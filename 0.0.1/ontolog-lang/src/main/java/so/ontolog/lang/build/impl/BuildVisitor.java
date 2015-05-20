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
package so.ontolog.lang.build.impl;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTStatement;
import so.ontolog.lang.ast.ASTVisitor;
import so.ontolog.lang.ast.CompilationUnit;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.decl.ParamDecl;
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.ast.stmt.EvalExprStatement;
import so.ontolog.lang.build.BuildContext;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Literal;
import so.ontolog.lang.runtime.Operator.Binary;
import so.ontolog.lang.runtime.Operator.Unary;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.Statement;
import so.ontolog.lang.runtime.expr.BinaryOperatorExpr;
import so.ontolog.lang.runtime.expr.UnaryOperatorExpr;
import so.ontolog.lang.runtime.internal.GenericLiteral.BooleanLiteral;
import so.ontolog.lang.runtime.internal.GenericLiteral.NumberLiteral;
import so.ontolog.lang.runtime.internal.GenericLiteral.ObjectLiteral;
import so.ontolog.lang.runtime.internal.GenericLiteral.TextLiteral;
import so.ontolog.lang.runtime.module.ExprModule;
import so.ontolog.lang.runtime.ref.VariableRef;
import so.ontolog.lang.runtime.ref.VariableRef.BeanPropertyRef;
import so.ontolog.lang.runtime.stmt.ParamDeclStmt;

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

	@Override
	public BuildContext visit(TernaryExpr ternaryExpr, BuildContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public BuildContext visit(VariableExpr variableExpr, BuildContext context) {
		QName qname = variableExpr.getQname();
		VariableRef<?> varRef = new VariableRef(variableExpr.type(), variableExpr.getQname());
		if(qname.getParent() != null){
			varRef = new BeanPropertyRef(variableExpr.type(), variableExpr.getQname());
		} else {
			varRef = new VariableRef(variableExpr.type(), variableExpr.getQname());
		}
		variableExpr.setNode(varRef);
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
		default:
			Converter<?> converter = TypeUtils.getConverter(type);
			Object value = converter.convert(literalExpr.getExpr());
			literal = new ObjectLiteral(type, value);
		}
		literalExpr.setNode(literal);
		return context;
	}

	@Override
	public BuildContext visit(ASTDeclaration declStmt, BuildContext context) {
		String tokenName = declStmt.getToken().getName();
		
		if(GrammarTokens.PARAM_DECL.equals(tokenName)){
			ParamDecl paramDecl = (ParamDecl)declStmt;
			ParamDeclStmt stmt = new ParamDeclStmt(paramDecl.getQname(), paramDecl.getType(), paramDecl.getParamName());
			declStmt.setNode(stmt);
		} else {
			throw new BuildException("Unknown Declaration token : " + tokenName).setNode(declStmt);
		}
		
		return context;
	}

	@Override
	public BuildContext visit(EvalExprStatement stmt, BuildContext context) {
		ASTExpr expr = stmt.getExpression();
		
		stmt.setNode(expr.getNode());

		logger.log(Level.INFO, "EvalExprStatement::" + expr);
		return context;
	}

}
