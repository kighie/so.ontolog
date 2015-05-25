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
package so.ontolog.lang.runtime.expr;


import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionCallExpr<T> implements Gettable<T> {
	
	private static final long serialVersionUID = -873729882285860890L;

	protected final Gettable<?>[] args;
	protected final Function<T> function;
	
	public FunctionCallExpr(Function<T> function, Gettable<?>[] args) {
		this.function = function;
		this.args = args;
	}

	
	@Override
	public TypeSpec type() {
		return function.returnType();
	}
	
	@Override
	public T get(Context context) {
		return function.eval(context, args);
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
