// Generated from Ontolog.g4 by ANTLR 4.4
package so.ontolog.lang.antlr;

	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.lang.runtime.*;
	import so.ontolog.lang.ast.*;
	import so.ontolog.lang.build.*;
	import so.ontolog.lang.util.*;

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
	void enterOntologExpression(@NotNull OntologParser.OntologExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OntologParser#ontologExpression}.
	 * @param ctx the parse tree
	 */
	void exitOntologExpression(@NotNull OntologParser.OntologExpressionContext ctx);
}