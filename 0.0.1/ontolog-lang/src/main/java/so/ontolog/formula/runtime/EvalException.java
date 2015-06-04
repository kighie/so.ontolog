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
package so.ontolog.formula.runtime;

import so.ontolog.formula.FormulaException;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class EvalException extends FormulaException {
	private static final long serialVersionUID = -148960022231244976L;
	
	private Node node;
	
	public EvalException(String message, Throwable cause) {
		super(message, cause);
	}

	public EvalException(String message) {
		super(message);
	}

	public EvalException(Throwable cause) {
		super(cause);
	}

	public EvalException setNode(Node node){
		this.node = node;
		return this;
	}
	
	/**
	 * @return the node
	 */
	public Node getNode() {
		return node;
	}
	
	@Override
	public String toString() {
		if(node != null){
			StringBuilder buf = new StringBuilder();
			buf.append(super.toString());
			buf.append( " :: ").append(node);
			return buf.toString();
		} else {
			return super.toString();
		}	
	}
}
