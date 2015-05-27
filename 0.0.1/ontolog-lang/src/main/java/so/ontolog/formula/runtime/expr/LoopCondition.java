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

import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.Node;
import so.ontolog.formula.runtime.stmt.VariableDeclStatement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class LoopCondition implements Node {

	private static final long serialVersionUID = -8021403374859845587L;
	
	private VariableDeclStatement varDecl;
	private Gettable<?> iterator;
	
	public LoopCondition(VariableDeclStatement varDecl, Gettable<?> iterator) {
		super();
		this.varDecl = varDecl;
		this.iterator = iterator;
	}

	public VariableDeclStatement getVarDecl() {
		return varDecl;
	}

	public Gettable<?> getIterator() {
		return iterator;
	}
	
	
	
}
