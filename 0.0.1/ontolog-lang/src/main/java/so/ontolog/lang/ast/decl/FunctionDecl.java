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
package so.ontolog.lang.ast.decl;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionDecl extends ASTDeclaration {

	private static final long serialVersionUID = -4346562711378972474L;

	protected Class<?>[]paramTypeArray;
	
	/**
	 * @param token
	 * @param qname
	 * @param typeSpec
	 */
	public FunctionDecl(ASTToken token, QName qname, TypeSpec typeSpec) {
		super(token, qname, typeSpec);
	}
	
	public Class<?>[] getParamTypeArray() {
		return paramTypeArray;
	}

	public void setParamTypeArray(Class<?>[] paramTypeArray) {
		this.paramTypeArray = paramTypeArray;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		// TODO Auto-generated method stub
	}

}
