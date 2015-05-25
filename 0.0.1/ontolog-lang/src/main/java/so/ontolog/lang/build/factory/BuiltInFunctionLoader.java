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
package so.ontolog.lang.build.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import so.ontolog.lang.OntologLangException;
import so.ontolog.lang.runtime.Function;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class BuiltInFunctionLoader {
	
	private Pattern splitPattern = Pattern.compile("\\s+?");

	public Map<String, Function<?>> loadFunctions(String funcDescriptorPath){
		return loadFunctions(this.getClass().getClassLoader(), new String[]{funcDescriptorPath});
	}

	public Map<String, Function<?>> loadFunctions(ClassLoader classLoader, String funcDescriptorPath){
		return loadFunctions(classLoader, new String[]{funcDescriptorPath});
	}
	
	public Map<String, Function<?>> loadFunctions(ClassLoader classLoader, String[] funcDescriptorPaths){
		Map<String, Function<?>> functionMap = new HashMap<String, Function<?>>();
		
		for(String path:funcDescriptorPaths){
			loadFunctions(classLoader, functionMap, path);
		}
		return functionMap;
	}
	
	protected void loadFunctions(ClassLoader classLoader, Map<String, Function<?>> functionMap, String funcDescriptorPath){
		InputStream stream = classLoader.getResourceAsStream(funcDescriptorPath);
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream,"utf-8"));
			
			String line;
			while( (line = reader.readLine()) != null){
				loadFunction(classLoader, functionMap, splitPattern.split(line, 0));
			}
		} catch (IOException e) {
			throw new OntologLangException(e);
		} finally {
			if(stream != null){
				try {
					stream.close();
				} catch (IOException e) {
					// Ignore
				}
			}
		}
	}
	
	protected void loadFunction(ClassLoader classLoader, Map<String, Function<?>> functionMap, String[] description){
		if(description.length<2){
			return;
		}
		
		String fnClassName = description[0];
		Function<?> function;
		try {
			function = (Function<?>)classLoader.loadClass(fnClassName).newInstance();
		} catch (Exception e) {
			throw new OntologLangException(e);
		}
		
		for(int i = 1;i<description.length;i++){
			functionMap.put(description[i], function);
		}
	}
}
