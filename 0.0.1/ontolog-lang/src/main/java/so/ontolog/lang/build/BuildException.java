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
package so.ontolog.lang.build;

import so.ontolog.lang.OntologLangException;
import so.ontolog.lang.ast.ASTNode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BuildException extends OntologLangException {

	private static final long serialVersionUID = -2856099805781611531L;

	private ASTNode node;
	
	public BuildException(String message, Throwable cause) {
		super(message, cause);
	}

	public BuildException(String message) {
		super(message);
	}

	public BuildException(Throwable cause) {
		super(cause);
	}

	public BuildException setNode(ASTNode node){
		this.node = node;
		setLocation(node.getToken());
		return this;
	}
	
	/**
	 * @return the node
	 */
	public ASTNode getNode() {
		return node;
	}
	
	/* (non-Javadoc)
	 * @see so.ontolog.lang.OntologLangException#toString()
	 */
	@Override
	public String toString() {
		if(node != null){
			StringBuilder buf = new StringBuilder();
			buf.append(super.toString());
			buf.append( " at ").append(node);
			return buf.toString();
		} else {
			return super.toString();
		}
	}
}
