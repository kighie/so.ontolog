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
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TypeSpec implements Serializable {
	private static final long serialVersionUID = -2981246612944358912L;

	private Class<?> baseType;

	private TypeKind typeKind;
	
	public TypeSpec(Class<?> baseType) {
		this.baseType = baseType;
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

	public Class<?> getComponentType() {
		return baseType.getComponentType();
	}

	public String getSimpleName() {
		return baseType.getSimpleName();
	}

	public boolean isEnum() {
		return baseType.isEnum();
	}

	public TypeVariable<?>[] getTypeParameters() {
		return baseType.getTypeParameters();
	}

	public Type getGenericSuperclass() {
		return baseType.getGenericSuperclass();
	}

	public Type[] getGenericInterfaces() {
		return baseType.getGenericInterfaces();
	}
	
}
