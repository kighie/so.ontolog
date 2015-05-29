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
package so.ontolog.formula.ast.stmt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import so.ontolog.formula.ast.ASTBlock;
import so.ontolog.formula.ast.ASTNode;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.AbstractASTNode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractASTBlock extends AbstractASTNode implements ASTBlock {
	private static final long serialVersionUID = -379295710765793638L;

	@SuppressWarnings("unchecked")
	protected final List<ASTStatement> EMPTY_STATEMENT = Collections.EMPTY_LIST;
	
	protected List<ASTStatement> children;
	
	
	public AbstractASTBlock(ASTToken position) {
		super(position);
	}

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
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		return acceptChildren(visitor, context);
	}
	
	protected <C> C acceptChildren(ASTVisitor<C> visitor, C context) {
		if(children != null){
			for(ASTNode c : children){
				c.accept(visitor, context);
			}
		}
		return context;
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		getChildrenText(buffer, depth);
	}
	
	protected void getChildrenText(StringBuilder buffer, int depth){
		if(children != null){
			int cDepth = depth;
			for(ASTNode c : children){
				c.getText(buffer, cDepth);
			}
		}
	}
}
