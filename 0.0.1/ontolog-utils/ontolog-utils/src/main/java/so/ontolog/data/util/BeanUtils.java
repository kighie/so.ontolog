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
package so.ontolog.data.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanUtils {
	public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class<?>[0];

	public static Type[] getGenericParameterTypes(Field field){
		Type type = field.getGenericType();
		if(type instanceof ParameterizedType){
			return ((ParameterizedType)type).getActualTypeArguments();
		} else {
			return null;
		}
	}

	public static Type[] getGenericReternTypes(Method method){
		Type genType = method.getGenericReturnType();
		if(genType instanceof ParameterizedType){
			ParameterizedType type = (ParameterizedType)genType;
			return type.getActualTypeArguments();
		}
		return null;
	}
	
	public static Field findField(Class<?> beanClass, String fieldName){
		Field field = null;
		
		try {
			field = beanClass.getDeclaredField(fieldName);
		} catch (Exception e) {
			// Ignore
		}
		
		return field;
	}
	
	public static Method findGetter(Class<?> beanClass, String fieldName){
		Method getter = null;
		String methodName = makeMethodName("get" , fieldName);
		try {
			getter = beanClass.getMethod(methodName, EMPTY_CLASS_ARRAY);
		} catch (Exception e) {
			// Ignore
		}
		
		if(getter == null){
			methodName = makeMethodName("is" , fieldName);
			try {
				getter = beanClass.getMethod(methodName, EMPTY_CLASS_ARRAY);
			} catch (Exception e) {
				// Ignore
			}
		}
		return getter;
	}
	
	public static String makeMethodName(String prefix, String name){
		StringBuilder builder = new StringBuilder(name);
		builder.setCharAt(0, Character.toUpperCase(name.charAt(0)));
		builder.insert(0, prefix);
		return builder.toString();
	}
}
