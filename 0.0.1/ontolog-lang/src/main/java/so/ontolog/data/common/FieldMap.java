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

import so.ontolog.data.util.StringArraySet;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
public class FieldMap<T extends Field> implements Serializable, Iterable<T>{
	private static final long serialVersionUID = -3120495093411329158L;
	
	private final StringArraySet keySet;
	private final T[] fields;

	@SuppressWarnings("unchecked")
	protected FieldMap(String[] strArray, Class<T> fieldType) {
		this.keySet = new StringArraySet(strArray);
		this.fields = (T[])Array.newInstance(fieldType, strArray.length);
	}

	public FieldMap(String[] strArray, T[] fields) {
		this(new StringArraySet(strArray), fields);
	}
	
	public FieldMap(StringArraySet keySet, T[] fields) {
		this.keySet = keySet;
		this.fields = fields;
	}

	public int size() {
		return keySet.size();
	}

	public boolean isEmpty() {
		return keySet.isEmpty();
	}

	public boolean contains(String key) {
		return keySet.contains(key);
	}

	public boolean contains(Field field) {
		int index = keySet.indexOf(field.name());
		
		if(index <0){
			return false;
		}
		
		return fields[index].equals(field);
	}

	public String getKey(int index){
		return keySet.get(index);
	}
	
	public T get(int index){
		return fields[index];
	}
	
	public T get(String key) {
		int index = keySet.indexOf(key);
		if(index < 0){
			throw new IndexOutOfBoundsException(key + " is not found.");
		}
		return fields[index];
	}

	public int indexOf(String key){
		return keySet.indexOf(key);
	}
	
	public void set(T field) {
		int index = keySet.indexOf(field.name());
		fields[index] = field;
	}
	
	public Set<String> getNames() {
		return keySet;
	}

	@Override
	public Iterator<T> iterator() {
		return new FieldIterator();
	}

	class FieldIterator implements Iterator<T> {
		int cursor = -1;
		
		public boolean hasNext(){
			return (cursor+1) < fields.length;
		}
		
		public T next(){
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
