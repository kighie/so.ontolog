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
package so.ontolog.lang.ast.factory;

import so.ontolog.data.type.TypeSpec;
import so.ontolog.lang.ast.ASTExpression;
import so.ontolog.lang.ast.ASTFactory;
import so.ontolog.lang.ast.ASTToken;
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
public class DefaultASTFactory implements ASTFactory {

	@Override
	public TypeSpec createType(String expr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeSpec createType(QName qname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QName createQName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QName createQName(QName parent, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UnaryExpr createUnary(ASTToken token, ASTExpression expr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryExpr createBinary(ASTToken token, ASTExpression left,
			ASTExpression right) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TernaryExpr createTernary(ASTToken token, ASTExpression expr1,
			ASTExpression expr2, ASTExpression expr3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableExpr createVariable(ASTToken token, QName qname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LiteralExpr createLiteral(ASTToken token, String expr) {
		// TODO Auto-generated method stub
		return null;
	}

}
