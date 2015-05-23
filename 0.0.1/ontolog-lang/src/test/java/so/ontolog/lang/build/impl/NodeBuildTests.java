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

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import so.ontolog.lang.runtime.Context;
import so.ontolog.lang.runtime.Module;
import so.ontolog.lang.runtime.internal.SimpleContext;
import so.ontolog.samples.bean.SampleBean;
import so.ontolog.test.StopWatch;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class NodeBuildTests {

	private DefaultOntologBuilder builder = new DefaultOntologBuilder();
	private StopWatch stopwatch = new StopWatch();
	
	@Before
	public void setUp(){
		builder.initialize();
	}

	private Module buildExpr(String expression){
		stopwatch.start();
		Module node = builder.buildExpr(expression);
		System.out.println("BUILD :: " + stopwatch.ellapsedTime() +"\t" + expression);
		return node;
	}

	private Module buildAndRunExpr(String expression, Context context){
		Module node = buildExpr(expression);
		stopwatch.start();
		Object rtn = node.eval(context);
		System.out.println("RUN :: " + stopwatch.ellapsedTime() +"\t" + rtn);
		return node;
	}

	@Test
	public void buildFormula(){
		Context context = new SimpleContext();
		buildAndRunExpr("=3*4.5/(3+5) - 1.3", context);
		buildAndRunExpr("= '*'*3 + (3*4.5/(3+5) - 1.3) + '*' *3", context);
		buildAndRunExpr("= not (3*4 < 12) and (12 > 11/2)", context);
		buildAndRunExpr("='*'*3", context);
	}
	
	@Test
	public void buildFormulaParamDef(){
		SimpleContext context = new SimpleContext();
		context.setParameter("a", 1);
		context.setParameter("b", 2);
		context.setParameter("c", "6");
		buildAndRunExpr("[param int a as pa; param real b;] =(3*4.5/(3+5) - 1.3)", context);
		buildAndRunExpr("[param int a as pa; param real b;] =(3*4.5/(pa+5) - b)", context);
		buildAndRunExpr("[param int a as pa; param real b;param text c;] =(3*4.5/(pa+5) - b) + ' : ' + c * 3", context);
	}
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void buildFormulaWizBeanParam(){
		SimpleContext context = new SimpleContext();
		SampleBean sample = new SampleBean();
		sample.setPropA("Text:");
		sample.setPropB(8);

		Map<String,BigDecimal> propMap = new HashMap<String, BigDecimal>();
		propMap.put("A", new BigDecimal(3));
		propMap.put("B", new BigDecimal(4));
		propMap.put("C", new BigDecimal(5));
		propMap.put("D", new BigDecimal(6));
		propMap.put("E", new BigDecimal(7));
		
		sample.setPropMap(propMap);

		HashMap propMap2 = new HashMap();
		propMap2.put("A", new BigDecimal(2));
		propMap2.put("B", "STR");
		propMap2.put("C", new BigDecimal(10));
		propMap2.put("D", 1);
		propMap2.put("E", 43);
		
		sample.setPropMap2(propMap2);
		
		context.setParameter("sample", sample);

		buildAndRunExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=(sample.propA * sample.propMap.C + sample.propB * sample.propMap.A)", context);

		buildAndRunExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=(sample.propA + sample.propMap2.B) * sample.propMap2.C+ ' , ' + sample.propB * sample.propMap2.A"
				+ "+ ' , ' + (34/(sample.propMap2.C - sample.propMap.D)", context);

	}
	

	@Test
	public void buildFormulaWizBeanParam2(){
		SimpleContext context = new SimpleContext();
		SampleBean sample = new SampleBean();
		sample.setPropA("Text:");
		sample.setPropB(8);
		
		sample.setPropArray(new int[]{1,2,3,4,5,6} );
		context.setParameter("sample", sample);

		buildAndRunExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=(sample.propArray[3] * sample.propArray[2])", context);

	}
	


	@Test
	public void buildFormulaWizVarIndex(){
		SimpleContext context = new SimpleContext();
		SampleBean sample = new SampleBean();
		sample.setPropA("Text:");
		sample.setPropB(3);
		
		sample.setPropArray(new int[]{1,2,3,4,5,6} );
		context.setParameter("sample", sample);

		buildAndRunExpr("[param so.ontolog.samples.bean.SampleBean sample;] "
				+ "=(sample.propArray[sample.propB] + sample.propArray[2])", context);

	}
}
