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
package so.ontolog.formula.build.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.ast.ASTErrorHandler;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.build.BuildErrorHandler;
import so.ontolog.formula.build.BuildException;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultErrorHandler implements ASTErrorHandler, BuildErrorHandler {
	private static Logger logger = Logger.getLogger("SyntaxErrorHandler");
	
	@Override
	public void syntaxError(String message, Object offendingSymbol,
			SourcePosition location, Exception cause) {
		logger.log(Level.SEVERE, message, cause);
		
//		throw new ASTException(message, cause).setLocation(location);
	}

	@Override
	public void buildError(String message, ASTToken token) {
		logger.log(Level.SEVERE, message);
	}
	
	@Override
	public void buildError(ASTToken token, Exception cause) {
		logger.log(Level.SEVERE, cause.getMessage(), cause);
//		throw new ASTException(cause.getMessage(), cause).setLocation(token);
	}
	
	@Override
	public void buildError(String message, ASTToken token, Exception cause) {
		logger.log(Level.SEVERE, message, cause);
//		throw new ASTException(message, cause).setLocation(token);
	}
	
	@Override
	public void buildWarning(String message, ASTToken token) {
		logger.log(Level.SEVERE, message);
//		throw new ASTException(message).setLocation(token);
	}
	
	@Override
	public void buildWarning(ASTException astWaring) {
		logger.log(Level.WARNING, "", astWaring);
	}
	
	@Override
	public void compileError(String message, SourcePosition location,
			Exception cause) {
		logger.log(Level.SEVERE, message, cause);
		throw new BuildException(message, cause).setLocation(location);
	}


}
