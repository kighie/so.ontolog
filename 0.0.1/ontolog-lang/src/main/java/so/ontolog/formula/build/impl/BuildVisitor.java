/* 
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package so.ontolog.formula.build.impl;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.ast.GrammarTokens;
import so.ontolog.formula.ast.decl.ParamDecl;
import so.ontolog.formula.ast.decl.VariableDecl;
import so.ontolog.formula.ast.expr.ASTArrayExpr;
import so.ontolog.formula.ast.expr.ASTCallExpr;
import so.ontolog.formula.ast.expr.ASTFunctionCallExpr;
import so.ontolog.formula.ast.expr.ASTLoopCondition;
import so.ontolog.formula.ast.expr.ASTMethodCallExpr;
import so.ontolog.formula.ast.expr.BinaryExpr;
import so.ontolog.formula.ast.expr.CompositeSymbolExpr;
import so.ontolog.formula.ast.expr.LiteralExpr;
import so.ontolog.formula.ast.expr.TernaryExpr;
import so.ontolog.formula.ast.expr.UnaryExpr;
import so.ontolog.formula.ast.expr.ASTVariableExpr;
import so.ontolog.formula.ast.stmt.ASTCallStatement;
import so.ontolog.formula.ast.stmt.ASTForeachStatement;
import so.ontolog.formula.ast.stmt.ASTIfStatement;
import so.ontolog.formula.ast.stmt.ASTReturnStatement;
import so.ontolog.formula.ast.stmt.EvalExprStatement;
import so.ontolog.formula.build.BuildContext;
import so.ontolog.formula.build.BuildException;
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.Literal;
import so.ontolog.formula.runtime.Node;
import so.ontolog.formula.runtime.Operator.Binary;
import so.ontolog.formula.runtime.Operator.Unary;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.Statement;
import so.ontolog.formula.runtime.expr.ArrayExpr;
import so.ontolog.formula.runtime.expr.BinaryOperatorExpr;
import so.ontolog.formula.runtime.expr.FunctionCallExpr;
import so.ontolog.formula.runtime.expr.LoopCondition;
import so.ontolog.formula.runtime.expr.MethodCallExpr;
import so.ontolog.formula.runtime.expr.TernaryOperatorExpr;
import so.ontolog.formula.runtime.expr.UnaryOperatorExpr;
import so.ontolog.formula.runtime.internal.GenericLiteral.BooleanLiteral;
import so.ontolog.formula.runtime.internal.GenericLiteral.NumberLiteral;
import so.ontolog.formula.runtime.internal.GenericLiteral.ObjectLiteral;
import so.ontolog.formula.runtime.internal.GenericLiteral.TextLiteral;
import so.ontolog.formula.runtime.module.ExprModule;
import so.ontolog.formula.runtime.module.ScriptModule;
import so.ontolog.formula.runtime.ref.VarIndexedRef;
import so.ontolog.formula.runtime.ref.VariableRef;
import so.ontolog.formula.runtime.ref.VariableRef.PropertyRef;
import so.ontolog.formula.runtime.stmt.ForeachStatement;
import so.ontolog.formula.runtime.stmt.GettablStatementWrapper;
import so.ontolog.formula.runtime.stmt.IfStatement;
import so.ontolog.formula.runtime.stmt.ParamDeclStmt;
import so.ontolog.formula.runtime.stmt.ReturnStatement;
import so.ontolog.formula.runtime.stmt.VariableDeclStatement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BuildVisitor implements ASTVisitor<BuildContext>{
	
	private static Logger logger = Logger.getLogger(BuildVisitor.class.getName());
	
	@Override
	public BuildContext visit(CompilationUnit compilationUnit,
			BuildContext context) {
		String token = compilationUnit.getToken().getName();
		
		if(GrammarTokens.EXPR_MODULE.equals(token)) {
			ExprModule module = new ExprModule();
			
			for(ASTStatement s : compilationUnit.children() ){
				if(GrammarTokens.PARAM_DECL.equals( s.getToken().getName()) ){
					Statement paramDecl = (Statement)s.getNode();
					module.addParamDef(paramDecl);
				} else if(GrammarTokens.EVAL_EXPR_STMT.equals( s.getToken().getName())){
					module.setExpression((Gettable<?>)s.getNode());
				} else {
					throw new BuildException("Illegal statment : " + s.getToken().getName()).setNode(s);
				}
			}
			
			context.setModule(module);
			return context;
		} else if(GrammarTokens.SCRIPT_MODULE.equals(token)) {
			ScriptModule module = new ScriptModule();
			
			for(ASTStatement s : compilationUnit.children() ){
				Node node = s.getNode();
				Statement statement = (Statement)node;
				module.append(statement);
			}
			
			context.setModule(module);
			return context;
		}
		
		throw new BuildException("Unknown Module token : " + token );
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public BuildContext visit(UnaryExpr unaryExpr, BuildContext context) {
		Gettable<?> expr = (Gettable<?>)unaryExpr.getExpr().getNode();
		if(expr == null){
			throw new BuildException("Unary operand is null.").setNode(unaryExpr);
		}
		
		Unary<?, ?> operator = unaryExpr.getOperator();
		UnaryOperatorExpr<?, ?> gettable = new UnaryOperatorExpr(operator, expr);
		unaryExpr.setNode(gettable);
		return context;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public BuildContext visit(BinaryExpr binaryExpr, BuildContext context) {
		Gettable<?> left = (Gettable<?>)binaryExpr.getLeft().getNode();
		Gettable<?> right = (Gettable<?>)binaryExpr.getRight().getNode();

		if(left == null){
			throw new BuildException("Left operand is null.").setNode(binaryExpr);
		}
		if(right == null){
			throw new BuildException("Right operand is null.").setNode(binaryExpr);
		}
		Binary<?, ?, ?> operator = binaryExpr.getOperator();
		
		BinaryOperatorExpr<?, ?, ?> gettable = new BinaryOperatorExpr(operator, left, right);
		binaryExpr.setNode(gettable);
		
		return context;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public BuildContext visit(TernaryExpr ternaryExpr, BuildContext context) {
		TernaryOperatorExpr<?> expr = new TernaryOperatorExpr(ternaryExpr.type(), 
				(Gettable<Boolean>)ternaryExpr.getExpr1().getNode(), 
				(Gettable<?>)ternaryExpr.getExpr2().getNode(), 
				(Gettable<?>)ternaryExpr.getExpr3().getNode());
		ternaryExpr.setNode(expr);
		return context;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public BuildContext visit(LiteralExpr literalExpr, BuildContext context) {
		TypeSpec type = literalExpr.type();
		Literal<?> literal;
		switch(type.getTypeKind()){
		case Number:
			literal = new NumberLiteral(new BigDecimal(literalExpr.getExpr()));
			break;
		case Text:
			literal = new TextLiteral(literalExpr.getExpr());
			break;
		case Bool:
			literal = new BooleanLiteral( DefaultConverters.BOOL.convert(literalExpr.getExpr()) );
			break;
		case Void:
		case Undefined:
			literal = new ObjectLiteral(type, null);
			break;
		default:
			Converter<?> converter = TypeUtils.getConverter(type);
			Object value = converter.convert(literalExpr.getExpr());
			literal = new ObjectLiteral(type, value);
		}
		literalExpr.setNode(literal);
		return context;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public BuildContext visit(ASTArrayExpr expr, BuildContext context) {
		List<Gettable<?>>elements = new LinkedList<Gettable<?>>();
		
		for(ASTExpr e : expr.getElements()){
			elements.add( (Gettable<?>)e.getNode() );
		}
		ArrayExpr<?> arrayAxpr = new ArrayExpr(expr.type(), elements);
		expr.setNode(arrayAxpr);
		return context;
	}
	
	@SuppressWarnings({ "rawtypes" , "unchecked" })
	@Override
	public BuildContext visit(ASTVariableExpr variableExpr, BuildContext context) {
		QName qname = variableExpr.getQname();
		VariableRef<?> varRef;
		if(qname.getParent() != null){
			varRef = new PropertyRef(variableExpr.type(), variableExpr.getQname(), 
					variableExpr.getPropertyAccessor());
		} else {
			varRef = new VariableRef(variableExpr.type(), variableExpr.getQname());
		}
		variableExpr.setNode(varRef);
		return context;
	}
	
	@Override
	public BuildContext visit(ASTSymbol symbol, BuildContext context) {
		if(symbol instanceof ASTVariableExpr) {
			return visit((ASTVariableExpr)symbol, context);
		} else if(symbol instanceof CompositeSymbolExpr) {
			CompositeSymbolExpr composite = (CompositeSymbolExpr)symbol;
			return visit(composite, context);
		} else {
			throw new BuildException("Unsupported ASTSymbol " + symbol);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BuildContext visit(CompositeSymbolExpr variableExpr, BuildContext context) {
		QName qname = variableExpr.getQname();
		VariableRef<?> parentRef = (VariableRef)variableExpr.getParent().getNode();
		VariableRef<?> indexerRef = (VariableRef)variableExpr.getVarIndexer().getNode();
		VarIndexedRef<?> varRef = new VarIndexedRef(qname, parentRef, indexerRef);
		variableExpr.setNode(varRef);
		return context;
	}
	
	@Override
	public BuildContext visit(ASTCallExpr expr, BuildContext context) {
		List<ASTExpr> argTypes = expr.getArgs();

		int length = argTypes.size();
		Gettable<?>[] argGettableArr = new Gettable<?>[length];
		
		for(int i=0;i<length;i++){
			argGettableArr[i] = (Gettable<?>)argTypes.get(i).getNode();
		}
		
		
		
		Node node = null;
		if(expr instanceof ASTMethodCallExpr){
			node = makeMethodCallExpr((ASTMethodCallExpr)expr, argGettableArr);
		} else if(expr instanceof ASTFunctionCallExpr){
			node = makeFunctionCallExpr((ASTFunctionCallExpr)expr, argGettableArr);
		} else {
			throw new BuildException("Unknown visit type : " + expr);
		}
		
		expr.setNode(node);
		return context;
	}

	/**<pre></pre>
	 * @param expr
	 * @param argGettableArr
	 * @param converters
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected MethodCallExpr<?> makeMethodCallExpr(ASTMethodCallExpr expr,
			Gettable<?>[] argGettableArr) {
		Class<?>[]paramTypeArray = expr.getRequiredParamTypes();
		int length = argGettableArr.length;
		
		Converter<?>[] converters = new Converter<?>[length];
		
		if(length > paramTypeArray.length) {
			int i=0;
			for(;i<paramTypeArray.length;i++){
				converters[i] = DefaultConverters.getConverter(paramTypeArray[i]);
			}
			Converter<?> lastConv = converters[paramTypeArray.length-1];
			
			for(;i<length;i++){
				converters[i] = lastConv;
			}
		} else {
			for(int i=0;i<length;i++){
				converters[i] = DefaultConverters.getConverter(paramTypeArray[i]);
			}
		}
		
		Gettable<?> beanGettable = (expr.getBeanRef() != null) ? (Gettable<?>)expr.getBeanRef().getNode() : null;
		Method method = expr.getMethod();
		MethodCallExpr<?> methodCall = new MethodCallExpr(expr.type(), beanGettable, method, converters, argGettableArr);
		return methodCall;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected FunctionCallExpr<?> makeFunctionCallExpr(ASTFunctionCallExpr expr,
			Gettable<?>[] argGettableArr) {
		
		FunctionCallExpr<?> funcCall = new FunctionCallExpr(expr.getFunction(), argGettableArr);
		return funcCall;
	}
	
	
	@Override
	public BuildContext visit(ASTDeclaration declStmt, BuildContext context) {
		String tokenName = declStmt.getToken().getName();
		
		if(GrammarTokens.PARAM_DECL.equals(tokenName)){
			ParamDecl paramDecl = (ParamDecl)declStmt;
			ParamDeclStmt stmt = new ParamDeclStmt(paramDecl.getQname(), paramDecl.getType(), paramDecl.getParamName());
			declStmt.setNode(stmt);
		} else if(GrammarTokens.VAR_DECL.equals(tokenName)){
			VariableDecl varDecl = (VariableDecl)declStmt;
			VariableDeclStatement stmt = new VariableDeclStatement(varDecl.getQname(), varDecl.getType());

			ASTExpr valueExpr = varDecl.getValueExpr();
			if(valueExpr != null){
				stmt.setInitialValue((Gettable<?>)valueExpr.getNode());
			}
			
			declStmt.setNode(stmt);
		} else {
			throw new BuildException("Unknown Declaration token : " + tokenName).setNode(declStmt);
		}
		
		return context;
	}
	
	@Override
	public BuildContext visit(ASTCallStatement stmt, BuildContext context) {
		Gettable<?> gettable = (Gettable<?>)stmt.getCallExpr().getNode();
		if(gettable == null){
			throw new BuildException("Exec node is null : " + stmt);
		}
		GettablStatementWrapper stmtWrapper = new GettablStatementWrapper(gettable);
		stmt.setNode(stmtWrapper);
		return context;
	}
	
	@Override
	public BuildContext visit(ASTReturnStatement stmt, BuildContext context) {
		Gettable<?> gettable = (Gettable<?>)stmt.getExpr().getNode();
		if(gettable == null){
			throw new BuildException("Exec node is null : " + stmt);
		}
		ReturnStatement rtnStmt = new ReturnStatement(gettable);
		stmt.setNode(rtnStmt);
		return context;
	}
	
	@Override
	public BuildContext visit(EvalExprStatement stmt, BuildContext context) {
		ASTExpr expr = stmt.getExpression();
		
		stmt.setNode(expr.getNode());

		logger.log(Level.INFO, "EvalExprStatement::" + expr);
		return context;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public BuildContext visit(ASTIfStatement stmt, BuildContext context) {
		Gettable<Boolean> condition = (Gettable<Boolean>)stmt.getCondition().getNode();
		IfStatement ifStmt = new IfStatement(condition);

		for(ASTStatement c : stmt.children() ){
			ifStmt.append((Statement)c.getNode());
		}

		for(ASTIfStatement.ElseIf ei : stmt.getElseifStmts() ){
			ifStmt.appendElseIf((IfStatement.ElseIf)ei.getNode());
		}
		
		ASTIfStatement.Else elseStmt = stmt.getElseStmt();
		if(elseStmt != null){
			ifStmt.setElseStmt((IfStatement.Else)elseStmt.getNode());
		}
		
		stmt.setNode(ifStmt);
		return context;
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public BuildContext visit(ASTIfStatement.ElseIf stmt, BuildContext context) {
		Gettable<Boolean> condition = (Gettable<Boolean>)stmt.getCondition().getNode();
		IfStatement.ElseIf elseIf = new IfStatement.ElseIf(condition);

		for(ASTStatement c : stmt.children() ){
			elseIf.append((Statement)c.getNode());
		}

		stmt.setNode(elseIf);
		return context;
	}
	
	@Override
	public BuildContext visit(ASTIfStatement.Else stmt, BuildContext context) {
		IfStatement.Else elseStmt = new IfStatement.Else();

		for(ASTStatement c : stmt.children() ){
			elseStmt.append((Statement)c.getNode());
		}

		stmt.setNode(elseStmt);
		return context;
	}

	@Override
	public BuildContext visit(ASTForeachStatement stmt, BuildContext context) {
		ForeachStatement foreachStmt = new ForeachStatement((LoopCondition)stmt.getCondition().getNode());
		
		for(ASTStatement c : stmt.children() ){
			foreachStmt.append((Statement)c.getNode());
		}
		
		stmt.setNode(foreachStmt);
		return context;
	}

	@Override
	public BuildContext visit(ASTLoopCondition expr, BuildContext context) {
		LoopCondition condition = new LoopCondition(
				(VariableDeclStatement)expr.getVarDelc().getNode(), 
				(Gettable<?>)expr.getIteratorExpr().getNode());
		expr.setNode(condition);
		return context;
	}
	
	
}
