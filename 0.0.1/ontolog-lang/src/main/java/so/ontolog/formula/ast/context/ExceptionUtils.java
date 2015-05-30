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
package so.ontolog.formula.ast.context;

import java.io.PrintWriter;
import java.io.StringWriter;

import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTNode;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.build.BuildException;
import so.ontolog.formula.build.OntologSource;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ExceptionUtils {

	public static ASTException makeException(OntologSource source, String message, ASTToken token) {
		StackTraceElement element = makeStackTraceElement(source, token, token.getName());
		
		StringBuilder builder = new StringBuilder(message);
		source.getText(token, builder);
		ASTException exception = new ASTException(builder.toString());
		StackTraceElement[] stackTrace = exception.getStackTrace();
		stackTrace[0] = element;
		exception.setStackTrace(stackTrace);
		return exception;
	}
	
	public static Exception fillStackTrace(OntologSource source, SourcePosition token, Exception cause) {
		StackTraceElement element = makeStackTraceElement(source, token, cause);

		StackTraceElement[] stackTrace = cause.getStackTrace();
		StackTraceElement[] newStackTrace = new StackTraceElement[stackTrace.length+1];
		
		newStackTrace[0] = element;
		System.arraycopy(stackTrace, 0, newStackTrace, 1, stackTrace.length);
		cause.setStackTrace(newStackTrace);
		
		return cause;
	}

	/**<pre></pre>
	 * @param source
	 * @param token
	 * @param cause
	 * @return
	 */
	protected static StackTraceElement makeStackTraceElement(
			OntologSource source, SourcePosition token, Exception cause) {
		String methodName;
		
		if( cause instanceof BuildException){
			ASTNode node = ((BuildException)cause).getNode();
			if(node != null){
				methodName = node.toString();
			} else {
				methodName = token.getName();
			}
		} else {
			methodName = token.getName();
		}

		return makeStackTraceElement(source, token, methodName);
	}

	/**<pre></pre>
	 * @param source
	 * @param token
	 * @param methodName
	 * @return
	 */
	protected static StackTraceElement makeStackTraceElement(
			OntologSource source, SourcePosition token, String methodName) {
		String sourcePath = source.getSourcePath() ;
		
		if(sourcePath == null){
			sourcePath = source.getSourceString();
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
