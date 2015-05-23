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

import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.ast.ASTFactory.VariableExprFactory;
import so.ontolog.lang.ast.ASTSymbol;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.expr.CompositeSymbolExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.ast.util.ASTUtils;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.VarQName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultVariableExprFactory implements VariableExprFactory{
	private static Logger logger = Logger.getLogger(DefaultVariableExprFactory.class.getName());
	
	@Override
	public ASTSymbol create(ASTContext context, ASTToken token, QName qname) {
		if( qname.getParent() == null){
			return createSimpleVariable(context, token, qname);
		} else {
			if( qname instanceof VarQName){
				return createCompositeVariable(context, token, (VarQName)qname);
			} else {
				return createHierachicalVariable(context, token, qname);
			}
		}
	}

	protected CompositeSymbolExpr createCompositeVariable(ASTContext context, ASTToken token, VarQName qname){
		QName parentName = qname.getParent();
		QName indexerName = ((VarQName)qname).getIndex();
		ASTSymbol varExpr = create(context, token, parentName);
		ASTSymbol varIndexer = create(context, token, indexerName);
		
		TypeSpec typeSpec;
		
		if(varExpr.type().isArray()){
			typeSpec = varExpr.type().getComponentType();
		} else {
			typeSpec = TypeSpec.UNDEFINED;
		}
		
		CompositeSymbolExpr composite = new CompositeSymbolExpr(token, typeSpec, qname);
		composite.setParent(varExpr);
		composite.setVarIndexer(varIndexer);
		return composite;
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
		PropertyAccessor<?,?> propertyAccessor = ASTUtils.getPropertyAccessor(context, qname);
		
		TypeSpec typeSpec;
		
		if(propertyAccessor != null){
			if( propertyAccessor instanceof BeanProperty){
				typeSpec = ((BeanProperty<?>)propertyAccessor).typeSpec();
			} else {
				typeSpec = TypeUtils.getTypeSpec(propertyAccessor.type());
			}
		} else {
			typeSpec = TypeSpec.UNDEFINED;
		}
		
		VariableExpr varExpr = new VariableExpr(token, typeSpec, qname);
		varExpr.setPropertyAccessor(propertyAccessor);
		return varExpr;
	}


}
