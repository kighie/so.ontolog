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

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.metadata.BeanProperty;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanFieldFactory implements BeanPropertyFactory {
	
	
	@Override
	public BeanProperty<?> createBeanProperty(Class<?> beanClass, String fieldName){
		try {
			PropertyDescriptor pd = new PropertyDescriptor(fieldName, beanClass);
			return createBeanProperty(pd);
		} catch (IntrospectionException e) {
			throw new BindingException(e);
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public BeanProperty<?> createBeanProperty(PropertyDescriptor pd) {
		Method getter = pd.getReadMethod();
		Method setter = pd.getWriteMethod();
		Class<?> type = pd.getPropertyType();
		
		BeanProperty<?> beanField = new BeanProperty(pd.getName(), type);
		beanField.setGetter(getter);
		beanField.setSetter(setter);
		return beanField;
	}
	
	
}
