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
package so.ontolog.data.binding.tools;

import so.ontolog.data.binding.BeanBindable;
import so.ontolog.data.binding.BeanBinder;
import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.metadata.BeanMetadata;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanAdapter<T> implements BeanBindable {

	private final BeanBinder<T> binder;
	private T bean;
	
	public BeanAdapter(BeanBinder<T> binder, T bean) {
		this.binder = binder;
		setBean(bean);
	}
	
	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		if( !binder.getMetadata().type().isAssignableFrom(bean.getClass()) ){
			throw new BindingException("Illegal bean type. " + bean.getClass().getName());
		}
		this.bean = bean;
	}

	@Override
	public BeanMetadata<T> getMetadata() {
		return binder.getMetadata();
	}

	@Override
	public <V> V getValue(int index) {
		return binder.getValue(bean, index);
	}

	@Override
	public <V> V getValue(String fieldName) {
		return binder.getValue(bean, fieldName);
	}

	@Override
	public <V> void setValue(int index, V value) {
		binder.setValue(bean, index, value);
	}

	@Override
	public <V> void setValue(String fieldName, V value) {
		binder.setValue(bean, fieldName, value);
	}

	@Override
	public Object[] getValues() {
		return binder.getValues(bean);
	}

	@Override
	public void setValues(Object[] values) {
		binder.setValues(bean, values);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public BeanBindable getFieldBindable(String fieldName) {
		BeanBinder<?> bidner = binder.getFieldBeanBinder(fieldName);
		Object value = binder.getValue(bean, fieldName);
		
		return new BeanAdapter(bidner, value);
	}

	

}
