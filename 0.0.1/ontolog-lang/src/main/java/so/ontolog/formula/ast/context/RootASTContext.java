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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.ast.ASTContext;
import so.ontolog.formula.ast.ASTDeclaration;
import so.ontolog.formula.ast.ASTErrorHandler;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.build.OntologSource;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.QName;
import so.ontolog.repository.OntologRepository;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class RootASTContext extends ScopeASTContext implements ASTErrorHandler {

	private OntologSource source;
	private OntologRepository<QName> repository;

	private Map<QName, QName> namespaceMap = new HashMap<QName, QName>();
	private Map<QName, TypeSpec> typeMap = new HashMap<QName, TypeSpec>();
	private ASTErrorHandler errorHandler;

	private List<Exception> exceptions = new ArrayList<Exception>();
	private List<Exception> warnings = new ArrayList<Exception>();
	
	public RootASTContext(OntologRepository<QName> repository, ASTErrorHandler errorHandler, OntologSource source) {
		super(null);
		this.repository = repository;
		this.errorHandler = errorHandler;
		this.source = source;
	}
	
	public OntologSource getSource() {
		return source;
	}

	public RootASTContext reuse(OntologSource source) {
		namespaceMap.clear();
		typeMap.clear();
		exceptions.clear();
		warnings.clear();
		this.source = source;
		return this;
	}

	/**
	 * @return the exceptions
	 */
	public Iterable<Exception> getExceptions() {
		return exceptions;
	}
	
	public boolean hasError(){
		return exceptions.size()>0;
	}

	/**
	 * @return the warnings
	 */
	public Iterable<Exception> getWarnings() {
		return warnings;
	}
	
	public boolean hasWarning(){
		return warnings.size()>0;
	}
	
	@Override
	public ASTContext root() {
		return this;
	}
	
	@Override
	protected ASTDeclaration askParentVar(QName qname) {
		return null;
	}
	
	@Override
	protected ASTDeclaration askParentFunc(QName qname) {
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
	
	@Override
	public TypeSpec getType(QName qname) {
		return typeMap.get(qname);
	}

	@Override
	public void registerType(QName qname, TypeSpec value) {
		typeMap.put(qname, value);
	}

	@Override
	public ASTErrorHandler getErrorHandler() {
		return this;
	}

	@Override
	public void syntaxError(String message, Object offendingSymbol,
			SourcePosition location, Exception cause) {
		if(cause != null){
			cause = ExceptionUtils.fillStackTrace(source, location, cause);
		} else {
			cause = ExceptionUtils.makeException(source, message, location);
		}
		
		exceptions.add(cause);
		if(errorHandler != null){
			errorHandler.syntaxError(message, offendingSymbol, location, cause);
		}
	}

	@Override
	public void buildError(ASTToken token, Exception cause) {
		cause = ExceptionUtils.fillStackTrace(source, token, cause);
		exceptions.add(cause);
		if(errorHandler != null){
			errorHandler.buildError(token, cause);
		}
	}
	
	@Override
	public void buildError(String message, ASTToken token, Exception cause) {
		cause = ExceptionUtils.fillStackTrace(source, token, cause);
		exceptions.add(cause);
		if(errorHandler != null){
			errorHandler.buildError(message, token, cause);
		}
	}
	
	@Override
	public void buildError(String message, ASTToken token) {
		ASTException exception = ExceptionUtils.makeException(source, message, token);
		exceptions.add(exception);
		if(errorHandler != null){
			errorHandler.buildError(message,token);
		}
	}
	
	@Override
	public void buildWarning(String message, ASTToken token) {
		ASTException exception = ExceptionUtils.makeException(source, message, token);
		warnings.add(exception);
		if(errorHandler != null){
			errorHandler.buildWarning(exception);
		}
	}
	
	@Override
	public void buildWarning(ASTException astWaring) {
		warnings.add(astWaring);
		if(errorHandler != null){
			errorHandler.buildWarning(astWaring);
		}
	}
}
