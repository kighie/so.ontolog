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

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.util.TextUtils;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTFunctionCallExpr extends ASTCallExpr {

	private static final long serialVersionUID = 8559481988681950984L;

	private Function<?> function;
	
	/**
	 * @param token
	 * @param typeSpec
	 * @param qname
	 * @param args
	 */
	public ASTFunctionCallExpr(ASTToken token, TypeSpec typeSpec, QName qname,
			List<ASTExpr> args) {
		super(token, typeSpec, qname, args);
	}
	
	public Function<?> getFunction() {
		return function;
	}

	public void setFunction(Function<?> function) {
		this.function = function;
	}

	@Override
	public <C> C accept(ASTVisitor<C> visitor, C context) {
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
		buffer.append("::").append(qname);
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
