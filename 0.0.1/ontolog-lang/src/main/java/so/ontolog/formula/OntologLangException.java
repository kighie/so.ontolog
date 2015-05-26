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
package so.ontolog.formula;


/**
 * 
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class OntologLangException extends RuntimeException {
	private static final long serialVersionUID = 704251867847845399L;

	protected SourcePosition sourceLocation;
	
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
	public OntologLangException setLocation(SourcePosition token) {
		this.sourceLocation = token;
		return this;
	}
	
	public SourcePosition getLocation() {
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
