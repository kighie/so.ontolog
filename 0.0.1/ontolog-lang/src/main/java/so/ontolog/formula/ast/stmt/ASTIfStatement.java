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

import java.util.LinkedList;
import java.util.List;

import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTIfStatement extends ASTBlock {

	private static final long serialVersionUID = 5387617533039143375L;

	private ASTExpr condition;
	private List<ElseIf> elseifStmts = new LinkedList<ASTIfStatement.ElseIf>();
	private Else elseStmt;
	
	/**
	 * @param position
	 */
	public ASTIfStatement(ASTToken token, ASTExpr condition) {
		super(token);
		this.condition = condition;
	}
	
	/**
	 * @return the condition
	 */
	public ASTExpr getCondition() {
		return condition;
	}
	
	public List<ElseIf> getElseifStmts() {
		return elseifStmts;
	}

	public Else getElseStmt() {
		return elseStmt;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		condition.accept(visitor, context);
		acceptChildren(visitor, context);
		
		for(ElseIf elseif : elseifStmts){
			elseif.accept(visitor, context);
		}
		if(elseStmt != null){
			elseStmt.accept(visitor, context);
		}
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n").append(TextUtils.getIndent(depth));
		buffer.append("if(").append(condition).append("){");
		getChildrenText(buffer, depth+1);
		buffer.append(TextUtils.getIndent(depth)).append("}");
		for(ElseIf elseif : elseifStmts){
			elseif.getText(buffer, depth);
		}
		
		if(elseStmt != null){
			elseStmt.getText(buffer, depth);
		}
		
	}
	

	public ASTBlock createElseIf(ASTToken token, ASTExpr condition) {
		ElseIf elseif = new ElseIf(token, condition);
		elseifStmts.add(elseif);
		return elseif;
	}

	public ASTBlock checkOutElse(ASTToken token) {
		elseStmt = new Else(token);
		return elseStmt;
	}

	public static class ElseIf extends ASTBlock {

		private static final long serialVersionUID = -5448070513540107933L;

		private ASTExpr condition;
		
		/**
		 * @param position
		 */
		public ElseIf(ASTToken token, ASTExpr condition) {
			super(token);
			this.condition = condition;
		}

		/**
		 * @return the condition
		 */
		public ASTExpr getCondition() {
			return condition;
		}
		
		@Override
		public <C> C accept(ASTVisitor<C> visitor, C context) {
			condition.accept(visitor, context);
			acceptChildren(visitor, context);
			return visitor.visit(this, context);
		}
		
		@Override
		public void getText(StringBuilder buffer, int depth) {
			buffer.append("\n").append(TextUtils.getIndent(depth));
			buffer.append("else if(").append(condition).append("){");
			getChildrenText(buffer, depth);
			buffer.append(TextUtils.getIndent(depth)).append("}");
		}
	}
	
	public static class Else extends ASTBlock {
		private static final long serialVersionUID = -9037814467321550962L;

		/**
		 * @param position
		 */
		public Else(ASTToken token) {
			super(token);
		}
		
		@Override
		public <C> C accept(ASTVisitor<C> visitor, C context) {
			acceptChildren(visitor, context);
			return visitor.visit(this, context);
		}

		@Override
		public void getText(StringBuilder buffer, int depth) {
			buffer.append("\n").append(TextUtils.getIndent(depth));
			buffer.append("else {");
			getChildrenText(buffer, depth);
			buffer.append(TextUtils.getIndent(depth)).append("}");
		}
	}
}
