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
package so.ontolog.lang.ast;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTFactory {

	CompilationUnit createModule(ASTContext context, ASTToken token);
	
	TypeSpec createType(String expr);
	
	TypeSpec createType(QName qname);

	QName createQName(String name);
	
	QName createQName(QName parent, String name);
	
	ASTExpr createUnary(ASTToken token, ASTExpr expr);

	ASTExpr createBinary(ASTToken token, ASTExpr left, ASTExpr right);
	
	ASTExpr createTernary(ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);

	ASTExpr createLiteral(ASTToken token, String expr);
	
	ASTExpr createVariable(ASTContext context, ASTToken token, QName qname);
	
	ASTDeclaration createParamDecl(ASTContext context, ASTToken token, TypeSpec type, String name, String alias);

	ASTStatement asStatement(ASTContext context, ASTDeclaration decl);

	ASTStatement createEvalStmt(ASTToken token, ASTExpr expr);
	
	

	public interface ModuleFactory {
		CompilationUnit create(ASTContext context, ASTToken token);
	}
	
	/**
	 *
	 */
	public interface UnaryExprFactory {
		ASTExpr create(ASTToken token, ASTExpr expr);
	}

	/**
	 *
	 */
	public interface BinaryExprFactory {
		ASTExpr create(ASTToken token, ASTExpr left, ASTExpr right);
	}

	/**
	 *
	 */
	public interface TernaryExprFactory {
		ASTExpr create(ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);
	}

	/**
	 *
	 */
	public interface VariableExprFactory {
		ASTExpr create(ASTContext context, ASTToken token, QName qname);
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
	
}
