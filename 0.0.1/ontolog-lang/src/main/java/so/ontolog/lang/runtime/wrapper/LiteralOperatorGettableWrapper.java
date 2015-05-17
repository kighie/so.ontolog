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
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Literal;

/**
 * <pre>
 * Wraps the result of Composite literal operation to optimize runtime operation.
 * ex) (3 * 4) --&gt; (12)  
 * 	('text' & 'merge') --&gt; ('textmearge')  
 * 	(1 < 3) --&gt; (true)  
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class LiteralOperatorGettableWrapper<T> implements Literal<T> {

	private static final long serialVersionUID = -578411137855807850L;
	
	private final T value;
	private final Gettable<T> original;

	public LiteralOperatorGettableWrapper(T value, Gettable<T> original) {
		this.value = value;
		this.original = original;
	}
	
	@Override
	public TypeSpec type() {
		return original.type();
	}

	@Override
	public T get(Context context) {
		return value;
	}
	
	@Override
	public T getValue() {
		return value;
	}
	
	/**
	 * @return the original
	 */
	public Gettable<T> getOriginal() {
		return original;
	}
	
	@Override
	public String toString() {
		return original.toString();
	}
}
