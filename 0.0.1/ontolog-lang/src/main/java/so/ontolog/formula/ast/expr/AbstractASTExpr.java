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
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.AbstractASTNode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractASTExpr extends AbstractASTNode implements ASTExpr {
	private static final long serialVersionUID = 874891282549239854L;

	protected TypeSpec typeSpec;
	
	public AbstractASTExpr(ASTToken token, TypeSpec typeSpec) {
		super(token);
		this.typeSpec = typeSpec;
	}
	
	/**
	 * @param typeSpec the typeSpec to set
	 */
	public void setType(TypeSpec typeSpec) {
		this.typeSpec = typeSpec;
	}
	
	/**
	 * @return the typeSpec
	 */
	public TypeSpec type() {
		return typeSpec;
	}
}
