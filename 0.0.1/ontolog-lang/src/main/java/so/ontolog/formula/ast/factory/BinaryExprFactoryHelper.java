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

import java.util.Map;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.GrammarTokens;
import so.ontolog.formula.ast.ASTFactory.BinaryExprFactory;
import so.ontolog.formula.ast.expr.BinaryExpr;
import so.ontolog.formula.ast.expr.ASTVariableExpr;
import so.ontolog.formula.build.BuildException;
import so.ontolog.formula.runtime.Operator;
import so.ontolog.formula.runtime.internal.DefaultOperators;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BinaryExprFactoryHelper {

	public static void initFactoryMap(Map<String, BinaryExprFactory> map){
		NumberExprFactory numberFac = new NumberExprFactory();
		map.put(GrammarTokens.OP_MINUS , numberFac);
		map.put(GrammarTokens.OP_DIVIDE , numberFac);
		map.put(GrammarTokens.OP_POW , numberFac);
		
		NumberStringExprFactory numStrFac = new NumberStringExprFactory();
		map.put(GrammarTokens.OP_PLUS , numStrFac);
		map.put(GrammarTokens.OP_MULTI , numStrFac);
		
		LogicalExprFactory logicalFac = new LogicalExprFactory();
		map.put(GrammarTokens.OP_AND , logicalFac);
		map.put(GrammarTokens.OP_OR , logicalFac);
		

		CompareExprFactory compareFac = new CompareExprFactory();
		map.put(GrammarTokens.OP_EQ , compareFac);
		map.put(GrammarTokens.OP_NOT_EQ , compareFac);
		map.put(GrammarTokens.OP_EQ_LT , compareFac);
		map.put(GrammarTokens.OP_EQ_GT , compareFac);
		map.put(GrammarTokens.OP_LT , compareFac);
		map.put(GrammarTokens.OP_GT , compareFac);
		
	}


	public static abstract class AbstractBinaryExprFactory implements BinaryExprFactory {
		@Override
		public final BinaryExpr create(ASTContext context, ASTToken token, ASTExpr left, ASTExpr right) {
			TypeKind leftTypeKind = left.type().getTypeKind();
			TypeKind rightTypeKind = right.type().getTypeKind();
			return createImpl(context, token, leftTypeKind, left, rightTypeKind, right);
		}
		
		protected abstract BinaryExpr createImpl(ASTContext context, 
				ASTToken token, TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right);
	}
	

	public static class LogicalExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTContext context, ASTToken token,
				TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			if(leftTypeKind!=TypeKind.Bool){
				throw new ASTException(token.getName() + " operator must have boolean operand.").setNode(left);
			}
			if(rightTypeKind!=TypeKind.Bool){
				throw new ASTException(token.getName() + " operator must have boolean operand.").setNode(right);
			}
			
			String tokenName = token.getName();
			
			Operator.Binary<?, ?, ?> operator;
			
			if(GrammarTokens.OP_AND.equals(tokenName) ){
				operator = DefaultOperators.AND;
			} else if(GrammarTokens.OP_OR.equals(tokenName) ){
				operator = DefaultOperators.OR;
			} else {
				throw new ASTException("Unknown logical expression " + tokenName).setLocation(token);
			}
			
			return new BinaryExpr(token, operator, left, right);
		}
	}

	
	public static class CompareExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTContext context, ASTToken token,
				TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			String tokenName = token.getName();
			
			Operator.Binary<?, ?, ?> operator;
			
			if(GrammarTokens.OP_NOT_EQ.equals(tokenName) ){
				operator = DefaultOperators.NOT_EQUALS;
			} else if(GrammarTokens.OP_EQ.equals(tokenName) ){
				operator = DefaultOperators.EQUALS;
			} else if(GrammarTokens.OP_GT.equals(tokenName) ){
				operator = DefaultOperators.GT;
			} else if(GrammarTokens.OP_EQ_GT.equals(tokenName) ){
				operator = DefaultOperators.EQUALS_GT;
			} else if(GrammarTokens.OP_LT.equals(tokenName) ){
				operator = DefaultOperators.LT;
			} else if(GrammarTokens.OP_EQ_LT.equals(tokenName) ){
				operator = DefaultOperators.EQUALS_LT;
			} else {
				throw new ASTException("Unknown compare expression " + tokenName).setLocation(token);
			}
			
			return new BinaryExpr(token, operator, left, right);
		}
	}
	
	public static class NumberExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTContext context, ASTToken token,
				TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			if(leftTypeKind!=TypeKind.Number){
				if(leftTypeKind==TypeKind.Undefined && left instanceof ASTVariableExpr){
					((ASTVariableExpr)left).setType(TypeSpec.DECIMAL);
				} else {
					throw new ASTException(token.getName() + " operator must have numeric operand.").setNode(left);
				}
			}
			if(rightTypeKind!=TypeKind.Number){
				if(rightTypeKind==TypeKind.Undefined && right instanceof ASTVariableExpr){
					((ASTVariableExpr)right).setType(TypeSpec.DECIMAL);
				} else {
					throw new ASTException(token.getName() + " operator must have numeric operand.").setNode(right);
				}
			}
			
			String tokenName = token.getName();
			
			Operator.Binary<?, ?, ?> operator;
			
			if(GrammarTokens.OP_MINUS.equals(tokenName) ){
				operator = DefaultOperators.SUBTRACT;
			} else if(GrammarTokens.OP_DIVIDE.equals(tokenName) ){
				operator = DefaultOperators.DIVIDE;
			} else if(GrammarTokens.OP_POW.equals(tokenName) ){
				operator = DefaultOperators.POW;
			} else {
				throw new ASTException("Unknown number operator " + tokenName).setLocation(token);
			}
			
			return new BinaryExpr(token, operator, left, right);
		}
	}
	
	public static class NumberStringExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTContext context, ASTToken token,
				TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {

			String tokenName = token.getName();
			
			Operator.Binary<?, ?, ?> operator;
			
			if( leftTypeKind == TypeKind.Text || rightTypeKind == TypeKind.Text) {
				if(GrammarTokens.OP_PLUS.equals(tokenName) ){
					operator = DefaultOperators.CONCAT;
				} else if(GrammarTokens.OP_MULTI.equals(tokenName) ){
					operator = DefaultOperators.MULTI_STR;
				} else {
					throw new ASTException("Unknown string operator " + tokenName).setLocation(token);
				}
				
				return new BinaryExpr(token, operator, left, right);
			} else if(leftTypeKind ==TypeKind.Number && leftTypeKind == TypeKind.Number){
				if(GrammarTokens.OP_PLUS.equals(tokenName) ){
					operator = DefaultOperators.ADD;
				} else if(GrammarTokens.OP_MULTI.equals(tokenName) ){
					operator = DefaultOperators.MULTIFLY;
				} else {
					throw new ASTException("Unknown number operator " + tokenName).setLocation(token);
				}
				return new BinaryExpr(token, operator, left, right);
			}
			
			BuildException exception = new ASTException(token.getName() 
					+ " operator must have numeric or string operand.").setNode(
							new BinaryExpr(token, DefaultOperators.CONCAT, left, right));
			
			context.getErrorHandler().buildError(token, exception);
			
			return new BinaryExpr(token, DefaultOperators.CONCAT, left, right);
		}
	}

	/**<pre></pre>
	 * @param left
	 * @param right
	 * @return
	 */
	protected static TypeSpec getNumberTypeSpec(ASTExpr left, ASTExpr right) {
		TypeSpec typeSpec = TypeSpec.INT;

		if( TypeUtils.hasFloatinPoint(left.type().getBaseType()) 
				||  TypeUtils.hasFloatinPoint(right.type().getBaseType()) ){
			typeSpec = TypeSpec.REAL;
		} else if( TypeUtils.isLong(left.type().getBaseType()) 
					||  TypeUtils.isLong(right.type().getBaseType()) ){
			typeSpec = TypeSpec.BIGINT;
		}
		return typeSpec;
	}
}
