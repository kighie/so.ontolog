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

import java.lang.reflect.Method;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.common.AbstractField;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BeanProperty<T> extends AbstractField{
	private static final long serialVersionUID = -196837514470986311L;
	public static final Object[] EMPTY_ARGS = new Object[0];
	
	private Method getter;
	private Method setter;
	private T defaultValue;
	private Converter<? extends T> converter;

	public BeanProperty(String name, Class<T> type) {
		this(name, type, DefaultConverters.getConverter(type));
	}

	public BeanProperty(String name, Class<T> type, Converter<T> converter) {
		this(name, TypeUtils.getTypeSpec(type), converter);
	}

	public BeanProperty(String name, TypeSpec typeSpec, Converter<T> converter) {
		super(name, typeSpec);
		this.converter = converter;
		initDefault();
	}
	
	
	@SuppressWarnings("incomplete-switch")
	protected void initDefault(){
		if(typeSpec.isPrimitive()) {
			switch(typeSpec.getTypeKind()){
			case Number : 
			case Text :  defaultValue = converter.convert(0); break;
			case Bool :  defaultValue = converter.convert(false); break;
			case Byte :  defaultValue = converter.convert(0); break;
			}
		}
	}
	
	public T getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(T defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * @param converter the converter to set
	 */
	public void setConverter(Converter<? extends T> converter) {
		this.converter = converter;
	}
	
	public boolean hasGetter() {
		return getter != null;
	}

	public void setGetter(Method getter) {
		this.getter = getter;
	}

	@SuppressWarnings("unchecked")
	public T get(Object bean){
		if(getter != null){
			try {
				return (T)getter.invoke(bean, EMPTY_ARGS);
			} catch (Exception e) {
				throw new BindingException(e);
			}
		} else {
			throw new BindingException("BeanProperty " + bean.getClass().getName() + "#" + name + " has no getter.");
		}
	}
	
	public boolean hasSetter() {
		return setter != null;
	}
	
	public void setSetter(Method setter) {
		this.setter = setter;
	}

	public void set(Object bean, Object value){
		if(setter != null){
			if(value == null){
				value = defaultValue;
			}
			try {
				T val = converter.convert(value); 
				setter.invoke(bean, new Object[]{val});
			} catch (Exception e) {
				throw new BindingException(e);
			}
		} else {
			throw new BindingException("BeanProperty " + bean.getClass().getName() + "#" + name + " has no setter.");
		}
	}
	
	@Override
	public void toString(StringBuilder builder) {
		builder.append(name).append(" : ");
		builder.append(typeSpec.getName());
		
		builder.append(", get=").append(hasGetter());
		builder.append(", set=").append(hasSetter());
	}
}
