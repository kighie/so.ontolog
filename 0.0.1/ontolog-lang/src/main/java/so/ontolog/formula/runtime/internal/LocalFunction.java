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
package so.ontolog.formula.runtime.internal;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.EvalException;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.Gettable;
import so.ontolog.formula.runtime.QName;
import so.ontolog.formula.runtime.ref.VariableRef.ArgDeclRef;
import so.ontolog.formula.runtime.stmt.AbstractBlock;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class LocalFunction<T> implements Function<T> {
	private static final long serialVersionUID = 9074103225860940674L;

	private List<ArgDeclRef<?>> argList;
	private SymbolTable symbolTable;
	private Class<?>[] argTypes;
	private QName qname;
	private String name;
	private TypeSpec returnType;
	private LocalFunctionBody functionBody = new LocalFunctionBody();
	
	public LocalFunction(QName qname, String name, TypeSpec returnType,
			List<ArgDeclRef<?>> argList) {
		this.qname = qname;
		this.name = name;
		this.returnType = returnType;
		this.argList = argList;
		symbolTable = new SymbolTable();
		argTypes = new Class<?>[argList.size()];
		int i=0;
		for(ArgDeclRef<?> a : argList){
			argTypes[i] = a.type().getBaseType();
			i++;
			symbolTable.register(a.qname(), a.type());
		}
	}

	/**
	 * @return the qname
	 */
	public QName qname() {
		return qname;
	}
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public TypeSpec returnType() {
		return returnType;
	}

	@Override
	public Class<?>[] argTypes() {
		return argTypes;
	}
	
	public LocalFunctionBody getBody() {
		return functionBody;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T eval(Context context, Gettable<?>[] args) {
		if(args.length != argList.size()){
			throw new EvalException("Function[" + qname + "] needs " + argList.size() + " arguments. But real is " + args.length);
		}

		context = context.down(symbolTable);
		
		int i=0;
		for(ArgDeclRef<?> a : argList){
			Object value = args[i].get(context);
			context.setReference(a.qname(), value);
			i++;
		}
		
		T rtn = (T)functionBody.eval(context);
		context.up();
		return rtn;
	}

	public class LocalFunctionBody extends AbstractBlock {
		private static final long serialVersionUID = -2260349972211447556L;
		
	}
}
