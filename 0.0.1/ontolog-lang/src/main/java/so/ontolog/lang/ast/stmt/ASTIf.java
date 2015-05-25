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
package so.ontolog.lang.ast.stmt;

import so.ontolog.lang.ast.ASTBlock;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTIf extends ASTBlock {

	private static final long serialVersionUID = 5387617533039143375L;

	private ASTExpr condition;
	
	/**
	 * @param position
	 */
	public ASTIf(ASTToken token, ASTExpr condition) {
		super(token);
		this.condition = condition;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		condition.accept(visitor, context);
		acceptChildren(visitor, context);
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		// TODO Auto-generated method stub
	}
	

	public ASTBlock createElseIf(ASTToken token, ASTExpr condition) {
		return null;
	}

	public ASTBlock checkOutElse(ASTToken token) {
		return null;
	}

	public class ElseIf extends ASTBlock {

		private static final long serialVersionUID = -5448070513540107933L;

		private ASTExpr condition;
		
		/**
		 * @param position
		 */
		public ElseIf(ASTToken token, ASTExpr condition) {
			super(token);
			this.condition = condition;
		}
		
		@Override
		public <C> C accept(ASTVisitor<C> visitor, C context) {
			condition.accept(visitor, context);
			acceptChildren(visitor, context);
//			return visitor.visit(this, context);
			return null;
		}
		
	}
}
