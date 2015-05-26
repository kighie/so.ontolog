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

import org.junit.Test;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ExprASTBuildTests extends ExpressionTests {

	

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

	@Test
	public void buildFormulaWizFuncCall(){

		buildExpr("[param java.math.BigDecimal dec1;param java.math.BigDecimal dec2;] "
				+ "=sum(dec1,dec2,3,5)");
		
		buildExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=sum( sample.testIntMethod( sample.propArray[3] * sample.propB), 5, 7) ");
	}
	

	@Test
	public void buildTernary(){

		buildExpr("= (1 < 3) ? 100 : 300");
		
	}
}
