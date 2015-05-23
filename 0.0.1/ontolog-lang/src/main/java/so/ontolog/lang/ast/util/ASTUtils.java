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
package so.ontolog.lang.ast.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.factory.CachedBeanBinderFactory;
import so.ontolog.data.binding.tools.PropertyAccessorChains;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.IndexedQName;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTUtils {

	private static Logger logger = Logger.getLogger(ASTUtils.class.getName());
	
	public static  ASTDeclaration findDeclaration(ASTContext context, QName qname) {
		ASTDeclaration decl = context.getDecl(qname);
		if(decl == null){
			if( qname.getParent() != null){
				return findDeclaration(context, qname.getParent());
			} else {
				logger.log(Level.WARNING, "Cannot find Declararion for " + qname);
			}
		}
		return decl;
	}
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static PropertyAccessor<?,?> getPropertyAccessor(ASTContext context, QName qname) {
		QName parentName = qname.getParent();
		if(parentName == null){
			logger.log(Level.WARNING, "Cannot find Declaration for " + qname);
			return null;
		}
		
		ASTDeclaration decl = context.getDecl(parentName);
		
		if(decl != null){
			TypeSpec typeSpec = decl.getType();
			return CachedBeanBinderFactory.getInstance().createPropertyAccessor(typeSpec.getBaseType(), qname.getName());
		} 
		

		PropertyAccessor<?,?> parentAccessor  = getPropertyAccessor(context, parentName);
		
		if(parentAccessor == null){
			throw new BuildException("Cannot find bean reference : " + parentName);
		}
		
		PropertyAccessor<?,?> propertyAccessor;
		
		if(qname instanceof IndexedQName){
			propertyAccessor  =  CachedBeanBinderFactory.getInstance()
					.createPropertyAccessor(parentAccessor.type(), ((IndexedQName)qname).getIndex());
		} else {
			propertyAccessor  =  CachedBeanBinderFactory.getInstance()
					.createPropertyAccessor(parentAccessor.type(), qname.getName());
		}
		
		
		return new PropertyAccessorChains(parentAccessor, propertyAccessor);
	}

	
}
