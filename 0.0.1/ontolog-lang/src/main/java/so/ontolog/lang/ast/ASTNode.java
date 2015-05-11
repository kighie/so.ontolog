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

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class ASTNode implements Serializable {
	private static final long serialVersionUID = -2448547060134876394L;
	
	@SuppressWarnings("unchecked")
	protected final List<? extends ASTNode> EMPTY_CHILDREN = Collections.EMPTY_LIST;
	
	protected SourcePosition position;
	
	/**
	 * @return this node's position
	 */
	public SourcePosition getPosition(){
		return position;
	}

	/**
	 * set this node's location
	 * @param position
	 * @return this node
	 */
	public ASTNode setPosition(SourcePosition position){
		this.position = position;
		return this;
	}
	
	/**
	 * <pre></pre>
	 * @param visitor
	 * @param context
	 * @return
	 */
	public abstract <C> C accept(ASTVisitor visitor, C context);

	/**
	 * @return this node's grammar token
	 * @see GrammarTokens
	 */
	public abstract String getToken();
	
	
	public List<? extends ASTNode> children(){
		return EMPTY_CHILDREN;
	}
}
