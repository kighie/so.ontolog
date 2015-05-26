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
package so.ontolog.formula.runtime.expr;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.EvalException;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class TernaryOperatorExpr<T> implements Gettable<T> {

	private static final long serialVersionUID = -1918717694483905062L;

	protected final Gettable<Boolean> operand1;
	protected final Gettable<? extends T> operand2;
	protected final Gettable<? extends T> operand3;
	private TypeSpec typeSpec;
	
	public TernaryOperatorExpr(TypeSpec typeSpec, Gettable<Boolean> operand1,
			Gettable<? extends T> operand2, Gettable<? extends T> operand3) {
		super();
		this.typeSpec = typeSpec;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operand3 = operand3;
	}

	@Override
	public TypeSpec type() {
		return typeSpec;
	}
	
	@Override
	public T get(Context context) {
		try {
			if(operand1.get(context)){
				return operand2.get(context);
			} else {
				return operand3.get(context);
			}
		} catch (Exception e) {
			throw new EvalException(e).setNode(this);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(operand1).append(" ? ").append(operand2).append(" : ").append(operand3).append(")");
		return buf.toString();
	}
}
