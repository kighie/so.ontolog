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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.ConverterMap;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.binding.convert.EnumConverter;
import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.data.util.BeanUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanPropertyFactory implements BeanPropertyFactory {
//	private static Logger logger = Logger.getLogger(DefaultBeanPropertyFactory.class.getName());
	
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
			return createBeanProperty(beanClass, pd);
		} catch (IntrospectionException e) {
			throw new BindingException(e);
		}
		
	}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public BeanProperty<?> createBeanProperty(Class<?> beanClass, PropertyDescriptor pd) {
		Class<?> type = pd.getPropertyType();
		if(type == null){
			return null;
		}
		
		if("class".equals( pd.getName() )){
			return null;
		}

		// getter/setter setting 
		Method getter = pd.getReadMethod();
		Method setter = pd.getWriteMethod();
		
		if( getter == null && type == Boolean.class){
			getter = BeanUtils.findGetter(beanClass, pd.getName());
		}
		
		// converter setting 
		Converter<?> converter = converterMap.get(type);
		
		if(converter ==null){
			if( Enum.class.isAssignableFrom(type)){
				converter = new EnumConverter(type);
			} else {
				converter = DefaultConverters.BY_PASS;
//				logger.log(Level.INFO, "Unknown converter type " + type.getName());
			}
		}
		
		// Generic type setting
		Type[] genericParamTypes;
		
		if(getter != null){
			genericParamTypes = BeanUtils.getGenericReternTypes(getter);
		} else {
			Field field = BeanUtils.findField(beanClass, pd.getName());
			genericParamTypes = BeanUtils.getGenericParameterTypes(field);
		}
		
		TypeSpec typeSpec = TypeUtils.getTypeSpec(type, genericParamTypes);
		
		BeanProperty beanField = new BeanProperty(pd.getName(), typeSpec, converter);
		beanField.setGetter(getter);
		beanField.setSetter(setter);
		beanField.setGenericParamTypes(genericParamTypes);
		
		return beanField;
	}
	
}
