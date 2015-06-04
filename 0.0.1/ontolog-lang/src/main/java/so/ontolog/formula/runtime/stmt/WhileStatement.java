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

import so.ontolog.formula.FormulaException;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class WhileStatement extends AbstractBlock {

	private static final long serialVersionUID = -6974427512817908933L;
	
	private final Gettable<Boolean> loopCondition;
	
	
	public WhileStatement(Gettable<Boolean> loopCondition) {
		super();
		this.loopCondition = loopCondition;
	}


	
	@Override
	protected Object evalInternal(Context context) {
		Object rtn = null;
		while(loopCondition.get(context)){
			rtn = evalChildren(context);
			if(rtn != null){
				return rtn;
			}
		}
		return rtn;
	}

	@Override
	protected void fillStackTrace(Context context, FormulaException e) {
		//SKIP
	}
}
