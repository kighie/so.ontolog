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
import java.util.logging.Level;
import java.util.logging.Logger;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.ConverterMap;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.binding.metadata.BeanProperty;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanPropertyFactory implements BeanPropertyFactory {
	private static Logger logger = Logger.getLogger(DefaultBeanPropertyFactory.class.getName());
	
	private ConverterMap converterMap;
	
	public DefaultBeanPropertyFactory(ConverterMap converterMap) {
		this.converterMap = converterMap;
	}


	public DefaultBeanPropertyFactory() {
		this(DefaultConverters.newConverterMap());
	}

	/**
	 * @return the converterMap
	 */
	public ConverterMap getConverterMap() {
		return converterMap;
	}

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
		Class<?> type = pd.getPropertyType();
		if(type == null){
			return null;
		}
		
		if("class".equals( pd.getName() )){
			return null;
		}
		Method getter = pd.getReadMethod();
		Method setter = pd.getWriteMethod();
		

		Converter<?> converter = converterMap.get(type);
		
		if(converter ==null){
			converter = DefaultConverters.BY_PASS;
			
			logger.log(Level.WARNING, "Unknown converter type " + type.getName());
		}
		
		BeanProperty beanField = new BeanProperty(pd.getName(), type, converter);
		beanField.setGetter(getter);
		beanField.setSetter(setter);
		
		return beanField;
	}
	
	
}
