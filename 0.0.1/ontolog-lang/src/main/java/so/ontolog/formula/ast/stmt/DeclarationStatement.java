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

import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTStatement;
import so.ontolog.formula.ast.ASTVisitor;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DeclarationStatement extends ASTStatement {

	private static final long serialVersionUID = -1281881442241216841L;

	protected final ASTDeclaration declaration;
	
	/**
	 * @param position
	 */
	public DeclarationStatement(ASTDeclaration decl) {
		super(decl.getToken());
		this.declaration = decl;
	}
	
	/**
	 * @return the declaration
	 */
	public ASTDeclaration getDeclaration() {
		return declaration;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		declaration.accept(visitor, context);
		setNode(declaration.getNode());
		return context;
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n");
		buffer.append("(");
		buffer.append("decl ");
		declaration.getText(buffer, 0);
		buffer.append(")");
	}

}
