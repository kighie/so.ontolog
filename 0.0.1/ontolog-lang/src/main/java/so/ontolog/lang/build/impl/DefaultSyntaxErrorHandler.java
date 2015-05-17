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
package so.ontolog.lang.build.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.lang.SourcePosition;
import so.ontolog.lang.ast.SyntaxErrorHandler;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultSyntaxErrorHandler implements SyntaxErrorHandler {
	private static Logger logger = Logger.getLogger("SyntaxErrorHandler");
	
	@Override
	public void syntaxError(String message, Object offendingSymbol,
			SourcePosition location, Exception cause) {
		logger.log(Level.SEVERE, message, cause);
	}

}
