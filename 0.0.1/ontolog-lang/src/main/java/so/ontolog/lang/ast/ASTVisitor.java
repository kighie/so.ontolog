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

import so.ontolog.lang.ast.expr.BinaryExpr;
import so.ontolog.lang.ast.expr.LiteralExpr;
import so.ontolog.lang.ast.expr.TernaryExpr;
import so.ontolog.lang.ast.expr.UnaryExpr;
import so.ontolog.lang.ast.expr.VariableExpr;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTVisitor {

	<C> C visit(UnaryExpr unaryExpr, C context);

	<C> C visit(BinaryExpr binaryExpr, C context);
	
	<C> C visit(TernaryExpr ternaryExpr, C context);

	<C> C visit(VariableExpr variableExpr, C context);
	
	<C> C visit(LiteralExpr variableExpr, C context);
	
}
