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
import java.util.Collection;
import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Gettable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ArrayExpr<T>  implements Gettable<Collection<T>> {

	private static final long serialVersionUID = 716155918644710745L;

	private TypeSpec typeSpec;
	private List<Gettable<T>> values;
	
	
	public ArrayExpr(TypeSpec typeSpec, List<Gettable<T>> values) {
		this.typeSpec = typeSpec;
		this.values = values;
	}

	@Override
	public TypeSpec type() {
		return typeSpec;
	}
	
	@Override
	public Collection<T> get(Context context) {
		int length = values.size();
		List<T> valList = new ArrayList<T>();
		Gettable<T> gettable;
		
		for(int i = 0 ; i<length ; i++){
			gettable = values.get(i);
			valList.add(gettable.get(context));
		}

		return valList;
	}

}
