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
package so.ontolog.formula.ast.stmt;

import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.expr.ASTCallExpr;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTCallStatement extends ASTStatement {
	private static final long serialVersionUID = 6727044409613296208L;

	private ASTCallExpr callExpr;
	
	/**
	 * @param position
	 */
	public ASTCallStatement(ASTCallExpr expr) {
		super(expr.getToken());
		this.callExpr = expr;
	}

	
	public ASTCallExpr getCallExpr() {
		return callExpr;
	}


	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		callExpr.accept(visitor, context);
		return visitor.visit(this, context);
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n");
		buffer.append("(");
		buffer.append("call ");
		callExpr.getText(buffer, 0);
		buffer.append(")");
	}

}
