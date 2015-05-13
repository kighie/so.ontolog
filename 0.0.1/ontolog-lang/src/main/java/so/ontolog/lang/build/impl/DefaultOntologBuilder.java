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

import so.ontolog.lang.SourcePosition;
import so.ontolog.lang.antlr.OntologLexer;
import so.ontolog.lang.antlr.OntologParser;
import so.ontolog.lang.antlr.OntologParser.OntologExpressionContext;
import so.ontolog.lang.ast.ASTNode;
import so.ontolog.lang.ast.SyntaxErrorHandler;
import so.ontolog.lang.ast.factory.DefaultASTFactory;
import so.ontolog.lang.build.BuildContext;
import so.ontolog.lang.build.OntologBuilder;
import so.ontolog.lang.build.OntologSource;
import so.ontolog.lang.runtime.Node;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOntologBuilder implements OntologBuilder {
	
	private DefaultASTFactory factory;
	
	public DefaultOntologBuilder() {
		factory = new DefaultASTFactory();
		factory.initFactory();
	}

	@Override
	public BuildContext createBuildContext() {
		// TODO Auto-generated method stub
		return null;
	}

	protected OntologParser createParser(String expression)  {
		CharStream input = new ANTLRInputStream(expression);
		OntologLexer lexer = new OntologLexer(input);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		OntologParser parser = new OntologParser(tokenStream);
		parser.setASTFactory(factory);
		parser.setSyntaxErrorHandler(new SyntaxErrorHandler() {
			@Override
			public void syntaxError(String message, Object offendingSymbol,
					SourcePosition location, Exception cause) {
				
			}
		});
		return parser;
	}

//	public ASTNode buildAST(String expression) {
//		OntologParser parser = createParser(expression);
//		OntologExpressionContext ctx = parser.ontologExpression();
//		
//		return ctx.result;
//	}

	public ASTNode buildExprAST(String expression) {
		OntologParser parser = createParser(expression);
		OntologExpressionContext ctx = parser.ontologExpression();
		
		return ctx.result;
	}
	
	@Override
	public Node buildExpr(String expression) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Node build(String expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node build(OntologSource source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node build(OntologSource source, BuildContext rootContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
