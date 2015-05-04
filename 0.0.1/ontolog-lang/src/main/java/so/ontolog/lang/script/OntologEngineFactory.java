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
package so.ontolog.lang.script;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public class OntologEngineFactory implements ScriptEngineFactory {

	private static List<String> ENGINE_EXTS;
	private static List<String> MIME_TYPES;
	private static List<String> NAMES;

	static {
		ENGINE_EXTS = new ArrayList<String>();
		ENGINE_EXTS.add("ol");
		ENGINE_EXTS = Collections.unmodifiableList(ENGINE_EXTS);
		
		MIME_TYPES = new ArrayList<String>();
		MIME_TYPES.add("text");
		MIME_TYPES.add("text/ontolog");
		MIME_TYPES.add("application/ontolog");
		MIME_TYPES = Collections.unmodifiableList(MIME_TYPES);
		
		NAMES = new ArrayList<String>();
		NAMES.add("ontolog");
		NAMES = Collections.unmodifiableList(NAMES);
	}

	private final Map<String,String> props = new HashMap<String, String>();
	private boolean initialized;

	public void initialize() {
		if(!initialized){
			initProps();
		}
		
	}

	public void destroy() {
		if(initialized){
			
		}
		
	}
	
	protected void initProps(){
		props.put(ScriptEngine.ENGINE, "Ontolog");
		props.put(ScriptEngine.ENGINE_VERSION, "0.0.1");
		props.put(ScriptEngine.NAME, "Ontolog Script");
		props.put(ScriptEngine.LANGUAGE, "OntologLang");
		props.put(ScriptEngine.LANGUAGE_VERSION, "0.0.1");
	}

    public String getName() {
        return (String)getParameter(ScriptEngine.NAME);
    }
    
    public String getEngineName() {
        return (String)getParameter(ScriptEngine.ENGINE);
    }
    
    public String getEngineVersion() {
        return (String)getParameter(ScriptEngine.ENGINE_VERSION);
    }
    
    public String getLanguageName() {
        return (String)getParameter(ScriptEngine.LANGUAGE);
    }
    
    public String getLanguageVersion() {
        return (String)getParameter(ScriptEngine.LANGUAGE_VERSION);
    }
    
	@Override
	public ScriptEngine getScriptEngine() {
		
		return null;
	}

	@Override
	public List<String> getNames() {
		return NAMES;
	}


	@Override
	public Object getParameter(String key) {
		return props.get(key);
	}

	
	@Override
	public String getMethodCallSyntax(String obj, String method, String... args) {
        String ret = obj + "." + method + "(";
        int len = args.length;
        if (len == 0) {
            ret += ")";
            return ret;
        }
        
        for (int i = 0; i < len; i++) {
            ret += args[i];
            if (i != len - 1) {
                ret += ",";
            } else {
                ret += ")";
            }
        }
        return ret;
	}

	@Override
	public String getOutputStatement(String toDisplay) {
        return "print(" + toDisplay + ")";
	}

	@Override
	public String getProgram(String... statements) {
        int len = statements.length;
        String ret = "";
        for (int i = 0; i < len; i++) {
            ret += statements[i] + ";";
        }
        
        return ret;
	}

	@Override
	public List<String> getExtensions() {
		return ENGINE_EXTS;
	}

	@Override
	public List<String> getMimeTypes() {
		return MIME_TYPES;
	}
}
