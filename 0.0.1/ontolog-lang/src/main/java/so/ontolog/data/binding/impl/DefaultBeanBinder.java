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

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.BeanBinderFactory;
import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeKind;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanBinder<T> implements BeanBinder<T>{
	private static final long serialVersionUID = -3815888452453577676L;

	private final BeanMetadata<T> metadata;
	private final BeanBinderFactory factory;
	
	public DefaultBeanBinder(BeanMetadata<T> metadata, BeanBinderFactory factory) {
		this.metadata = metadata;
		this.factory = factory;
	}

	@Override
	public BeanMetadata<T> getMetadata() {
		return metadata;
	}
	
	@Override
	public Class<T> type() {
		return metadata.type();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <V> V getValue(T bean, int index) {
		V value = (V)metadata.get(index).get(bean);
		return value;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <V> V getValue(T bean, String fieldName) {
		V value = (V)metadata.get(fieldName).get(bean);
		return value;
	}
	
	@Override
	public Object[] getValues(T bean) {
		Object[] values = new Object[metadata.size()];
		int index = 0;
		for( BeanProperty<?> p : metadata){
			values[index++] = p.get(bean);
		}
		return values;
	}
	
	@Override
	public <V> void setValue(T bean, int index, V value) {
		metadata.get(index).set(bean, value);
	}
	
	@Override
	public <V> void setValue(T bean, String fieldName, V value) {
		metadata.get(fieldName).set(bean, value);
	}
	
	@Override
	public void setValues(T bean, Object[] values) {
		for(int i=values.length-1;i>=0;i--){
			BeanProperty<?> p = metadata.get(i);
			p.set(bean, values[i]);
		}
	}
	
	@Override
	public T newBean() {
		return metadata.newBean();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> BeanBinder<V> getFieldBinder(String fieldName) {
		BeanProperty<V> prop = (BeanProperty<V>)metadata.get(fieldName);
		if(prop.typeKind() == TypeKind.Object){
			return (BeanBinder<V>)factory.createBeanBinder(prop.type());
		}
		throw new BindingException("Field " + fieldName + " is not bean type.");
	}
}
