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
package so.ontolog.formula.runtime.ref;

import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.Ref;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractRef implements Ref {
	private static final long serialVersionUID = 8381103642569733743L;
	
	protected final QName qname;
	

	/**
	 * @param qname
	 */
	public AbstractRef(QName qname) {
		this.qname = qname;
	}

	@Override
	public QName qname() {
		return qname;
	}
	
	@Override
	public String toString() {
		return "{" + this.getClass().getSimpleName() + ":" + qname + "}";
	}
	
}
