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

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.EvalException;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Operator.Binary;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class BinaryOperatorGettable<T, O1, O2> implements Gettable<T> {
	private static final long serialVersionUID = 3117925013922355766L;
	
	protected final Binary<T, O1, O2> operator;
	protected final Gettable<? extends O1> operand1;
	protected final Gettable<? extends O2> operand2;
	
	/**
	 * @param operator
	 * @param operand1
	 * @param operand2
	 */
	public BinaryOperatorGettable(Binary<T, O1, O2> operator,
			Gettable<? extends O1> operand1, 
			Gettable<? extends O2> operand2) {
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Class<? extends T> type() {
		return operator.type();
	}
	
	@Override
	public T get(Context context) {
		try {
			return operator.eval(operand1.get(context), operand2.get(context));
		} catch (Exception e) {
			throw new EvalException(e).setNode(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(operator.token()).append(" ").append(operand1).append(" ").append(operand2).append(")");
		return buf.toString();
	}
}
