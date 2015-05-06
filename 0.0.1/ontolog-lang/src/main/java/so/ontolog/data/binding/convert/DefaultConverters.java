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
package so.ontolog.data.binding.convert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import so.ontolog.data.util.NumberUtils;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class DefaultConverters {
	private DefaultConverters(){}

	/**
	 * yyyyMMdd
	 */
	public static DateConverter DATE = new DateConverter("yyyyMMdd");

	public static SqlDateConverter SQL_DATE = new SqlDateConverter("yyyy-MM-dd");
	
	public static TimeConverter TIME = new TimeConverter();
	
	public static TimestampConverter TIMESTAMP = new TimestampConverter("yyyyMMdd:HHmmssSSS");
	
	
	public static Converter<Object> BY_PASS = new Converter<Object>() {
		
		@Override
		public Object convert(Object value) {
			return value;
		}
		
		public String toString() {
			return "Converter<BY_PASS>";
		};
	};
	
	public static Converter<String> STRING = new Converter<String>() {
		@Override
		public String convert(Object value) {
			if(value instanceof String){
				return (String)value;
			} else if (value != null){
				return value.toString();
			}
			
			return null;
		}
		public String toString() {
			return "Converter<STRING>";
		};
	};
	

	/**
	 * @see ScaleDetectedBigDecimalConverter
	 */
	public static Converter<BigDecimal> BIG_DECIMAL = new Converter<BigDecimal>() {
		@Override
		public BigDecimal convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof BigDecimal){
				return (BigDecimal)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return null;
				}
				BigDecimal bd = new BigDecimal(str);
				return bd;
			} else if( value instanceof Number){
				BigDecimal bd = new BigDecimal(value.toString());
				return bd;
			} else if(value instanceof Number){
				return new BigDecimal(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to BigDecimal.");
			}
		}
		public String toString() {
			return "Converter<BIG_DECIMAL>";
		};
	};
	
	public static Converter<BigInteger> BIG_INTEGER = new Converter<BigInteger>() {
		@Override
		public BigInteger convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof BigInteger){
				return (BigInteger)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return null;
				}
				return NumberUtils.parseNumber(str, BigInteger.class);
			} else if(value instanceof Number){
				return new BigInteger(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to BigInteger.");
			}
		}
		public String toString() {
			return "Converter<BIG_INTEGER>";
		};
	};
	

	public static Converter<Integer> INTEGER = new Converter<Integer>() {
		@Override
		public Integer convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Integer){
				return (Integer)value;
			} else if(value instanceof String){
				if(value.toString().length()==0){
					return null;
				}
				
				return Integer.parseInt((String)value);
			} else if(value instanceof Number){
				return Integer.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Integer.");
			}
		}
		public String toString() {
			return "Converter<INTEGER>";
		};
	};

	public static Converter<Integer> PRIM_INT = new Converter<Integer>() {
		@Override
		public Integer convert(Object value) {
			if( value == null ){
				return 0;
			} else if(value instanceof Integer){
				return (Integer)value;
			} else if(value instanceof String){
				if(value.toString().length()==0){
					return 0;
				}
				return Integer.parseInt((String)value);
			} else if(value instanceof Number){
				return Integer.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to int.");
			}
		}
		public String toString() {
			return "Converter<PRIM_INT>";
		};
	};
	

	public static Converter<Long> LONG = new Converter<Long>() {
		@Override
		public Long convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Long){
				return (Long)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return null;
				}
				return NumberUtils.parseNumber(str, Long.class);
			} else if(value instanceof Number){
				return Long.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Long.");
			}
		}
		public String toString() {
			return "Converter<LONG>";
		};
	};

	
	public static Converter<Long> PRIM_LONG = new Converter<Long>() {
		@Override
		public Long convert(Object value) {
			if( value == null ){
				return 0L;
			} else if(value instanceof Long){
				return (Long)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return  0L;
				}
				return NumberUtils.parseNumber(str, Long.class);
			} else if(value instanceof Number){
				return Long.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to long.");
			}
		}
		public String toString() {
			return "Converter<PRIM_LONG>";
		};
	};

	public static Converter<Double> DOUBLE = new Converter<Double>() {
		@Override
		public Double convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Double){
				return (Double)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return  null;
				}
				return NumberUtils.parseNumber(str, Double.class);
			} else if(value instanceof Number){
				return Double.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Double.");
			}
		}
		public String toString() {
			return "Converter<DOUBLE>";
		};
	};

	public static Converter<Double> PRIM_DOUBLE = new Converter<Double>() {
		@Override
		public Double convert(Object value) {
			if( value == null ){
				return (double)0;
			} else if(value instanceof Double){
				return (Double)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return 0D;
				}
				return NumberUtils.parseNumber(str, Double.class);
			} else if(value instanceof Number){
				return Double.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to double.");
			}
		}
		public String toString() {
			return "Converter<PRIM_DOUBLE>";
		};
	};

	public static Converter<Float> FLOAT = new Converter<Float>() {
		@Override
		public Float convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Float){
				return (Float)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return null;
				}
				return NumberUtils.parseNumber((String)value, Float.class);
			} else if(value instanceof Number){
				return Float.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Float.");
			}
		}
		public String toString() {
			return "Converter<FLOAT>";
		};
	};

	public static Converter<Float> PRIM_FLOAT = new Converter<Float>() {
		@Override
		public Float convert(Object value) {
			if( value == null ){
				return 0f;
			} else if(value instanceof Float){
				return (Float)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return 0f;
				}
				return NumberUtils.parseNumber((String)value, Float.class);
			} else if(value instanceof Number){
				return Float.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to float.");
			}
		}
		public String toString() {
			return "Converter<PRIM_FLOAT>";
		};
	};

	public static Converter<Short> SHORT = new Converter<Short>() {
		@Override
		public Short convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Short){
				return (Short)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return null;
				}
				return NumberUtils.parseNumber((String)value, Short.class);
			} else if(value instanceof Number){
				return Short.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Short.");
			}
		}
		public String toString() {
			return "Converter<SHORT>";
		};
	};

	public static Converter<Short> PRIM_SHORT = new Converter<Short>() {
		@Override
		public Short convert(Object value) {
			if( value == null ){
				return 0;
			} else if(value instanceof Short){
				return (Short)value;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return (short)0;
				}
				return NumberUtils.parseNumber((String)value, Short.class);
			} else if(value instanceof Number){
				return Short.valueOf(value.toString());
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to short.");
			}
		}
		public String toString() {
			return "Converter<PRIM_SHORT>";
		};
	};
	

	private static final Set<String> TRUE_SET = new HashSet<String>();
	static {
		TRUE_SET.add("true");
		TRUE_SET.add("Y");
		TRUE_SET.add("yes");
		TRUE_SET.add("y");
	}
	

	public static Converter<Boolean> BOOL = new Converter<Boolean>() {

		private static final int TRUE_NUM = 1;
		
		@Override
		public Boolean convert(Object value) {
			if( value == null ){
				return null;
			} else if(value instanceof Boolean){
				return (Boolean)value;
			} else if(value instanceof Number){
				return ((Number)value).intValue() == TRUE_NUM ;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return false;
				}
				return TRUE_SET.contains(value);
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to Boolean.");
			}
		}
		public String toString() {
			return "Converter<BOOL>";
		};
	};

	public static Converter<Boolean> PRIM_BOOL = new Converter<Boolean>() {

		private static final int TRUE_NUM = 1;
		
		@Override
		public Boolean convert(Object value) {
			if( value == null ){
				return false;
			} else if(value instanceof Boolean){
				return (Boolean)value;
			} else if(value instanceof Number){
				return ((Number)value).intValue() == TRUE_NUM ;
			} else if(value instanceof String){
				String str = ((String) value).trim();
				if(str.length()==0){
					return false;
				}
				return TRUE_SET.contains(value);
			} else {
				throw new IllegalArgumentException("Cannot convert type ["  
						+ value.getClass().getName() + "] to boolean.");
			}
		}
		public String toString() {
			return "Converter<PRIM_BOOL>";
		};
	};

	private static Map<Class<?>, Converter<?>> convertersMap;
	
	static {
		convertersMap = new HashMap<Class<?>, Converter<?>>();
		
		convertersMap.put(String.class, DefaultConverters.STRING);
		convertersMap.put(java.util.Date.class, DefaultConverters.DATE);
		convertersMap.put(java.sql.Date.class, DefaultConverters.SQL_DATE);
		convertersMap.put(java.sql.Timestamp.class, DefaultConverters.TIMESTAMP);
		convertersMap.put(Time.class, DefaultConverters.TIME);
		convertersMap.put(BigDecimal.class, DefaultConverters.BIG_DECIMAL);
		convertersMap.put(BigInteger.class, DefaultConverters.BIG_INTEGER);
		convertersMap.put(Boolean.class, DefaultConverters.BOOL);
		convertersMap.put(Boolean.TYPE, DefaultConverters.PRIM_BOOL);
		convertersMap.put(Integer.class, DefaultConverters.INTEGER);
		convertersMap.put(Integer.TYPE, DefaultConverters.PRIM_INT);
		convertersMap.put(Long.class, DefaultConverters.LONG);
		convertersMap.put(Long.TYPE, DefaultConverters.PRIM_LONG);
		convertersMap.put(Double.class, DefaultConverters.DOUBLE);
		convertersMap.put(Double.TYPE, DefaultConverters.PRIM_DOUBLE);
		convertersMap.put(Float.class, DefaultConverters.FLOAT);
		convertersMap.put(Float.TYPE, DefaultConverters.PRIM_FLOAT);
		convertersMap.put(Short.class, DefaultConverters.SHORT);
		convertersMap.put(Short.TYPE, DefaultConverters.PRIM_SHORT);
		
		convertersMap = Collections.unmodifiableMap(convertersMap);
	}
	
	public static Map<Class<?>, Converter<?>> getConverters(){
		return convertersMap;
	}

	@SuppressWarnings("unchecked")
	public static <T> Converter<T> getConverter(Class<T> type){
		return (Converter<T>)convertersMap.get(type);
	}
	
}
