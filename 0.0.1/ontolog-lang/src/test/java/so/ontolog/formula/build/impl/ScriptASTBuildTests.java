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
public class ScriptASTBuildTests extends ScriptTests{
	
	@Test
	public void scriptBasic(){
		buildAst("so/ontolog/formula/build/impl/ScriptBasic.ol");
	}

	@Test
	public void scriptIf(){
		buildAst("so/ontolog/formula/build/impl/if.ol");
	}
	
	@Test
	public void scriptFor(){
		buildAst("so/ontolog/formula/build/impl/foreach.ol");
	}
	

	@Test
	public void scriptWhile(){
		buildAst("so/ontolog/formula/build/impl/while.ol");
	}

	@Test
	public void scriptFunctionDecls(){
		buildAst("so/ontolog/formula/build/impl/functionDecls.ol");
	}


	@Test
	public void scriptMapExpr(){
		buildAst("so/ontolog/formula/build/impl/map.ol");
	}


	@Test
	public void scriptArrayExpr(){
		buildAst("so/ontolog/formula/build/impl/array.ol");
	}
	
}
