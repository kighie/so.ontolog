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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import so.ontolog.data.binding.BindingException;

/**
 * 
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DateConverter implements Converter<Date>{

	private DateFormat dateFormat;
	

	/**
	 * yyyyMMdd
	 */
	public DateConverter() {
		this("yyyyMMdd");
	}

	public DateConverter(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateConverter(String pattern) {
		this.dateFormat = new SimpleDateFormat(pattern);
	}

	@Override
	public Date convert( Object value) throws BindingException {
		if( value == null ){
			return null;
		} else if(value instanceof Date){
			return (Date)value;
		} else if(value instanceof String){
			return convertTo((String)value);
		} else {
			throw new IllegalArgumentException("Cannot convert type ["  
					+ value.getClass().getName() + "] to Date.");
		}
	}
	
	public Date convertTo(String value) {
		try {
			return dateFormat.parse(value);
		} catch (ParseException e) {
			throw new BindingException(e);
		}
	}
}
