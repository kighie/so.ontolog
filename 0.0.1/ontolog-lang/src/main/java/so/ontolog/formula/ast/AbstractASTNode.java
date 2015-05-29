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
package so.ontolog.formula.ast;

import java.util.Collections;
import java.util.List;

import so.ontolog.formula.runtime.Node;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractASTNode implements ASTNode {
	private static final long serialVersionUID = -2448547060134876394L;
	
	@SuppressWarnings("unchecked")
	protected final List<? extends AbstractASTNode> EMPTY_CHILDREN = Collections.EMPTY_LIST;

	protected ASTToken token;
	protected Node rtNode;
	
	public AbstractASTNode(ASTToken token) {
		this.token = token;
	}

	@Override
	public ASTToken getToken(){
		return token;
	}

	@Override
	public ASTNode setToken(ASTToken token){
		this.token = token;
		return this;
	}
	
	@Override
	public abstract <C> C accept(ASTVisitor<C> visitor, C context);
	
	@Override
	public List<? extends ASTNode> children(){
		return EMPTY_CHILDREN;
	}

	@Override
	public abstract void getText(StringBuilder buffer, int depth);
	
	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		getText(buffer, 0);
		return buffer.toString();
	}
	
	@Override
	public Node getNode() {
		return rtNode;
	}
	
	@Override
	public void setNode(Node rtNode) {
		this.rtNode = rtNode;
	}
}
