/* ******************************************************************************
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
package so.ontolog.lang;

import so.ontolog.lang.util.SourceLocation;
import so.ontolog.lang.util.SourceLocationUtils;

/**
 * 
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class OntologLangException extends RuntimeException {
	private static final long serialVersionUID = 704251867847845399L;

	protected SourceLocation sourceLocation;

	public OntologLangException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public OntologLangException(String message, Throwable cause) {
		super(message, cause);
	}

	public OntologLangException(String message) {
		super(message);
	}

	public OntologLangException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * <pre></pre>
	 * @param token
	 * @return this object
	 */
	public OntologLangException setLocation(SourceLocation token) {
		this.sourceLocation = token;
		return this;
	}

	/**
	 * <pre></pre>
	 * @param line
	 * @param charPositionInLine
	 * @return this object
	 */
	public OntologLangException setLocation(int line, int charPositionInLine) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine);
		return this;
	}

	/**
	 * <pre></pre>
	 * @param line
	 * @param charPositionInLine
	 * @param startIndex
	 * @param endIndex
	 * @return this object
	 */
	public OntologLangException setLocation(int line, int charPositionInLine, 
			int startIndex, int endIndex) {
		this.sourceLocation = SourceLocationUtils.createSourceLocation(line, charPositionInLine, startIndex, endIndex);
		return this;
	}

	public SourceLocation getLocation() {
		return sourceLocation;
	}
	
	@Override
	public String toString() {
		if(sourceLocation != null){
			StringBuilder buf = new StringBuilder();
			buf.append(super.toString());
			buf.append( " at ").append(sourceLocation);
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
