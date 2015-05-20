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

import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.impl.DefaultBeanBinder;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.factory.BeanMetadataFactory;
import so.ontolog.data.binding.metadata.factory.BeanPropertyFactory;
import so.ontolog.data.binding.metadata.factory.DefaultBeanMetadataFactory;
import so.ontolog.data.binding.metadata.factory.DefaultBeanPropertyFactory;
import so.ontolog.data.binding.tools.BeanPrinter;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanBinderFactory extends GenericBeanBinderFactory {

	private static DefaultBeanBinderFactory instance;
	
	public static DefaultBeanBinderFactory getInstance(){
		if(instance == null){
			instance = new DefaultBeanBinderFactory();
			instance.initialize();
		}
		return instance;
	}

	private BeanPrinter printer;
	
	@Override
	protected BeanMetadataFactory initMetadataFactory(BeanPropertyFactory propertyFactory) {
		DefaultBeanMetadataFactory factory = new DefaultBeanMetadataFactory(propertyFactory);
		printer = new BeanPrinter(factory);
		return factory;
	}


	@Override
	protected BeanPropertyFactory initPropertyFactory() {
		return new DefaultBeanPropertyFactory();
	}


	@Override
	protected <T> BeanBinder<T> createBeanBinder(BeanMetadata<T> metadata) {
		return new DefaultBeanBinder<T>(metadata, this, printer);
	}
	
	
}
