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
package so.ontolog.formula.ast.context;

import java.util.HashMap;
import java.util.Map;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ScopeASTContext implements ASTContext {
	private ASTContext parent;
	private Map<QName, ASTDeclaration> varTable = new HashMap<QName, ASTDeclaration>();
	private Map<QName, ASTDeclaration> funcTable = new HashMap<QName, ASTDeclaration>();
	
	public ScopeASTContext(ASTContext parent) {
		this.parent = parent;
	}

	@Override
	public ASTContext parent() {
		return parent;
	}
	
	@Override
	public ASTContext root() {
		return parent.root();
	}
	
	@Override
	public ASTDeclaration getVarDecl(QName qname) {
		ASTDeclaration symbol = varTable.get(qname);
		if(symbol == null){
			symbol = askParentVar(qname);
		}
		return symbol;
	}

	protected ASTDeclaration askParentVar(QName qname) {
		return parent.getVarDecl(qname);
	}

	@Override
	public void registerVarDecl(ASTDeclaration symbol) {
		varTable.put(symbol.getQname(), symbol);
	}
	
	
	
	@Override
	public ASTDeclaration getFuncDecl(QName qname) {
		ASTDeclaration symbol = funcTable.get(qname);
		if(symbol == null){
			symbol = askParentFunc(qname);
		}
		return symbol;
	}

	protected ASTDeclaration askParentFunc(QName qname) {
		return parent.getFuncDecl(qname);
	}

	@Override
	public void registerFuncDecl(ASTDeclaration symbol) {
		funcTable.put(symbol.getQname(), symbol);
	}

	@Override
	public Function<?> getBuiltInFunction(QName qname) {
		return parent.getBuiltInFunction(qname);
	}
	
	@Override
	public TypeSpec getType(QName qname) {
		return parent.getType(qname);
	}
	
	@Override
	public void registerType(QName qname, TypeSpec typeSpec) {
		parent.registerType(qname, typeSpec);
	}
	
	protected void clear(){
		varTable.clear();
	}
}
