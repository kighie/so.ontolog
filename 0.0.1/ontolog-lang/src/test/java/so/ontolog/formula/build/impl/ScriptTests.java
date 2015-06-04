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

import org.junit.Before;

import so.ontolog.formula.OntologSource;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.runtime.Module;
import so.ontolog.formula.runtime.internal.RootContext;
import so.ontolog.test.StopWatch;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ScriptTests {
	protected DefaultOntologBuilder builder = new DefaultOntologBuilder();
	protected StopWatch stopwatch = new StopWatch();
	
	@Before
	public void setUp(){
		builder.initialize();
	}

	protected CompilationUnit buildAst(String scriptPath){
		stopwatch.start();
		OntologSource source = OntologSource.newSource(this.getClass().getClassLoader(), scriptPath );
		
		CompilationUnit ast = builder.buildAST(source);
		System.out.println("AST :: " + stopwatch.ellapsedTime() + "\t" + source);
		System.out.println(ast);
		return ast;
	}

	protected Module build(CompilationUnit moduleAst){
		stopwatch.start();
		Module node = builder.build(moduleAst);
		System.out.println("EXPR :: " + stopwatch.ellapsedTime());
		return node;
	}

	protected Module build(String scriptPath, RootContext context){
		CompilationUnit moduleAst = buildAst(scriptPath);
		context.setSource(moduleAst.getSource());
		return build(moduleAst);
	}
	

	protected Module buildAndRun(String scriptPath, RootContext context){
		Module node = build(scriptPath, context);
		stopwatch.start();
		Object rtn = node.eval(context);
		System.out.println("RUN :: " + stopwatch.ellapsedTime() +"\t" + rtn);
		return node;
	}
}
