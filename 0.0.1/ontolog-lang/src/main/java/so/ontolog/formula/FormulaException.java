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
package so.ontolog.formula;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FormulaException extends OntologLangException {

	private static final long serialVersionUID = -6503663827943562820L;

	private String sourceLine;
	
	public FormulaException(String message, Throwable cause) {
		super(message, cause);
	}

	public FormulaException(String message) {
		super(message);
	}

	public FormulaException(Throwable cause) {
		super(cause);
	}

	public String getSourceLine() {
		return sourceLine;
	}

	public void setSourceLine(String sourceLine) {
		this.sourceLine = sourceLine;
	}


	@Override
	public String toString() {
		if(sourceLine != null){
			StringBuilder buf = new StringBuilder();
			buf.append(super.getMessage());
			buf.append( "\n").append(sourceLine);
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
