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

import java.util.WeakHashMap;

import so.ontolog.data.binding.metadata.BeanMetadata;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class SimpleBeanMetadataCache implements BeanMetadataCache {
	private WeakHashMap<Class, BeanMetadata> metadataMap = new WeakHashMap<Class, BeanMetadata>();
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> BeanMetadata<T> put(BeanMetadata<T> metadata) {
		return metadataMap.put(metadata.type(), metadata);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> BeanMetadata<T> get(Class<T> beanClass) {
		return metadataMap.get(beanClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> BeanMetadata<T> remove(Class<T> beanClass) {
		return metadataMap.remove(beanClass);
	}

}
