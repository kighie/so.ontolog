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

import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.Statement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class VariableDeclStatement implements Statement {
	private static final long serialVersionUID = -4365066019694115923L;
	
	protected final QName qname;
	protected final TypeSpec typeSpec;
	protected Gettable<?> initialValue;
	
	public VariableDeclStatement(QName qname, TypeSpec typeSpec) {
		super();
		this.qname = qname;
		this.typeSpec = typeSpec;
	}

	/**
	 * @return the qname
	 */
	public QName getQName() {
		return qname;
	}
	
	public Gettable<?> getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(Gettable<?> initialValue) {
		this.initialValue = initialValue;
	}

	@Override
	public Object eval(Context context) {
		if(initialValue !=null){
			Object value = initialValue.get(context);
			
			if(value != null && !typeSpec.isAssignableFrom(value.getClass())){
				value = TypeUtils.convert(value, typeSpec);
			}
			context.setReference(qname, value);
		}
		return null;
	}
}
