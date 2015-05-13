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
package so.ontolog.lang.ast.expr;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BinaryExpr extends ASTExpr {

	private static final long serialVersionUID = -1178295662888508086L;
	protected ASTExpr left;
	protected ASTExpr right;

//	/**
//	 * @param position
//	 * @param typeSpec
//	 */
//	public BinaryExpr(ASTToken token, ASTExpr left, ASTExpr right) {
//		super(token);
//		this.left = left;
//		this.right = right;
//	}

	public BinaryExpr(ASTToken token, TypeSpec typeSpec, ASTExpr left, ASTExpr right) {
		super(token, typeSpec);
		this.left = left;
		this.right = right;
	}
	
	/**
	 * @return the left
	 */
	public ASTExpr getLeft() {
		return left;
	}
	
	/**
	 * @return the right
	 */
	public ASTExpr getRight() {
		return right;
	}
	
	@Override
	public <C> C accept(ASTVisitor visitor, C context) {
		return visitor.visit(this, context);
	}

}
