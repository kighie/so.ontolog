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
package so.ontolog.formula.ast.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTFactory;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.ast.GrammarTokens;
import so.ontolog.formula.ast.expr.ASTCallExpr;
import so.ontolog.formula.ast.expr.ArrayExpr;
import so.ontolog.formula.ast.expr.LiteralExpr;
import so.ontolog.formula.ast.expr.TernaryExpr;
import so.ontolog.formula.ast.expr.UnaryExpr;
import so.ontolog.formula.ast.stmt.ASTCallStatement;
import so.ontolog.formula.ast.stmt.ASTForeachStatement;
import so.ontolog.formula.ast.stmt.ASTIfStatement;
import so.ontolog.formula.ast.stmt.ASTReturnStatement;
import so.ontolog.formula.ast.stmt.DeclarationStatement;
import so.ontolog.formula.ast.stmt.EvalExprStatement;
import so.ontolog.formula.runtime.IndexedQName;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.VarQName;
import so.ontolog.formula.runtime.internal.DefaultOperators;
import so.ontolog.formula.runtime.internal.TypeHelper;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultASTFactory implements ASTFactory {
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger(DefaultASTFactory.class.getName());
	
	private TypeHelper typeHelper;
	private Map<String, ModuleFactory> moduleFactoryMap;
	private Map<String, UnaryExprFactory> unaryExprFactoryMap;
	private Map<String, BinaryExprFactory> binaryExprFactoryMap;
	private Map<String, TernaryExprFactory> ternaryExprFactoryMap;
	private Map<String, VariableExprFactory> variableExprFactoryMap;
	private Map<String, LiteralExprFactory> literalExprFactoryMap;
	private Map<String, CallExprFactory> callExprFactoryMap;
	
	private ParamDeclFactory paramDeclFactory;
	private VariableDeclFactory variableDeclFactory;
	
	
	public void initFactory(){
		this.typeHelper = initTypeHelper();
		this.moduleFactoryMap = initModuleFactoryMap();
		this.unaryExprFactoryMap = initUnaryExprFactories();
		this.binaryExprFactoryMap = initBinaryExprFactories();
		this.ternaryExprFactoryMap = initTernaryExprFactories();
		this.literalExprFactoryMap = initLiteralExprFactories();
		this.variableExprFactoryMap = initVariableExprFactories();
		this.callExprFactoryMap = initCallExprFactories();
		
		this.paramDeclFactory = initParamDeclFactory();
		this.variableDeclFactory = initVariableDeclFactory();
	}
	
	protected TypeHelper initTypeHelper() {
		return new TypeHelper();
	}

	
	@Override
	public TypeSpec createType(ASTContext context, String typeFullName) {
		QName qname = QName.parseQName(typeFullName);
		return createType(context, qname);
	}

	@Override
	public TypeSpec createType(ASTContext context, QName qname) {
		TypeSpec typeSpec = context.getType(qname);
		if(typeSpec == null){
			typeSpec = typeHelper.getType(qname.getFullName());
			context.registerType(qname, typeSpec);
		}
		return typeSpec;
	}

	@Override
	public TypeSpec createArrayType(ASTContext context, String typeFullName) {
		return typeHelper.getArrayType(typeFullName);
	}
	
	@Override
	public QName createQName(ASTContext context, String name) {
		return new QName(name);
	}

	@Override
	public QName createQName(ASTContext context, QName parent, String name) {
		return new QName(parent, name);
	}

	@Override
	public IndexedQName createIndexedQName(ASTContext context, QName parent, String index) {
		return new IndexedQName(parent, index);
	}
	
	@Override
	public QName createVarQName(ASTContext context, QName parent, QName index) {
		return new VarQName(parent, index);
	}
	
	
	
	@Override
	public void importJava(ASTContext context, QName qname) {
		TypeSpec typeSpec = typeHelper.getType(qname.getFullName());
		
		context.registerType(qname, typeSpec);
		
		if(qname.getParent() !=null){
			context.registerType(new QName(qname.getName()), typeSpec);
		}
	}

	@Override
	public void importModule(ASTContext context, String path, String alias) {
		// TODO Auto-generated method stub
	}

	@Override
	public CompilationUnit createModule(ASTContext context, ASTToken token) {
		String tokenName = token.getName();
		ModuleFactory factory = moduleFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown Module type " + tokenName ).setLocation(token);
		}
		return factory.create(context, token);
	}

	protected Map<String, ModuleFactory> initModuleFactoryMap() {
		Map<String, ModuleFactory> factoryMap = new HashMap<String, ASTFactory.ModuleFactory>();
		factoryMap.put(GrammarTokens.EXPR_MODULE, new ModuleFactory() {
			@Override
			public CompilationUnit create(ASTContext context, ASTToken token) {
				return new CompilationUnit(context, token);
			}
		});
		
		factoryMap.put(GrammarTokens.SCRIPT_MODULE, new ModuleFactory() {
			@Override
			public CompilationUnit create(ASTContext context, ASTToken token) {
				return new CompilationUnit(context, token);
			}
		});
		
		return factoryMap;
	}

	@Override
	public ASTExpr createUnary(ASTContext context, ASTToken token, ASTExpr expr) {
		String tokenName = token.getName();
		UnaryExprFactory factory = unaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown Unary Operation " + tokenName ).setLocation(token);
		}
		return factory.create(context, token, expr);
	}

	protected  Map<String, UnaryExprFactory> initUnaryExprFactories() {
		Map<String, UnaryExprFactory> map = new HashMap<String, ASTFactory.UnaryExprFactory>();
		
		map.put(GrammarTokens.OP_NUM_NEGATION, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTContext context, ASTToken token, ASTExpr expr) {
				if(expr.type().getTypeKind() != TypeKind.Number){
					throw new ASTException("Expression " + expr + " cannot be negated." ).setNode(expr);
				}
				return new UnaryExpr(token, DefaultOperators.NEGATE, expr);
			}
		});

		map.put(GrammarTokens.OP_NOT, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTContext context, ASTToken token, ASTExpr expr) {
				if(expr.type().getTypeKind() != TypeKind.Bool){
					throw new ASTException("Expression " + expr + " cannot negated logically." ).setNode(expr);
				}
				return new UnaryExpr(token, DefaultOperators.NOT, expr);
			}
		});
		
		map.put(GrammarTokens.OP_PERCENT, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTContext context, ASTToken token, ASTExpr expr) {
				if(expr.type().getTypeKind() != TypeKind.Number){
					throw new ASTException("Illegal Expression " + expr + "%" ).setNode(expr);
				}
				return new UnaryExpr(token, DefaultOperators.PERCENT, expr);
			}
		});
		return map;
	}

	@Override
	public ASTExpr createBinary(ASTContext context, ASTToken token, ASTExpr left, ASTExpr right) {
		String tokenName = token.getName();
		
		BinaryExprFactory factory = binaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown Binary Operation " + tokenName ).setLocation(token);
		}
		
		return factory.create(context, token, left, right);
	}

	protected Map<String, BinaryExprFactory> initBinaryExprFactories() {
		Map<String, BinaryExprFactory> map = new HashMap<String, ASTFactory.BinaryExprFactory>();
		BinaryExprFactoryHelper.initFactoryMap(map);
		return map;
	}

	@Override
	public ASTExpr createTernary(ASTContext context, ASTToken token, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		String tokenName = token.getName();
		
		TernaryExprFactory factory = ternaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown Ternary Operation " + tokenName ).setLocation(token);
		}
		
		return factory.create(context, token, expr1, expr2, expr3);
	}

	protected Map<String, TernaryExprFactory> initTernaryExprFactories() {
		Map<String, TernaryExprFactory> map = new HashMap<String, ASTFactory.TernaryExprFactory>();
		map.put(GrammarTokens.OP_TERNARY, new TernaryExprFactory() {
			@Override
			public ASTExpr create(ASTContext context, ASTToken token, ASTExpr expr1,
					ASTExpr expr2, ASTExpr expr3) {
				TypeSpec typeSpec = (expr2.type() != null) ? expr2.type() : expr3.type();
				TernaryExpr expr = new TernaryExpr(token, typeSpec, expr1, expr2, expr3);
				return expr;
			}
		});
		return map;
	}

	@Override
	public ASTSymbol createVariable(ASTContext context, ASTToken token, QName qname) {
		String tokenName = token.getName();
		
		VariableExprFactory factory = variableExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown variable token " + tokenName ).setLocation(token);
		}
		
		return factory.create(context, token, qname);
	}

	protected Map<String, VariableExprFactory> initVariableExprFactories() {
		Map<String, VariableExprFactory> map = new HashMap<String, ASTFactory.VariableExprFactory>();
		
		map.put(GrammarTokens.VAR, new DefaultVariableExprFactory());
		
		return map;
	}

	@Override
	public ASTExpr createLiteral(ASTToken token, String expr) {
		String tokenName = token.getName();

		LiteralExprFactory factory = literalExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown literal token " + tokenName ).setLocation(token);
		}
		
		return factory.create(token, expr);
	}

	protected Map<String, LiteralExprFactory> initLiteralExprFactories() {
		Map<String, LiteralExprFactory> map = new HashMap<String, ASTFactory.LiteralExprFactory>();
		
		map.put(GrammarTokens.LIT_BOOLEAN, new LiteralExprFactory() {
			@Override
			public LiteralExpr create(ASTToken token, String expr) {
				return new LiteralExpr(token, TypeSpec.BOOLEAN, expr);
			}
		});
		
		map.put(GrammarTokens.LIT_DATE, new LiteralExprFactory() {
			@Override
			public LiteralExpr create(ASTToken token, String expr) {
				return new LiteralExpr(token, TypeSpec.DATE, expr);
			}
		});
		
		map.put(GrammarTokens.LIT_NULL, new LiteralExprFactory() {
			@Override
			public LiteralExpr create(ASTToken token, String expr) {
				return new LiteralExpr(token, TypeSpec.UNDEFINED, expr);
			}
		});
		
		map.put(GrammarTokens.LIT_NUMBER, new LiteralExprFactory() {
			@Override
			public LiteralExpr create(ASTToken token, String expr) {
				TypeSpec typeSpec;
				if(expr.contains(".")){
					typeSpec = TypeSpec.INT;
				} else {
					typeSpec = TypeSpec.REAL;
				}
				return new LiteralExpr(token, typeSpec, expr);
			}
		});
		
		map.put(GrammarTokens.LIT_STRING, new LiteralExprFactory() {
			@Override
			public LiteralExpr create(ASTToken token, String expr) {
				return new LiteralExpr(token, TypeSpec.STRING, expr);
			}
		});
		
		return map;
	}
	
	
	@Override
	public ASTExpr createArray(ASTToken token, List<ASTExpr> elements) {
		TypeSpec typeSpec = TypeUtils.getArrayTypeSpec(TypeSpec.UNDEFINED);
		
		ArrayExpr arrayExpr = new ArrayExpr(token, typeSpec, elements);
		return arrayExpr;
	}
	
	
	@Override
	public ASTExpr createCall(ASTContext context, ASTToken token,
			ASTSymbol beanSymbol, String name, List<ASTExpr> args) {
		String tokenName = token.getName();

		CallExprFactory factory = callExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new ASTException("Unknown call token " + tokenName ).setLocation(token);
		}
		
		return factory.create(context, token, beanSymbol, name, args);
	}
	
	/**<pre></pre>
	 * @return
	 */
	protected Map<String, CallExprFactory> initCallExprFactories() {
		Map<String, CallExprFactory> map = new HashMap<String, ASTFactory.CallExprFactory>();

		map.put(GrammarTokens.METHOD_CALL, new MetodCallExprFactory());
		map.put(GrammarTokens.FUNC_CALL, new FunctionCallExprFactory());
		
		return map;
	}


	@Override
	public ASTStatement asStatement(ASTContext context, ASTExpr callExpr) {
		if(callExpr instanceof ASTCallExpr){
			return new ASTCallStatement((ASTCallExpr)callExpr);
		}
		
		throw new ASTException(" asStatement(.., ASTExpr) must be applied to ASTCallExpr : " 
				+ callExpr.getToken() + "\n" + callExpr);
	}
	
	@Override
	public ASTStatement createReturnStatement(ASTContext context,
			ASTExpr expr) {
		return new ASTReturnStatement(expr);
	}
	
	@Override
	public ASTStatement asStatement(ASTContext context, ASTDeclaration decl) {
		return new DeclarationStatement(decl);
	}
	
	@Override
	public ASTBlock createIfStmt(ASTContext context, ASTToken token,
			ASTExpr condition) {
		ASTIfStatement ifstmt = new ASTIfStatement(token, condition);
		return ifstmt;
	}
	
	@Override
	public ASTBlock createForeachStatement(ASTContext context, ASTToken token,
			ASTExpr condition) {
		ASTForeachStatement foreachStmt = new ASTForeachStatement(token, condition);
		return foreachStmt;
	}
	
	@Override
	public ASTDeclaration createParamDecl(ASTContext context, ASTToken token,  TypeSpec type, 
			String name, String alias) {
		ASTDeclaration paramDecl = paramDeclFactory.create(context, token, type, name, alias);
		context.registerVarDecl(paramDecl);
		return paramDecl;
	}

	protected ParamDeclFactory initParamDeclFactory() {
		return new DefaultParamDeclFactory();
	}


	@Override
	public ASTDeclaration createVariableDecl(ASTContext context,
			ASTToken token, TypeSpec type, String name, ASTExpr value) {
		ASTDeclaration varDecl = variableDeclFactory.create(context, token, type, name, value);
		context.registerVarDecl(varDecl);
		return varDecl;
	}

	protected VariableDeclFactory initVariableDeclFactory() {
		return new DefaultVariableDeclFactory();
	}

	@Override
	public ASTStatement createEvalStmt(ASTToken token, ASTExpr expr) {
		return new EvalExprStatement(token, expr);
	}
	
	
}
