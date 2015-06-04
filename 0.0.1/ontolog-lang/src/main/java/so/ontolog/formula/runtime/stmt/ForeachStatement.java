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

import java.lang.reflect.Array;

import so.ontolog.formula.FormulaException;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.expr.LoopCondition;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ForeachStatement extends AbstractBlock {
	private static final long serialVersionUID = 3105138382122206L;

	private final LoopCondition loopCondition;
	
	
	public ForeachStatement(LoopCondition loopCondition) {
		this.loopCondition = loopCondition;
	}


	@SuppressWarnings("rawtypes")
	@Override
	protected Object evalInternal(Context context) {
		QName qname = loopCondition.getVarDecl().getQName();
		Object iterable = loopCondition.getIterator().get(context);
		
		Object rtn = null;
		if(iterable instanceof Iterable<?>){
			rtn = listLoop(qname, (Iterable)iterable, context);
		} else if(iterable.getClass().isArray()){
			rtn= arrayLoop(qname, iterable, context);
		}
		return rtn;
	}
	
	Object arrayLoop(QName qname, Object iterator, Context context){
		int length = Array.getLength(iterator);
		Object rtn = null;
		for(int i = 0 ; i<length ; i++){
			Object value = Array.get(iterator, i);
			context.setReference(qname, value);
			
			rtn = evalChildren(context);
			if(rtn != null){
				return rtn;
			}
		}
		return null;
	}
	

	Object listLoop(QName qname, Iterable<?> iterable, Context context){
		Object rtn = null;
		for(Object value : iterable){
			context.setReference(qname, value);
			rtn = evalChildren(context);
			if(rtn != null){
				return rtn;
			}
		}
		return null;
	}
	

	@Override
	protected void fillStackTrace(Context context, FormulaException e) {
		//SKIP
	}
}
