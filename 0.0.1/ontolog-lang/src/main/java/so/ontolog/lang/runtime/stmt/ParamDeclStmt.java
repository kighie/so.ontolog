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

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.EvalException;
import so.ontolog.lang.runtime.QName;
import so.ontolog.lang.runtime.Statement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ParamDeclStmt implements Statement {
	private static final long serialVersionUID = 987017160320384316L;
	

	protected final QName qname;
	protected final TypeSpec typeSpec;
	protected final QName paramName;
	
	public ParamDeclStmt(QName qname, TypeSpec typeSpec, QName paramName) {
		super();
		this.qname = qname;
		this.typeSpec = typeSpec;
		this.paramName = paramName;
	}

	@Override
	public void eval(Context context) {
		Object value = context.getReference(paramName);
		if(value != null){
			if(!typeSpec.isAssignableFrom(value.getClass())){
				value = TypeUtils.convert(value, typeSpec);
//				throw new EvalException("Illegal Parameter type: '" + paramName 
//						+ "' expected=" + typeSpec.getName()
//						+ ", given=" + value.getClass().getName());
			}
			context.setReference(paramName,null);
			context.setReference(qname, value);
		}
	}

}
