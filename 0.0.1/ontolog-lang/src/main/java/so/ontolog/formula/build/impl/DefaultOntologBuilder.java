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
package so.ontolog.formula.build.impl;

import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import so.ontolog.formula.antlr.OntologLexer;
import so.ontolog.formula.antlr.OntologParser;
import so.ontolog.formula.antlr.OntologParser.OntologExpressionContext;
import so.ontolog.formula.antlr.OntologParser.OntologScriptContext;
import so.ontolog.formula.ast.ASTErrorHandler;
import so.ontolog.formula.ast.ASTException;
import so.ontolog.formula.ast.ASTFactory;
import so.ontolog.formula.ast.ASTToken;
import so.ontolog.formula.ast.ASTVisitor;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.ast.context.ExceptionUtils;
import so.ontolog.formula.ast.context.RootASTContext;
import so.ontolog.formula.ast.factory.DefaultASTFactory;
import so.ontolog.formula.build.BuildContext;
import so.ontolog.formula.build.BuildErrorHandler;
import so.ontolog.formula.build.OntologBuilder;
import so.ontolog.formula.build.OntologSource;
import so.ontolog.formula.build.context.RootBuildContext;
import so.ontolog.formula.build.factory.BuiltInFunctionLoader;
import so.ontolog.formula.runtime.Function;
import so.ontolog.formula.runtime.Module;
import so.ontolog.formula.runtime.QName;
import so.ontolog.repository.OntologRepository;
import so.ontolog.repository.impl.SimpleRepository;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOntologBuilder implements OntologBuilder {
	private String basicFuncDescPath = "META-INF/services/so.ontolog.formula.functions.default";
	private String formulaFuncDescPath = "META-INF/services/so.ontolog.formula.functions.formula";
	
	private ASTFactory factory;
	private ASTErrorHandler syntaxErrorHandler;
	private BuildErrorHandler buildErrorHandler;
	private ASTVisitor<BuildContext> visitor;
	private OntologRepository<QName> repository;
	private boolean inited;
	
	public DefaultOntologBuilder() {
	}

	public void initialize(){
		if(!inited){
			repository = initRepository();
			factory = initASTFactory();
			syntaxErrorHandler = initSyntaxErrorHandler();
			buildErrorHandler = initBuildErrorHandler();
			visitor = initBuildVisitor();
			initBuiltinFunctions();
			inited = true;
		}
	}
	
	protected ASTFactory initASTFactory(){
		DefaultASTFactory factory = new DefaultASTFactory();
		factory.initFactory();
		return factory;
	}

	protected ASTVisitor<BuildContext> initBuildVisitor(){
		return new BuildVisitor();
	}
	
	protected OntologRepository<QName> initRepository(){
		SimpleRepository<QName> repo = new SimpleRepository<QName>(new Class[]{
				CompilationUnit.class, Module.class, Function.class});
		return repo;
	}

	protected ASTErrorHandler initSyntaxErrorHandler() {
		ASTErrorHandler syntaxErrorHandler = new DefaultErrorHandler();
		return syntaxErrorHandler;
	}

	/**<pre></pre>
	 * @return
	 */
	protected BuildErrorHandler initBuildErrorHandler() {
		return new DefaultErrorHandler();
	}

	protected void initBuiltinFunctions() {
		BuiltInFunctionLoader loader = new BuiltInFunctionLoader();
		Map<String, Function<?>> functionsMap = loader.loadFunctions(this.getClass().getClassLoader(),
				new String[]{basicFuncDescPath, formulaFuncDescPath});
		Function<?> func;
		for(Map.Entry<String, Function<?>> e : functionsMap.entrySet()){
			func = e.getValue();
			repository.register(QName.createFunctionQName(e.getKey(), func.argTypes().length), func);
		}
	}

	protected void registerModule(QName qname, Module module){
		repository.register(qname, module);
	}

	protected void registerBuiltinFunction(QName name, Function<?> function){
		repository.register(name, function);
	}
	
	public <T> T getFromRepository(QName qname, Class<T> type) {
		return repository.getUnique(qname, type);
	}

	public void registerToRepository(QName qname, Object module) {
		repository.register(qname, module);
	}
	
	protected RootASTContext createRootASTContext(OntologSource source){
		RootASTContext astContext = new RootASTContext(repository, syntaxErrorHandler, source);
		return astContext;
	}
	
	protected OntologParser createParser(OntologSource source)  {
		CharStream input = new ANTLRInputStream(source.getSourceString());
		OntologLexer lexer = new OntologLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		OntologParser parser = new OntologParser(tokenStream);
		parser.setASTFactory(factory);
		
		RootASTContext context = createRootASTContext(source);
		parser.setSyntaxErrorHandler(context);
		parser.setRootContext(context);
		
		return parser;
	}


	protected Module build(CompilationUnit ast) {
		RootBuildContext context = new RootBuildContext(ast, buildErrorHandler);
		ast.accept(visitor, context);
		return context.getModule();
	}
	
	@Override
	public Module buildExpr(String expression) {
		CompilationUnit astNode = buildExprAST(expression);
		return build(astNode);
	}
	
	@Override
	public Module build(String expression) {
		StackTraceElement e = new Exception().getStackTrace()[0];
		return build(new OntologSource(e.toString(), expression));
	}

	@Override
	public Module build(OntologSource source) {
		CompilationUnit astNode = buildAST(source);
		return build(astNode);
	}


	protected CompilationUnit buildExprAST(String expression) {
		OntologParser parser = createParser(new OntologSource(expression));
//		parser.reset();
		OntologExpressionContext ctx = parser.ontologExpression();

		RootASTContext context = parser.getRootContext();
		
		if(context.hasError()){
			String message = ExceptionUtils.toString( context.getExceptions() );
			throw new ASTException(message);
		}
		return ctx.result;
	}
	
	protected CompilationUnit buildAST(OntologSource source) {
		OntologParser parser = createParser(source);
		RootASTContext context = parser.getRootContext();
		
		OntologScriptContext ctx = null;
		try {
			ctx = parser.ontologScript();
		} catch (Exception e) {
			ASTToken token = parser.createASTToken();
			context.buildError(token, e);
		}
		
		if(context.hasError()){
			String message = ExceptionUtils.toString( context.getExceptions() );
			throw new ASTException(message);
		}
		return ctx.result;
	}

}
