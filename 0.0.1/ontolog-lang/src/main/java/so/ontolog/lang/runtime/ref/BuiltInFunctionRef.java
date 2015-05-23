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
package so.ontolog.lang.runtime.ref;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class BuiltInFunctionRef extends AbstractRef implements Gettable<Function> {
	private static final long serialVersionUID = -8146512859266950897L;
	
	protected final Function<?> function;
	
	
	public BuiltInFunctionRef(QName qname, Function<?> function) {
		super(qname);
		this.function = function;
	}

	@Override
	public TypeSpec type() {
		return Function.FUNCTION_TYPE;
	}

	@Override
	public Function<?> get(Context context) {
		return function;
	}
	
}
