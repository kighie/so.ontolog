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
package so.ontolog.data.binding;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.factory.BeanMetadataFactory;
import so.ontolog.data.binding.metadata.factory.BeanPropertyFactory;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class BeanBinderFactory {

	private BeanMetadataFactory metadataFactory;
	private BeanPropertyFactory propertyFactory;
	
	protected void initialize(){
		propertyFactory = initPropertyFactory();
		metadataFactory = initMetadataFactory(propertyFactory);
	}

	public <T>BeanBinder<T> createBeanBinder(Class<T> beanClass){
		BeanMetadata<T> metadata = createBeanMetadata(beanClass);
		return createBeanBinder(metadata);
	}

	public <T>BeanMetadata<T> createBeanMetadata(Class<T> beanClass){
		return metadataFactory.create(beanClass);
	}

	public abstract <T> Binder<T[]> createArrayBinder(Class<T> componentType);

	@SuppressWarnings("rawtypes")
	public abstract Binder<? extends Collection> createCollectionBinder(Class listClass, Type componentType);

	@SuppressWarnings("rawtypes")
	public abstract Binder<? extends Map> createMapBinder(Class mapClass, Type keyType, Type valueType);

	public abstract PropertyAccessor<?,?> createPropertyAccessor(Class<?> beanClass, String fieldName);
	
	public abstract PropertyAccessor<?,?> createPropertyAccessor(Class<?> beanClass, int index);
	
	/**
	 * <pre>create and initialize {@link BeanMetadataFactory} </pre>
	 * @return
	 */
	protected abstract BeanMetadataFactory initMetadataFactory(BeanPropertyFactory propertyFactory);

	/**
	 * <pre>create {@link BeanBinder} </pre>
	 * @return
	 */
	protected abstract <T>BeanBinder<T> createBeanBinder(BeanMetadata<T> metadata);
	
	/**
	 * @return the metadataFactory
	 */
	public BeanMetadataFactory getMetadataFactory( ) {
		return metadataFactory;
	}

	protected abstract BeanPropertyFactory initPropertyFactory();
	
	public BeanPropertyFactory getPropertyFactory() {
		return propertyFactory;
	}

}
