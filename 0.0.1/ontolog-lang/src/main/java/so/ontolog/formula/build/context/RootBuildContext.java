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
package so.ontolog.formula.build.context;

import so.ontolog.formula.SourcePosition;
import so.ontolog.formula.ast.CompilationUnit;
import so.ontolog.formula.build.BuildContext;
import so.ontolog.formula.build.BuildErrorHandler;
import so.ontolog.formula.runtime.Module;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class RootBuildContext implements BuildContext, BuildErrorHandler {

	private final CompilationUnit compilationUnit;
	private Module module;
	private BuildErrorHandler errorHandler;
	
	public RootBuildContext(CompilationUnit compilationUnit, BuildErrorHandler errorHandler) {
		super();
		this.compilationUnit = compilationUnit;
		this.errorHandler = errorHandler;
	}

	/**
	 * @return the compilationUnit
	 */
	public CompilationUnit getCompilationUnit() {
		return compilationUnit;
	}
	
	@Override
	public BuildContext getParent() {
		return null;
	}
	
	@Override
	public void setModule(Module module) {
		this.module = module;
	}
	
	@Override
	public Module getModule() {
		return module;
	}
	
	@Override
	public void compileError(String message, SourcePosition location,
			Exception cause) {
		if(errorHandler != null){
			errorHandler.compileError(message, location, cause);
		}
	}
}
