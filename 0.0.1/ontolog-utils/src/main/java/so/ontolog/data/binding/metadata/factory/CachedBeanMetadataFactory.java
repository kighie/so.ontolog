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
package so.ontolog.data.binding.metadata.factory;

import so.ontolog.data.binding.metadata.BeanMetadata;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class CachedBeanMetadataFactory implements BeanMetadataFactory {
	protected final BeanMetadataFactory factory;
	protected final BeanMetadataCache cache;
	
	public CachedBeanMetadataFactory(BeanMetadataFactory factory,
			BeanMetadataCache cache) {
		this.factory = factory;
		this.cache = cache;
	}

	public CachedBeanMetadataFactory(BeanMetadataFactory factory) {
		this(factory, new SimpleBeanMetadataCache());
	}

	public CachedBeanMetadataFactory() {
		this(new DefaultBeanMetadataFactory(), new SimpleBeanMetadataCache());
	}

	@Override
	public <T> BeanMetadata<T> create(Class<T> beanClass) {
		BeanMetadata<T> metadata = cache.get(beanClass);
		if(metadata == null){
			synchronized(cache){
				metadata = factory.create(beanClass);
				cache.put(metadata);
			}
		}
		
		return metadata;
	}
	
	
}
