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
package so.ontolog.lang.runtime.internal;

import java.util.HashMap;
import java.util.Map;

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class SimpleContext implements Context {
	private Map<QName, Object> refMap = new HashMap<QName, Object>();
	

	public void setParameter(String name, Object value){
		setReference(new QName(name), value);
	}
	
	
	@Override
	public Object getReference(QName name) {
		return refMap.get(name);
	}
	
	@Override
	public void setReference(QName name, Object value) {
		refMap.put(name, value);
	}
	
	@Override
	public void clear() {
		refMap.clear();
	}

}
