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

import java.util.List;
import java.util.Map;

import so.ontolog.data.binding.metadata.BeanProperty;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.EvalException;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.Settable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 * @param <T> Member Type
 * @param <P> Parent Type
 */
public abstract class PropertyRef<T, P> extends GenericRef implements Gettable<T>, Settable<T> {

	private static final long serialVersionUID = 562819218967483759L;

	protected TypeSpec type;
	protected final Gettable<P> parentGettable;
	
	/**
	 * @param qname
	 */
	public PropertyRef(TypeSpec type, QName qname, Gettable<P> parent) {
		super(qname);
		this.type = type;
		this.parentGettable = parent;
	}

	@Override
	public TypeSpec type() {
		return type;
	}
	
	/**
	 * <pre>Get owner bean</pre>
	 * @param context
	 * @return
	 */
	protected P getParent(Context context){
		return parentGettable.get(context);
	}
	
	/**
	 * 
	 * <pre></pre>
	 * @author Ikchan Kwon
	 *
	 * @param <T>
	 */
	public static class BeanPropertyRef<T> extends PropertyRef<T, Object>{

		private static final long serialVersionUID = -3749532767527522142L;
		
		protected final BeanProperty<T> beanProperty;
		
		public BeanPropertyRef(QName qname, Gettable<Object> parent, BeanProperty<T> beanProperty) {
			super(beanProperty.typeSpec(), qname, parent);
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
	

	/**
	 * 
	 * <pre></pre>
	 * @author Ikchan Kwon
	 *
	 * @param <T> element type
	 * @param <P> parent type
	 * @param <I> indexer type
	 */
	public static abstract class AbstractElementRef<T, P, I> extends PropertyRef<T, P> {
		private static final long serialVersionUID = 6530138026502513547L;

		protected Gettable<I> indexer;
		
		/**
		 * @param type
		 * @param qname
		 * @param parent
		 */
		public AbstractElementRef(TypeSpec type, QName parentQname,
				Gettable<P> parent, Gettable<I> indexer) {
			super(type, new QName(parentQname, indexer.toString()), parent);
			this.indexer = indexer;
		}
		

		public I getIndex(Context context){
			return indexer.get(context);
		}
		
	}

	public static class ArrayElementRef<T> extends AbstractElementRef<T, T[], Number> {
		private static final long serialVersionUID = 2063686483038250869L;

		/**
		 * @param type
		 * @param parentQname
		 * @param parent
		 * @param indexer
		 */
		public ArrayElementRef(TypeSpec type, QName parentQname,
				Gettable<T[]> parent, Gettable<Number> indexer) {
			super(type, parentQname, parent, indexer);
		}

		@Override
		public T get(Context context) {
			T[] array = getParent(context);
			Number index = indexer.get(context);
			
			if(array == null){
				return null;
			}
			
			try {
				return array[index.intValue()];
			} catch (Exception e) {
				throw new EvalException(e).setNode(this);
			}
		}

		@Override
		public void set(Context context, T value) {
			T[] array = getParent(context);
			Number index = indexer.get(context);
			
			if(array == null){
				throw new EvalException("Parent array is null : " + parentGettable.toString()).setNode(this);
			}
			
			int indexInt = index.intValue();
			
			if(indexInt<0 || indexInt >= array.length){
				throw new EvalException("Array index out of bound : " + indexInt).setNode(this);
			}
			
			array[index.intValue()] = value;
		}
	}

	public static class ListElementRef<T> extends AbstractElementRef<T, List<T>, Number> {
		private static final long serialVersionUID = 2063686483038250869L;

		/**
		 * @param type
		 * @param parentQname
		 * @param parent
		 * @param indexer
		 */
		public ListElementRef(TypeSpec type, QName parentQname,
				Gettable<List<T>> parent, Gettable<Number> indexer) {
			super(type, parentQname, parent, indexer);
		}

		@Override
		public T get(Context context) {
			List<T> list = getParent(context);
			Number index = indexer.get(context);
			
			if(list == null){
				return null;
			}
			
			try {
				return list.get(index.intValue());
			} catch (Exception e) {
				throw new EvalException(e).setNode(this);
			}
		}

		@Override
		public void set(Context context, T value) {
			List<T> list = getParent(context);
			Number index = indexer.get(context);
			
			if(list == null){
				throw new EvalException("Parent list is null : " + parentGettable.toString()).setNode(this);
			}
			
			list.set(index.intValue(), value);
		}
	}

	@SuppressWarnings("rawtypes")
	public static class MapEntryRef<T> extends AbstractElementRef<T, Map, Object> {
		private static final long serialVersionUID = 6288321734688611309L;

		/**
		 * @param type
		 * @param parentQname
		 * @param parent
		 * @param indexer
		 */
		public MapEntryRef(TypeSpec type, QName parentQname,
				Gettable<Map> parent, Gettable<Object> indexer) {
			super(type, parentQname, parent, indexer);
		}

		@SuppressWarnings("unchecked")
		@Override
		public T get(Context context) {
			Map map = getParent(context);
			Object index = indexer.get(context);
			
			if(map == null){
				return null;
			}
			
			try {
				return (T)map.get(index);
			} catch (Exception e) {
				throw new EvalException(e).setNode(this);
			}
		}

		@SuppressWarnings("unchecked")
		@Override
		public void set(Context context, T value) {
			Map map = getParent(context);
			Object index = indexer.get(context);
			
			if(map == null){
				throw new EvalException("Parent map is null : " + parentGettable.toString()).setNode(this);
			}
			
			map.put(index, value);
		}
	}
	
	public static class UnknownTypeElementRef extends AbstractElementRef<Object,Object,Object> {
		private static final long serialVersionUID = -8389947863991675302L;
		
		/**
		 * @param type
		 * @param parentQname
		 * @param parent
		 * @param indexer
		 */
		public UnknownTypeElementRef(TypeSpec type,
				QName parentQname, Gettable<Object> parent,
				Gettable<Object> indexer) {
			super(type, parentQname, parent, indexer);
		}

		@Override
		public Object get(Context context) {
			throw new EvalException("TODO : Not supported");
		}
		
		@Override
		public void set(Context context, Object value) {
			throw new EvalException("TODO : Not supported");
		}

		
	}
}
