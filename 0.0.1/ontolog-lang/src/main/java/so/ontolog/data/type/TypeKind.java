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

/**
 * <pre>
 * Kinds of field value type. 
 * </pre>
 * @author Ikchan Kwon
 *
 */
public enum TypeKind {
	/** Simple value type : Number */
	Number, 
	/** Simple value type : String, CharSequence, char */
	Text, 
	/** Simple value type : boolean */
	Bool,
	/** Simple value type : Date */
	Date,
	/** Simple value type : byte */
	Byte,
	/** Enumeration type */
	Enum,
	Array,
	Collection,
	Map,
	Record,
	Object,
	Undefined;
	
	boolean isScalar(TypeKind kind){
		return ( kind == Number 
				|| kind == Text 
				|| kind==Bool 
				|| kind==Date 
				|| kind==Byte);
	}
}
