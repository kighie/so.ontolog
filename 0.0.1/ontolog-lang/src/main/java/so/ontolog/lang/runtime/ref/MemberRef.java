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
package so.ontolog.lang.runtime.ref;

import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.Settable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class MemberRef<T> extends GenericRef implements Gettable<T>, Settable<T> {

	private static final long serialVersionUID = 562819218967483759L;

	protected final Class<? extends T> type;
	protected final Gettable<?> parentGettable;
	
	/**
	 * @param qname
	 */
	public MemberRef(Class<? extends T> type, QName qname, Gettable<?> parent) {
		super(qname);
		this.type = type;
		this.parentGettable = parent;
	}

	@Override
	public Class<? extends T> type() {
		return type;
	}
	
	protected Object getParent(Context context){
		return parentGettable.get(context);
	}
	
	/**
	 * 
	 * <pre></pre>
	 * @author Ikchan Kwon
	 *
	 * @param <T>
	 */
	public static class BeanPropertyRef<T> extends MemberRef<T>{

		private static final long serialVersionUID = -3749532767527522142L;
		
		protected final BeanProperty<T> beanProperty;
		
		@SuppressWarnings("unchecked")
		public BeanPropertyRef(QName qname, Gettable<?> parent, BeanProperty<T> beanProperty) {
			super((Class<T>)beanProperty.type(), qname, parent);
			this.beanProperty = beanProperty;
		}
		
		@Override
		public void set(Context context, T value) {
			beanProperty.set(getParent(context), value);
		}
		
		@Override
		public T get(Context context) {
			return beanProperty.get(getParent(context));
		}
	}
}
