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

/**
 * <pre>Undefined Type markup class</pre>
 * @author kighie@gmail.com
 *
 */
public final class Undefined implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Undefined Value
	 */
	public static Undefined VALUE = new Undefined();
	
	@Override
	public String toString() {
		return "Undefined";
	}
	
	/**
	 * <pre>
	 * Returns true, if value is null or Undefined object.
	 * </pre>
	 * @param value
	 * @return
	 */
	public static boolean isUndefined(Object value){
		return (value == null || value instanceof Undefined);
	}
	

	/**
	 * <pre>
	 * Returns true, if type is null or Undefined class.
	 * </pre>
	 * @param value
	 * @return
	 */
	public static boolean isUndefined(Class<?> type){
		return (type == null || Undefined.class == type);
	}
	
}
