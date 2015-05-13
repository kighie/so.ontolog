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

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import so.ontolog.data.record.Record;
import so.ontolog.data.table.Table;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TypeSpec implements Serializable {
	private static final long serialVersionUID = -2981246612944358912L;
	
	/**
	 * <pre>
	 * Markup class of undefined Type
	 * </pre>
	 * @author Ikchan Kwon
	 *
	 */
	public static final class Undefined implements Serializable {
		private static final long serialVersionUID = 6989212413512268013L;
	}

	public static final TypeSpec BOOLEAN = new TypeSpec(Boolean.class, TypeKind.Bool);
	public static final TypeSpec BOOLEAN_PRIM = new TypeSpec(Boolean.TYPE, TypeKind.Bool);
	public static final TypeSpec BYTE = new TypeSpec(Byte.class, TypeKind.Byte);
	public static final TypeSpec BYTE_PRIM = new TypeSpec(Byte.TYPE, TypeKind.Byte);
	public static final TypeSpec STRING = new TypeSpec(String.class, TypeKind.Text);
	public static final TypeSpec CHAR = new TypeSpec(Character.class, TypeKind.Text);
	public static final TypeSpec CHAR_PRIM = new TypeSpec(Character.TYPE, TypeKind.Text);
	
	public static final TypeSpec DOUBLE = new TypeSpec(Double.class, TypeKind.Number);
	public static final TypeSpec DOUBLE_PRIM = new TypeSpec(Double.TYPE, TypeKind.Number);
	public static final TypeSpec FLOAT = new TypeSpec(Float.class, TypeKind.Number);
	public static final TypeSpec FLOAT_PRIM = new TypeSpec(Float.TYPE, TypeKind.Number);
	public static final TypeSpec INTEGER = new TypeSpec(Integer.class, TypeKind.Number);
	public static final TypeSpec INTEGER_PRIM = new TypeSpec(Integer.TYPE, TypeKind.Number);
	public static final TypeSpec LONG = new TypeSpec(Long.class, TypeKind.Number);
	public static final TypeSpec LONG_PRIM = new TypeSpec(Long.TYPE, TypeKind.Number);
	public static final TypeSpec SHORT = new TypeSpec(Short.class, TypeKind.Number);
	public static final TypeSpec SHORT_PRIM = new TypeSpec(Short.TYPE, TypeKind.Number);
	public static final TypeSpec DECIMAL = new TypeSpec(BigDecimal.class, TypeKind.Number);
	public static final TypeSpec BIG_INTEGER = new TypeSpec(BigInteger.class, TypeKind.Number);
	public static final TypeSpec BIGINT = new TypeSpec(BigInt.class, TypeKind.Number);
	public static final TypeSpec INT = new TypeSpec(Int.class, TypeKind.Number);
	public static final TypeSpec REAL = new TypeSpec(Real.class, TypeKind.Number);

	public static final TypeSpec DATE = new TypeSpec(Date.class, TypeKind.Date);
	public static final TypeSpec DATE_SQL = new TypeSpec(java.sql.Date.class, TypeKind.Date);
	public static final TypeSpec TIME = new TypeSpec(java.sql.Time.class, TypeKind.Date);
	public static final TypeSpec TIMESTAMP = new TypeSpec(java.sql.Timestamp.class, TypeKind.Date);
	

	public static final TypeSpec SET = new TypeSpec(Set.class, TypeKind.Collection);
	public static final TypeSpec COLLECTION = new TypeSpec(Collection.class, TypeKind.Collection);
	public static final TypeSpec LIST = new TypeSpec(List.class, TypeKind.Collection);

	public static final TypeSpec MAP = new TypeSpec(Map.class, TypeKind.Map);
	public static final TypeSpec RECORD = new TypeSpec(Record.class, TypeKind.Record);
	public static final TypeSpec TABLE = new TypeSpec(Table.class, TypeKind.Table);

	public static final TypeSpec UNDEFINED = new TypeSpec(Undefined.class, TypeKind.Undefined);
	
	
	private Class<?> baseType;
	private TypeKind typeKind;
	private TypeSpec componentType;

	public TypeSpec(Class<?> baseType, TypeKind typeKind) {
		this.baseType = baseType;
		this.typeKind = typeKind;
	}

	public TypeSpec(Class<?> baseType, TypeKind typeKind, TypeSpec componentType) {
		this.baseType = baseType;
		this.typeKind = typeKind;
		this.componentType = componentType;
	}

	/**
	 * @return the typeKind
	 */
	public TypeKind getTypeKind() {
		return typeKind;
	}
	
	/**
	 * @return the baseType
	 */
	public Class<?> getBaseType() {
		return baseType;
	}

	public boolean isInterface() {
		return baseType.isInterface();
	}

	public boolean isArray() {
		return baseType.isArray();
	}

	public boolean isPrimitive() {
		return baseType.isPrimitive();
	}

	public String getName() {
		return baseType.getName();
	}

	public TypeSpec getComponentType() {
		return componentType;
	}

	public String getSimpleName() {
		return baseType.getSimpleName();
	}

	public boolean isEnum() {
		return baseType.isEnum();
	}

	public boolean isInstance(Object obj) {
		return baseType.isInstance(obj);
	}

	public boolean isAssignableFrom(Class<?> cls) {
		return baseType.isAssignableFrom(cls);
	}

	public boolean isAssignableFrom(TypeSpec other) {
		return baseType.isAssignableFrom(other.baseType);
	}

	public boolean isSubclassOf(Class<?> cls) {
		if(cls != null){
			return cls.isAssignableFrom(baseType);
		}
		return false;
	}

	public boolean isSubclassOf(TypeSpec other) {
		return isSubclassOf(other.baseType);
	}

	
}
