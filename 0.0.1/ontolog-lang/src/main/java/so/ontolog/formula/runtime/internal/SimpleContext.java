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

import java.util.HashMap;
import java.util.Map;

import so.ontolog.formula.runtime.Context;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class SimpleContext implements Context {
	private Map<QName, Object> refMap = new HashMap<QName, Object>();

	private Context parent;
	private Context child;
	private SymbolTable symbolTable;
	
	public SimpleContext() {
		super();
	}
	
	public SimpleContext(Context parent, SymbolTable symbolTable) {
		this.parent = parent;
		this.symbolTable = symbolTable;
	}
	

	protected Context getSymbolOwner(QName name) {
		if(symbolTable != null && symbolTable.contains(name)){
			return this;
		}
		if(parent != null){
			return ((SimpleContext)parent).getSymbolOwner(name);
		}
		return null;
	}
	
	protected void setSymbolTable(SymbolTable symbolTable) {
		this.symbolTable = symbolTable;
	}
	
	public void setParameter(String name, Object value){
		setReference(new QName(name), value);
	}
	
	
	@Override
	public Object getReference(QName name) {
		Object ref = refMap.get(name);
		if(ref == null && parent != null){
			return parent.getReference(name);
		}
		return ref;
	}
	
	@Override
	public void setReference(QName name, Object value) {
		Context owner = getSymbolOwner(name);
		if(owner != null && owner != this){
			owner.setReference(name, value);
		} else {
			refMap.put(name, value);
		}
	}
	
	@Override
	public void clear() {
		refMap.clear();
	}

	@Override
	public Context down(SymbolTable symbolTable) {
		if(child == null){
			child = new SimpleContext(this, symbolTable);
		}
		((SimpleContext)child).setSymbolTable(symbolTable);
		return child;
	}
	
	@Override
	public Context up() {
		this.clear();
		symbolTable = null;
		return parent;
	}
}
