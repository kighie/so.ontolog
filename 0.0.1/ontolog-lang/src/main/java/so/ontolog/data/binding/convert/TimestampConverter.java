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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import so.ontolog.data.binding.BindingException;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class TimestampConverter implements Converter<Timestamp>{

	private DateFormat dateFormat;
	

	/**
	 * yyyyMMdd
	 */
	public TimestampConverter() {
	}

	public TimestampConverter(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public TimestampConverter(String pattern) {
		this.dateFormat = new SimpleDateFormat(pattern);
	}

	@Override
	public Timestamp convert(Object value) {
		if( value == null ){
			return null;
		} else if(value instanceof Timestamp){
			return (Timestamp)value;
		} else if(value instanceof Date){
			return new Timestamp( ((Date)value).getTime());
		} else if(value instanceof java.util.Date){
			return new Timestamp( ((java.util.Date)value).getTime());
		} else if(value instanceof String){
			return convertTo((String)value);
		} else {
			throw new IllegalArgumentException("Cannot convert type ["  
					+ value.getClass().getName() + "] to java.sql.Date.");
		}
	}
	

	public Timestamp convertTo(String value) {
		try {
			if(dateFormat != null){
				return new Timestamp( dateFormat.parse(value).getTime() );
			} else {
				return Timestamp.valueOf(value);
			}
		} catch (ParseException e) {
			throw new BindingException(e);
		}
	}
}
