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
import so.ontolog.data.binding.BeanBinderFactory;
import so.ontolog.data.binding.impl.DefaultBeanBinder;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.factory.BeanMetadataFactory;
import so.ontolog.data.binding.metadata.factory.CachedBeanMetadataFactory;
import so.ontolog.data.binding.metadata.factory.DefaultBeanMetadataFactory;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CachedBeanBinderFactory extends BeanBinderFactory {

	private static CachedBeanBinderFactory instance;
	
	public static CachedBeanBinderFactory getInstance(){
		if(instance == null){
			instance = new CachedBeanBinderFactory();
			instance.initialize();
		}
		return instance;
	}

	@Override
	protected BeanMetadataFactory initMetadataFactory() {
		DefaultBeanMetadataFactory factory = new DefaultBeanMetadataFactory();
		return new CachedBeanMetadataFactory(factory);
	}
	
	@Override
	protected <T> BeanBinder<T> createBeanBinder(BeanMetadata<T> metadata) {
		return new DefaultBeanBinder<T>(metadata, this);
	}
	
	
}
