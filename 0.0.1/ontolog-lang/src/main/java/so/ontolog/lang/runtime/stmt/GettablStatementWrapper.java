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
package so.ontolog.lang.runtime.stmt;

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Statement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class GettablStatementWrapper implements Statement {

	private static final long serialVersionUID = -4132464366372767215L;
	
	private Gettable<?> gettable;
	
	
	public GettablStatementWrapper(Gettable<?> gettable) {
		this.gettable = gettable;
	}


	@Override
	public Object eval(Context context) {
		gettable.get(context);
		return null;
	}

}
