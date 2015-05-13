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
package so.ontolog.lang.ast.factory;

import java.util.HashMap;
import java.util.Map;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.internal.TypeHelper;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultASTFactory implements ASTFactory {

	private TypeHelper typeHelper;
	private Map<String, UnaryExprFactory> unaryExprFactoryMap;
	private Map<String, BinaryExprFactory> binaryExprFactoryMap;
	private Map<String, TernaryExprFactory> ternaryExprFactoryMap;
	private Map<String, VariableExprFactory> variableExprFactoryMap;
	private Map<String, LiteralExprFactory> literalExprFactoryMap;
	
	public void initFactory(){
		this.typeHelper = initTypeHelper();
		this.unaryExprFactoryMap = initUnaryExprFactories();
		this.binaryExprFactoryMap = initBinaryExprFactories();
		this.ternaryExprFactoryMap = initTernaryExprFactories();
		this.variableExprFactoryMap = initVariableExprFactories();
		this.literalExprFactoryMap = initLiteralExprFactories();
	}
	
	protected TypeHelper initTypeHelper() {
		return new TypeHelper();
	}

	@Override
	public TypeSpec createType(String typeName) {
		return typeHelper.getType(typeName);
	}

	@Override
	public TypeSpec createType(QName qname) {
		return typeHelper.getType(qname.getFullName());
	}

	@Override
	public QName createQName(String name) {
		return QName.getQName(name);
	}

	@Override
	public QName createQName(QName parent, String name) {
		return new QName(parent, name);
	}

	@Override
	public UnaryExpr createUnary(ASTToken token, ASTExpr expr) {
		String tokenName = token.getName();
		UnaryExprFactory factory = unaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new BuildException("Unknown Unary Operation " + tokenName ).setLocation(token);
		}
		return factory.create(token, expr);
	}

	protected  Map<String, UnaryExprFactory> initUnaryExprFactories() {
		Map<String, UnaryExprFactory> map = new HashMap<String, ASTFactory.UnaryExprFactory>();
		
		map.put(GrammarTokens.OP_NUM_NEGATION, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTToken token, ASTExpr expr) {
				if(expr.getTypeSpec().getTypeKind() != TypeKind.Number){
					throw new BuildException("Expression " + expr + " cannot be negated." ).setNode(expr);
				}
				return new UnaryExpr(token, expr);
			}
		});

		map.put(GrammarTokens.OP_NOT, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTToken token, ASTExpr expr) {
				if(expr.getTypeSpec().getTypeKind() != TypeKind.Bool){
					throw new BuildException("Expression " + expr + " cannot negated logically." ).setNode(expr);
				}
				return new UnaryExpr(token, expr);
			}
		});
		
		map.put(GrammarTokens.OP_NUM_NEGATION, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTToken token, ASTExpr expr) {
				if(expr.getTypeSpec().getTypeKind() != TypeKind.Number){
					throw new BuildException("Expression " + expr + " cannot be negated." ).setNode(expr);
				}
				return new UnaryExpr(token, expr);
			}
		});
		
		map.put(GrammarTokens.OP_PERCENT, new UnaryExprFactory() {
			@Override
			public UnaryExpr create(ASTToken token, ASTExpr expr) {
				if(expr.getTypeSpec().getTypeKind() != TypeKind.Number){
					throw new BuildException("Illegal Expression " + expr + "%" ).setNode(expr);
				}
				return new UnaryExpr(token, expr);
			}
		});
		return map;
	}

	@Override
	public BinaryExpr createBinary(ASTToken token, ASTExpr left, ASTExpr right) {
		String tokenName = token.getName();
		
		BinaryExprFactory factory = binaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new BuildException("Unknown Binary Operation " + tokenName ).setLocation(token);
		}
		
		return factory.create(token, left, right);
	}

	protected Map<String, BinaryExprFactory> initBinaryExprFactories() {
		Map<String, BinaryExprFactory> map = new HashMap<String, ASTFactory.BinaryExprFactory>();
		BinaryExprFactoryHelper.initFactoryMap(map);
		return map;
	}

	@Override
	public TernaryExpr createTernary(ASTToken token, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		String tokenName = token.getName();
		
		TernaryExprFactory factory = ternaryExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new BuildException("Unknown Ternary Operation " + tokenName ).setLocation(token);
		}
		
		return factory.create(token, expr1, expr2, expr3);
	}

	protected Map<String, TernaryExprFactory> initTernaryExprFactories() {
		Map<String, TernaryExprFactory> map = new HashMap<String, ASTFactory.TernaryExprFactory>();
		return map;
	}

	@Override
	public VariableExpr createVariable(ASTToken token, QName qname) {
		String tokenName = token.getName();
		
		VariableExprFactory factory = variableExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new BuildException("Unknown variable token " + tokenName ).setLocation(token);
		}
		
		return factory.create(token, qname);
	}

	protected Map<String, VariableExprFactory> initVariableExprFactories() {
		Map<String, VariableExprFactory> map = new HashMap<String, ASTFactory.VariableExprFactory>();
		return map;
	}

	@Override
	public LiteralExpr createLiteral(ASTToken token, String expr) {
		String tokenName = token.getName();

		LiteralExprFactory factory = literalExprFactoryMap.get(tokenName);
		
		if(factory == null){
			throw new BuildException("Unknown literal token " + tokenName ).setLocation(token);
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

}
