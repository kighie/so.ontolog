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
import so.ontolog.formula.OntologLangException;
import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Statement;
import so.ontolog.formula.runtime.internal.FormulaExceptionUtils;
import so.ontolog.formula.util.ExceptionUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractStatement implements Statement {

	private static final long serialVersionUID = 609630469668109183L;

	protected SourcePosition sourcePosition;

	@Override
	public void setSourcePosition(SourcePosition position) {
		this.sourcePosition = position;
	}

	@Override
	public SourcePosition getSourcePosition() {
		return sourcePosition;
	}
	
	@Override
	public final Object eval(Context context) {
		Object rtn = null;
		try{
			evalImpl(context);
		} catch (FormulaException e){
			FormulaException ote = (FormulaException)e;
			
			fillStackTrace(context, ote);
			
			throw ote;
		} catch (OntologLangException e){
			OntologLangException ote = (OntologLangException)e;
			if(ote.getLocation() == null){
				ote.setLocation(sourcePosition);
			} 
			throw ote;
		} catch (Exception e){
			FormulaException exception = FormulaExceptionUtils.makeException(context.getSource(), e.getMessage(), sourcePosition, e);
			throw exception;
		}
		return rtn;
	}
	
	protected void fillStackTrace(Context context, FormulaException e){
		if(sourcePosition != null){
			if(e.getLocation() == null){
				e.setLocation(sourcePosition);
			} 
			if(e.getSourceLine() == null){
				e.setSourceLine(context.getLine(sourcePosition));
			} 
			
			ExceptionUtils.fillStackTrace(context.getSource(), sourcePosition, sourcePosition.getName(), e);
		}
	}
	
	protected abstract Object evalImpl(Context context);
}
