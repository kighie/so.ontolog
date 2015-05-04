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
package so.ontolog.data.util;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * <pre></pre>
 * @author kighie@gmail.com
 *
 */
public class StringArraySet extends AbstractSet<String> implements Serializable, Iterable<String> {

	private static final long serialVersionUID = 1L;

	public final static String[] EMPTY_STRING_ARRAY = new String[0];
	
	private final String[] strArray;
	private Entry entryArray[];
	
	public StringArraySet(String[] strArray){
		this.strArray = strArray;
		init();
	}
	
	private void init() {
		if(strArray == null){
			throw new IllegalArgumentException( "string array must not be null");
		}
		
		entryArray = new Entry[(int)(strArray.length*1.4)];

		for (int i = strArray.length - 1; i >= 0; i--) {
			setIndex(strArray[i], i);
		}
	}
	
	private void setIndex(String key, int index) {
		int hash = key.hashCode();
		int entryIdx = (hash & 0x7FFFFFFF) % entryArray.length;

		for (Entry e = entryArray[entryIdx]; e != null; e = e.next) {
			if ((e.key == key) || (e.key.equals(key))) {
				throw new IllegalArgumentException(
						"Attribute key must be unique.");
			}
		}

		Entry e = new Entry(key, index, entryArray[entryIdx]);
		entryArray[entryIdx] = e;
	}
	


	public final boolean contains(String key) {
		return indexOf(key) > -1;
	}

	public final int indexOf(String key) {
		int hash = key.hashCode();
		int index = (hash & 0x7FFFFFFF) % entryArray.length;

		for (Entry e = entryArray[index]; e != null; e = e.next) {
			if ((e.key == key) || (e.key.equals(key))) {
				return e.index;
			}
		}
		return -1;
	}

	public final String get(int index) {
		return strArray[index];
	}
	
	public Iterator<String> iterator() {
		return new StringArrayIterator();
	}
	
	public final int size() {
		return strArray.length;
	}

	public boolean equals(StringArraySet other) {
		if(other != null){
			if(other.hashCode() == this.hashCode()){
				return true;
			}
			
			return Arrays.equals(strArray, other.strArray);
		}
		
		return false;
	}

	/**
	 * inner class : map entry
	 */
	private static class Entry  implements Serializable {
		private static final long serialVersionUID = 4801509094207445665L;

		Object key;
		int index;
		Entry next;

		Entry(Object key, int index, Entry next) {
			this.key = key;
			this.index = index;
			this.next = next;
		}
	}

	/**
	 * inner class
	 */
	private class StringArrayIterator implements Iterator<String> {
		int cursor = -1;
		
		public boolean hasNext(){
			return (cursor+1) < strArray.length;
		}
		
		public String next(){
			if(!hasNext()) {
				throw new IndexOutOfBoundsException("StringArrayIterator excess list size.");
			}
			
			cursor++;
			
			return strArray[cursor];
		}
		
		public void remove() {
			throw new RuntimeException("remove operation is not supported.");
		}
	}
	
}
