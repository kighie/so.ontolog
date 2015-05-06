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

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TimeConverter implements Converter<Time>{

	/**
	 * yyyyMMdd
	 */
	public TimeConverter() {
		
	}
	
	@Override
	public Time convert(Object value) {
		if( value == null ){
			return null;
		} else if(value instanceof Time){
			return (Time)value;
		} else if(value instanceof Timestamp){
			return new Time(((Timestamp) value).getTime());
		} else if(value instanceof Date){
			return new Time(((Date) value).getTime());
		} else if(value instanceof java.util.Date){
			return new Time(((java.util.Date) value).getTime());
		} else if(value instanceof String){
			return Time.valueOf((String)value);
		} else {
			throw new IllegalArgumentException("Cannot convert type ["  
					+ value.getClass().getName() + "] to java.sql.Time.");
		}
	}
	

}
