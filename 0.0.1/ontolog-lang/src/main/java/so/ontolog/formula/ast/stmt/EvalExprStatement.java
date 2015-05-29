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

import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.AbstractASTNode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class EvalExprStatement extends AbstractASTNode implements ASTStatement {

	private static final long serialVersionUID = -6200531771237460158L;
	
	protected final ASTExpr expression;
	
	/**
	 * @param position
	 */
	public EvalExprStatement(ASTToken position, ASTExpr expression) {
		super(position);
		this.expression = expression;
	}

	/**
	 * @return the expression
	 */
	public ASTExpr getExpression() {
		return expression;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		expression.accept(visitor, context);
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n(").append(token.getName()).append(" ");
		expression.getText(buffer, 0);
		buffer.append(")");
	}

}
