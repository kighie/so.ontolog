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
package so.ontolog.formula.runtime.ref;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.EvalException;
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.Settable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class VarIndexedRef<T> extends AbstractRef implements Gettable<T>, Settable<T> {

	private static final long serialVersionUID = 6720589776466679084L;

	private TypeSpec type;
	private final Gettable<?> parent;
	private final Gettable<?> indexer;
	
	public VarIndexedRef(QName qname, Gettable<?> parent, Gettable<?> indexer) {
		super(qname);
		this.parent = parent;
		this.indexer = indexer;
		
		type = parent.type().getComponentType();
	}

	@Override
	public TypeSpec type() {
		return type;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public T get(Context context) {
		Object parentValue = parent.get(context);

		if(parentValue == null){
			return null;
		}
		
		Object value;
		
		if(parentValue instanceof Map){
			value = ((Map)parentValue).get(indexer.get(context));
		} else {
			Number index = (Number)indexer.get(context);
			if(parentValue instanceof List){
				value = ((List)parentValue).get(index.intValue());
			} else if(parentValue.getClass().isArray()){
				value = Array.get(parentValue, index.intValue());
			} else {
				throw new EvalException(parent + " is not array nor List nor Map.").setNode(this);
			}
		}
		
		
		return (T)value;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void set(Context context, T value) {
		Object parentValue = parent.get(context);

		if(parentValue == null){
			return;
		}
		
		if(parentValue instanceof Map){
			((Map)parentValue).put(indexer.get(context), value);
		} else {
			Number index = (Number)indexer.get(context);
			if(parentValue instanceof List){
				((List)parentValue).add(index.intValue(), value);
			} else if(parentValue.getClass().isArray()){
				Array.set(parentValue, index.intValue(), value);
			} else {
				throw new EvalException(parent + " is not array nor List nor Map.").setNode(this);
			}
		}
	}
}
