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

import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.convert.Converter;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractPropertyAccessor<K,V> implements PropertyAccessor<K,V> {
	protected final K key;
	protected final Class<V> type;
	protected Converter<? extends V> converter;
	
	public AbstractPropertyAccessor(K key, Class<V> type) {
		this.key = key;
		this.type = type;
	}

	@Override
	public K accessKey() {
		return key;
	}

	@Override
	public Class<?> type() {
		return type;
	}
	
	@Override
	public void setConverter(Converter<? extends V> converter) {
		this.converter = converter;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(Object bean, Object value) {
		V v = null;
		if(converter != null){
			v = converter.convert(value);
		} else {
			v = (V)value;
		}
		setImpl(bean, v);
	}

	protected abstract void setImpl(Object bean, V value);
}
