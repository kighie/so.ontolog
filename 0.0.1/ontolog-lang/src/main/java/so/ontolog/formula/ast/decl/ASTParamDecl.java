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
package so.ontolog.formula.ast.decl;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTParamDecl extends AbstractASTDeclaration {

	private static final long serialVersionUID = 4702206536943488765L;
	
	private QName paramName;
	private BeanBinder<?> beanBinder;
	
	/**
	 * @param token
	 * @param qname
	 * @param typeSpec
	 */
	public ASTParamDecl(ASTToken token, QName qname, TypeSpec typeSpec, QName paramName) {
		super(token, qname, typeSpec);
		this.paramName = paramName;
	}
	
	/**
	 * @param beanBinder the beanBinder to set
	 */
	public void setBeanBinder(BeanBinder<?> beanBinder) {
		this.beanBinder = beanBinder;
	}
	
	/**
	 * @return the beanBinder
	 */
	public BeanBinder<?> getBeanBinder() {
		return beanBinder;
	}
	
	/**
	 * @return the paramName
	 */
	public QName getParamName() {
		return paramName;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		return visitor.visit(this, context);
	}

	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		
		buffer.append("(").append(token.getName()).append(" ");
		buffer.append(typeSpec.getName()).append(" ").append(qname);
		buffer.append("<-").append(paramName);
		buffer.append(")");
	}
	
	
}
