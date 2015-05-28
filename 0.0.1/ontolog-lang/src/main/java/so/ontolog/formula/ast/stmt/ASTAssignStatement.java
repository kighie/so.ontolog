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
import so.ontolog.formula.ast.util.TextUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTAssignStatement extends ASTStatement {

	private static final long serialVersionUID = -3405771545984022318L;

	private final ASTExpr varExpr;
	private final ASTExpr valueExpr;

	public ASTAssignStatement(ASTToken position, ASTExpr varExpr,
			ASTExpr valueExpr) {
		super(position);
		this.varExpr = varExpr;
		this.valueExpr = valueExpr;
	}

	
	/**
	 * @return the varExpr
	 */
	public ASTExpr getVarExpr() {
		return varExpr;
	}


	public ASTExpr getValueExpr() {
		return valueExpr;
	}



	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		varExpr.accept(visitor, context);
		valueExpr.accept(visitor, context);
		return visitor.visit(this, context);
	}

	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n").append(TextUtils.getIndent(depth));
		buffer.append("(");
		buffer.append("assign ");
		varExpr.getText(buffer, 0);
		buffer.append(" = ");
		valueExpr.getText(buffer, 0);
		buffer.append(")");
	}

}
