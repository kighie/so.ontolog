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
import java.math.MathContext;
import java.math.RoundingMode;

import so.ontolog.lang.runtime.Operator.Binary;
import so.ontolog.lang.runtime.Operator.Unary;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOperators {

	private final static BigDecimal DEC100 = new BigDecimal("100");
	
	public static final MathContext DIVIDE_MATH_CONTEXT = new MathContext(10, RoundingMode.HALF_UP);

	public static final Unary<BigDecimal,BigDecimal> NEGATE = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.negate();
		};

		@Override
		public Class<BigDecimal> type() { return BigDecimal.class; }
		@Override
		public String token() { return "NEGATE";}

	};

	public static final Unary<BigDecimal,BigDecimal> PERCENT = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.divide(DEC100, val.scale()+2 , RoundingMode.HALF_UP);
		};

		@Override
		public Class<BigDecimal> type() { return BigDecimal.class; }
		@Override
		public String token() { return "PERCENT";}

	};
	
	public static final Unary<Boolean,Boolean> NOT = new Unary<Boolean,Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val) {
			return (val != null) ? !val : true;
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "NOT";}

	};
	
	public static final Binary<BigDecimal,BigDecimal,BigDecimal> POW = new Binary<BigDecimal,BigDecimal,BigDecimal>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
				return val1.pow(val2.intValueExact());
			}
			
			@Override
			public Class<? extends BigDecimal> type() { return BigDecimal.class; }
			@Override
			public String token() { return "POW";};
	};
	
	public static final Binary<BigDecimal,BigDecimal,BigDecimal> MULTIFLY = new Binary<BigDecimal,BigDecimal,BigDecimal>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
				return val1.multiply(val2);
			}

			@Override
			public Class<? extends BigDecimal> type() { return BigDecimal.class; }
			@Override
			public String token() { return "MULTIFLY";};
	};
	
	public static final Binary<BigDecimal, BigDecimal, BigDecimal> DIVIDE = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.divide(val2, DIVIDE_MATH_CONTEXT);
		}

		@Override
		public Class<? extends BigDecimal> type() { return BigDecimal.class; }
		@Override
		public String token() { return "DIVIDE";};
	};

	public static final Binary<BigDecimal, BigDecimal, BigDecimal> ADD = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.add(val2);
		}

		@Override
		public Class<? extends BigDecimal> type() { return BigDecimal.class; }
		@Override
		public String token() { return "ADD";};
	};
	

	public static final Binary<BigDecimal, BigDecimal, BigDecimal> SUBTRACT = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.subtract(val2);
		}

		@Override
		public Class<? extends BigDecimal> type() { return BigDecimal.class; }
		@Override
		public String token() { return "SUBTRACT";};
	};
	

	public static final Binary<Boolean, Object, Object> EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return val1.equals(val2);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "EQUALS";}

	};

	public static final Binary<Boolean, Object, Object> NOT_EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return !val1.equals(val2);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "NOT_EQUALS";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) >= 0);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "EQUALS_GT";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) > 0);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "GT";}

	};
	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) <= 0);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "EQUALS_LT";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) < 0);
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "LT";}

	};
	

	public static final Binary<Boolean, Boolean, Boolean> AND = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 && val2;
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "AND";}

	};
	

	public static final Binary<Boolean, Boolean, Boolean> OR = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 || val2;
		};

		@Override
		public Class<Boolean> type() { return Boolean.class; }
		@Override
		public String token() { return "OR";}

	};
	

	public static final Binary<String, Object, Object> CONCAT = new Binary<String, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public String eval(Object val1, Object val2) {
			StringBuilder buf = new StringBuilder();
			buf.append(val1).append(val2);
			return buf.toString();
		};

		@Override
		public Class<String> type() { return String.class; }
		@Override
		public String token() { return "CONCAT";}

	};
}
