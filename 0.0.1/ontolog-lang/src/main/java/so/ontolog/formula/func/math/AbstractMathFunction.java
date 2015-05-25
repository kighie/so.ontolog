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
package so.ontolog.formula.func.math;

import java.math.BigDecimal;

import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Function;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractMathFunction<T extends Number>  implements Function<T> {

	private static final long serialVersionUID = -8711825160593697940L;
	
	protected static final Class<?>[] SINGLE_DECIMAL_ARGS = new Class[]{Number.class};
	
	@Override
	public TypeSpec returnType() {
		return TypeSpec.DECIMAL;
	}

	@Override
	public Class<?>[] argTypes() {
		return SINGLE_DECIMAL_ARGS;
	}

	BigDecimal convertDecimal(Object value){
		return DefaultConverters.BIG_DECIMAL.convert(value);
	}
}
