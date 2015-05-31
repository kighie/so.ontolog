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
package so.ontolog.formula.ast.decl;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.stmt.AbstractASTBlock;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTFunctionDecl extends AbstractASTBlock implements ASTDeclaration {

	private static final long serialVersionUID = -4346562711378972474L;

	protected List<ASTDeclaration> args;
	protected TypeSpec returnType;
	protected final QName qname;
	protected final String name;
	
	public ASTFunctionDecl(ASTToken token, QName qname, String name, TypeSpec typeSpec, List<ASTDeclaration> args) {
		super(token);
		this.args = args;
		this.qname = qname;
		this.name = name;
		this.returnType = typeSpec;
		if(args != null){
			for(ASTDeclaration d : args){
				addSymbol(d);
			}
		}
	}

	
	@Override
	public QName qname() {
		return qname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public TypeSpec type() {
		return returnType;
	}


	public List<ASTDeclaration> getArgDecls(){
		return args;
	}
	
	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		if(args != null){
			for(ASTDeclaration d : args){
				d.accept(visitor, context);
			}
		}
		
		acceptChildren(visitor, context);
		
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		buffer.append("\n").append(TextUtils.getIndent(depth));
		buffer.append("function ").append(qname).append("(");
		if(args != null){
			boolean first = true;
			for(ASTDeclaration d : args){
				if(first){
					first = false;
				} else {
					buffer.append(",");
				}
				d.getText(buffer, 0);
			}
		}
		buffer.append(") {");
		getChildrenText(buffer, depth+1);
		buffer.append(TextUtils.getIndent(depth)).append("}");
	}

}
