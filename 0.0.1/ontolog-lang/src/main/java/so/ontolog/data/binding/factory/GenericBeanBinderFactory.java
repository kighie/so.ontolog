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
package so.ontolog.data.binding.factory;

import java.awt.List;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import so.ontolog.data.binding.BeanBinderFactory;
import so.ontolog.data.binding.Binder;
import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.impl.ArrayBinder;
import so.ontolog.data.binding.impl.ArrayPropertyAccessor;
import so.ontolog.data.binding.impl.ListBinder;
import so.ontolog.data.binding.impl.ListPropertyAccessor;
import so.ontolog.data.binding.impl.MapBinder;
import so.ontolog.data.binding.impl.MapPropertyAccessor;
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class GenericBeanBinderFactory extends BeanBinderFactory {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public <T> Binder<T[]> createArrayBinder(Class<T> arrayClass) {
		return new ArrayBinder(arrayClass, this, arrayClass.getComponentType());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Binder<? extends Collection> createCollectionBinder(Class listClass,
			Type componentType) {
		Class<?> componentClass = null;
		
		if(componentType instanceof Class){
			componentClass = (Class)componentType;
		}
		if(List.class.isAssignableFrom(listClass)){
			return new ListBinder(listClass, this, componentClass);
		}
		
		throw new BindingException("createCollectionBinder("+ listClass + " ...) is not allowed. ");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Binder<? extends Map> createMapBinder(Class mapClass, Type keyType,
			Type valueType) {
		Class<?> componentClass = null;
		
		if(valueType instanceof Class){
			componentClass = (Class)valueType;
		}
		if(Map.class.isAssignableFrom(mapClass)){
			return new MapBinder(mapClass, this, componentClass);
		}
		
		throw new BindingException("createMapBinder("+ mapClass + " ...) is not allowed. ");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public PropertyAccessor<?, ?> createPropertyAccessor(Class<?> beanClass, String fieldName) {
		if( TypeUtils.isSimpleValueType(beanClass) ){
			throw new BindingException("Simple Value Type cannot be applied PropertyAccessor.");
		} else if(Collection.class.isAssignableFrom(beanClass)){
			throw new BindingException("Collection Type cannot be applied named PropertyAccessor .");
		} else if(Collection.class.isAssignableFrom(beanClass)){
			return new MapPropertyAccessor(fieldName, null);
		} else if(beanClass.isArray()){
			throw new BindingException("Array cannot be applied named PropertyAccessor .");
		} else {
			return getPropertyFactory().createBeanProperty(beanClass, fieldName);
		}	
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public PropertyAccessor<?, ?> createPropertyAccessor(Class<?> beanClass, int index) {
		if( TypeUtils.isSimpleValueType(beanClass) ){
			throw new BindingException("Simple Value Type cannot be applied PropertyAccessor .");
		} else if(List.class.isAssignableFrom(beanClass)){
			return new ListPropertyAccessor(index, null);
		} else if(Collection.class.isAssignableFrom(beanClass)){
			throw new BindingException("Map Type cannot be applied indexed PropertyAccessor .");
		} else if(beanClass.isArray()){
			return new ArrayPropertyAccessor(index, beanClass.getComponentType());
		} else {
			throw new BindingException("Bean Property cannot be applied indexed PropertyAccessor .");
		}	
	}
	
	
}
