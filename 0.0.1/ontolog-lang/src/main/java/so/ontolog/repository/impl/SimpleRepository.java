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
package so.ontolog.repository.impl;

import java.util.HashMap;
import java.util.Map;

import so.ontolog.repository.ComponentRepository;
import so.ontolog.repository.OntologRepository;
import so.ontolog.repository.OntologRepositoryException;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class SimpleRepository<K> implements OntologRepository<K> {

	private Map<Class<?>, ComponentRepository<K,?>> typeMap;
	
	public SimpleRepository (Class<?>[] supportedTypes){
		initialize(supportedTypes);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void initialize(Class<?>[] supportedTypes){
		typeMap = new HashMap<Class<?>, ComponentRepository<K,?>>();
		for(Class<?> c : supportedTypes){
			typeMap.put(c, new SimpleComponentRepository(c));
		}
	}
	
	@Override
	public boolean support(Class<?> type) {
		return typeMap.containsKey(type);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getUnique(K qname, Class<T> type) {
		ComponentRepository<K,T> map = (ComponentRepository<K,T>)typeMap.get(type);
		if(map == null){
			throw new OntologRepositoryException("Unsupported Repository type : " + type );
		}
		return map.get(qname);
	}
	
	@Override
	public void register(K qname, Object obj) {
		Class<?> type = obj.getClass();
		for( ComponentRepository<K,?> r : typeMap.values() ){
			if(r.support(type)){
				r.register(qname, obj);
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(typeMap);
		return builder.toString();
	}
}
