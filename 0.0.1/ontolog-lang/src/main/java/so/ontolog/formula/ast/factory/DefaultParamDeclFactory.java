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
package so.ontolog.formula.ast.factory;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTFactory.ParamDeclFactory;
import so.ontolog.formula.ast.decl.ParamDecl;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultParamDeclFactory implements ParamDeclFactory {
	
	
	@Override
	public ParamDecl create(ASTContext context, ASTToken token,
			TypeSpec type, String paramName, String alias) {
		QName qname;
		QName paramQName = new QName(paramName);
		if(alias != null){
			qname = new QName(alias);
		} else {
			qname = paramQName;
		}
		ParamDecl paramDecl = new ParamDecl(token, qname, type, paramQName);
		
		return paramDecl;
	}

}
