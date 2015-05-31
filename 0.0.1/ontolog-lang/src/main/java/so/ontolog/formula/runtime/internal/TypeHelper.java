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
package so.ontolog.formula.runtime.internal;

import java.util.HashMap;

import so.ontolog.data.type.TypeKind;
import so.ontolog.data.type.TypeSpec;
import so.ontolog.data.type.TypeUtils;
import so.ontolog.formula.runtime.Function;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class TypeHelper {

	protected final HashMap<String, TypeSpec> typeMap = new HashMap<String, TypeSpec>();

	public static final TypeSpec VOID = new TypeSpec(Void.class, TypeKind.Void);
	public static final TypeSpec FUNCTION = new TypeSpec(Function.class, TypeKind.Executable);
	
	/**
	 * 
	 */
	public TypeHelper() {
		initDefaults();
	}

	protected void initDefaults() {
		registerType("number", TypeSpec.REAL);
		registerType("text", TypeSpec.STRING);
		registerType("boolean", TypeSpec.BOOLEAN);
		registerType("date", TypeSpec.DATE);
//		registerType("map", TypeSpec.MAP);
//		registerType("record", TypeSpec.RECORD);
//		registerType("table", TypeSpec.TABLE);
		

		registerType("BigDecimal", TypeSpec.DECIMAL);
		registerType("String", TypeSpec.STRING);
		registerType("Boolean", TypeSpec.BOOLEAN);
		registerType("Date", TypeSpec.DATE);
//		registerType("Map", TypeSpec.MAP);

		registerType("int", TypeSpec.INT);
		registerType("Integer", TypeSpec.INT);
		registerType("long", TypeSpec.BIGINT);
		registerType("Long", TypeSpec.BIGINT);
		registerType("real", TypeSpec.REAL);
		registerType("double", TypeSpec.REAL);
		registerType("Double", TypeSpec.REAL);
		registerType("float", TypeSpec.REAL);
		registerType("Float", TypeSpec.REAL);
		

		registerType("function", FUNCTION);
		registerType("void", VOID);
	}
	
	public void registerType(String typeName, TypeSpec type){
		typeMap.put(typeName, type);
	}
	
	
	public TypeSpec getType(String typeName) {
		TypeSpec type = typeMap.get(typeName);
		if(type == null){
			type = TypeUtils.forName(typeName);
		}
		return type;
	}

	public TypeSpec getArrayType(String typeName) {
		TypeSpec type = getType(typeName);
		type = TypeUtils.getArrayTypeSpec(type);
		return type;
	}
}
