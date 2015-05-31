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

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTFactory.CallExprFactory;
import so.ontolog.formula.ast.decl.ASTFunctionDecl;
import so.ontolog.formula.ast.expr.ASTFunctionCallExpr;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionCallExprFactory implements CallExprFactory {

	
	@Override
	public ASTSymbol create(ASTContext context, ASTToken token, ASTSymbol beanRef, String name, List<ASTExpr> args) {
		if(beanRef != null){
			throw new ASTException("TODO function Namespace ");
		}
		
		int argCount = (args != null) ? args.size() : 0;
		QName qname = QName.createFunctionQName(name, argCount);
		
		TypeSpec typeSpec;
		Class<?>[] argTypeArray = null;
		
		ASTDeclaration fnDecl = context.getFuncDecl(qname);
		Function<?> function = null;
		
		if(fnDecl != null){
			typeSpec = fnDecl.type(); 
			List<ASTDeclaration> argDecls = ((ASTFunctionDecl)fnDecl).getArgDecls();
			if(argDecls != null){
				argTypeArray = new Class<?>[argDecls.size()];
				int index = 0;
				for(ASTDeclaration a : argDecls){
					argTypeArray[index] = a.type().getBaseType();
					index++;
				}
			}
		} else {
			function = context.getBuiltInFunction(qname);
			if(function != null){
				typeSpec = function.returnType();
				argTypeArray = function.argTypes();
			}else {
				typeSpec = TypeSpec.UNDEFINED;
			}
		} 
		
		ASTFunctionCallExpr callExpr = new ASTFunctionCallExpr(token, typeSpec, qname, args);
		callExpr.setRequiredParamTypes(argTypeArray);
		callExpr.setFunction(function);
		return callExpr;
	}

	
}
