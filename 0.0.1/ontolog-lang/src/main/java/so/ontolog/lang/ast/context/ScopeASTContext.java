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
package so.ontolog.lang.ast.context;

import java.util.HashMap;
import java.util.Map;

import so.ontolog.lang.ast.ASTContext;
import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ScopeASTContext implements ASTContext {
	private ASTContext parent;
	private Map<QName, ASTDeclaration> symbolTable = new HashMap<QName, ASTDeclaration>();
	
	public ScopeASTContext(ASTContext parent) {
		this.parent = parent;
	}

	@Override
	public ASTContext parent() {
		return parent;
	}

	@Override
	public ASTDeclaration getDecl(QName qname) {
		ASTDeclaration symbol = symbolTable.get(qname);
		if(symbol == null){
			symbol = askParent(qname);
		}
		return symbol;
	}

	protected ASTDeclaration askParent(QName qname) {
		return parent.getDecl(qname);
	}

	@Override
	public void registerDecl(ASTDeclaration symbol) {
		symbolTable.put(symbol.getQname(), symbol);
	}
	
	@Override
	public Function<?> getBuiltInFunction(QName qname) {
		return parent.getBuiltInFunction(qname);
	}
	
	protected void clear(){
		symbolTable.clear();
	}
}
