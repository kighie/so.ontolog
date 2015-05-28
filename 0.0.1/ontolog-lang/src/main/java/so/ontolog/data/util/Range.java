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
import java.math.BigDecimal;
import java.util.Iterator;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Range implements Serializable , Iterable<Integer> {
	private static final long serialVersionUID = 1L;

	public static final Range ZERO_RANGE = new Range(0,0);
	
	private final int from;
	private final int to;
	
	/**
	 * @param from
	 * @param to
	 */
	public Range(int from, int to) {
		if(from>to){
			throw new RuntimeException("Range to("+to+") must be greater than from("+from+").");
		}
		this.from = from;
		this.to = to;
	}

	public static Range create(String from, String to){
		try {
			int fromInt = Integer.parseInt(from);
			int toInt = Integer.parseInt(to);
			
			return new Range(fromInt, toInt);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Range must be integer to integer. " + e.getMessage());
		}
	}

	
	
	public int from() {
		return from;
	}

	public int to() {
		return to;
	}

	public Iterator<Integer> iterator() {
		return new IntegerIterator();
	}
	
	public int distance(){
		return to-from;
	}
	
	@Override
	public String toString() {
		return from + ":" + to;
	}

	class IntegerIterator implements Iterator<Integer> {
		int index = 0;
		
		public IntegerIterator() {
			index = from;
		}
		
		@Override
		public boolean hasNext() {
			return index<to;
		}
		
		@Override
		public Integer next() {
			return index++;
		}

		@Override
		public void remove() {
			//DO NOTHING
		}
		
	}

	class DecimalIterator implements Iterator<BigDecimal> {
		int index = 0;
		
		public DecimalIterator() {
			index = from;
		}
		
		@Override
		public boolean hasNext() {
			return index<to;
		}
		
		@Override
		public BigDecimal next() {
			return new BigDecimal(index++);
		}

		@Override
		public void remove() {
			//DO NOTHING
		}
		
	}
	
//	public static Range conjunction(Range ra, Range rb){
//		if(ra.from<rb.from && ra.to)
//		
//		
//		if(ra.from<rb.to && ra.to>=rb.from){
//			
//		}
//	}
//
//	public static Range disjunction(Range ra, Range rb){
//		int from = Math.min(ra.from, rb.from);
//		int to = Math.min(ra.to, rb.to);
//		if(from < to){
//			return new Range(from,to);
//		}
//		
//		return ZERO_RANGE;
//	}
}
