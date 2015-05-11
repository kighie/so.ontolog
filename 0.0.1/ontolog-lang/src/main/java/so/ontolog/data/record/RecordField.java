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
package so.ontolog.data.record;

import so.ontolog.data.common.AbstractField;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;

public class RecordField extends AbstractField {
	private static final long serialVersionUID = 8161179718435161133L;

	public static final int UNDEFINED_LENGTH = -1;
	
	
	private int length = UNDEFINED_LENGTH;
	private Object defaultValue;


	public RecordField(String name , Class<?> type) {
		super(name, type);
	}

	public RecordField(String name , TypeSpec typeSpec) {
		super(name, typeSpec);
	}

	public RecordField(String name , Class<?> type, int length) {
		this(name, TypeUtils.getTypeSpec(type), length);
	}

	public RecordField(String name , TypeSpec typeSpec, int length) {
		super(name, typeSpec);
		this.length = length;
	}

	public int length() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * @return the defaultValue
	 */
	public Object getDefaultValue() {
		return defaultValue;
	}

	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(Object defaultValue) {
		this.defaultValue = defaultValue;
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
		StringBuilder buf = new StringBuilder();
		if(typeSpec != null){
			buf.append(typeSpec.getName()).append(" ");
			
			if(length > UNDEFINED_LENGTH){
				buf.append("(").append(length).append(") ");
			}
		}
		buf.append(name);
		
		return buf.toString();
	}
}
