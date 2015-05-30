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
package so.ontolog.test;

import org.junit.Test;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class ExceptionTests {

	@Test
	public void stackTrace(){
		Exception e = new Exception();
		
		for( StackTraceElement stackTrace : e.getStackTrace() ){
			System.out.println(stackTrace);
		}
		
		StackTraceElement ste = new StackTraceElement("TEST", "testMethod", "test.ol", 3);
		
		e.setStackTrace(new StackTraceElement[]{ste});
		
		e.printStackTrace();
	}
}
