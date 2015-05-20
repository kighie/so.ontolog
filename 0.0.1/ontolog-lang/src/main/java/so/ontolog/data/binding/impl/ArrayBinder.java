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
package so.ontolog.data.binding.impl;

import so.ontolog.data.binding.BeanBinderFactory;
import so.ontolog.data.binding.PropertyAccessor;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ArrayBinder<T> extends AbstractBinder<T[]>{
	
	public ArrayBinder(Class<T[]> type, BeanBinderFactory factory, Class<T> elementType) {
		super(type, factory, elementType);
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public <V> V getValue(T[] bean, int index) {
		return (V)bean[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> void setValue(T[] bean, int index, V value) {
		bean[index] = (T)value;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public PropertyAccessor<?,?> getPropertyAccessor(int index) {
		return new ArrayPropertyAccessor(index, type);
	}
}
