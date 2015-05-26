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

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class VariableDecl extends ASTDeclaration {

	private static final long serialVersionUID = -5739860630818499547L;

	private ASTExpr valueExpr;
	
	/**
	 * @param token
	 * @param qname
	 * @param typeSpec
	 */
	public VariableDecl(ASTToken token, QName qname, TypeSpec typeSpec) {
		super(token, qname, typeSpec);
	}

	public ASTExpr getValueExpr() {
		return valueExpr;
	}

	public void setValueExpr(ASTExpr valueExpr) {
		this.valueExpr = valueExpr;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		if(valueExpr != null){
			valueExpr.accept(visitor, context);
		}
		
		return visitor.visit(this, context);
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		
		buffer.append("(").append(token.getName()).append(" ");
		buffer.append(typeSpec.getName()).append(" ").append(qname);
		if(valueExpr != null){
			valueExpr.getText(buffer, depth+1);
		}
		buffer.append(")");
	}
	
}
