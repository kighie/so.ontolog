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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TypeTests {

	@Test
	public void test(){
		Map<String,String> map = new HashMap<String, String>();
		Class<?> mapClz = map.getClass();
		ParameterizedType type = (ParameterizedType)mapClz.getGenericSuperclass();
		
		Type[] types = type.getActualTypeArguments();
		
		for(Type t : types){
			TypeVariable tv = (TypeVariable)t;
			System.out.println(Arrays.toString(tv.getBounds()));
		}
	}
}
