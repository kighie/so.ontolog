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

//	/**
//	 * <pre>
//	 * Start building new block and new scope context.
//	 * </pre>
//	 * @param token
//	 * @return
//	 */
//	ASTBlock block(String token);
//	
//	/**
//	 * <pre>
//	 * Make new building context, when new scope begins.
//	 * </pre>
//	 */
//	void beginScope();
//	
//	
//	/**
//	 * <pre>
//	 * End building block.
//	 * </pre>
//	 */
//	void endScope();
//	
//	/**
//	 * <pre>
//	 * Builds unary operator
//	 * </pre>
//	 * @param token
//	 * @param node
//	 * @return
//	 */
//	ASTGettable<?> operator (String token, ASTNode node);
//	
//	/**
//	 * <pre>
//	 * Builds binary operator
//	 * </pre>
//	 * @param token
//	 * @param left
//	 * @param right
//	 * @return
//	 */
//	ASTGettable<?> operator (String token, ASTNode left, ASTNode right);
//	
//	/**
//	 * <pre>
//	 * Make literal value
//	 * </pre>
//	 * @param token
//	 * @param value
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	ASTLiteral literal(String token, String value);
//
//	/**
//	 * <pre>
//	 * Builds Reference
//	 * </pre>
//	 * @param token
//	 * @param exp
//	 * @return
//	 */
//	ASTRef refer(String name);
//	
//
//	/**
//	 * <pre>
//	 * Builds Reference
//	 * </pre>
//	 * @param token
//	 * @param parent
//	 * @param name
//	 * @return
//	 */
//	ASTRef refer(ASTRef parent, String name);
//
//	/**
//	 * <pre>
//	 * Builds Reference with array/map index
//	 * </pre>
//	 * @param name
//	 * @param index
//	 * @return
//	 */
//	ASTRef referIndexed(ASTRef parent, ASTNode index);
//	
//	/**
//	 * <pre>
//	 * Declares Ref(variable, type, ...)
//	 * </pre>
//	 * @param token
//	 * @param type
//	 * @param name
//	 * @return
//	 */
//	ASTRef declare(String token, Class<?> type, String name);
//	
//
//	/**
//	 * <pre>
//	 * Declares prototype
//	 * </pre>
//	 * @param token
//	 * @param name
//	 * @return
//	 */
//	ASTGettable<?> declareProto(String token, List<?>fieldList);
//	
//
//	/**
//	 * Declares prototype field.
//	 * @param protoStatement
//	 * @param type
//	 * @param name
//	 * @param defaultValue
//	 * @param extra
//	 */
//	void protoField(String token, List<?>fieldList, Class<?> type, String name, ASTNode defaultValue, Object ... extra);
//	
//	
//	
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
//	ASTFunction<?> declareFn(Class<?> retType, String name, List<ASTRef> args);
//
////	/**
////	 * <pre>
////	 * Make an anonymous function or operator.
////	 * </pre>
////	 * @param token
////	 * @param args
////	 * @return
////	 */
////	ASTFunction<?> lambda(String token, List<Ref> args, Object ... extra);
//	
//	/**
//	 * <pre>
//	 * </pre>
//	 * @param typeQname
//	 * @return
//	 */
//	Class<?> type(String typeQname);
//
//	/**
//	 * <pre>
//	 * </pre>
//	 * @param type
//	 * @return
//	 */
//	<T> Class<T[]> arrayType(Class<T> type);
//	
//	/**
//	 * <pre>
//	 * Builds function call expression
//	 * </pre>
//	 * @param name
//	 * @param args
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	ASTGettable functionCall(String name, List<ASTNode> args);
//
//	/**
//	 * <pre>
//	 * Builds method call expression
//	 * </pre>
//	 * @param parent
//	 * @param name
//	 * @param args
//	 * @return
//	 */
//	ASTRef methodCall(ASTRef parent, String name, List<ASTNode> args);
//	
//	/**
//	 * <pre>
//	 * Builds statements (variable/type declaration, assignment, method call, if , foreach, etc.)
//	 * </pre>
//	 * @param token
//	 * @param args
//	 * @return
//	 */
//	ASTStatement statement(String token, ASTNode ... args);
//	
//
//	/**
//	 * <pre>
//	 * Builds block statement.
//	 * [Caution] You must call {@link #endBlock()} after completing block parsing.
//	 * </pre>
//	 * @param token
//	 * @param args
//	 * @return
//	 */
//	ASTBlockStatement statementBlock(String token, ASTNode ... args);
//	
//	/**
//	 * <pre>
//	 * </pre>
//	 * @param token
//	 * @param element
//	 * @return
//	 */
//	ASTGettable<?> array(List<ASTNode> elements);
//	
//
//	/**
//	 * <pre>
//	 * </pre>
//	 * @param token
//	 * @param entrySet
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	ASTGettable<Map> map(String token);
//	
//	/**
//	 * <pre>
//	 * </pre>
//	 * @param retType
//	 * @param name
//	 * @param value
//	 * @return
//	 */
//	@SuppressWarnings("rawtypes")
//	void mapEntry(Gettable<Map> mapGettable, Class<?> entryType, String name, ASTNode value);
//	
//	
//	void importJava(ASTRef ref);
	
	
}
