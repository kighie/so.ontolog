// Generated from Ontolog.g4 by ANTLR 4.5
package so.ontolog.formula.antlr;

	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.data.type.TypeSpec;
	import so.ontolog.formula.runtime.QName;
	import so.ontolog.formula.ast.*;
	import so.ontolog.formula.ast.util.*;
	import so.ontolog.formula.ast.stmt.ASTIfStatement;
	import so.ontolog.formula.ast.expr.ASTArrayExpr;
	import so.ontolog.formula.build.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OntologParser}.
 */
public interface OntologListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OntologParser#ontologExpression}.
	 * @param ctx the parse tree
	 */
	void enterOntologExpression(OntologParser.OntologExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ontologExpression}.
	 * @param ctx the parse tree
	 */
	void exitOntologExpression(OntologParser.OntologExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ontologScript}.
	 * @param ctx the parse tree
	 */
	void enterOntologScript(OntologParser.OntologScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ontologScript}.
	 * @param ctx the parse tree
	 */
	void exitOntologScript(OntologParser.OntologScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void enterBlockContents(OntologParser.BlockContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void exitBlockContents(OntologParser.BlockContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(OntologParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(OntologParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(OntologParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(OntologParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(OntologParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(OntologParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(OntologParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(OntologParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(OntologParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(OntologParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(OntologParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(OntologParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondition(OntologParser.LoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondition(OntologParser.LoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(OntologParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(OntologParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(OntologParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(OntologParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void enterLeftAssign(OntologParser.LeftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#leftAssign}.
	 * @param ctx the parse tree
	 */
	void exitLeftAssign(OntologParser.LeftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightAssign(OntologParser.RightAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#rightAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightAssign(OntologParser.RightAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(OntologParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(OntologParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(OntologParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(OntologParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(OntologParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(OntologParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void enterArgsDecl(OntologParser.ArgsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#argsDecl}.
	 * @param ctx the parse tree
	 */
	void exitArgsDecl(OntologParser.ArgsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OntologParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OntologParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(OntologParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(OntologParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(OntologParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(OntologParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(OntologParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(OntologParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#chooseExpr}.
	 * @param ctx the parse tree
	 */
	void enterChooseExpr(OntologParser.ChooseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#chooseExpr}.
	 * @param ctx the parse tree
	 */
	void exitChooseExpr(OntologParser.ChooseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#chooseWhenExpr}.
	 * @param ctx the parse tree
	 */
	void enterChooseWhenExpr(OntologParser.ChooseWhenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#chooseWhenExpr}.
	 * @param ctx the parse tree
	 */
	void exitChooseWhenExpr(OntologParser.ChooseWhenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(OntologParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(OntologParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#pathExpr}.
	 * @param ctx the parse tree
	 */
	void enterPathExpr(OntologParser.PathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#pathExpr}.
	 * @param ctx the parse tree
	 */
	void exitPathExpr(OntologParser.PathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(OntologParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(OntologParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(OntologParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(OntologParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(OntologParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(OntologParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void enterMapExpr(OntologParser.MapExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#mapExpr}.
	 * @param ctx the parse tree
	 */
	void exitMapExpr(OntologParser.MapExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(OntologParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(OntologParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(OntologParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(OntologParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(OntologParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(OntologParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(OntologParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(OntologParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(OntologParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(OntologParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(OntologParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(OntologParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(OntologParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(OntologParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(OntologParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(OntologParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(OntologParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(OntologParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(OntologParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(OntologParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(OntologParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(OntologParser.OperatorExpressionContext ctx);
}