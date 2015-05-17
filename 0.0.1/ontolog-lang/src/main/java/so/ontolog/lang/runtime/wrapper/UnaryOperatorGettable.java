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
package so.ontolog.lang.runtime.wrapper;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.EvalException;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Operator.Unary;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class UnaryOperatorGettable<T, O1> implements Gettable<T>{

	private static final long serialVersionUID = 4720749136838241978L;
	protected final Unary<T, O1> operator;
	protected final Gettable<? extends O1> operand;
	
	public UnaryOperatorGettable(Unary<T, O1> operator, 
			Gettable<? extends O1> operand1 ) {
		this.operator = operator;
		this.operand = operand1;
	}

	@Override
	public TypeSpec type() {
		return operator.type();
	}
	
	
	@Override
	public T get(Context context) {
		try {
			return operator.eval(operand.get(context));
		} catch (Exception e) {
			throw new EvalException(e).setNode(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(operator.token()).append(" ").append(operand).append(")");
		return buf.toString();
	}

}
