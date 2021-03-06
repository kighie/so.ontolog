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
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTFactory.VariableDeclFactory;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.decl.ASTVariableDecl;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultVariableDeclFactory implements VariableDeclFactory {

	@Override
	public ASTDeclaration create(ASTContext context, ASTToken token,
			TypeSpec typeSpec, String name, ASTExpr valueExpr) {
		QName qname;
//		if(typeSpec.getTypeKind() == TypeKind.Executable){
//			ASTDeclaration fnDecl = context.findFuncDecl(name);
//			if(fnDecl != null){
//				qname = fnDecl.qname();
//			} else {
//				context.getErrorHandler().buildError("Cannot find function : " + name, token);
//				qname = new QName(name);
//			}
//		} else {
//			qname = new QName(name);
//		}
		qname = new QName(name);
		ASTVariableDecl varDecl = new ASTVariableDecl(token, qname, typeSpec);
		varDecl.setValueExpr(valueExpr);
		return varDecl;
	}

}
