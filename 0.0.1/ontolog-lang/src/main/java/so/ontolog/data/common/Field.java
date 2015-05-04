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

import java.io.Serializable;

import so.ontolog.data.type.TypeKind;

/**
 * 
 * <pre></pre>
 * @author kighie@gmail.com
 *
 * @param <T>
 */
public interface Field extends Serializable {

	public static final Class<?> UNDEFINED_TYPE = Undefined.class;
	public static final Object UNDEFINED_VALUE = Undefined.VALUE;
	
	
	/**
	 * <pre>The name of this field</pre>
	 * @return
	 */
	String name();
	
	/**
	 * <pre>The type of this field</pre>
	 * @return
	 */
	Class<?> type();
	
	/**
	 * <pre>The kind of this field type.</pre>
	 * @return
	 */
	TypeKind typeKind();
}
