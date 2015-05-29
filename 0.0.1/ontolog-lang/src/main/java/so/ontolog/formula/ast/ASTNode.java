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

import java.io.Serializable;
import java.util.List;

import so.ontolog.formula.runtime.Node;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTNode extends Serializable{

	/**
	 * @return this node's position
	 */
	public abstract ASTToken getToken();

	/**
	 * set this node's location
	 * @param position
	 * @return this node
	 */
	public abstract ASTNode setToken(ASTToken token);

	/**
	 * <pre></pre>
	 * @param visitor
	 * @param context
	 * @return
	 */
	public abstract <C> C accept(ASTVisitor<C> visitor, C context);

	public abstract List<? extends ASTNode> children();

	public abstract void getText(StringBuilder buffer, int depth);

	/**
	 * @return the rtNode
	 */
	public abstract Node getNode();

	/**
	 * @param rtNode the rtNode to set
	 */
	public abstract void setNode(Node rtNode);

}