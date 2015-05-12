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
import so.ontolog.lang.ast.ASTExpression;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class UnaryExpr extends ASTExpression {

	private static final long serialVersionUID = -3046445070714553198L;
	protected ASTExpression expr;
	protected ASTExpression right;

	public UnaryExpr(ASTToken token, ASTExpression expr) {
		super(token);
		this.expr = expr;
	}

	public UnaryExpr(ASTToken token, TypeSpec typeSpec, ASTExpression expr) {
		super(token, typeSpec);
		this.expr = expr;
	}
	
	/**
	 * @return the left
	 */
	public ASTExpression getExpr() {
		return expr;
	}
	
	@Override
	public <C> C accept(ASTVisitor visitor, C context) {
		return visitor.visit(this, context);
	}

}
