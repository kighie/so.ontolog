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

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class Sum extends AbstractMathFunction<BigDecimal>{

	private static final long serialVersionUID = 8933978837906265660L;
	
	@Override
	public String name() {
		return "sum";
	}
	
	@Override
	public BigDecimal eval(Context context, Gettable<?>[] args) {
		int length = args.length;
		
		BigDecimal sum = convertDecimal(args[0].get(context));
		
		for(int i = 1; i<length;i++){
			sum = sum.add(convertDecimal(args[i].get(context)));
		}
		return sum;
	}

}
