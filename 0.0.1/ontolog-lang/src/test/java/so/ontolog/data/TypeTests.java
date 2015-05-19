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
package so.ontolog.data;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import so.ontolog.data.type.TypeKind;
import so.ontolog.samples.bean.SampleBean;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TypeTests {

	@Test
	public void testMap(){
		Map<String,String> map = new HashMap<String, String>();
		Class<?> mapClz = map.getClass();
		ParameterizedType type = (ParameterizedType)mapClz.getGenericSuperclass();
		
		Type[] types = type.getActualTypeArguments();
		
		for(Type t : types){
			@SuppressWarnings("rawtypes")
			TypeVariable tv = (TypeVariable)t;
			System.out.println(Arrays.toString(tv.getBounds()));
		}
	}
	

	@Test
	public void testCollection(){
		List<String> map = new ArrayList<String>();
		Class<?> mapClz = map.getClass();
		
		for(Type t : mapClz.getTypeParameters()){
			@SuppressWarnings("rawtypes")
			TypeVariable tv = (TypeVariable)t;
			System.out.println(Arrays.toString(tv.getGenericDeclaration().getTypeParameters()));
		}
	}

	@Test
	public void testCollectionField(){
		try {
			for( Field field : SampleBean.class.getDeclaredFields() ){
				System.out.println(field);
				if(Collection.class.isAssignableFrom( field.getType()) ){
					Type genType = field.getGenericType();
					if(genType instanceof ParameterizedType){
						ParameterizedType type = (ParameterizedType)genType;
						System.out.println("\t" + type.getActualTypeArguments()[0]);
					}
				} else if(Map.class.isAssignableFrom( field.getType()) ){
					Type genType = field.getGenericType();
					if(genType instanceof ParameterizedType){
						ParameterizedType type = (ParameterizedType)genType;
						System.out.println("\t" + Arrays.toString( type.getActualTypeArguments()) );
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Test
	public void testCollectionMethod(){
		try {
			for( Method method : SampleBean.class.getDeclaredMethods() ){
				if(Collection.class.isAssignableFrom( method.getReturnType()) ){
					Type genType = method.getGenericReturnType();
					if(genType instanceof ParameterizedType){
						ParameterizedType type = (ParameterizedType)genType;
						System.out.println("\t" + type.getActualTypeArguments()[0]);
					}
				} else if(Map.class.isAssignableFrom( method.getReturnType()) ){
					Type genType = method.getGenericReturnType();
					if(genType instanceof ParameterizedType){
						ParameterizedType type = (ParameterizedType)genType;
						System.out.println("\t" + Arrays.toString( type.getActualTypeArguments()) );
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void enumTest() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Method method = TypeKind.class.getMethod("values", new Class[0]);
		Enum<?>[] values = (Enum<?>[])method.invoke(null, new Object[0]);
		for(Enum<?> e : values ){
			System.out.println("\t" + e.ordinal() + " " + e);
		}
	}
}
