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

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTException;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory.CallExprFactory;
import so.ontolog.lang.ast.ASTSymbol;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.expr.ASTMethodCallExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class MetodCallExprFactory implements CallExprFactory {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public ASTSymbol create(ASTContext context, ASTToken token,
			ASTSymbol beanRef, String name, List<ASTExpr> args) {
		Class<?> beanClz = beanRef.type().getBaseType();
		LinkedList list = new LinkedList();
		
		for(ASTExpr e : args){
			list.add( e.type().getBaseType() );
		}
		
		Class<?>[]argTypeArray = new Class<?>[list.size()];
		list.toArray(argTypeArray);
		
		Method method = getMethod(beanClz, name, argTypeArray);

		if(method == null){
			throw new ASTException("Cannot find method : " + name + Arrays.toString(argTypeArray));
		}
		
		TypeSpec typeSpec = TypeUtils.getTypeSpec(method.getReturnType());
		
		ASTMethodCallExpr callExpr = new ASTMethodCallExpr(token, typeSpec, new QName(name), method, args);
		callExpr.setBeanRef((VariableExpr) beanRef);
		
		callExpr.setRequiredParamTypes(method.getParameterTypes());
		return callExpr;
	}
	
	protected Method getMethod(Class<?> beanClz, String name, Class<?>[]typeArray) {
		Class<?>[]paramTypeArray;
		
		for(Method m : beanClz.getMethods() ){
			if(m.getName().equals(name)){
				paramTypeArray = m.getParameterTypes();
				if((paramTypeArray.length == typeArray.length)
						&& match(paramTypeArray, typeArray)){
					return m;
				}
			}
		}
		
		return null;
	}
	
	protected boolean match(Class<?>[] paramTypeArray, Class<?>[] argTypeArray) {
		int length = paramTypeArray.length;
		for(int i =0;i<length;i++){
			if(!paramTypeArray[i].isAssignableFrom(argTypeArray[i])){
				if((TypeUtils.getTypeKind(paramTypeArray[i]) == TypeKind.Number)
						&& (TypeUtils.getTypeKind(argTypeArray[i]) == TypeKind.Number)) {
					continue;
				}
				return false;
			}
		}
		return true;
	}
}
