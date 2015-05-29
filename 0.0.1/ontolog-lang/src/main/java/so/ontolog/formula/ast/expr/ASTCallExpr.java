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

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class ASTCallExpr extends AbstractASTSymbol {

	private static final long serialVersionUID = -976688139106286789L;
	
	protected List<ASTExpr> args;
	protected Class<?>[]paramTypeArray;
	
	
	/**
	 * @param token
	 * @param typeSpec
	 * @param qname
	 * @param method
	 * @param args
	 */
	public ASTCallExpr(ASTToken token, TypeSpec typeSpec, QName qname,  List<ASTExpr> args) {
		super(token, typeSpec, qname);
		this.args = args;
	}
	
	public List<ASTExpr> getArgs() {
		return args;
	}
	
	public Class<?>[] getRequiredParamTypes() {
		return paramTypeArray;
	}

	public void setRequiredParamTypes(Class<?>[] argTypeArray) {
		this.paramTypeArray = argTypeArray;
	}
	
}
