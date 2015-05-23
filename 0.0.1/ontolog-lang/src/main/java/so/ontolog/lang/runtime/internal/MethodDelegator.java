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
package so.ontolog.lang.runtime.internal;

import java.lang.reflect.Method;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@Deprecated
public class MethodDelegator {

	public static final Object[] EMPTY_ARRAY = new Object[0];
	
	private final Method method;
	
	/**
	 * @param name
	 * @param returnType
	 * @param method
	 */
	public MethodDelegator(Method method) {
		this.method = method;
	}

	public String getName() {
		return method.getName();
	}

	public Class<?> getReturnType() {
		return method.getReturnType();
	}

	public Class<?>[] getParameterTypes() {
		return method.getParameterTypes();
	}
	
	public Object eval(Object bean, Object[] args) {
		try {
			return method.invoke(bean, args);
		} catch (Exception e) {
			throw new InternalException(e);
		}
	}
}
