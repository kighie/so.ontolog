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
import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;
import so.ontolog.lang.runtime.QName;

/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTFactory {

	TypeSpec createType(String expr);
	
	TypeSpec createType(QName qname);

	QName createQName(String name);
	
	QName createQName(QName parent, String name);
	
	UnaryExpr createUnary(ASTToken token, ASTExpr expr);

	BinaryExpr createBinary(ASTToken token, ASTExpr left, ASTExpr right);
	
	TernaryExpr createTernary(ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);

	VariableExpr createVariable(ASTToken token, QName qname);
	
	LiteralExpr createLiteral(ASTToken token, String expr);
	
	

	/**
	 *
	 */
	public interface UnaryExprFactory {
		UnaryExpr create(ASTToken token, ASTExpr expr);
	}

	/**
	 *
	 */
	public interface BinaryExprFactory {
		BinaryExpr create(ASTToken token, ASTExpr left, ASTExpr right);
	}

	/**
	 *
	 */
	public interface TernaryExprFactory {
		TernaryExpr create(ASTToken token, ASTExpr expr1, ASTExpr expr2, ASTExpr expr3);
	}

	/**
	 *
	 */
	public interface VariableExprFactory {
		VariableExpr create(ASTToken token, QName qname);
	}

	/**
	 *
	 */
	public interface LiteralExprFactory {
		LiteralExpr create(ASTToken token, String expr);
	}
	
}
