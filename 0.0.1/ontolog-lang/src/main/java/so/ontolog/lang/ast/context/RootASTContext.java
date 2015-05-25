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

import so.ontolog.lang.ast.ASTDeclaration;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.QName;
import so.ontolog.repository.OntologRepository;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class RootASTContext extends ScopeASTContext {

	private OntologRepository<QName> repository;
	
	private Map<QName, QName> namespaceMap = new HashMap<QName, QName>();
	
	public RootASTContext(OntologRepository<QName> repository) {
		super(null);
		this.repository = repository;
	}
	
	@Override
	protected ASTDeclaration askParent(QName qname) {
		return null;
	}
	

	@Override
	public Function<?> getBuiltInFunction(QName qname) {
		QName parent = qname.getParent();
		if(parent != null){
			QName original = namespaceMap.get(parent);
			qname = new QName(original, qname.getName());
		}
		
		return repository.getUnique(qname, Function.class);
	}
	
	
}
