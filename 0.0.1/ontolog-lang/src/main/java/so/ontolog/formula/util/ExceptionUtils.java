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
package so.ontolog.formula.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import so.ontolog.formula.OntologSource;
import so.ontolog.formula.SourcePosition;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ExceptionUtils {
	
	public static Exception fillStackTrace(OntologSource source, SourcePosition token, 
			String methodName, Exception cause) {
		StackTraceElement element = makeStackTraceElement(source, token, methodName);

		StackTraceElement[] stackTrace = cause.getStackTrace();
		StackTraceElement[] newStackTrace = new StackTraceElement[stackTrace.length+1];
		
		int start =0;
		for(;start<stackTrace.length;start++){
			if(!"Ontolog".equals( stackTrace[start].getClassName() )){
				break;
			}
		}
		if(start>0){
			System.arraycopy(stackTrace, 0, newStackTrace, 0, start);
			newStackTrace[start] = element;
			System.arraycopy(stackTrace, start, newStackTrace, start+1, stackTrace.length-start);
		} else {
			newStackTrace[0] = element;
			System.arraycopy(stackTrace, 0, newStackTrace, 1, stackTrace.length);
		}
		
		cause.setStackTrace(newStackTrace);
		
		return cause;
	}
	
	/**<pre></pre>
	 * @param source
	 * @param token
	 * @param methodName
	 * @return
	 */
	public static StackTraceElement makeStackTraceElement(
			OntologSource source, SourcePosition token, String methodName) {
		String sourcePath = source.getSourcePath() ;
		
		if(sourcePath == null){
			sourcePath = source.getSourceString();
		}
		
		if(methodName == null){
			methodName = "unknwon";
		}
		
		return new StackTraceElement("Ontolog", methodName, sourcePath, token.getLine());
	}
	
	public static String toString(Iterable<Exception> exceptions){
		StringWriter writer = new StringWriter(1024);
		PrintWriter printer = new PrintWriter(writer);
		printer.println();
		for(Exception e : exceptions){
			e.printStackTrace(printer);
		}
		printer.flush();
		return writer.toString();
	}
}
