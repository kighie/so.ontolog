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
package so.ontolog.formula.ast.expr;

import java.lang.reflect.Method;
import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTMethodCallExpr extends ASTCallExpr {
	private static final long serialVersionUID = -3814046753998279120L;
	private Method method;
	private ASTVariableExpr beanRef;
	
	
	/**
	 * @param token
	 * @param typeSpec
	 * @param qname
	 * @param method
	 * @param args
	 */
	public ASTMethodCallExpr(ASTToken token, TypeSpec typeSpec, QName qname,
			Method method, List<ASTExpr> args) {
		super(token, typeSpec, qname, args);
		this.method = method;
	}
	
	public Method getMethod() {
		return method;
	}

	public ASTVariableExpr getBeanRef() {
		return beanRef;
	}

	public void setBeanRef(ASTVariableExpr beanRef) {
		this.beanRef = beanRef;
	}


	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
		if(beanRef != null){
			beanRef.accept(visitor, context);
		}
		
		for(ASTExpr e : args){
			e.accept(visitor, context);
		}
		
		return visitor.visit(this, context);
	}
	
	@Override
	public void getText(StringBuilder buffer, int depth) {
		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append("(");
		buffer.append(token.getName()).append(" ");
		if(beanRef != null){
			beanRef.getText(buffer, depth+1);
		}
		buffer.append("::").append(method);
		buffer.append(" ");
		
		for( ASTExpr e : args ){
			e.getText(buffer, depth+1);
		}

		if(depth>0){
			buffer.append("\n").append(TextUtils.getIndent(depth));
		}
		buffer.append(")");
	}

}
