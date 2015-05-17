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

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CompilationUnit extends ASTBlock {

	private static final long serialVersionUID = -3772387129534484495L;

	protected final ASTContext context;
	
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
		context = visitor.visit(this, context);
		if(context != null){
			acceptChildren(visitor, context);
		}
		return context;
	}
	
}