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
package so.ontolog.formula.func.basic;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class Println implements Function<Void>{

	private static final long serialVersionUID = 8178856096467737639L;

	private Class<?>[] argTypes = new Class[]{Object.class};
	
	@Override
	public TypeSpec returnType() {
		return TypeSpec.VOID;
	}

	@Override
	public String name() {
		return "println";
	}
	
	@Override
	public Class<?>[] argTypes() {
		return argTypes;
	}

	@Override
	public boolean isVariableArgs() {
		return false;
	}
	
	@Override
	public Void eval(Context context, Gettable<?>[] args) {
		System.out.println(args[0].get(context));
		return null;
	}
}
