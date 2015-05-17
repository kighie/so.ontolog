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
package so.ontolog.lang.ast;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import so.ontolog.lang.runtime.Node;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class ASTNode implements Serializable {
	private static final long serialVersionUID = -2448547060134876394L;
	
	@SuppressWarnings("unchecked")
	protected final List<? extends ASTNode> EMPTY_CHILDREN = Collections.EMPTY_LIST;

	protected ASTToken token;
	protected Node rtNode;
	
	public ASTNode(ASTToken token) {
		this.token = token;
	}

	/**
	 * @return this node's position
	 */
	public ASTToken getToken(){
		return token;
	}

	/**
	 * set this node's location
	 * @param position
	 * @return this node
	 */
	public ASTNode setToken(ASTToken token){
		this.token = token;
		return this;
	}
	
	/**
	 * <pre></pre>
	 * @param visitor
	 * @param context
	 * @return
	 */
	public abstract <C> C accept(ASTVisitor<C> visitor, C context);
	
	public List<? extends ASTNode> children(){
		return EMPTY_CHILDREN;
	}

	public abstract void getText(StringBuilder buffer, int depth);
	
	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		getText(buffer, 0);
		return buffer.toString();
	}
	
	/**
	 * @return the rtNode
	 */
	public Node getNode() {
		return rtNode;
	}
	
	/**
	 * @param rtNode the rtNode to set
	 */
	public void setNode(Node rtNode) {
		this.rtNode = rtNode;
	}
}
