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
package so.ontolog.lang.runtime.internal;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Literal;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public abstract class GenericLiteral<T> implements Literal<T>{
	private static final long serialVersionUID = 473383319479443064L;

	protected T value;
	
	/**
	 * @param value
	 */
	public GenericLiteral(T value) {
		this.value = value;
	}

	@Override
	public T getValue(){
		return value;
	}
	
	@Override
	public T get(Context context) {
		return value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}

	/**
	 * <pre>Text literal </pre>
	 * @author Ikchan Kwon
	 *
	 */
	public static class TextLiteral extends GenericLiteral<String> {
		private static final long serialVersionUID = -9087887733634147019L;

		public TextLiteral(String value) {
			super(value);
		}

		@Override
		public TypeSpec type() {
			return TypeSpec.STRING;
		}
		
		@Override
		public String toString() {
			return "'" + value + "'";
		}
	}
	

	/**
	 * <pre>Number literal </pre>
	 * @author Ikchan Kwon
	 *
	 */
	public static class NumberLiteral extends GenericLiteral<BigDecimal> {

		private static final long serialVersionUID = 641298535480157623L;
		public final static NumberLiteral ZERO = new NumberLiteral(BigDecimal.ZERO);
		public final static NumberLiteral ONE = new NumberLiteral(BigDecimal.ONE);
		public final static NumberLiteral TWO = new NumberLiteral(new BigDecimal(2));
		public final static NumberLiteral THREE = new NumberLiteral(new BigDecimal(3));
		public final static NumberLiteral FOUR = new NumberLiteral(new BigDecimal(4));
		public final static NumberLiteral FIVE = new NumberLiteral(new BigDecimal(5));
		public final static NumberLiteral SIX = new NumberLiteral(new BigDecimal(6));
		public final static NumberLiteral SEVEN = new NumberLiteral(new BigDecimal(7));
		public final static NumberLiteral EIGHT = new NumberLiteral(new BigDecimal(8));
		public final static NumberLiteral NINE = new NumberLiteral(new BigDecimal(9));
		public final static NumberLiteral TEN = new NumberLiteral(BigDecimal.TEN);
		
		static final Map<String, NumberLiteral> map = new HashMap<String, GenericLiteral.NumberLiteral>();
		static {
			map.put("0", ZERO);
			map.put("1", ONE);
			map.put("2", TWO);
			map.put("3", THREE);
			map.put("4", FOUR);
			map.put("5", FIVE);
			map.put("6", SIX);
			map.put("7", SEVEN);
			map.put("8", EIGHT);
			map.put("9", NINE);
			map.put("10", TEN);
		}

		public static NumberLiteral parseLiteral(String value) {
			NumberLiteral literal = map.get(value);
			if(literal == null){
				literal = new NumberLiteral(new BigDecimal(value));
			}
			return literal;
		}

		public static NumberLiteral parseLiteral(int value) {
			NumberLiteral literal = map.get(Integer.toString(value));
			if(literal == null){
				literal = new NumberLiteral(new BigDecimal(value));
			}
			return literal;
		}
		
		public NumberLiteral(BigDecimal value) {
			super(value);
		}

		@Override
		public TypeSpec type() {
			return TypeSpec.DECIMAL;
		}
		
	}

	/**
	 * <pre>boolean literal </pre>
	 * @author Ikchan Kwon
	 *
	 */
	public static class BooleanLiteral extends GenericLiteral<Boolean> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 3826493857572646576L;
		public static final BooleanLiteral TRUE = new BooleanLiteral(true);
		public static final BooleanLiteral FALSE = new BooleanLiteral(false);
		
		public BooleanLiteral(Boolean value) {
			super(value);
		}

		@Override
		public TypeSpec type() {
			return TypeSpec.BOOLEAN;
		}
	}

	/**
	 * <pre>Date literal </pre>
	 * @author Ikchan Kwon
	 *
	 */
	public static class DateLiteral extends GenericLiteral<Date> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 8405918607730594670L;
		private static final DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		public DateLiteral(Date value) {
			super(value);
		}

		public DateLiteral(String value) throws ParseException {
			super(formatter.parse(value));
		}

		@Override
		public TypeSpec type() {
			return TypeSpec.DATE;
		}
	}
	

	public static class ObjectLiteral<T> extends GenericLiteral<T> {
		private static final long serialVersionUID = -9087887733634147019L;

		private TypeSpec typeSpec;
		
		public ObjectLiteral(TypeSpec typeSpec, T value) {
			super(value);
			this.typeSpec = typeSpec;
		}

		@Override
		public TypeSpec type() {
			return typeSpec;
		}
		
		/**
		 * @param typeSpec the typeSpec to set
		 */
		public void setType(TypeSpec type) {
			this.typeSpec = type;
		}
		
		@Override
		public String toString() {
			return "'" + value + "'";
		}
	}
	
}
