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

import java.util.Collection;
import java.util.Map;

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.BeanBinderFactory;
import so.ontolog.data.binding.Binder;
import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractBinder<T> implements Binder<T> {

	protected final Class<T> type;
	protected final BeanBinderFactory factory;
	private Binder<?> defaultBinder;
	

	public AbstractBinder(Class<T> type, BeanBinderFactory factory, Class<?> valueType) {
		this.type = type;
		this.factory = factory;
		if(valueType != null){
			defaultBinder = getBinder(valueType);
		}
	}

	@Override
	public Class<T> type() {
		return type;
	}

	@Override
	public <V> V getValue(T bean, int index) {
		throw new BindingException("Method getValue(Object,int) is not support.");
	}

	@Override
	public <V> V getValue(T bean, String fieldName) {
		throw new BindingException("Method getValue(Object,String) is not support.");
	}

	@Override
	public <V> void setValue(T bean, int index, V value) {
		throw new BindingException("Method setValue(Object,int,Object) is not support.");
	}

	@Override
	public <V> void setValue(T bean, String fieldName, V value) {
		throw new BindingException("Method setValue(Object,String,Object) is not support.");
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> Binder<V> getFieldBinder(T bean, String fieldName) {
		if(defaultBinder != null){
			return (Binder<V>)defaultBinder;
		}
		
		Object value = getValue(bean, fieldName);
		if(value != null){
			return getBinder(value.getClass());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> Binder<V> getFieldBinder(T bean, int index) {
		if(defaultBinder != null){
			return (Binder<V>)defaultBinder;
		}
		
		Object value = getValue(bean, index);
		if(value != null){
			return getBinder(value.getClass());
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	protected <V> Binder<V> getBinder(Class<?> type) {
		if(Map.class.isAssignableFrom(type)){
			return (Binder<V>)factory.createMapBinder(type, null, null);
		} else if(Collection.class.isAssignableFrom(type)){
			return (Binder<V>)factory.createCollectionBinder(type, null);
		} else if(type.isArray()){
			return (Binder<V>)factory.createArrayBinder(type);
		} else if(!TypeUtils.isSimpleValueType(type)){
			return (BeanBinder<V>)factory.createBeanBinder(type);
		}  
		
		throw new BindingException("Cannot create Binder for " + type);
	}

	@Override
	public PropertyAccessor<?,?> getPropertyAccessor(String fieldName) {
		throw new BindingException("Method getPropertyAccessor(String) is not support.");
	}

	@Override
	public PropertyAccessor<?,?> getPropertyAccessor(int index) {
		throw new BindingException("Method getPropertyAccessor(int) is not support.");
	}
	
	
}
