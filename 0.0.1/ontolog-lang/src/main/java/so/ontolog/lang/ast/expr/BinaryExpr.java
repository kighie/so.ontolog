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
import so.ontolog.lang.ast.util.TextUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BinaryExpr extends ASTExpr {

	private static final long serialVersionUID = -1178295662888508086L;
	protected ASTExpr left;
	protected ASTExpr right;

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
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("(");
		buf.append(token.getName()).append(" ");
		buf.append(left).append(",");
		buf.append(right);
		buf.append(")");
		
		return buf.toString();
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append("(");
		buffer.append(token.getName()).append(" ");
		left.getText(buffer, depth+1);
		buffer.append(",");
		right.getText(buffer, depth+1);

		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append(")");
	}
}
