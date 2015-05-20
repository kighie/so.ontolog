/**
 * 
 */
package so.ontolog.data.binding.tools;

import so.ontolog.data.binding.BindingException;
import so.ontolog.data.binding.PropertyAccessor;

/**
 * @author kighie
 *
 */
public class PropertyAccessorChains<T> {

	private PropertyAccessorChains<?> parentChain;
	private PropertyAccessor<?,T> beanProperty;
	
	public PropertyAccessorChains(PropertyAccessorChains<?> parentChain, PropertyAccessor<?,T> beanProperty) {
		this.parentChain = parentChain;
		this.beanProperty = beanProperty;
	}
	
	
	public T getValue(Object rootBean) {
		Object bean;
		if(parentChain != null){
			bean = parentChain.getValue(rootBean);
		} else {
			bean = rootBean;
		}

		if(bean == null) {
			return null;
		}
		
		return beanProperty.get(bean);
	}

	public void setValue(Object rootBean, T value){
		Object bean;
		if(parentChain != null){
			bean = parentChain.getValue(rootBean);
		} else {
			bean = rootBean;
		}

		if(bean == null) {
			throw new BindingException("parent bean is null");
		}
		
		beanProperty.set(bean, value);
	}
}
