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
package so.ontolog.lang.ast.expr;

import java.lang.reflect.Method;
import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTExpr;
import so.ontolog.lang.ast.ASTSymbol;
import so.ontolog.lang.ast.ASTToken;
import so.ontolog.lang.ast.ASTVisitor;
import so.ontolog.lang.ast.util.TextUtils;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CallExpr extends ASTSymbol {

	private static final long serialVersionUID = -976688139106286789L;
	
	private Method method;
	private List<ASTExpr> args;
	private Class<?>[]argTypeArray;
	private VariableExpr beanRef;
	
	
	/**
	 * @param token
	 * @param typeSpec
	 * @param qname
	 * @param method
	 * @param args
	 */
	public CallExpr(ASTToken token, TypeSpec typeSpec, QName qname,
			Method method, List<ASTExpr> args) {
		super(token, typeSpec, qname);
		this.method = method;
		this.args = args;
	}
	
	public Method getMethod() {
		return method;
	}

	public List<ASTExpr> getArgs() {
		return args;
	}
	
	public VariableExpr getBeanRef() {
		return beanRef;
	}

	public void setBeanRef(VariableExpr beanRef) {
		this.beanRef = beanRef;
	}

	public Class<?>[] getArgTypeArray() {
		return argTypeArray;
	}

	public void setArgTypeArray(Class<?>[] argTypeArray) {
		this.argTypeArray = argTypeArray;
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
