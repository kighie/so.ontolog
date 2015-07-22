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
package so.ontolog.data.common;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractField<K> implements Field<K> {

	private static final long serialVersionUID = -3899071010486688214L;
	
	protected final TypeSpec typeSpec;
	protected final K name;
	
	
	public AbstractField(K name , Class<?> type) {
		this(name, TypeUtils.getTypeSpec(type));
	}

	public AbstractField(K name , TypeSpec typeSpec) {
		this.typeSpec = typeSpec;
		this.name = name;
	}

	@Override
	public K name() {
		return name;
	}

	public Class<?> type() {
		return typeSpec.getBaseType();
	}

	@Override
	public TypeKind typeKind() {
		return typeSpec.getTypeKind();
	}

	/**
	 * @return the typeSpec
	 */
	public TypeSpec typeSpec() {
		return typeSpec;
	}
	
	/**
	 * if value is null nor type is null, returns true.
	 * @param value
	 * @return
	 */
	public boolean checkType(Object value){
		if(value == null || typeSpec == null){
			return true;
		}
		
		return typeSpec.isAssignableFrom(value.getClass());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName()).append("[");
		toString(builder);
		builder.append("]");
		return builder.toString();
	}

	public void toString(StringBuilder builder) {
		builder.append(name).append(" : ");
		builder.append(typeSpec.getName());
	}
	
}