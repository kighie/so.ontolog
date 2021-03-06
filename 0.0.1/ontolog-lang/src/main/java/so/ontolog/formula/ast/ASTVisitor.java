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

import so.ontolog.formula.ast.expr.ASTArrayExpr;
import so.ontolog.formula.ast.expr.ASTCallExpr;
import so.ontolog.formula.ast.expr.ASTLoopCondition;
import so.ontolog.formula.ast.expr.ASTVariableExpr;
import so.ontolog.formula.ast.expr.BinaryExpr;
import so.ontolog.formula.ast.expr.LiteralExpr;
import so.ontolog.formula.ast.expr.TernaryExpr;
import so.ontolog.formula.ast.expr.UnaryExpr;
import so.ontolog.formula.ast.stmt.ASTAssignStatement;
import so.ontolog.formula.ast.stmt.ASTCallStatement;
import so.ontolog.formula.ast.stmt.ASTForeachStatement;
import so.ontolog.formula.ast.stmt.ASTIfStatement;
import so.ontolog.formula.ast.stmt.ASTReturnStatement;
import so.ontolog.formula.ast.stmt.ASTWhileStatement;
import so.ontolog.formula.ast.stmt.EvalExprStatement;


/**
 * <pre></pre>
 * @author Ikchan Kwon
 *
 */
public interface ASTVisitor<C> {

	C visit(CompilationUnit compilationUnit, C context);
	
	C visit(UnaryExpr unaryExpr, C context);

	C visit(BinaryExpr binaryExpr, C context);
	
	C visit(TernaryExpr ternaryExpr, C context);

	C visit(ASTVariableExpr variableExpr, C context);
	
	C visit(ASTSymbol symbol, C context);
	
	C visit(LiteralExpr expr, C context);

	C visit(ASTArrayExpr expr, C context);
	
	C visit(ASTCallExpr expr, C context);

	
	
	

	C visit(ASTDeclaration declStmt, C context);
	

	C visit(EvalExprStatement stmt, C context);
	
	C visit(ASTCallStatement stmt, C context);

	C visit(ASTReturnStatement stmt, C context);
	

	C visit(ASTIfStatement stmt, C context);

	C visit(ASTIfStatement.ElseIf stmt, C context);
	
	C visit(ASTIfStatement.Else stmt, C context);
	
	C visit(ASTForeachStatement expr, C context);
	
	C visit(ASTLoopCondition expr, C context);
	
	C visit(ASTWhileStatement expr, C context);
	

	C visit(ASTAssignStatement expr, C context);
	
}
