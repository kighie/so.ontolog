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

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class SimpleComponentRepository<K, T> implements ComponentRepository<K, T> {
	private Map<K, T> map = new HashMap<K, T>();
	private Class<T> type;
	
	
	public SimpleComponentRepository(Class<T> type) {
		this.type = type;
	}

	public Class<T> type(){
		return type;
	}
	
	public boolean support(Class<?> type){
		return this.type.isAssignableFrom(type);
	}
	
	public T get(K qname){
		return map.get(qname);
	}
	
	@SuppressWarnings("unchecked")
	public void register(K qname, Object obj){
		map.put(qname, (T)obj);
	}
}
