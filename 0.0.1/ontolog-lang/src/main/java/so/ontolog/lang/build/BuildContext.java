/* ******************************************************************************
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
package so.ontolog.lang.build;

import java.util.Map.Entry;

import so.ontolog.lang.ast.ASTRef;
import so.ontolog.lang.runtime.Function;
import so.ontolog.lang.runtime.QName;

/**
 * 
 * @author IkChan Kwon
 * @date 2012. 10. 10.
 * @since	1.0
 */
public interface BuildContext {
	
	BuildContext getParent() ;

	void registerLocalFn(String name, Function<?> fn);
	
	Function<?> getLocalFn(String name);

	Function<?> getBuiltInFunction(String name);

	
	void registerRef(QName qname, ASTRef ref);
	
	ASTRef getRef(QName qname);

	Iterable<Entry<QName, ASTRef>> references();

}
