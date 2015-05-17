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

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class ASTDeclaration extends ASTNode {

	private static final long serialVersionUID = -3218930083176435587L;
	protected final QName qname;
	protected final TypeSpec typeSpec;
	
	public ASTDeclaration(ASTToken token, QName qname, TypeSpec typeSpec) {
		super(token);
		this.qname = qname;
		this.typeSpec = typeSpec;
	}
	
	public QName getQname() {
		return qname;
	}

	public TypeSpec getType() {
		return typeSpec;
	}
	
}
