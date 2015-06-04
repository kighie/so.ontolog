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
package so.ontolog.formula.runtime.stmt;

import java.util.LinkedList;
import java.util.List;

import so.ontolog.formula.FormulaException;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class IfStatement extends AbstractBlock {
	private static final long serialVersionUID = -4590974169510516208L;

	private Gettable<Boolean> condition;
	private List<ElseIf> elseIfStmts;
	private Else elseStmt;
	
	public IfStatement(Gettable<Boolean> condition) {
		this.condition = condition;
	}
	
	public void appendElseIf(ElseIf elseif){
		if(elseIfStmts == null){
			elseIfStmts = new LinkedList<IfStatement.ElseIf>();
		}
		elseIfStmts.add(elseif);
	}
	
	public void setElseStmt(Else elseStmt) {
		this.elseStmt = elseStmt;
	}

	@Override
	protected Object evalInternal(Context context) {
		if(condition.get(context)){
			return evalChildren(context);
		} 

		if(elseIfStmts != null){
			for(ElseIf elseif : elseIfStmts){
				if(elseif.condition.get(context)){
					return elseif.evalChildren(context);
				}
			}
		} 
		
		if(elseStmt != null){
			return elseStmt.eval(context);
		}
		
		return null;
	}

	@Override
	protected void fillStackTrace(Context context, FormulaException e) {
		//SKIP
	}
	
	public static class ElseIf extends AbstractBlock {
		private static final long serialVersionUID = -8630217146643767491L;
		
		private Gettable<Boolean> condition;

		public ElseIf(Gettable<Boolean> condition) {
			this.condition = condition;
		}
		
		@Override
		protected Object evalInternal(Context context) {
			if(condition.get(context)){
				return evalChildren(context);
			} 
			
			return null;
		}

		@Override
		protected void fillStackTrace(Context context, FormulaException e) {
			//SKIP
		}
	}

	public static class Else extends AbstractBlock {
		private static final long serialVersionUID = 5725998838593451944L;
		
		@Override
		protected void fillStackTrace(Context context, FormulaException e) {
			//SKIP
		}
	}
}
