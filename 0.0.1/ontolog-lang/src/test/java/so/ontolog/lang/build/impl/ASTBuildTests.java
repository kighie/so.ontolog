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

import org.junit.Before;
import org.junit.Test;

import so.ontolog.lang.ast.CompilationUnit;
import so.ontolog.lang.runtime.Node;
import so.ontolog.test.StopWatch;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ASTBuildTests {

	private DefaultOntologBuilder builder = new DefaultOntologBuilder();
	private StopWatch stopwatch = new StopWatch();
	
	@Before
	public void setUp(){
		builder.initialize();
	}

	private CompilationUnit buildAst(String expression){
		stopwatch.start();
		CompilationUnit ast = builder.buildExprAST(expression);
		System.out.println("AST :: " + stopwatch.ellapsedTime() + "\t" + expression);
		System.out.println(ast);
		return ast;
	}

	private Node buildExpr(CompilationUnit moduleAst){
		stopwatch.start();
		Node node = builder.buildExpr(moduleAst);
		System.out.println("EXPR :: " + stopwatch.ellapsedTime());
		return node;
	}

	private Node buildExpr(String expression){
		CompilationUnit moduleAst = buildAst(expression);
		return buildExpr(moduleAst);
	}

	@Test
	public void buildFormulaAst(){
		buildAst("=3*4.5/(3+5) - 1.3");
		buildAst("=3*4.5/(3+5) - 1.3 + 'sting'");
		buildAst("= not (3*4 < 12) and (12 > 11/2)");
		buildAst("='sting'*3");
	}
	
	@Test
	public void buildFormulaParamDefAst(){
		buildAst("[param int a as pa; param real b;] =(3*4.5/(3+5) - 1.3)");
//		testAst("[param int a as pa; param real b;] =(3*4.5/(pa+5) - b)");
	}
	

	@Test
	public void buildFormula(){
		buildExpr("=3*4.5/(3+5) - 1.3");
		buildExpr("=3*4.5/(3+5) - 1.3 + 'sting'");
		buildExpr("= not (3*4 < 12) and (12 > 11/2)");
		buildExpr("='sting'*3");
	}
	
	@Test
	public void buildFormulaParamDef(){
		buildExpr("[param int a as pa; param real b;] =(3*4.5/(3+5) - 1.3)");
//		testAst("[param int a as pa; param real b;] =(3*4.5/(pa+5) - b)");
	}
	

	@Test
	public void buildFormulaWizMethodCall(){

		buildExpr("[param java.math.BigDecimal dec1;param java.math.BigDecimal dec2;] "
				+ "=(dec1.add(dec2))");
		
		buildExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=(sample.testIntMethod( sample.propArray[3] * sample.propB))");
		
	}
	
}
