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
package so.ontolog.formula.ast.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTExpr;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.expr.LiteralExpr;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Range implements Serializable , Iterable<BigDecimal> {
	private static final long serialVersionUID = 1L;

	public static final Range ZERO_RANGE = new Range(0,0);
	
	private final int from;
	private final int to;
	private BigDecimal[] decimals;
	
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
		
		decimals = new BigDecimal[to-from];
		int index = 0;
		for(int i =from;i<to;i++){
			decimals[index++] = new BigDecimal(i);
		}
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

	public static void setRange(List<ASTExpr> list, String from, String to){
		
		try {
			int fromInt = Integer.parseInt(from);
			int toInt = Integer.parseInt(to);
			
			setRange(list, fromInt, toInt);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Range must be integer to integer. " + e.getMessage());
		}
	}
	
	public static void setRange(List<ASTExpr> list, int from, int to){
		if(from>to){
			throw new RuntimeException("Range to("+to+") must be greater than from("+from+").");
		}
		
		for(int i=from ; i < to ; i++){
			list.add(new LiteralExpr(new ASTToken(0,0), TypeSpec.INT, Integer.toString(i)));
		}
	}
	
	public int from() {
		return from;
	}

	public int to() {
		return to;
	}
	
	/**
	 * @return the decimals
	 */
	public BigDecimal[] getDecimals() {
		return decimals;
	}

	public Iterator<BigDecimal> iterator() {
		return new DecimalIterator();
	}
	
	public int distance(){
		return to-from;
	}
	
	@Override
	public String toString() {
		return from + ":" + to;
	}
	
	class DecimalIterator implements Iterator<BigDecimal> {
		int index = 0;
		
		@Override
		public boolean hasNext() {
			return index<decimals.length;
		}
		
		@Override
		public BigDecimal next() {
			return decimals[index++];
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
