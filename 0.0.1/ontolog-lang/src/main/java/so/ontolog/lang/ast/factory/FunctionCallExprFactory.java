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
package so.ontolog.lang.ast.factory;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory.CallExprFactory;
import so.ontolog.lang.ast.ASTSymbol;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.decl.FunctionDecl;
import so.ontolog.lang.ast.expr.ASTFunctionCallExpr;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionCallExprFactory implements CallExprFactory {

	
	@Override
	public ASTSymbol create(ASTContext context, ASTToken token, ASTSymbol beanRef, String name, List<ASTExpr> args) {
		if(beanRef != null){
			throw new BuildException("TODO function Namespace ");
		}
		
		QName qname = new QName(name);
		
		TypeSpec typeSpec;
		Class<?>[] argTypeArray = null;
		
		ASTDeclaration fnDecl = context.getDecl(qname);
		Function<?> function = null;
		
		if(fnDecl != null){
			typeSpec = fnDecl.getType(); 
			argTypeArray = ((FunctionDecl)fnDecl).getParamTypeArray();
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
