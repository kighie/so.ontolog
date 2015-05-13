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

import java.util.Map;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.GrammarTokens;
import so.ontolog.lang.ast.ASTFactory.BinaryExprFactory;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.build.BuildException;

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
		map.put(GrammarTokens.OP_NOT , logicalFac);
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
		public final BinaryExpr create(ASTToken token, ASTExpr left, ASTExpr right) {
			TypeKind leftTypeKind = left.getTypeSpec().getTypeKind();
			TypeKind rightTypeKind = right.getTypeSpec().getTypeKind();
			return createImpl(token, leftTypeKind, left, rightTypeKind, right);
		}
		
		protected abstract BinaryExpr createImpl(ASTToken token, 
				TypeKind leftTypeKind, ASTExpr left, TypeKind rightTypeKind, ASTExpr right);
	}
	

	public static class LogicalExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTToken token, TypeKind leftTypeKind,
				ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			if(leftTypeKind!=TypeKind.Bool){
				throw new BuildException(token.getName() + " operator must have boolean operand.").setNode(left);
			}
			if(rightTypeKind!=TypeKind.Bool){
				throw new BuildException(token.getName() + " operator must have boolean operand.").setNode(right);
			}
			
			return new BinaryExpr(token, TypeSpec.BOOLEAN, left, right);
		}
	}

	
	public static class CompareExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTToken token, TypeKind leftTypeKind,
				ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			return new BinaryExpr(token, TypeSpec.BOOLEAN, left, right);
		}
	}
	
	public static class NumberExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTToken token, TypeKind leftTypeKind,
				ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			if(leftTypeKind!=TypeKind.Number){
				throw new BuildException(token.getName() + " operator must have numeric operand.").setNode(left);
			}
			if(rightTypeKind!=TypeKind.Number){
				throw new BuildException(token.getName() + " operator must have numeric operand.").setNode(right);
			}
			
			TypeSpec typeSpec = getNumberTypeSpec(left, right);
			
			return new BinaryExpr(token, typeSpec, left, right);
		}
	}

	public static class NumberStringExprFactory extends AbstractBinaryExprFactory {
		@Override
		protected BinaryExpr createImpl(ASTToken token, TypeKind leftTypeKind,
				ASTExpr left, TypeKind rightTypeKind, ASTExpr right) {
			if( leftTypeKind == TypeKind.Text || rightTypeKind == TypeKind.Text) {
				return new BinaryExpr(token, TypeSpec.STRING, left, right);
			} else if(leftTypeKind ==TypeKind.Number && leftTypeKind == TypeKind.Number){
				return new BinaryExpr(token, getNumberTypeSpec(left, right), left, right);
			}
			throw new BuildException(token.getName() + " operator must have numeric or string operand.").setLocation(token);
		}
	}

	/**<pre></pre>
	 * @param left
	 * @param right
	 * @return
	 */
	protected static TypeSpec getNumberTypeSpec(ASTExpr left, ASTExpr right) {
		TypeSpec typeSpec = TypeSpec.INT;

		if( TypeUtils.hasFloatinPoint(left.getTypeSpec().getBaseType()) 
				||  TypeUtils.hasFloatinPoint(right.getTypeSpec().getBaseType()) ){
			typeSpec = TypeSpec.REAL;
		} else if( TypeUtils.isLong(left.getTypeSpec().getBaseType()) 
					||  TypeUtils.isLong(right.getTypeSpec().getBaseType()) ){
			typeSpec = TypeSpec.BIGINT;
		}
		return typeSpec;
	}
}
