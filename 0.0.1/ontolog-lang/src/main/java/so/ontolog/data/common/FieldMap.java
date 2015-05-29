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
package so.ontolog.data.common;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;

import so.ontolog.data.util.KeyArraySet;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
@SuppressWarnings("rawtypes")
public class FieldMap<K, F extends Field> implements Serializable, Iterable<F>{
	private static final long serialVersionUID = -3120495093411329158L;
	
	private final KeyArraySet<K> keySet;
	private final F[] fields;

	@SuppressWarnings("unchecked")
	protected FieldMap(K[] strArray, Class<F> fieldType) {
		this.keySet = new KeyArraySet<K>(strArray);
		this.fields = (F[])Array.newInstance(fieldType, strArray.length);
	}

	public FieldMap(K[] strArray, F[] fields) {
		this(new KeyArraySet<K>(strArray), fields);
	}
	
	public FieldMap(KeyArraySet<K> keySet, F[] fields) {
		this.keySet = keySet;
		this.fields = fields;
	}

	public int size() {
		return keySet.size();
	}

	public boolean isEmpty() {
		return keySet.isEmpty();
	}

	public boolean contains(K key) {
		return keySet.contains(key);
	}

	public boolean contains(Field<K> field) {
		int index = keySet.indexOf(field.name());
		
		if(index <0){
			return false;
		}
		
		return fields[index].equals(field);
	}

	public K getKey(int index){
		return keySet.get(index);
	}
	
	public F get(int index){
		return fields[index];
	}
	
	public F get(K key) {
		int index = keySet.indexOf(key);
		if(index < 0){
			throw new IndexOutOfBoundsException(key + " is not found.");
		}
		return fields[index];
	}

	public int indexOf(K key){
		return keySet.indexOf(key);
	}
	
	public void set(K key, F field) {
		int index = keySet.indexOf(key);
		fields[index] = field;
	}
	
	public Set<K> getNames() {
		return keySet;
	}

	@Override
	public Iterator<F> iterator() {
		return new FieldIterator();
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		toString(builder);;
		return builder.toString();
	}
	
	public void toString(StringBuilder builder) {
		builder.append(getClass().getSimpleName()).append("[");
		for(F f : fields){
			builder.append("\n\t");
			f.toString(builder);
		}
		builder.append("\n]");
	}


	class FieldIterator implements Iterator<F> {
		int cursor = -1;
		
		public boolean hasNext(){
			return (cursor+1) < fields.length;
		}
		
		public F next(){
			if(!hasNext()) {
				throw new IndexOutOfBoundsException("FieldIterator excess list size.");
			}
			
			cursor++;
			
			return fields[cursor];
		}

		@Override
		public void remove() {
			throw new RuntimeException("remove operation is not supported.");
		}
		
	}
	
	
}
