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
package so.ontolog.lang.runtime.module;

import java.util.LinkedList;
import java.util.List;

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Module;
import so.ontolog.lang.runtime.Statement;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ExprModule implements Module {

	private static final long serialVersionUID = 6365036104423741953L;

	private List<Statement> paramDefList;
	private Gettable<?> expression;
	
	public boolean addParamDef(Statement e) {
		if(paramDefList == null){
			paramDefList = new LinkedList<Statement>();
		}
		return paramDefList.add(e);
	}
	
	/**
	 * @param expression the expression to set
	 */
	public void setExpression(Gettable<?> expression) {
		this.expression = expression;
	}

	@Override
	public Object eval(Context context) {
		if(paramDefList!=null){
			for( Statement s : paramDefList ){
				s.eval(context);
			}
		}
		
		if(expression != null){
			return expression.get(context);
		}
		
		return null;
	}

}
