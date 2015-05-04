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
import java.math.BigInteger;


/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class Int extends BigDecimal {
	private static final long serialVersionUID = 1L;

	/**
	 * @param val
	 */
	public Int(BigInteger val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public Int(int val) {
		super(val);
	}

	/**
	 * @param val
	 */
	public Int(String val) {
		super(Integer.parseInt(val));
	}

	
}
