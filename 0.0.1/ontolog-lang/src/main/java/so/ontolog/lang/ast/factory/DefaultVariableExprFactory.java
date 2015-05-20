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

import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.data.binding.factory.CachedBeanBinderFactory;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTFactory.VariableExprFactory;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.build.BuildException;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultVariableExprFactory implements VariableExprFactory{
	private static Logger logger = Logger.getLogger(DefaultVariableExprFactory.class.getName());
	
	@Override
	public ASTExpr create(ASTContext context, ASTToken token, QName qname) {
		if( qname.getParent() == null){
			return createSimpleVariable(context, token, qname);
		} else {
			return createHierachicalVariable(context, token, qname);
		}
	}

	protected VariableExpr createSimpleVariable(ASTContext context, ASTToken token, QName qname){
		ASTDeclaration decl = context.getDecl(qname);
		TypeSpec typeSpec;
		if(decl != null){
			typeSpec = decl.getType(); 
		} else {
			logger.log(Level.WARNING, "Cannot find Declararion for " + qname);
			typeSpec = TypeSpec.UNDEFINED;
		}
		VariableExpr varExpr = new VariableExpr(token, typeSpec, qname);
		return varExpr;
	}

	/**
	 * TODO
	 * @param context
	 * @param token
	 * @param qname
	 * @return
	 */
	protected VariableExpr createHierachicalVariable(ASTContext context, ASTToken token, QName qname){
		BeanProperty<?> property = traceBeanProperty(context, qname);
		
		TypeSpec typeSpec;
		
		if(property != null){
			typeSpec = property.typeSpec();
		} else {
			typeSpec = TypeSpec.UNDEFINED;
		}
		
		VariableExpr varExpr = new VariableExpr(token, typeSpec, qname);
		return varExpr;
	}

	public ASTDeclaration findRootDeclaration(ASTContext context, QName qname) {
		ASTDeclaration decl = context.getDecl(qname);
		if(decl == null){
			if( qname.getParent() != null){
				return findRootDeclaration(context, qname.getParent());
			} else {
				logger.log(Level.WARNING, "Cannot find Declararion for " + qname);
			}
		}
		return decl;
	}
	
	protected BeanProperty<?> traceBeanProperty(ASTContext context, QName qname) {
		QName parentName = qname.getParent();
		if(parentName == null){
			logger.log(Level.WARNING, "Cannot find Declaration for " + qname);
			return null;
		}
		
		ASTDeclaration decl = context.getDecl(parentName);
		
		if(decl == null){
			return traceBeanProperty(context, parentName);
		}
		
		TypeSpec typeSpec = decl.getType();
		BeanMetadata<?> metadata = CachedBeanBinderFactory.getInstance().createBeanMetadata(typeSpec.getBaseType());
		
		BeanProperty<?> property = metadata.get(qname.getName());
		
		if(property == null){
			throw new BuildException("Cannot find property '" + qname + "' of bean " + metadata.type().getName());
		}
		
		return property;
	}
}
