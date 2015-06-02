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
package so.ontolog.formula.runtime.stmt;

import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Statement;
import so.ontolog.formula.runtime.internal.LocalFunction;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class FunctionDeclStatement implements Statement {
	private static final long serialVersionUID = 3346670355531074109L;
	
	private LocalFunction<?> function;
	
	public FunctionDeclStatement(LocalFunction<?> function) {
		this.function = function;
	}

	@Override
	public Object eval(Context context) {
		context.setReference(function.qname(), function);
//		System.out.println("FunctionDeclStatement::" + function.qname());
		return null;
	}
	
}
