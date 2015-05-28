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
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.Settable;
import so.ontolog.formula.runtime.Statement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
@SuppressWarnings("rawtypes")
public class AssignStatement implements Statement {

	private static final long serialVersionUID = 238316198748422481L;

	protected Settable varSettable;
	protected Gettable valueGettable;
	
	public AssignStatement(Settable varSettable, Gettable valueGettable) {
		super();
		this.varSettable = varSettable;
		this.valueGettable = valueGettable;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object eval(Context context) {
		varSettable.set(context, valueGettable.get(context));
		return null;
	}

}
