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

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import so.ontolog.data.ReflectionException;
import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.record.Record;
import so.ontolog.data.table.Table;
import so.ontolog.data.util.ArrayIterable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public final class TypeUtils {
	private static final Map<Class<?>, TypeKind> defaultTypeKindMap;
	
	static {
		defaultTypeKindMap = new HashMap<Class<?>, TypeKind>(41);	

		defaultTypeKindMap.put(Boolean.class, TypeKind.Bool);
		defaultTypeKindMap.put(Boolean.TYPE, TypeKind.Bool);
		defaultTypeKindMap.put(Byte.class, TypeKind.Byte);
		defaultTypeKindMap.put(Byte.TYPE, TypeKind.Byte);
		defaultTypeKindMap.put(String.class, TypeKind.Text);
		defaultTypeKindMap.put(Character.class, TypeKind.Text);
		defaultTypeKindMap.put(Character.TYPE, TypeKind.Text);
		
		defaultTypeKindMap.put(Double.class, TypeKind.Number);
		defaultTypeKindMap.put(Double.TYPE, TypeKind.Number);
		defaultTypeKindMap.put(Float.class, TypeKind.Number);
		defaultTypeKindMap.put(Float.TYPE, TypeKind.Number);
		defaultTypeKindMap.put(Integer.class, TypeKind.Number);
		defaultTypeKindMap.put(Integer.TYPE, TypeKind.Number);
		defaultTypeKindMap.put(Long.class, TypeKind.Number);
		defaultTypeKindMap.put(Long.TYPE, TypeKind.Number);
		defaultTypeKindMap.put(Short.class, TypeKind.Number);
		defaultTypeKindMap.put(Short.TYPE, TypeKind.Number);
		defaultTypeKindMap.put(BigDecimal.class, TypeKind.Number);
		defaultTypeKindMap.put(BigInteger.class, TypeKind.Number);
		defaultTypeKindMap.put(BigInt.class, TypeKind.Number);
		defaultTypeKindMap.put(Int.class, TypeKind.Number);
		defaultTypeKindMap.put(Real.class, TypeKind.Number);

		defaultTypeKindMap.put(Date.class, TypeKind.Date);
		defaultTypeKindMap.put(java.sql.Date.class, TypeKind.Date);
		defaultTypeKindMap.put(java.sql.Time.class, TypeKind.Date);
		defaultTypeKindMap.put(java.sql.Timestamp.class, TypeKind.Date);

		defaultTypeKindMap.put(Record.class, TypeKind.Record);
		defaultTypeKindMap.put(Table.class, TypeKind.Table);

		defaultTypeKindMap.put(Set.class, TypeKind.Collection);
		defaultTypeKindMap.put(Collection.class, TypeKind.Collection);
		defaultTypeKindMap.put(List.class, TypeKind.Collection);
		defaultTypeKindMap.put(ArrayList.class, TypeKind.Collection);
		defaultTypeKindMap.put(LinkedList.class, TypeKind.Collection);

		defaultTypeKindMap.put(Map.class, TypeKind.Map);
		defaultTypeKindMap.put(HashMap.class, TypeKind.Map);
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
		

		typeSpecMap.put(Record.class, TypeSpec.RECORD);
		typeSpecMap.put(Table.class, TypeSpec.TABLE);

//		typeSpecMap.put(Set.class, TypeSpec.SET);
//		typeSpecMap.put(Collection.class, TypeSpec.COLLECTION);
//		typeSpecMap.put(List.class, TypeSpec.LIST);
//		typeSpecMap.put(ArrayList.class, new TypeSpec(ArrayList.class, TypeKind.Collection) );
//		typeSpecMap.put(LinkedList.class, new TypeSpec(LinkedList.class, TypeKind.Collection) );
//		typeSpecMap.put(Map.class, TypeSpec.MAP);
//		typeSpecMap.put(HashMap.class, new TypeSpec(HashMap.class, TypeKind.Map));
	}

	@SuppressWarnings("rawtypes")
	public static boolean isSimpleValueType(Type type) {
		if(type instanceof Class){
			return isSimpleValueType((Class)type);
		}
		return false;
	}

	public static boolean isSimpleValueType(Class<?> clazz) {
		return clazz.isPrimitive() || clazz.isEnum() ||
				CharSequence.class.isAssignableFrom(clazz) ||
				Number.class.isAssignableFrom(clazz) ||
				Boolean.class.isAssignableFrom(clazz) ||
				Date.class.isAssignableFrom(clazz) ||
				clazz.equals(URI.class) || clazz.equals(URL.class) ||
				clazz.equals(Locale.class) || clazz.equals(Class.class);
	}
	
	
	public static TypeKind getTypeKind(Class<?> type){
		if(type == null){
			return TypeKind.Undefined;
		}
		TypeKind kind = defaultTypeKindMap.get(type);
		
		if(kind == null){
			if(type.isArray()){
				kind =  TypeKind.Array;
			} else if(type.isEnum()){
				kind = TypeKind.Enum;
			} else if(List.class.isAssignableFrom(type)){
				kind = TypeKind.Collection;
			} else if(Map.class.isAssignableFrom(type)){
				kind = TypeKind.Map;
			} else if(Record.class.isAssignableFrom(type)){
				kind = TypeKind.Record;
			} else if(Table.class.isAssignableFrom(type)){
				kind = TypeKind.Table;
			} else {
				kind = TypeKind.Object;
			}
		}
		return kind;
	}
	
	public static TypeSpec getArrayTypeSpec(TypeSpec componentType){
		if(componentType == null){
			throw new ReflectionException("componentType is null");
		}
		
		Class<?> baseType = Array.newInstance(componentType.getBaseType(), 0).getClass();
		TypeSpec spec = new TypeSpec(baseType, TypeKind.Array, componentType);
		
		return spec;
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
			} else {
				spec = new TypeSpec(type, kind);
			}
		}
		return spec;
	}
	
	@SuppressWarnings("rawtypes")
	public static TypeSpec getTypeSpec(Class<?> type, Type[] genericTypes){
		if(type == null){
			return TypeSpec.UNDEFINED;
		}
		
		TypeKind kind = getTypeKind(type);
		
		TypeSpec compType = null;
		
		if( type.isArray()){
			compType = getTypeSpec(type.getComponentType());
		} else if(genericTypes != null){
			if( genericTypes.length == 1){
				compType = getTypeSpec((Class)genericTypes[0]);
			} else if( kind == TypeKind.Map && genericTypes.length == 2){
				compType = getTypeSpec((Class)genericTypes[1]);
			}
		}
		
		TypeSpec spec = new TypeSpec(type, kind, compType);
		
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
	
	public static Enum<?>[] getEnumValues(Class<? extends Enum<?>> enumClass){
		try {
			Method method = TypeKind.class.getMethod("values", new Class[0]);
			return (Enum<?>[])method.invoke(null, new Object[0]);
		} catch (Exception e) {
			throw new ReflectionException(e);
		}
	}
	
	

	public static int getArrayLength(Object arrayObject){
		if(arrayObject.getClass().isArray()){
			return Array.getLength(arrayObject);
		}
		return 0;
	}

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Iterable<?> toArrayIterable(Object arrayObject, Class<?> componentType){
		if(componentType.isPrimitive()){
			int arrlength = Array.getLength(arrayObject);
			Object[] outputArray;
			
			if(componentType == Boolean.TYPE){
				outputArray = new Boolean[arrlength];
			} else if(componentType == Byte.TYPE){
				outputArray = new Byte[arrlength];
			} else if(componentType == Character.TYPE){
				outputArray = new Character[arrlength];
			} else if(componentType == Double.TYPE){
				outputArray = new Double[arrlength];
			} else if(componentType == Float.TYPE){
				outputArray = new Float[arrlength];
			} else if(componentType == Integer.TYPE){
				outputArray = new Integer[arrlength];
			} else if(componentType == Long.TYPE){
				outputArray = new Long[arrlength];
			} else if(componentType == Short.TYPE){
				outputArray = new Short[arrlength];
			} else {
				throw new ReflectionException("Connot cast to primitive type array : " + componentType);
			}
			
		    for(int i = 0; i < arrlength; ++i){
		       outputArray[i] = Array.get(arrayObject, i);
		    }
		    return new ArrayIterable(outputArray);
		} else {
			return new ArrayIterable((Object[])arrayObject);
		}
	}
	
	
	
}
