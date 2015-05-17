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

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import so.ontolog.lang.antlr.OntologLexer;
import so.ontolog.lang.antlr.OntologParser;
import so.ontolog.lang.antlr.OntologParser.OntologExpressionContext;
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
import so.ontolog.lang.runtime.Module;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOntologBuilder implements OntologBuilder {
	
	private ASTFactory factory;
	private SyntaxErrorHandler syntaxErrorHandler;
	private ASTVisitor<BuildContext> visitor = new BuildVisitor();
	private boolean inited;
	
	public DefaultOntologBuilder() {
	}

	public void initialize(){
		if(!inited){
			factory = initASTFactory();
			syntaxErrorHandler = initSyntaxErrorHandler();
			visitor = initBuildVisitor();
			inited = true;
		}
	}
	
	protected ASTFactory initASTFactory(){
		DefaultASTFactory factory = new DefaultASTFactory();
		factory.initFactory();
		return factory;
	}
	
	protected SyntaxErrorHandler initSyntaxErrorHandler() {
		SyntaxErrorHandler syntaxErrorHandler = new DefaultSyntaxErrorHandler();
		return syntaxErrorHandler;
	}
	
	protected ASTVisitor<BuildContext> initBuildVisitor(){
		return new BuildVisitor();
	}
	
	
	protected OntologParser createParser(String expression)  {
		CharStream input = new ANTLRInputStream(expression);
		OntologLexer lexer = new OntologLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		OntologParser parser = new OntologParser(tokenStream);
		parser.setASTFactory(factory);
		parser.setSyntaxErrorHandler(syntaxErrorHandler);
		parser.setRootContext(new RootASTContext());
		return parser;
	}


	public CompilationUnit buildExprAST(String expression) {
		OntologParser parser = createParser(expression);
		OntologExpressionContext ctx = parser.ontologExpression();
		
		return ctx.result;
	}

	protected Module buildExpr(CompilationUnit ast) {
		RootBuildContext context = new RootBuildContext(ast);
		ast.accept(visitor, context);
		return context.getModule();
	}
	
	@Override
	public Module buildExpr(String expression) {
		CompilationUnit astNode = buildExprAST(expression);
		return buildExpr(astNode);
	}
	
	@Override
	public Module build(String expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Module build(OntologSource source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Module build(OntologSource source, BuildContext rootContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
