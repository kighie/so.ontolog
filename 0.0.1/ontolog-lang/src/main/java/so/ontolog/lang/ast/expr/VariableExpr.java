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
package so.ontolog.lang.ast.expr;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTExpression;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class VariableExpr extends ASTExpression {

	private static final long serialVersionUID = 1892405954432146025L;

	protected final QName qname;
	
	public VariableExpr(ASTToken token, QName qname) {
		super(token);
		this.qname = qname;
	}

	/**
	 * @param token
	 * @param typeSpec
	 */
	public VariableExpr(ASTToken token, TypeSpec typeSpec, QName qname) {
		super(token, typeSpec);
		this.qname = qname;
	}
	
	/**
	 * @return the qname
	 */
	public QName getQName() {
		return qname;
	}
	
	@Override
	public <C> C accept(ASTVisitor visitor, C context) {
		return visitor.visit(this, context);
	}

}
