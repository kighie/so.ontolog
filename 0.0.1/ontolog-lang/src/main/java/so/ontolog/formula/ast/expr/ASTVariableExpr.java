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

import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTVariableExpr extends AbstractASTSymbol {

	private static final long serialVersionUID = 1892405954432146025L;
	
	private PropertyAccessor<?,?> propertyAccessor;
	
	/**
	 * @param token
	 * @param typeSpec
	 */
	public ASTVariableExpr(ASTToken token, TypeSpec typeSpec, QName qname) {
		super(token, typeSpec, qname);
	}
	
	public PropertyAccessor<?, ?> getPropertyAccessor() {
		return propertyAccessor;
	}

	public void setPropertyAccessor(PropertyAccessor<?, ?> propertyAccessor) {
		this.propertyAccessor = propertyAccessor;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
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
		buffer.append("(").append(token.getName()).append(" ").append(qname).append(")");
	}
}
