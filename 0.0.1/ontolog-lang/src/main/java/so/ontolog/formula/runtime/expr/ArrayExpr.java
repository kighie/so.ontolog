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

import java.util.ArrayList;
import java.util.List;

import so.ontolog.data.binding.convert.DefaultConverters;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.util.Range;
import so.ontolog.formula.OntologLangException;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ArrayExpr<T>  implements Gettable<Iterable<T>> {

	private static final long serialVersionUID = 716155918644710745L;

	private TypeSpec typeSpec;
	private List<Gettable<T>> values;
	private Gettable<T> from;
	private Gettable<T> to;
	
	
	public ArrayExpr(TypeSpec typeSpec, List<Gettable<T>> values) {
		this.typeSpec = typeSpec;
		this.values = values;
	}

	@Override
	public TypeSpec type() {
		return typeSpec;
	}
	
	
	public Gettable<T> getFrom() {
		return from;
	}

	public void setFrom(Gettable<T> from) {
		this.from = from;
	}

	public Gettable<T> getTo() {
		return to;
	}

	public void setTo(Gettable<T> to) {
		this.to = to;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Iterable<T> get(Context context) {
		if(values != null){
			int length = values.size();
			List<T> valList = new ArrayList<T>();
			Gettable<T> gettable;
			
			for(int i = 0 ; i<length ; i++){
				gettable = values.get(i);
				valList.add(gettable.get(context));
			}
			return valList;
		} else 	if(from != null && to != null){
			int fromInt = DefaultConverters.INTEGER.convert(from.get(context));
			int toInt = DefaultConverters.INTEGER.convert(to.get(context));
			Range range = new Range(fromInt, toInt);
			return (Iterable<T>)range;
		}
		
		throw new OntologLangException("Illegal array expression : " + this.toString());
	}

	
}
