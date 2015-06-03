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

import java.util.LinkedList;
import java.util.List;

import so.ontolog.formula.runtime.Block;
import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.Statement;
import so.ontolog.formula.runtime.internal.SymbolTable;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class AbstractBlock extends AbstractStatement implements Block {

	private static final long serialVersionUID = -8149269987642137932L;

	protected SymbolTable symbolTable;
	protected final List<Statement> statementList = new LinkedList<Statement>();
	
	@Override
	public void append(Statement node) {
		statementList.add(node);
	}
	
	public SymbolTable getSymbolTable() {
		return symbolTable;
	}
	
	public void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	@Override
	protected final Object evalImpl(Context context) {
		context = context.down(symbolTable);
		Object rtn = evalInternal(context);
		context.up();
		return rtn;
	}
	

	protected Object evalInternal(Context context) {
		return evalChildren(context);
	}
	
	
	protected Object evalChildren(Context context){
		Object rtn;
		
		for( Statement s : statementList ){
			rtn = s.eval(context);
			if(rtn!=null){
				return rtn;
			}
		}
		return null;
	}
}
