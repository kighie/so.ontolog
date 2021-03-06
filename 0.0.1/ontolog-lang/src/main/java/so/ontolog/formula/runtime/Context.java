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
package so.ontolog.formula.runtime;

import so.ontolog.formula.OntologSource;
import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.runtime.internal.SymbolTable;





/**
 * 
 * @author IkChan Kwon
 * @date 2012. 10. 10.
 * @since 1.0
 */
public interface Context {
	
	Object getReference(QName name);
	
	void setReference(QName name, Object value);
	
	void clear();
	
	Context down(SymbolTable symbolTable);
	
	Context up();
	
	int depth();
	
	OntologSource getSource();
	
	String getLine(SourcePosition position);
}
