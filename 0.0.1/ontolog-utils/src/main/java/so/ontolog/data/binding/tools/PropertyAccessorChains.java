/**
 * 
 */
package so.ontolog.data.binding.tools;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.PropertyAccessor;
import so.ontolog.data.binding.convert.Converter;

/**
 * @author kighie
 *
 */
public class PropertyAccessorChains<K, V> implements PropertyAccessor<K, V> {

	private PropertyAccessor<?,?> parent;
	private PropertyAccessor<K,V> propertyAccessor;
	
	public PropertyAccessorChains(PropertyAccessor<?,?> parent, PropertyAccessor<K,V> propertyAccessor) {
		this.parent = parent;
		this.propertyAccessor = propertyAccessor;
	}
	
	public K accessKey() {
		return propertyAccessor.accessKey();
	}

	public Class<?> type() {
		return propertyAccessor.type();
	}

	public void setConverter(Converter<? extends V> converter) {
		propertyAccessor.setConverter(converter);
	}

	public V get(Object rootBean) {
		Object bean;
		if(parent != null){
			bean = parent.get(rootBean);
		} else {
			bean = rootBean;
		}

		if(bean == null) {
			return null;
		}
		
		return propertyAccessor.get(bean);
	}

	public void set(Object rootBean, Object value){
		Object bean;
		if(parent != null){
			bean = parent.get(rootBean);
		} else {
			bean = rootBean;
		}

		if(bean == null) {
			throw new BindingException("parent bean is null");
		}
		
		propertyAccessor.set(bean, value);
	}
}
