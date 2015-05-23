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


import java.lang.reflect.Method;

import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.EvalException;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.internal.InternalException;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class MethodCallExpr<T> implements Gettable<T> {
	private static final long serialVersionUID = -3305778909529848422L;
	
	protected TypeSpec type;
	protected final Gettable<?> parentGettable;
	protected final Gettable<?>[] args;
	protected Converter<?>[] converters;
	protected final Method method;
	
	public MethodCallExpr(TypeSpec type, Gettable<?> parent, 
			Method method, Converter<?>[] converters, Gettable<?>[] args) {
		this.type = type;
		this.parentGettable = parent;
		this.method = method;
		this.args = args;
		this.converters = converters;
	}

	
	@Override
	public TypeSpec type() {
		return type;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		Object[] argArr = new Object[args.length];
		int i = 0;
		for(Gettable<?> n : args){
			argArr[i] = converters[i].convert(n.get(context));
			i++;
		}

		Object bean = parentGettable.get(context);
		Object returnValue = null;
		
		if(bean != null){
			returnValue = eval(bean, argArr);
		} else {
			throw new EvalException("Method[" + method.getName() + "] has no owner bean : " + parentGettable).setNode(this);
		}
		return (T) returnValue;
	}
	
	@SuppressWarnings("unchecked")
	protected T eval(Object bean, Object[] args) {
		try {
			return (T)method.invoke(bean, args);
		} catch (Exception e) {
			throw new InternalException(e);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("{methodCall: ");
		buf.append(method.getName()).append("(");
		for(Gettable<?> a : args){
			buf.append(a.toString()).append(" ");
		}
		buf.append(")");
		buf.append("}");
		return buf.toString();
	}
	
}
