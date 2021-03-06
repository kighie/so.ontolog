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

import so.ontolog.formula.OntologSource;
import so.ontolog.formula.ast.stmt.AbstractASTBlock;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CompilationUnit extends AbstractASTBlock {

	private static final long serialVersionUID = -3772387129534484495L;

	protected final ASTContext context;
	private OntologSource ontologSource;

	/**
	 * @param token
	 */
	public CompilationUnit(ASTContext context, ASTToken token) {
		super(token);
		this.context = context;
	}

	/**
	 * @return the context
	 */
	public ASTContext getContext() {
		return context;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		acceptChildren(visitor, context);
		visitor.visit(this, context);
		if(context != null){
			
		}
		return context;
	}

	public OntologSource getSource() {
		return ontologSource;
	}

	public void setSource(OntologSource ontologSource) {
		this.ontologSource = ontologSource;
	}
}
