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

import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTFactory.VariableExprFactory;
import so.ontolog.formula.ast.ASTSymbol;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.expr.ASTVariableExpr;
import so.ontolog.formula.ast.expr.CompositeSymbolExpr;
import so.ontolog.formula.ast.util.ASTUtils;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.VarQName;
import so.ontolog.formula.runtime.internal.TypeHelper;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultVariableExprFactory implements VariableExprFactory{
//	private static Logger logger = Logger.getLogger(DefaultVariableExprFactory.class.getName());
	
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
	
	protected ASTVariableExpr createSimpleVariable(ASTContext context, ASTToken token, QName qname){
		ASTDeclaration decl = context.getVarDecl(qname);
		TypeSpec typeSpec;
		if(decl != null){
			typeSpec = decl.type(); 
		} else {
			decl = context.findFuncDecl(qname.getName());
			if(decl != null){
				qname = decl.qname();
				typeSpec = TypeHelper.FUNCTION; 
			} else {
				context.getErrorHandler().buildWarning("Cannot find Declararion for " + qname, token);
				typeSpec = TypeSpec.UNDEFINED;
			}
		}
		
		ASTVariableExpr varExpr = new ASTVariableExpr(token, typeSpec, qname);
		return varExpr;
	}

	/**
	 * TODO
	 * @param context
	 * @param token
	 * @param qname
	 * @return
	 */
	protected ASTVariableExpr createHierachicalVariable(ASTContext context, ASTToken token, QName qname){
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
		
		ASTVariableExpr varExpr = new ASTVariableExpr(token, typeSpec, qname);
		varExpr.setPropertyAccessor(propertyAccessor);
		return varExpr;
	}


}
