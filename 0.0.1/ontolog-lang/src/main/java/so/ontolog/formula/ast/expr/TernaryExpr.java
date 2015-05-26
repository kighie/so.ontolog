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
package so.ontolog.formula.ast.expr;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TernaryExpr extends ASTExpr {

	private static final long serialVersionUID = -5755226002106875177L;
	protected ASTExpr expr1;
	protected ASTExpr expr2;
	protected ASTExpr expr3;

	public TernaryExpr(ASTToken token, TypeSpec typeSpec, ASTExpr expr1,
			ASTExpr expr2, ASTExpr expr3) {
		super(token, typeSpec);
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.expr3 = expr3;
	}

	/**
	 * @return the left
	 */
	public ASTExpr getExpr1() {
		return expr1;
	}
	
	/**
	 * @return the right
	 */
	public ASTExpr getExpr2() {
		return expr2;
	}
	
	public ASTExpr getExpr3() {
		return expr3;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		expr1.accept(visitor, context);
		expr2.accept(visitor, context);
		expr3.accept(visitor, context);
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append("(");
		buffer.append(token.getName()).append(" ");
		expr1.getText(buffer, depth+1);
		buffer.append(" ? ");
		expr2.getText(buffer, depth+1);
		buffer.append(" : ");
		expr3.getText(buffer, depth+1);
		buffer.append(")");
	}
}
