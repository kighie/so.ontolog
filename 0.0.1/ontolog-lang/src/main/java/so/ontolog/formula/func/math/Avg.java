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

import java.lang.reflect.Array;
import java.math.BigDecimal;

import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class Avg extends AbstractMathFunction<BigDecimal>{

	private static final long serialVersionUID = 1037330139149912425L;

	@Override
	public String name() {
		return "average";
	}
	
	@Override
	public BigDecimal eval(Context context, Gettable<?>[] args) {
		int length = args.length;
		
		BigDecimal sum = add(BigDecimal.ZERO, args[0].get(context));
		
		for(int i = 1; i<length;i++){
			sum = sum.add(convertDecimal(args[i].get(context)));
		}
		return sum.divide(new BigDecimal(args.length),REAL_MATH_CONTEXT);
	}

	@Override
	public boolean isVariableArgs() {
		return true;
	}
	
	private BigDecimal add(BigDecimal sum, Object value){
		if(value == null){
			return sum;
		}
		if(value.getClass().isArray()){
			int length = Array.getLength(value);
			for(int i=0;i<length;i++){
				sum = sum.add(convertDecimal(Array.get(value, i)));
			}
			
		} else {
			sum = sum.add(convertDecimal(value));
		}
		return sum;
	}
}
