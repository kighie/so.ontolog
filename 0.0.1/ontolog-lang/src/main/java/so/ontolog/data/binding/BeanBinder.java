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

import java.io.Serializable;

import so.ontolog.data.binding.metadata.BeanMetadata;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
public interface BeanBinder<T> extends Serializable {
	
	BeanMetadata<T> getMetadata();
	
	Class<T> type();
	
	<V> V getValue(T bean, int index);
	
	<V> V getValue(T bean, String fieldName);

	Object[] getValues(T bean);
	
	<V> void setValue(T bean, int index, V value);

	<V> void setValue(T bean, String fieldName, V value);
	
	void setValues(T bean, Object[] values);
	
	T newBean();
	
	<V> BeanBinder<V> getFieldBinder(String fieldName);
	
	void print(T bean, StringBuilder builder, String indent);
}
