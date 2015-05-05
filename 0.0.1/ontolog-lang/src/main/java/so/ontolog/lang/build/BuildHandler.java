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
package so.ontolog.lang.build;

import java.util.List;
import java.util.Map;

import so.ontolog.lang.runtime.Block;
import so.ontolog.lang.runtime.BlockStatement;
import so.ontolog.lang.runtime.Gettable;
import so.ontolog.lang.runtime.Literal;
import so.ontolog.lang.runtime.Node;
import so.ontolog.lang.runtime.Ref;
import so.ontolog.lang.runtime.Statement;

/**
 * @author kighie@gmail.com
 *
 */
public interface BuildHandler {
	
	/**
	 * <pre>
	 * Gets the build time cursor context
	 * </pre>
	 * @return
	 */
	BuildContext current();

	/**
	 * <pre>
	 * Start building new block and new scope context.
	 * </pre>
	 * @param token
	 * @return
	 */
	Block block(String token);
	
	/**
	 * <pre>
	 * Make new building context, when new scope begins.
	 * </pre>
	 */
	void beginScope();
	
	
	/**
	 * <pre>
	 * End building block.
	 * </pre>
	 */
	void endScope();
	
	/**
	 * <pre>
	 * Builds unary operator
	 * </pre>
	 * @param token
	 * @param node
	 * @return
	 */
	Gettable<?> operator (String token, Node node);
	
	/**
	 * <pre>
	 * Builds binary operator
	 * </pre>
	 * @param token
	 * @param left
	 * @param right
	 * @return
	 */
	Gettable<?> operator (String token, Node left, Node right);
	
	/**
	 * <pre>
	 * Make literal value
	 * </pre>
	 * @param token
	 * @param value
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	Literal literal(String token, String value);

	/**
	 * <pre>
	 * Builds Reference
	 * </pre>
	 * @param token
	 * @param exp
	 * @return
	 */
	Ref refer(String name);
	

	/**
	 * <pre>
	 * Builds Reference
	 * </pre>
	 * @param token
	 * @param parent
	 * @param name
	 * @return
	 */
	Ref refer(Ref parent, String name);

	/**
	 * <pre>
	 * Builds Reference with array/map index
	 * </pre>
	 * @param name
	 * @param index
	 * @return
	 */
	Ref referIndexed(Ref parent, Node index);
	
	/**
	 * <pre>
	 * Declares Ref(variable, type, ...)
	 * </pre>
	 * @param token
	 * @param type
	 * @param name
	 * @return
	 */
	Ref declare(String token, Class<?> type, String name);
	

	/**
	 * <pre>
	 * Declares prototype
	 * </pre>
	 * @param token
	 * @param name
	 * @return
	 */
	Gettable<?> declareProto(String token, List<?>fieldList);
	

	/**
	 * Declares prototype field.
	 * @param protoStatement
	 * @param type
	 * @param name
	 * @param defaultValue
	 * @param extra
	 */
	void protoField(String token, List<?>fieldList, Class<?> type, String name, Node defaultValue, Object ... extra);
	
	
	
//	/**
//	 * <pre>
//	 * Declares Function
//	 * [Caution] You must call {@link #endBlock()} after completing block parsing.
//	 * </pre>
//	 * @param token
//	 * @param type
//	 * @param name
//	 * @return
//	 */
//	BlockStatement declareFn(Class<?> retType, String name, List<Ref> args);

//	/**
//	 * <pre>
//	 * Make an anonymous function or operator.
//	 * </pre>
//	 * @param token
//	 * @param args
//	 * @return
//	 */
//	Lambda<?> lambda(String token, List<Ref> args, Object ... extra);
	
	/**
	 * <pre>
	 * </pre>
	 * @param typeQname
	 * @return
	 */
	Class<?> type(String typeQname);

	/**
	 * <pre>
	 * </pre>
	 * @param type
	 * @return
	 */
	<T> Class<T[]> arrayType(Class<T> type);
	
	/**
	 * <pre>
	 * Builds function call expression
	 * </pre>
	 * @param name
	 * @param args
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	Gettable functionCall(String name, List<Node> args);

	/**
	 * <pre>
	 * Builds method call expression
	 * </pre>
	 * @param parent
	 * @param name
	 * @param args
	 * @return
	 */
	Ref methodCall(Ref parent, String name, List<Node> args);
	
	/**
	 * <pre>
	 * Builds statements (variable/type declaration, assignment, method call, if , foreach, etc.)
	 * </pre>
	 * @param token
	 * @param args
	 * @return
	 */
	Statement statement(String token, Node ... args);
	

	/**
	 * <pre>
	 * Builds block statement.
	 * [Caution] You must call {@link #endBlock()} after completing block parsing.
	 * </pre>
	 * @param token
	 * @param args
	 * @return
	 */
	BlockStatement statementBlock(String token, Node ... args);
	
	/**
	 * <pre>
	 * </pre>
	 * @param token
	 * @param element
	 * @return
	 */
	Gettable<?> array(List<Node> elements);
	

	/**
	 * <pre>
	 * </pre>
	 * @param token
	 * @param entrySet
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	Gettable<Map> map(String token);
	
	/**
	 * <pre>
	 * </pre>
	 * @param retType
	 * @param name
	 * @param value
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	void mapEntry(Gettable<Map> mapGettable, Class<?> entryType, String name, Node value);
	
	
	void importJava(Ref ref);
	
	
}
