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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;

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
	
	private static final Map<Class<?>, TypeSpec> typeSpecMap;
	
	static {
		typeSpecMap = new HashMap<Class<?>, TypeSpec>(41);	
		
		typeSpecMap.put(Boolean.class, TypeSpec.BOOLEAN);
		typeSpecMap.put(Boolean.TYPE, TypeSpec.BOOLEAN_PRIM);
		typeSpecMap.put(Byte.class, TypeSpec.BYTE);
		typeSpecMap.put(Byte.TYPE, TypeSpec.BYTE_PRIM);
		typeSpecMap.put(String.class, TypeSpec.STRING);
		typeSpecMap.put(Character.class, TypeSpec.CHAR);
		typeSpecMap.put(Character.TYPE, TypeSpec.CHAR_PRIM);
		typeSpecMap.put(Double.class, TypeSpec.DOUBLE);
		typeSpecMap.put(Double.TYPE, TypeSpec.DOUBLE_PRIM);
		typeSpecMap.put(Float.class, TypeSpec.FLOAT);
		typeSpecMap.put(Float.TYPE, TypeSpec.FLOAT_PRIM);
		typeSpecMap.put(Integer.class, TypeSpec.INTEGER);
		typeSpecMap.put(Integer.TYPE, TypeSpec.INTEGER_PRIM);
		typeSpecMap.put(Long.class, TypeSpec.LONG);
		typeSpecMap.put(Long.TYPE, TypeSpec.LONG_PRIM);
		typeSpecMap.put(Short.class, TypeSpec.SHORT);
		typeSpecMap.put(Short.TYPE, TypeSpec.SHORT_PRIM);
		typeSpecMap.put(BigDecimal.class, TypeSpec.DECIMAL);
		typeSpecMap.put(BigInteger.class, TypeSpec.BIG_INTEGER);
		typeSpecMap.put(BigInt.class, TypeSpec.BIGINT);
		typeSpecMap.put(Int.class, TypeSpec.INT);
		typeSpecMap.put(Real.class, TypeSpec.REAL);

		typeSpecMap.put(Date.class, TypeSpec.DATE);
		typeSpecMap.put(java.sql.Date.class, TypeSpec.DATE_SQL);
		typeSpecMap.put(java.sql.Time.class, TypeSpec.TIME);
		typeSpecMap.put(java.sql.Timestamp.class, TypeSpec.TIMESTAMP);
		

		typeSpecMap.put(Set.class, TypeSpec.SET);
		typeSpecMap.put(Collection.class, TypeSpec.COLLECTION);
		typeSpecMap.put(List.class, TypeSpec.LIST);
		typeSpecMap.put(ArrayList.class, new TypeSpec(ArrayList.class, TypeKind.Collection) );
		typeSpecMap.put(LinkedList.class, new TypeSpec(LinkedList.class, TypeKind.Collection) );

		typeSpecMap.put(Map.class, TypeSpec.MAP);
		typeSpecMap.put(HashMap.class, new TypeSpec(HashMap.class, TypeKind.Map));
	}
	
	
	public static TypeKind getTypeKind(Class<?> type){
		if(type == null){
			return TypeKind.Undefined;
		}
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
	

	public static TypeSpec getTypeSpec(Class<?> type){
		if(type == null){
			return TypeSpec.UNDEFINED;
		}
		
		TypeSpec spec = typeSpecMap.get(type);
		
		if(spec == null){
			TypeKind kind = getTypeKind(type);
			
			if(kind == TypeKind.Array){
				TypeSpec compType = getTypeSpec(type.getComponentType());
				spec = new TypeSpec(type, kind, compType);
				if(compType.getTypeKind() != TypeKind.Object){
					typeSpecMap.put(type, spec);
				}
			} else {
				spec = new TypeSpec(type, kind);
				
				if(kind != TypeKind.Object){
					typeSpecMap.put(type, spec);
				}
			}
		}
		return spec;
	}
	

	public static TypeSpec forName(String className){
		try {
			return getTypeSpec(Class.forName(className));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	

	public static TypeSpec forName(ClassLoader loader , String className){
		try {
			return getTypeSpec(loader.loadClass(className));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	

	private static final Set<Class<?>> fpSet;
	
	static {
		fpSet = new HashSet<Class<?>>(10);	
		
		fpSet.add(Double.class);
		fpSet.add(Double.TYPE);
		fpSet.add(Float.class);
		fpSet.add(Float.TYPE);
		fpSet.add(BigDecimal.class);
		fpSet.add(Real.class);
	}
	
	public static boolean hasFloatinPoint(Class<?> type){
		return fpSet.contains(type);
	}
	

	private static final Set<Class<?>> longSet;
	
	static {
		longSet = new HashSet<Class<?>>(10);	
		
		longSet.add(Long.class);
		longSet.add(Long.TYPE);
		longSet.add(BigInt.class);
		longSet.add(BigInteger.class);
	}
	
	public static boolean isLong(Class<?> type){
		return longSet.contains(type);
	}
	
	/**
	 * <pre></pre>
	 * @param type
	 * @return 
	 * @see DefaultConverters#getConverter(Class)
	 */
	public static <T> Converter<T> getConverter(Class<T>type){
		return DefaultConverters.getConverter(type);
	}
	

	@SuppressWarnings("unchecked")
	public static <T> Converter<T> getConverter(TypeSpec type){
		return DefaultConverters.getConverter((Class<T>)type.getBaseType());
	}
	

	public static Object convert(Object value, TypeSpec to){
		Converter<?> converter = getConverter(to);
		if(converter == null){
			throw new TypeException("Cannot find Converter for " + to);
		}
		return converter.convert(value);
	}
}
