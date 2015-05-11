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

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class ASTBlock extends ASTNode {
	private static final long serialVersionUID = -379295710765793638L;

	@SuppressWarnings("unchecked")
	protected final List<ASTStatement> EMPTY_STATEMENT = Collections.EMPTY_LIST;
	
	protected List<ASTStatement> children;
	
	
	public boolean append(ASTStatement e) {
		if(children == null){
			children = new LinkedList<ASTStatement>();
		}
		return children.add(e);
	}
	
	@Override
	public List<ASTStatement> children() {
		if(children == null){
			return EMPTY_STATEMENT;
		}
		return children;
	}

	@Override
	public <C> C accept(ASTVisitor visitor, C context) {
		return acceptChildren(visitor, context);
	}
	
	protected <C> C acceptChildren(ASTVisitor visitor, C context) {
		if(children != null){
			for(ASTNode c : children){
				c.accept(visitor, context);
			}
		}
		return context;
	}

	
}
