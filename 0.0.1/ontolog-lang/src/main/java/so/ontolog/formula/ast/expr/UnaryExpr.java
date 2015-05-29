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

import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.Operator;
import so.ontolog.formula.runtime.Operator.Unary;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class UnaryExpr extends AbstractASTExpr {

	private static final long serialVersionUID = -3046445070714553198L;
	protected ASTExpr expr;

	protected Operator.Unary<?, ?> operator;

	public UnaryExpr(ASTToken token, Unary<?, ?> operator, ASTExpr expr) {
		super(token, operator.type());
		this.operator = operator;
		this.expr = expr;
	}
	
	/**
	 * @return the left
	 */
	public ASTExpr getExpr() {
		return expr;
	}
	
	/**
	 * @return the operator
	 */
	public Operator.Unary<?, ?> getOperator() {
		return operator;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		expr.accept(visitor, context);
		return visitor.visit(this, context);
	}

	@Override
	public String toString() {
		return "(" + token.getName() + " " + expr + ")";
	}
	

	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		
		buffer.append("(").append(token.getName()).append(" ");
		expr.getText(buffer, depth+1);
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append(")");
	}
}
