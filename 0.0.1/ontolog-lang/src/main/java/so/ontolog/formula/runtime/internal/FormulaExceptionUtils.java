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
package so.ontolog.formula.runtime.internal;

import so.ontolog.formula.FormulaException;
import so.ontolog.formula.OntologSource;
import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.util.ExceptionUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FormulaExceptionUtils {

	public static FormulaException makeException(OntologSource source, String message, 
			SourcePosition token, Exception cause) {
		StackTraceElement element = ExceptionUtils.makeStackTraceElement(source, token, token.getName());
		
		StringBuilder builder = new StringBuilder();
		if(message!=null){
			builder.append(message);
		}
		builder.append(" : ");
		source.getText(token, builder);
		
		FormulaException exception;
		if(cause != null){
			exception = new FormulaException(builder.toString(), cause);
		} else {
			exception = new FormulaException(builder.toString());
		}
		
		StackTraceElement[] stackTrace = exception.getStackTrace();
		stackTrace[0] = element;

		int length = Math.min(stackTrace.length, 5);
		StackTraceElement[] newStackTrace = new StackTraceElement[length];
		System.arraycopy(stackTrace, 0, newStackTrace, 0, length);
		
		exception.setStackTrace(newStackTrace);
		return exception;
	}
	
}
