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

import org.junit.Test;

import so.ontolog.lang.ast.ASTNode;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class DefaultOntologBuilderTests {

	private DefaultOntologBuilder builder = new DefaultOntologBuilder();
	
	
	@Test
	public void buildAST(){
		ASTNode ast = builder.buildExprAST("=3*4.5/(3+5) - 1.3");
		System.out.println(ast.getText());
		ASTNode ast2 = builder.buildExprAST("=3*4.5/(3+5) - 1.3 + 'sting'");
		System.out.println(ast2.getText());
		ASTNode ast3 = builder.buildExprAST("= not (3*4 < 12) and (12 > 11/2)");
		System.out.println(ast3.getText());
	}
}
