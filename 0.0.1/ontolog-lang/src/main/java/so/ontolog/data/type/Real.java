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
package so.ontolog.data.type;

import java.math.BigDecimal;
import java.math.MathContext;


/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Real extends BigDecimal {
	private static final long serialVersionUID = 1L;
	

	public static final BigDecimal PI = BigDecimal.valueOf( Math.PI );
	public static final BigDecimal ONE = BigDecimal.ONE;
	public static final BigDecimal NEGAT_ONE = BigDecimal.ONE.negate();
	public static final BigDecimal TWO = BigDecimal.valueOf( 2 );
	public static final BigDecimal TEN = BigDecimal.TEN;
	
	
	/**
	 * @param val
	 */
	public Real(long val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public Real(double val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public Real(String val) {
		super(val);
	}

	/**
	 * @param val
	 * @param mc
	 */
	public Real(double val, MathContext mc) {
		super(val, mc);
	}

	
}
