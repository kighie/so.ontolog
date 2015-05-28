// Generated from Ontolog.g4 by ANTLR 4.4
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
	 * Enter a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void enterExponential(@NotNull OntologParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#exponential}.
	 * @param ctx the parse tree
	 */
	void exitExponential(@NotNull OntologParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(@NotNull OntologParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(@NotNull OntologParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(@NotNull OntologParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(@NotNull OntologParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull OntologParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void enterBlockContents(@NotNull OntologParser.BlockContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#blockContents}.
	 * @param ctx the parse tree
	 */
	void exitBlockContents(@NotNull OntologParser.BlockContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull OntologParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull OntologParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull OntologParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull OntologParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull OntologParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull OntologParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(@NotNull OntologParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(@NotNull OntologParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(@NotNull OntologParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(@NotNull OntologParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull OntologParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull OntologParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void enterIterableTerm(@NotNull OntologParser.IterableTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#iterableTerm}.
	 * @param ctx the parse tree
	 */
	void exitIterableTerm(@NotNull OntologParser.IterableTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExp(@NotNull OntologParser.MethodCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#methodCallExp}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExp(@NotNull OntologParser.MethodCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ontologScript}.
	 * @param ctx the parse tree
	 */
	void enterOntologScript(@NotNull OntologParser.OntologScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ontologScript}.
	 * @param ctx the parse tree
	 */
	void exitOntologScript(@NotNull OntologParser.OntologScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void enterFormulaTerm(@NotNull OntologParser.FormulaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#formulaTerm}.
	 * @param ctx the parse tree
	 */
	void exitFormulaTerm(@NotNull OntologParser.FormulaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(@NotNull OntologParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#literalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(@NotNull OntologParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull OntologParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull OntologParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull OntologParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull OntologParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void enterLoopCondition(@NotNull OntologParser.LoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#loopCondition}.
	 * @param ctx the parse tree
	 */
	void exitLoopCondition(@NotNull OntologParser.LoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(@NotNull OntologParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(@NotNull OntologParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull OntologParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull OntologParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ontologExpression}.
	 * @param ctx the parse tree
	 */
	void enterOntologExpression(@NotNull OntologParser.OntologExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ontologExpression}.
	 * @param ctx the parse tree
	 */
	void exitOntologExpression(@NotNull OntologParser.OntologExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull OntologParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull OntologParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExp(@NotNull OntologParser.FuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#funcCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExp(@NotNull OntologParser.FuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull OntologParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull OntologParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(@NotNull OntologParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(@NotNull OntologParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(@NotNull OntologParser.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#operatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(@NotNull OntologParser.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#pathExpr}.
	 * @param ctx the parse tree
	 */
	void enterPathExpr(@NotNull OntologParser.PathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#pathExpr}.
	 * @param ctx the parse tree
	 */
	void exitPathExpr(@NotNull OntologParser.PathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamDecl(@NotNull OntologParser.ParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#paramDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamDecl(@NotNull OntologParser.ParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(@NotNull OntologParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(@NotNull OntologParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(@NotNull OntologParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(@NotNull OntologParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull OntologParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull OntologParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OntologParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull OntologParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull OntologParser.TernaryExpressionContext ctx);
}