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
package so.ontolog.formula.runtime.expr;


import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.EvalException;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionCallExpr<T> implements Gettable<T> {
	
	private static final long serialVersionUID = -873729882285860890L;

	protected final Gettable<?>[] args;
	protected final QName funcName;
	protected Function<T> function;
	
	
	public FunctionCallExpr(QName funcName, Gettable<?>[] args, Function<T> function) {
		this.funcName = funcName;
		this.args = args;
		this.function = function;
	}

	
	@Override
	public TypeSpec type() {
		return function.returnType();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		Function<T> fnc;
		if(function != null){
			fnc = function;
		} else {
			fnc = (Function<T>)context.getReference(funcName);
			if(fnc == null){
				throw new EvalException("Function[" + funcName + "] is undefined.");
			}
		}
		return fnc.eval(context, args);
	}
	
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("{functionCall: ");
		buf.append(function.name()).append("(");
		for(Gettable<?> a : args){
			buf.append(a.toString()).append(" ");
		}
		buf.append(")");
		buf.append("}");
		return buf.toString();
	}
	
}
