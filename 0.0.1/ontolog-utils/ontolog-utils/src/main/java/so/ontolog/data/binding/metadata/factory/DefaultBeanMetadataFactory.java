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

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.LinkedList;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.metadata.BeanMetadata;
import so.ontolog.data.binding.metadata.BeanProperty;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultBeanMetadataFactory implements BeanMetadataFactory {
	
	private BeanPropertyFactory propertyFactory;
	

	/**
	 * create DefaultBeanFactory with {@link DefaultBeanPropertyFactory}
	 */
	public DefaultBeanMetadataFactory() {
		this(new DefaultBeanPropertyFactory());
	}

	public DefaultBeanMetadataFactory(BeanPropertyFactory propertyFactory) {
		this.propertyFactory = propertyFactory;
	}

	@Override
	public <T> BeanMetadata<T> create(Class<T> beanClass) {
		LinkedList<BeanProperty<?>> propList = getBeanProperties(beanClass);

		int length = propList.size();
		BeanProperty<?>[] propertyArray = new BeanProperty<?>[length];
		String[] fnameArray = new String[length];
		
		propList.toArray(propertyArray);

		BeanProperty<?> property;
		
		for( int i=0;i<length;i++ ){
			property = propertyArray[i];
			fnameArray[i] = property.name();
		}
		
		BeanMetadata<T> metadata = new BeanMetadata<T>(beanClass, fnameArray, propertyArray);
		return metadata;
	}

	/**<pre></pre>
	 * @param beanClass
	 * @return
	 */
	protected <T> PropertyDescriptor[] getPropertyDescriptors(Class<T> beanClass) {
		BeanInfo beanInfo;
		
		try {
			beanInfo = Introspector.getBeanInfo(beanClass);
		} catch (IntrospectionException e) {
			throw new BindingException(e);
		}
		
		PropertyDescriptor[] pdArray = beanInfo.getPropertyDescriptors();
		return pdArray;
	}
	
	/**<pre></pre>
	 * @param beanClass
	 * @return
	 */
	protected <T> LinkedList<BeanProperty<?>> getBeanProperties(
			Class<T> beanClass) {
		PropertyDescriptor[] pdArray = getPropertyDescriptors(beanClass);
		
		LinkedList<BeanProperty<?>> propList = new LinkedList<BeanProperty<?>>();
		BeanProperty<?> property;
		
		for( PropertyDescriptor pd : pdArray ){
			property = propertyFactory.createBeanProperty(beanClass, pd);
			property = checkField(beanClass, property, pd);
			if(property != null){
				propList.add(property);
			}
		}
		return propList;
	}

	protected BeanProperty<?> checkField(Class<?> beanClass, BeanProperty<?> property, PropertyDescriptor pd){
//		if(property==null){
//			return null;
//		}
//		
//		if( !property.hasGetter() && property.type() == Boolean.class){
//			String methodName = makeMethodName("is" , property.name());
//			try {
//				Method getter = beanClass.getMethod(methodName, EMPTY_CLASS_ARRAY);
//				property.setGetter(getter);
//			} catch (Exception e) {
//				// Ignore
//			}
//			
//		}
		return property;
	}
}
