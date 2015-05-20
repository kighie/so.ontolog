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

import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.factory.BeanMetadataFactory;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class BeanBinderFactory {
	
	private BeanMetadataFactory metadataFactory;
	
	protected void initialize(){
		metadataFactory = initMetadataFactory();
	}

	/**
	 * <pre>create and initialize {@link BeanMetadataFactory} </pre>
	 * @return
	 */
	protected abstract BeanMetadataFactory initMetadataFactory();
	
	/**
	 * @return the metadataFactory
	 */
	protected BeanMetadataFactory getMetadataFactory() {
		return metadataFactory;
	}

	public <T>BeanBinder<T> createBeanBinder(Class<T> beanClass){
		BeanMetadata<T> metadata = createBeanMetadata(beanClass);
		return createBeanBinder(metadata);
	}

	public <T>BeanMetadata<T> createBeanMetadata(Class<T> beanClass){
		return metadataFactory.create(beanClass);
	}

	/**
	 * <pre>create {@link BeanBinder} </pre>
	 * @return
	 */
	protected abstract <T>BeanBinder<T> createBeanBinder(BeanMetadata<T> metadata);
	
}
