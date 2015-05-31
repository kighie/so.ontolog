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
import so.ontolog.formula.ast.decl.ASTVariableDecl;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTLoopCondition extends AbstractASTExpr {

	private static final long serialVersionUID = -2944616438543779976L;

	private final ASTVariableDecl varDelc;
	private final ASTExpr iteratorExpr;
	
	/**
	 * @param token
	 * @param typeSpec
	 */
	public ASTLoopCondition(ASTToken token, ASTVariableDecl varDelc, ASTExpr iteratorExpr) {
		super(token, varDelc.type());
		this.varDelc = varDelc;
		this.iteratorExpr = iteratorExpr;
	}
	
	
	public ASTVariableDecl getVarDelc() {
		return varDelc;
	}


	public ASTExpr getIteratorExpr() {
		return iteratorExpr;
	}


	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		varDelc.accept(visitor, context);
		iteratorExpr.accept(visitor, context);
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		varDelc.getText(buffer, 0);
		buffer.append( " in ");
		iteratorExpr.getText(buffer, 0);
	}

}
