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
package so.ontolog.formula.ast.expr;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CompositeSymbolExpr extends ASTSymbol {

	private static final long serialVersionUID = -1476125755606003012L;

	private ASTSymbol parent;
	private ASTSymbol varIndexer;
	
	/**
	 * @param token
	 * @param typeSpec
	 */
	public CompositeSymbolExpr(ASTToken token, TypeSpec typeSpec, QName qname) {
		super(token, typeSpec, qname);
	}
	
	public ASTSymbol getVarIndexer() {
		return varIndexer;
	}

	public void setVarIndexer(ASTSymbol varIndexer) {
		this.varIndexer = varIndexer;
	}
	
	

	public ASTSymbol getParent() {
		return parent;
	}

	public void setParent(ASTSymbol parent) {
		this.parent = parent;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		visitor.visit(parent, context);
		visitor.visit(varIndexer, context);
		
		return visitor.visit(this, context);
	}

	@Override
	public String toString() {
		return "(" + token.getName() + " " + qname + ")";
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append("(").append(token.getName()).append(" ").append(qname).append(" ");
		parent.getText(buffer, depth+1);
		varIndexer.getText(buffer, depth+1);
		buffer.append(")");
	}
}
