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
package so.ontolog.data.binding.convert;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class EnumConverter<T extends Enum> implements Converter<T>{

	private Class<T> enumType;
	
	public EnumConverter(Class<T> enumType) {
		super();
		this.enumType = enumType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T convert(Object value) {
		if(value != null){
			return (T)Enum.valueOf(enumType, value.toString());
		}
		return null;
	}

}
