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
package so.ontolog.formula.ast;

import java.util.List;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.formula.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTFactory {

	CompilationUnit createModule(ASTContext context, ASTToken token);
	
	TypeSpec createType(ASTContext context, String typeName);
	
	TypeSpec createType(ASTContext context, QName qname);

	TypeSpec createArrayType(ASTContext context, String typeName);
	
	QName createQName(ASTContext context, String name);

	QName createQName(ASTContext context, QName parent, String name);
	
	QName createIndexedQName(ASTContext context, QName parent, String index);

	QName createVarQName(ASTContext context, QName parent, QName index);

	void importJava(ASTContext context, QName qname);
	
	void importModule(ASTContext context, String path, String alias);
	
	ASTExpr createUnary(ASTContext context, ASTToken token, ASTExpr expr);

	ASTExpr createBinary(ASTContext context, ASTToken token, ASTExpr left, ASTExpr right);
	
	ASTExpr createTernary(ASTContext context, ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);

	ASTExpr createLiteral(ASTToken token, String expr);
	
	ASTExpr createArray(ASTToken token, List<ASTExpr> elements);
	
	ASTSymbol createVariable(ASTContext context, ASTToken token, QName qname);

	ASTExpr createLoopCondition(ASTContext context, ASTToken token, ASTDeclaration varDecl, ASTExpr iteratorExpr);
	
	/**<pre></pre>
	 * @param current
	 * @param astToken
	 * @param beanSymbol
	 * @param name
	 * @param args
	 * @return
	 */
	ASTExpr createCall(ASTContext context, ASTToken token,
			ASTSymbol beanSymbol, String name, List<ASTExpr> args);

	ASTStatement asStatement(ASTContext context, ASTDeclaration decl);

	ASTStatement asStatement(ASTContext context, ASTExpr callExpr);

	ASTStatement createReturnStatement(ASTContext context, ASTExpr callExpr);
	
	ASTDeclaration createVariableDecl(ASTContext context, ASTToken token, TypeSpec type, String name, ASTExpr value);
	
	ASTDeclaration createParamDecl(ASTContext context, ASTToken token, TypeSpec type, String name, String alias);

	ASTStatement createEvalStmt(ASTToken token, ASTExpr expr);

	ASTBlock createIfStmt(ASTContext context, ASTToken token, ASTExpr condition);

	ASTBlock createLoopStatement(ASTContext context, ASTToken token, ASTExpr condition);
	
	
	public interface ModuleFactory {
		CompilationUnit create(ASTContext context, ASTToken token);
	}
	
	/**
	 *
	 */
	public interface UnaryExprFactory {
		ASTExpr create(ASTContext context, ASTToken token, ASTExpr expr);
	}

	/**
	 *
	 */
	public interface BinaryExprFactory {
		ASTExpr create(ASTContext context, ASTToken token, ASTExpr left, ASTExpr right);
	}

	/**
	 *
	 */
	public interface TernaryExprFactory {
		ASTExpr create(ASTContext context, ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);
	}

	/**
	 *
	 */
	public interface VariableExprFactory {
		ASTSymbol create(ASTContext context, ASTToken token, QName qname);
	}

	/**
	 *
	 */
	public interface LiteralExprFactory {
		ASTExpr create(ASTToken token, String expr);
	}

	/**
	 *
	 */
	public interface ParamDeclFactory {
		ASTDeclaration create(ASTContext context, ASTToken token, TypeSpec type, String name, String alias);
	}

	public interface VariableDeclFactory {
		ASTDeclaration create(ASTContext context,
				ASTToken token, TypeSpec type, String name, ASTExpr value);
	}

	public interface CallExprFactory {
		/**
		 * <pre></pre>
		 * @param context
		 * @param token
		 * @param beanRef
		 * @param name
		 * @param args
		 * @return
		 */
		ASTSymbol create(ASTContext context, ASTToken token, ASTSymbol beanRef, String name, List<ASTExpr> args);
	}

}
