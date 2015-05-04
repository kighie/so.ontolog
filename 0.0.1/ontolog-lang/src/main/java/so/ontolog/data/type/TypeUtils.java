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
package so.ontolog.data.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public final class TypeUtils {
	private static final Map<Class<?>, TypeKind> simpleTypeMap;
	
	static {
		simpleTypeMap = new HashMap<Class<?>, TypeKind>(41);	

		simpleTypeMap.put(Boolean.class, TypeKind.Bool);
		simpleTypeMap.put(Boolean.TYPE, TypeKind.Bool);
		simpleTypeMap.put(Byte.class, TypeKind.Byte);
		simpleTypeMap.put(Byte.TYPE, TypeKind.Byte);
		simpleTypeMap.put(String.class, TypeKind.Text);
		simpleTypeMap.put(Character.class, TypeKind.Text);
		simpleTypeMap.put(Character.TYPE, TypeKind.Text);
		
		simpleTypeMap.put(Double.class, TypeKind.Number);
		simpleTypeMap.put(Double.TYPE, TypeKind.Number);
		simpleTypeMap.put(Float.class, TypeKind.Number);
		simpleTypeMap.put(Float.TYPE, TypeKind.Number);
		simpleTypeMap.put(Integer.class, TypeKind.Number);
		simpleTypeMap.put(Integer.TYPE, TypeKind.Number);
		simpleTypeMap.put(Long.class, TypeKind.Number);
		simpleTypeMap.put(Long.TYPE, TypeKind.Number);
		simpleTypeMap.put(Short.class, TypeKind.Number);
		simpleTypeMap.put(Short.TYPE, TypeKind.Number);
		simpleTypeMap.put(BigDecimal.class, TypeKind.Number);
		simpleTypeMap.put(BigInteger.class, TypeKind.Number);
		simpleTypeMap.put(BigInt.class, TypeKind.Number);
		simpleTypeMap.put(Int.class, TypeKind.Number);
		simpleTypeMap.put(Real.class, TypeKind.Number);

		simpleTypeMap.put(Date.class, TypeKind.Date);
		simpleTypeMap.put(java.sql.Date.class, TypeKind.Date);
		simpleTypeMap.put(java.sql.Time.class, TypeKind.Date);
		simpleTypeMap.put(java.sql.Timestamp.class, TypeKind.Date);
		

		simpleTypeMap.put(Set.class, TypeKind.Collection);
		simpleTypeMap.put(Collection.class, TypeKind.Collection);
		simpleTypeMap.put(List.class, TypeKind.Collection);
		simpleTypeMap.put(ArrayList.class, TypeKind.Collection);
		simpleTypeMap.put(LinkedList.class, TypeKind.Collection);

		simpleTypeMap.put(Map.class, TypeKind.Map);
		simpleTypeMap.put(HashMap.class, TypeKind.Map);
	}
	
	
	public static TypeKind getTypeKind(Class<?> type){
		TypeKind kind = simpleTypeMap.get(type);
		
		if(kind == null){
			if(type.isArray()){
				kind =  TypeKind.Array;
			} else if(type.isEnum()){
				kind = TypeKind.Enum;
			} else if(List.class.isAssignableFrom(type)){
				kind = TypeKind.Collection;
			} else if(Map.class.isAssignableFrom(type)){
				kind = TypeKind.Map;
			} else {
				kind = TypeKind.Object;
			}
		}
		return kind;
	}
	

	public static Class<?> getElementType(Object bean){
		return bean.getClass().getComponentType();
	}
	
}
