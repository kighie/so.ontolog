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
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractField implements Field {

	private static final long serialVersionUID = -3899071010486688214L;
	
	
	
	
	protected final Class<?> type;
	protected final String name;
	protected final TypeKind typeKind;
	
	
	public AbstractField(String name , Class<?> type) {
		this(name, type, TypeUtils.getTypeKind(type));
	}

	public AbstractField(String name , Class<?> type, TypeKind typeKind) {
		this.type = type;
		this.name = name;
		this.typeKind = typeKind;
	}

	@Override
	public String name() {
		return name;
	}

	public Class<?> type() {
		return type;
	}

	@Override
	public TypeKind typeKind() {
		return typeKind;
	}

}