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
package so.ontolog.data.binding.metadata;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.common.FieldMap;
import so.ontolog.data.util.StringArraySet;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class BeanMetadata<T> extends FieldMap<String, BeanProperty>{
	private static final long serialVersionUID = 8012712582777493688L;

	private Class<T> beanClass;
	
	public BeanMetadata(Class<T> beanClass, String[] strArray) {
		super(strArray, BeanProperty.class);
		this.beanClass = beanClass;
	}
	
	public BeanMetadata(Class<T> beanClass,String[] strArray, BeanProperty[] fields) {
		super(strArray, fields);
		this.beanClass = beanClass;
	}

	public BeanMetadata(Class<T> beanClass,StringArraySet keySet, BeanProperty[] fields) {
		super(keySet, fields);
		this.beanClass = beanClass;
	}

	/**
	 * @return the beanClass
	 */
	public Class<T> type() {
		return beanClass;
	}
	

	public void toString(StringBuilder builder) {
		builder.append(beanClass.getSimpleName()).append("[");
		for(BeanProperty f : this){
			builder.append("\n\t");
			f.toString(builder);
		}
		builder.append("\n]");
	}

	public T newBean(){
		try {
			return beanClass.newInstance();
		} catch (Exception e) {
			throw new BindingException(e);
		}
	}
}
