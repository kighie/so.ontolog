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
package so.ontolog.lang.build.impl;

import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import so.ontolog.lang.antlr.OntologLexer;
import so.ontolog.lang.antlr.OntologParser;
import so.ontolog.lang.antlr.OntologParser.OntologExpressionContext;
import so.ontolog.lang.antlr.OntologParser.OntologScriptContext;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTVisitor;
import so.ontolog.lang.ast.CompilationUnit;
import so.ontolog.lang.ast.SyntaxErrorHandler;
import so.ontolog.lang.ast.context.RootASTContext;
import so.ontolog.lang.ast.factory.DefaultASTFactory;
import so.ontolog.lang.build.BuildContext;
import so.ontolog.lang.build.OntologBuilder;
import so.ontolog.lang.build.OntologSource;
import so.ontolog.lang.build.context.RootBuildContext;
import so.ontolog.lang.build.factory.BuiltInFunctionLoader;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.Module;
import so.ontolog.lang.runtime.QName;
import so.ontolog.repository.OntologRepository;
import so.ontolog.repository.impl.SimpleRepository;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOntologBuilder implements OntologBuilder {
	private String basicFuncDescPath = "META-INF/services/so.ontolog.lang.functions.default";
	private String formulaFuncDescPath = "META-INF/services/so.ontolog.lang.functions.formula";
	
	private ASTFactory factory;
	private SyntaxErrorHandler syntaxErrorHandler;
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

	protected SyntaxErrorHandler initSyntaxErrorHandler() {
		SyntaxErrorHandler syntaxErrorHandler = new DefaultSyntaxErrorHandler();
		return syntaxErrorHandler;
	}

	protected void initBuiltinFunctions() {
		BuiltInFunctionLoader loader = new BuiltInFunctionLoader();
		Map<String, Function<?>> functionsMap = loader.loadFunctions(this.getClass().getClassLoader(),
				new String[]{basicFuncDescPath, formulaFuncDescPath});
		
		for(Map.Entry<String, Function<?>> e : functionsMap.entrySet()){
			repository.register(new QName(e.getKey()), e.getValue());
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
	
	protected RootASTContext createRootASTContext(){
		RootASTContext astContext = new RootASTContext(repository);
		return astContext;
	}
	
	protected OntologParser createParser(String expression)  {
		CharStream input = new ANTLRInputStream(expression);
		OntologLexer lexer = new OntologLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		OntologParser parser = new OntologParser(tokenStream);
		parser.setASTFactory(factory);
		parser.setSyntaxErrorHandler(syntaxErrorHandler);
		
		parser.setRootContext(createRootASTContext());
		return parser;
	}


	protected CompilationUnit buildExprAST(String expression) {
		OntologParser parser = createParser(expression);
//		parser.reset();
		OntologExpressionContext ctx = parser.ontologExpression();
		
		return ctx.result;
	}

	protected Module build(CompilationUnit ast) {
		RootBuildContext context = new RootBuildContext(ast);
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


	protected CompilationUnit buildAST(OntologSource source) {
		OntologParser parser = createParser(source.getSourceString());
		OntologScriptContext ctx = parser.ontologScript();
		
		return ctx.result;
	}

}
