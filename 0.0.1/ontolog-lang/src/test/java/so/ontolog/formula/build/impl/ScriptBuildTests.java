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

import so.ontolog.formula.runtime.internal.RootContext;
import so.ontolog.samples.bean.SampleBean;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ScriptBuildTests extends ScriptTests{
	
	RootContext createContext(){
		RootContext context = new RootContext();
		SampleBean sample = new SampleBean();
		sample.setPropA("Text:");
		sample.setPropB(3);
		
		sample.setPropArray(new int[]{1,2,3,4,5,6} );
		context.setParameter("sample", sample);
		context.setParameter("dec1", 30);
		context.setParameter("dec2", 20);
		return context;
	}
	
	@Test
	public void scriptBasic(){
		RootContext context = createContext();
		buildAndRun("so/ontolog/formula/build/impl/ScriptBasic.ol", context);
	}

	@Test
	public void scriptIf(){
		RootContext context = createContext();
		buildAndRun("so/ontolog/formula/build/impl/if.ol", context);
	}

	@Test
	public void scriptFor(){
		RootContext context = createContext();
		buildAndRun("so/ontolog/formula/build/impl/foreach.ol", context);
	}

	@Test
	public void scriptWhile(){
		RootContext context = createContext();
		buildAndRun("so/ontolog/formula/build/impl/while.ol", context);
	}
	

	@Test
	public void scriptFunctionDecls(){
		RootContext context = createContext();
		buildAndRun("so/ontolog/formula/build/impl/functionDecls.ol", context);
	}

}
