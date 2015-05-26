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
package so.ontolog.formula.runtime.internal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import so.ontolog.data.binding.convert.Converter;
import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Operator.Binary;
import so.ontolog.formula.runtime.Operator.Unary;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOperators {

	private final static Converter<BigDecimal> decimalConverter = DefaultConverters.BIG_DECIMAL;
	
	private final static BigDecimal DEC100 = new BigDecimal("100");
	
	public static final MathContext DIVIDE_MATH_CONTEXT = new MathContext(10, RoundingMode.HALF_UP);

	private static BigDecimal toDecimal(Number number){
		return decimalConverter.convert(number);
	}
	
	
	public static final Unary<BigDecimal,BigDecimal> NEGATE = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.negate();
		};

		@Override
		public TypeSpec type() { return TypeSpec.DECIMAL; }
		@Override
		public String token() { return "NEGATE";}
		
		public String toString() { return token(); };
	};

	public static final Unary<BigDecimal,BigDecimal> PERCENT = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.divide(DEC100, val.scale()+2 , RoundingMode.HALF_UP);
		};

		@Override
		public TypeSpec type() { return TypeSpec.DECIMAL; }
		@Override
		public String token() { return "PERCENT";}

		public String toString() { return token(); };
	};
	
	public static final Unary<Boolean,Boolean> NOT = new Unary<Boolean,Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val) {
			return (val != null) ? !val : true;
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "NOT";}

		public String toString() { return token(); };
	};
	
	public static final Binary<BigDecimal, Number, Number> POW = new Binary<BigDecimal, Number, Number>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(Number val1, Number val2) {
				return toDecimal(val1).pow(val2.intValue());
			}
			
			@Override
			public TypeSpec type() { return TypeSpec.DECIMAL; }
			@Override
			public String token() { return "POW";};
			public String toString() { return token(); };
	};
	
	public static final Binary<BigDecimal, Number, Number> MULTIFLY = new Binary<BigDecimal, Number, Number>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(Number val1, Number val2) {
				return toDecimal(val1).multiply( toDecimal(val2) );
			}

			@Override
			public TypeSpec type() { return TypeSpec.DECIMAL; }
			@Override
			public String token() { return "MULTIFLY";};
			public String toString() { return token(); };
	};
	
	public static final Binary<BigDecimal, Number, Number> DIVIDE = new Binary<BigDecimal, Number, Number>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(Number val1, Number val2) {
			return toDecimal(val1).divide(toDecimal(val2), DIVIDE_MATH_CONTEXT);
		}

		@Override
		public TypeSpec type() { return TypeSpec.DECIMAL; }
		@Override
		public String token() { return "DIVIDE";};
		public String toString() { return token(); };
	};

	public static final Binary<BigDecimal, Number, Number> ADD = new Binary<BigDecimal, Number, Number>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(Number val1, Number val2) {
			return toDecimal(val1).add(toDecimal(val2));
		}

		@Override
		public TypeSpec type() { return TypeSpec.DECIMAL; }
		@Override
		public String token() { return "ADD";};
		public String toString() { return token(); };
	};
	

	public static final Binary<BigDecimal, Number, Number> SUBTRACT = new Binary<BigDecimal, Number, Number>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(Number val1, Number val2) {
			return toDecimal(val1).subtract(toDecimal(val2));
		}

		@Override
		public TypeSpec type() { return TypeSpec.DECIMAL; }
		@Override
		public String token() { return "SUBTRACT";};
		public String toString() { return token(); };
	};
	

	public static final Binary<Boolean, Object, Object> EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return val1.equals(val2);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "EQUALS";}

		public String toString() { return token(); };
	};

	public static final Binary<Boolean, Object, Object> NOT_EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return !val1.equals(val2);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "NOT_EQUALS";}

		public String toString() { return token(); };
	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) >= 0);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "EQUALS_GT";}

		public String toString() { return token(); };
	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) > 0);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "GT";}

		public String toString() { return token(); };
	};
	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) <= 0);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "EQUALS_LT";}

		public String toString() { return token(); };
	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) < 0);
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "LT";}

		public String toString() { return token(); };
	};
	

	public static final Binary<Boolean, Boolean, Boolean> AND = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 && val2;
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "AND";}

		public String toString() { return token(); };
	};
	

	public static final Binary<Boolean, Boolean, Boolean> OR = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 || val2;
		};

		@Override
		public TypeSpec type() { return TypeSpec.BOOLEAN; }
		@Override
		public String token() { return "OR";}

		public String toString() { return token(); };
	};
	

	public static final Binary<String, Object, Object> CONCAT = new Binary<String, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public String eval(Object val1, Object val2) {
			StringBuilder buf = new StringBuilder();
			buf.append(val1);
			buf.append(val2);
			return buf.toString();
		};

		@Override
		public TypeSpec type() { return TypeSpec.STRING; }
		@Override
		public String token() { return "CONCAT";}

		public String toString() { return token(); };
	};
	

	public static final Binary<String, Object, Number> MULTI_STR = new Binary<String, Object, Number>() {
		private static final long serialVersionUID = 1L;

		@Override
		public String eval(Object val1, Number val2) {
			StringBuilder buf = new StringBuilder();
			
			for( int i = val2.intValue(); i>0 ; i--){
				buf.append(val1);
			}
			
			return buf.toString();
		};

		@Override
		public TypeSpec type() { return TypeSpec.STRING; }
		@Override
		public String token() { return "MULTI_STR";}

		public String toString() { return token(); };
	};
	
}
