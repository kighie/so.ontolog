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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OntologParser extends so.ontolog.formula.antlr.AbstractOntologHandlerParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		END_OF_STMT=39, NUMBER=40, STRING_LITERAL=41, NULL=42, BOOLEAN=43, IDENT=44, 
		WS=45, COMMENT=46, LINE_COMMENT=47;
	public static final int
		RULE_ontologExpression = 0, RULE_ontologScript = 1, RULE_blockContents = 2, 
		RULE_importStatement = 3, RULE_methodCallStatement = 4, RULE_functionCallStatement = 5, 
		RULE_returnStatement = 6, RULE_ifStatement = 7, RULE_foreachStatement = 8, 
		RULE_loopCondition = 9, RULE_whileStatement = 10, RULE_paramDecl = 11, 
		RULE_variableDecl = 12, RULE_expression = 13, RULE_funcCallExp = 14, RULE_methodCallExp = 15, 
		RULE_arguments = 16, RULE_literalTerm = 17, RULE_pathExpr = 18, RULE_typeExpr = 19, 
		RULE_qualifiedName = 20, RULE_array = 21, RULE_iterableTerm = 22, RULE_formulaTerm = 23, 
		RULE_unary = 24, RULE_percent = 25, RULE_exponential = 26, RULE_multiplicative = 27, 
		RULE_additiveExpression = 28, RULE_comparison = 29, RULE_notExpression = 30, 
		RULE_logicalExpression = 31, RULE_ternaryExpression = 32, RULE_operatorExpression = 33;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"foreachStatement", "loopCondition", "whileStatement", "paramDecl", "variableDecl", 
		"expression", "funcCallExp", "methodCallExp", "arguments", "literalTerm", 
		"pathExpr", "typeExpr", "qualifiedName", "array", "iterableTerm", "formulaTerm", 
		"unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"comparison", "notExpression", "logicalExpression", "ternaryExpression", 
		"operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'foreach'", "'in'", "'while'", "'param'", 
		"'as'", "'.'", "','", "'/'", "':'", "'-'", "'%'", "'^'", "'*'", "'+'", 
		"'=='", "'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", "'<'", "'<='", 
		"'and'", "'or'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
		"IDENT", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Ontolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OntologParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OntologExpressionContext extends ParserRuleContext {
		public CompilationUnit result;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public OntologExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterOntologExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitOntologExpression(this);
		}
	}

	public final OntologExpressionContext ontologExpression() throws RecognitionException {
		OntologExpressionContext _localctx = new OntologExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ontologExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((OntologExpressionContext)_localctx).result =  createModule(EXPR_MODULE); 
			setState(77);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(69);
				match(T__0);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(70);
					paramDecl(_localctx.result);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__1);
				}
			}

			setState(79);
			match(T__2);
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(80);
				match(T__3);
				setState(81);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(82);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(85);
				((OntologExpressionContext)_localctx).expression = expression();
				 _localctx.result.append(createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result)) ; 
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OntologScriptContext extends ParserRuleContext {
		public CompilationUnit result;
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OntologParser.EOF, 0); }
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
		}
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public OntologScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ontologScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterOntologScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitOntologScript(this);
		}
	}

	public final OntologScriptContext ontologScript() throws RecognitionException {
		OntologScriptContext _localctx = new OntologScriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ontologScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((OntologScriptContext)_localctx).result =  createModule(SCRIPT_MODULE); 
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(91);
				importStatement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(97);
				paramDecl(_localctx.result);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			blockContents(_localctx.result);
			setState(104);
			match(EOF);
			 endScope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContentsContext extends ParserRuleContext {
		public ASTBlock stmtHolder;
		public VariableDeclContext variableDecl;
		public MethodCallStatementContext methodCallStatement;
		public FunctionCallStatementContext functionCallStatement;
		public IfStatementContext ifStatement;
		public ForeachStatementContext foreachStatement;
		public WhileStatementContext whileStatement;
		public ReturnStatementContext returnStatement;
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<MethodCallStatementContext> methodCallStatement() {
			return getRuleContexts(MethodCallStatementContext.class);
		}
		public MethodCallStatementContext methodCallStatement(int i) {
			return getRuleContext(MethodCallStatementContext.class,i);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<ForeachStatementContext> foreachStatement() {
			return getRuleContexts(ForeachStatementContext.class);
		}
		public ForeachStatementContext foreachStatement(int i) {
			return getRuleContext(ForeachStatementContext.class,i);
		}
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContentsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockContentsContext(ParserRuleContext parent, int invokingState, ASTBlock stmtHolder) {
			super(parent, invokingState);
			this.stmtHolder = stmtHolder;
		}
		@Override public int getRuleIndex() { return RULE_blockContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterBlockContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitBlockContents(this);
		}
	}

	public final BlockContentsContext blockContents(ASTBlock stmtHolder) throws RecognitionException {
		BlockContentsContext _localctx = new BlockContentsContext(_ctx, getState(), stmtHolder);
		enterRule(_localctx, 4, RULE_blockContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << IDENT))) != 0)) {
				{
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(107);
					((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(110);
					((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(113);
					((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(116);
					((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				case 5:
					{
					setState(119);
					((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.result); 
					}
					break;
				case 6:
					{
					setState(122);
					((BlockContentsContext)_localctx).whileStatement = whileStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).whileStatement.result); 
					}
					break;
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(130);
				((BlockContentsContext)_localctx).returnStatement = returnStatement();
				 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).returnStatement.result); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName;
		public PathExprContext pathExpr;
		public Token IDENT;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public PathExprContext pathExpr() {
			return getRuleContext(PathExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitImportStatement(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(135);
				match(T__5);
				setState(136);
				((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(137);
				match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__6:
				{
				{
				setState(140);
				match(T__6);
				setState(141);
				((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(143);
				((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(146);
				match(END_OF_STMT);
				 importModule(((ImportStatementContext)_localctx).pathExpr.path, alias); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallStatementContext extends ParserRuleContext {
		public ASTStatement result;
		public MethodCallExpContext methodCallExp;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitMethodCallStatement(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(153);
			match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public ASTStatement result;
		public FuncCallExpContext funcCallExp;
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(157);
			match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ASTStatement result;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(159);
				match(T__7);
				setState(160);
				((ReturnStatementContext)_localctx).expression = expression();
				setState(161);
				match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(164);
				match(T__7);
				setState(165);
				match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(null); 
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ASTIfStatement result;
		public LogicalExpressionContext logicalExpression;
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<BlockContentsContext> blockContents() {
			return getRuleContexts(BlockContentsContext.class);
		}
		public BlockContentsContext blockContents(int i) {
			return getRuleContext(BlockContentsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			 beginScope(); 
			setState(171);
			match(T__3);
			setState(172);
			((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(173);
			match(T__4);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(175);
			match(T__9);
			setState(176);
			blockContents(_localctx.result);
			setState(177);
			match(T__10);
				endScope(); 
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(T__11);
					setState(180);
					match(T__8);
					 beginScope(); 
					setState(182);
					match(T__3);
					setState(183);
					((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(184);
					match(T__4);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(186);
					match(T__9);
					setState(187);
					blockContents(elseIfStmt);
					setState(188);
					match(T__10);
						endScope(); 
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(204);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(196);
				match(T__11);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(199);
				match(T__9);
				setState(200);
				blockContents(elseStmt);
				setState(201);
				match(T__10);
					endScope(); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public ASTBlock result;
		public LoopConditionContext loopCondition;
		public LoopConditionContext loopCondition() {
			return getRuleContext(LoopConditionContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__12);
				beginScope(); 
			setState(208);
			match(T__3);
			setState(209);
			((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(210);
			match(T__4);
			 	((ForeachStatementContext)_localctx).result =  loopStatement(FOREACH, ((ForeachStatementContext)_localctx).loopCondition.result);  
			setState(212);
			match(T__9);
			setState(213);
			blockContents(_localctx.result);
			setState(214);
			match(T__10);
			setState(216);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(215);
				match(END_OF_STMT);
				}
			}

				endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopConditionContext extends ParserRuleContext {
		public ASTExpr result;
		public TypeExprContext typeExpr;
		public Token IDENT;
		public IterableTermContext iterableTerm;
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public IterableTermContext iterableTerm() {
			return getRuleContext(IterableTermContext.class,0);
		}
		public LoopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterLoopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitLoopCondition(this);
		}
	}

	public final LoopConditionContext loopCondition() throws RecognitionException {
		LoopConditionContext _localctx = new LoopConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((LoopConditionContext)_localctx).typeExpr = typeExpr();
			setState(221);
			((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
						ASTDeclaration varDecl = variableDecl(VAR_DECL, ((LoopConditionContext)_localctx).typeExpr.result, (((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null),null );
					
			setState(223);
			match(T__13);
			setState(224);
			((LoopConditionContext)_localctx).iterableTerm = iterableTerm();
				
						((LoopConditionContext)_localctx).result =  loopCondition(varDecl, ((LoopConditionContext)_localctx).iterableTerm.result);
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ASTBlock result;
		public LogicalExpressionContext logicalExpression;
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__14);
			 beginScope(); 
			setState(229);
			match(T__3);
			setState(230);
			((WhileStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(231);
			match(T__4);
			 	((WhileStatementContext)_localctx).result =  loopStatement(WHILE, ((WhileStatementContext)_localctx).logicalExpression.result);  
			setState(233);
			match(T__9);
			setState(234);
			blockContents(_localctx.result);
			setState(235);
			match(T__10);
			setState(237);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(236);
				match(END_OF_STMT);
				}
			}

				endScope(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamDeclContext extends ParserRuleContext {
		public CompilationUnit module;
		public QualifiedNameContext type;
		public Token name;
		public Token IDENT;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public ParamDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamDeclContext(ParserRuleContext parent, int invokingState, CompilationUnit module) {
			super(parent, invokingState);
			this.module = module;
		}
		@Override public int getRuleIndex() { return RULE_paramDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitParamDecl(this);
		}
	}

	public final ParamDeclContext paramDecl(CompilationUnit module) throws RecognitionException {
		ParamDeclContext _localctx = new ParamDeclContext(_ctx, getState(), module);
		enterRule(_localctx, 22, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__15);
			 String alias = null; 
			setState(243);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(244);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(248);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(245);
				match(T__16);
				setState(246);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(251);
			match(END_OF_STMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public ASTStatement result;
		public TypeExprContext typeExpr;
		public Token IDENT;
		public ExpressionContext expression;
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ASTExpr valueExpr = null; 
			setState(254);
			((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(255);
			((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(260);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(256);
				match(T__2);
				setState(257);
				((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(262);
			match(END_OF_STMT);
				((VariableDeclContext)_localctx).result =  asStatement(variableDecl(VAR_DECL, ((VariableDeclContext)_localctx).typeExpr.result, (((VariableDeclContext)_localctx).IDENT!=null?((VariableDeclContext)_localctx).IDENT.getText():null),valueExpr )); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public OperatorExpressionContext operatorExpression;
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(265);
			((ExpressionContext)_localctx).operatorExpression = operatorExpression();
			 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).operatorExpression.result ; 
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallExpContext extends ParserRuleContext {
		public ASTExpr result;
		public Token IDENT;
		public ArgumentsContext arguments;
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitFuncCallExp(this);
		}
	}

	public final FuncCallExpContext funcCallExp() throws RecognitionException {
		FuncCallExpContext _localctx = new FuncCallExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCallExp);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(268);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(269);
				match(T__3);
				setState(270);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(272);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(273);
				match(T__3);
				setState(274);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(275);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), ((FuncCallExpContext)_localctx).arguments.argList) ;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallExpContext extends ParserRuleContext {
		public ASTExpr result;
		public QualifiedNameContext qualifiedName;
		public Token IDENT;
		public ArgumentsContext arguments;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterMethodCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitMethodCallExp(this);
		}
	}

	public final MethodCallExpContext methodCallExp() throws RecognitionException {
		MethodCallExpContext _localctx = new MethodCallExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(280);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(281);
				match(T__17);
				setState(282);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(283);
				match(T__3);
				setState(284);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(287);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(288);
				match(T__17);
				setState(289);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(290);
				match(T__3);
				setState(291);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(292);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), ((MethodCallExpContext)_localctx).arguments.argList) ; 
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ASTExpr> argList;
		public ExpressionContext arg2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).argList =  new LinkedList<ASTExpr>(); 
			{
			setState(298);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(301);
				match(T__18);
				setState(302);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTermContext extends ParserRuleContext {
		public ASTExpr result;
		public Token BOOLEAN;
		public Token STRING_LITERAL;
		public Token NUMBER;
		public TerminalNode BOOLEAN() { return getToken(OntologParser.BOOLEAN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(OntologParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(OntologParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(OntologParser.NULL, 0); }
		public LiteralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitLiteralTerm(this);
		}
	}

	public final LiteralTermContext literalTerm() throws RecognitionException {
		LiteralTermContext _localctx = new LiteralTermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literalTerm);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(NULL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NULL, null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathExprContext extends ParserRuleContext {
		public String path;
		public Token IDENT;
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public PathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterPathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitPathExpr(this);
		}
	}

	public final PathExprContext pathExpr() throws RecognitionException {
		PathExprContext _localctx = new PathExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(321);
			((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__19) {
				{
				setState(329);
				switch (_input.LA(1)) {
				case T__17:
					{
					{
					setState(323);
					match(T__17);
					setState(324);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__19:
					{
					{
					setState(326);
					match(T__19);
					setState(327);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((PathExprContext)_localctx).path =  builder.toString(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeExprContext extends ParserRuleContext {
		public TypeSpec result;
		public Token IDENT;
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitTypeExpr(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(337);
			((TypeExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(339);
				match(T__17);
				setState(340);
				((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(347);
				match(T__0);
				setState(348);
				match(T__1);
				 isArray = true; 
				}
			}

			 ((TypeExprContext)_localctx).result =  (isArray ? arrayType(builder.toString()) : type(builder.toString()) ); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public QName result;
		public Token IDENT;
		public Token NUMBER;
		public QualifiedNameContext index;
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OntologParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OntologParser.NUMBER, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(368);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						{
						setState(356);
						match(T__17);
						setState(357);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(359);
						match(T__0);
						setState(360);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(361);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(363);
						match(T__0);
						setState(364);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(365);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ASTExpr result;
		public FormulaTermContext formulaTerm;
		public ExpressionContext from;
		public ExpressionContext to;
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(373);
				match(T__0);
				 List<ASTExpr> elements = new LinkedList<ASTExpr>(); 
				{
				setState(375);
				((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(378);
					match(T__18);
					setState(379);
					((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(T__1);
					((ArrayContext)_localctx).result =  array(elements); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(390);
				match(T__0);
				setState(391);
				((ArrayContext)_localctx).from = expression();
				setState(392);
				match(T__20);
				setState(393);
				((ArrayContext)_localctx).to = expression();
				setState(394);
				match(T__1);
				 
									((ArrayContext)_localctx).result =  array(null);
									ASTArrayExpr arrayExpr = (ASTArrayExpr)_localctx.result;
									arrayExpr.setFrom(((ArrayContext)_localctx).from.result);
									arrayExpr.setTo(((ArrayContext)_localctx).to.result);
								
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterableTermContext extends ParserRuleContext {
		public ASTExpr result;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayContext array;
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IterableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterIterableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitIterableTerm(this);
		}
	}

	public final IterableTermContext iterableTerm() throws RecognitionException {
		IterableTermContext _localctx = new IterableTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_iterableTerm);
		try {
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  variable( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  variable( ((IterableTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				((IterableTermContext)_localctx).array = array();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).array.result; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaTermContext extends ParserRuleContext {
		public ASTExpr result;
		public LiteralTermContext literalTerm;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayContext array;
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FormulaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formulaTerm);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).array.result ; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public ASTExpr result;
		public FormulaTermContext formulaTerm;
		public OperatorExpressionContext operatorExpression;
		public FormulaTermContext formulaTerm() {
			return getRuleContext(FormulaTermContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(437);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(435);
				match(T__21);
				 negative = true; 
				}
			}

			setState(447);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(439);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(442);
				match(T__3);
				setState(443);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(444);
				match(T__4);
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).operatorExpression.result;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 
						if(negative){
							((UnaryContext)_localctx).result =  unary(OP_NUM_NEGATION, _localctx.result );
						} 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentContext extends ParserRuleContext {
		public ASTExpr result;
		public UnaryContext unary;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(455);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(453);
				match(T__22);
				((PercentContext)_localctx).result =  unary(OP_PERCENT, _localctx.result); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialContext extends ParserRuleContext {
		public ASTExpr result;
		public PercentContext percent;
		public PercentContext op2;
		public List<PercentContext> percent() {
			return getRuleContexts(PercentContext.class);
		}
		public PercentContext percent(int i) {
			return getRuleContext(PercentContext.class,i);
		}
		public ExponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(459);
				match(T__23);
				setState(460);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeContext extends ParserRuleContext {
		public ASTExpr result;
		public ExponentialContext exponential;
		public ExponentialContext op2;
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
		}
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__24) {
				{
				setState(478);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(470);
					match(T__24);
					setState(471);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__19:
					{
					setState(474);
					match(T__19);
					setState(475);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public MultiplicativeContext multiplicative;
		public MultiplicativeContext op2;
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__25) {
				{
				setState(493);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(485);
					match(T__25);
					setState(486);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__21:
					{
					setState(489);
					match(T__21);
					setState(490);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ASTExpr result;
		public AdditiveExpressionContext additiveExpression;
		public AdditiveExpressionContext op2;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				setState(537);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(500);
					match(T__26);
					setState(501);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(504);
					match(T__27);
					setState(505);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(508);
					match(T__28);
					setState(509);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(512);
					match(T__29);
					setState(513);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(516);
					match(T__27);
					setState(517);
					match(T__30);
					setState(518);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(521);
					match(T__31);
					setState(522);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(525);
					match(T__32);
					setState(526);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(529);
					match(T__33);
					setState(530);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(533);
					match(T__34);
					setState(534);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public ComparisonContext comparison;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__21:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(542);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__30:
				{
				setState(545);
				match(T__30);
				setState(546);
				((NotExpressionContext)_localctx).comparison = comparison();
				((NotExpressionContext)_localctx).result =  unary(OP_NOT, ((NotExpressionContext)_localctx).comparison.result); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public NotExpressionContext notExpression;
		public OperatorExpressionContext op2;
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(561);
					switch (_input.LA(1)) {
					case T__35:
						{
						setState(553);
						match(T__35);
						setState(554);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__36:
						{
						setState(557);
						match(T__36);
						setState(558);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public LogicalExpressionContext op1;
		public OperatorExpressionContext op2;
		public OperatorExpressionContext op3;
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitTernaryExpression(this);
		}
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(567);
			match(T__37);
			{
			setState(568);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(569);
			match(T__20);
			{
			setState(570);
			((TernaryExpressionContext)_localctx).op3 = operatorExpression();
			}
			((TernaryExpressionContext)_localctx).result =  ternary(OP_TERNARY, ((TernaryExpressionContext)_localctx).op1.result, ((TernaryExpressionContext)_localctx).op2.result, ((TernaryExpressionContext)_localctx).op3.result); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public LogicalExpressionContext logicalExpression;
		public TernaryExpressionContext ternaryExpression;
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitOperatorExpression(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(573);
				((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(576);
				((OperatorExpressionContext)_localctx).ternaryExpression = ternaryExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).ternaryExpression.result;  
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0248\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\7\3_\n\3\f\3\16\3b\13"+
		"\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16"+
		"\4\u0083\13\4\3\4\3\4\3\4\5\4\u0088\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0098\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00c2\n\t\f\t\16\t\u00c5\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cf"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00db\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f0\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fb\n\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0107\n\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u0119\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u012a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0134\n\22\f\22\16\22\u0137\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0141\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u014c\n\24\f\24\16\24\u014f\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0159\n\25\f\25\16\25\u015c\13\25\3\25\3\25\3\25"+
		"\5\25\u0161\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0173\n\26\f\26\16\26\u0176\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0181\n\27\f\27\16\27\u0184"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0190\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u01a0\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01b3\n\31\3\32\3\32\3\32\5\32"+
		"\u01b8\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c2\n\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\5\33\u01ca\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u01d2\n\34\f\34\16\34\u01d5\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u01e1\n\35\f\35\16\35\u01e4\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01f0\n\36\f\36\16"+
		"\36\u01f3\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u021c\n\37\f\37\16\37\u021f\13\37\3 \3 \3 \3 \3 \3 \3 \5 \u0228"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0234\n!\f!\16!\u0237\13!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0246\n#\3#\2\2$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\u0266\2F\3"+
		"\2\2\2\4\\\3\2\2\2\6\u0081\3\2\2\2\b\u0097\3\2\2\2\n\u0099\3\2\2\2\f\u009d"+
		"\3\2\2\2\16\u00a9\3\2\2\2\20\u00ab\3\2\2\2\22\u00d0\3\2\2\2\24\u00de\3"+
		"\2\2\2\26\u00e5\3\2\2\2\30\u00f3\3\2\2\2\32\u00ff\3\2\2\2\34\u010b\3\2"+
		"\2\2\36\u0118\3\2\2\2 \u0129\3\2\2\2\"\u012b\3\2\2\2$\u0140\3\2\2\2&\u0142"+
		"\3\2\2\2(\u0152\3\2\2\2*\u0164\3\2\2\2,\u018f\3\2\2\2.\u019f\3\2\2\2\60"+
		"\u01b2\3\2\2\2\62\u01b4\3\2\2\2\64\u01c5\3\2\2\2\66\u01cb\3\2\2\28\u01d6"+
		"\3\2\2\2:\u01e5\3\2\2\2<\u01f4\3\2\2\2>\u0227\3\2\2\2@\u0229\3\2\2\2B"+
		"\u0238\3\2\2\2D\u0245\3\2\2\2FO\b\2\1\2GK\7\3\2\2HJ\5\30\r\2IH\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NP\7\4\2\2OG\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2QZ\7\5\2\2RS\7\6\2\2ST\5\34\17\2TU\7\7\2\2UV\b\2\1"+
		"\2V[\3\2\2\2WX\5\34\17\2XY\b\2\1\2Y[\3\2\2\2ZR\3\2\2\2ZW\3\2\2\2[\3\3"+
		"\2\2\2\\`\b\3\1\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af"+
		"\3\2\2\2b`\3\2\2\2ce\5\30\r\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gi\3\2\2\2hf\3\2\2\2ij\5\6\4\2jk\7\2\2\3kl\b\3\1\2l\5\3\2\2\2mn\5\32\16"+
		"\2no\b\4\1\2o\u0080\3\2\2\2pq\5\n\6\2qr\b\4\1\2r\u0080\3\2\2\2st\5\f\7"+
		"\2tu\b\4\1\2u\u0080\3\2\2\2vw\5\20\t\2wx\b\4\1\2x\u0080\3\2\2\2yz\5\22"+
		"\n\2z{\b\4\1\2{\u0080\3\2\2\2|}\5\26\f\2}~\b\4\1\2~\u0080\3\2\2\2\177"+
		"m\3\2\2\2\177p\3\2\2\2\177s\3\2\2\2\177v\3\2\2\2\177y\3\2\2\2\177|\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\16\b\2\u0085\u0086\b\4\1\2"+
		"\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3"+
		"\2\2\2\u0089\u008a\7\b\2\2\u008a\u008b\5*\26\2\u008b\u008c\7)\2\2\u008c"+
		"\u008d\b\5\1\2\u008d\u0098\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u0090\5&"+
		"\24\2\u0090\u0091\b\5\1\2\u0091\u0092\7.\2\2\u0092\u0093\b\5\1\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7)\2\2\u0095\u0096\b\5\1\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0089\3\2\2\2\u0097\u008e\3\2\2\2\u0098\t\3\2\2\2\u0099\u009a"+
		"\5 \21\2\u009a\u009b\b\6\1\2\u009b\u009c\7)\2\2\u009c\13\3\2\2\2\u009d"+
		"\u009e\5\36\20\2\u009e\u009f\b\7\1\2\u009f\u00a0\7)\2\2\u00a0\r\3\2\2"+
		"\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7)\2\2\u00a4"+
		"\u00a5\b\b\1\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\7)"+
		"\2\2\u00a8\u00aa\b\b\1\2\u00a9\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa"+
		"\17\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\b\t\1\2\u00ad\u00ae\7\6\2"+
		"\2\u00ae\u00af\5@!\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\b\t\1\2\u00b1\u00b2"+
		"\7\f\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\7\r\2\2\u00b4\u00c3\b\t\1\2\u00b5"+
		"\u00b6\7\16\2\2\u00b6\u00b7\7\13\2\2\u00b7\u00b8\b\t\1\2\u00b8\u00b9\7"+
		"\6\2\2\u00b9\u00ba\5@!\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\b\t\1\2\u00bc"+
		"\u00bd\7\f\2\2\u00bd\u00be\5\6\4\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\b\t"+
		"\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00ce\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\b\t\1\2\u00c8\u00c9\b\t\1\2\u00c9"+
		"\u00ca\7\f\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\b\t"+
		"\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\21\3\2\2\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\b\n\1\2\u00d2\u00d3\7\6\2"+
		"\2\u00d3\u00d4\5\24\13\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\b\n\1\2\u00d6"+
		"\u00d7\7\f\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00da\7\r\2\2\u00d9\u00db\7)"+
		"\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\b\n\1\2\u00dd\23\3\2\2\2\u00de\u00df\5(\25\2\u00df\u00e0\7.\2\2"+
		"\u00e0\u00e1\b\13\1\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4"+
		"\b\13\1\2\u00e4\25\3\2\2\2\u00e5\u00e6\7\21\2\2\u00e6\u00e7\b\f\1\2\u00e7"+
		"\u00e8\7\6\2\2\u00e8\u00e9\5@!\2\u00e9\u00ea\7\7\2\2\u00ea\u00eb\b\f\1"+
		"\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\5\6\4\2\u00ed\u00ef\7\r\2\2\u00ee\u00f0"+
		"\7)\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b\f\1\2\u00f2\27\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\b\r\1"+
		"\2\u00f5\u00f6\5*\26\2\u00f6\u00fa\7.\2\2\u00f7\u00f8\7\23\2\2\u00f8\u00f9"+
		"\7.\2\2\u00f9\u00fb\b\r\1\2\u00fa\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\b\r\1\2\u00fd\u00fe\7)\2\2\u00fe\31\3\2\2\2"+
		"\u00ff\u0100\b\16\1\2\u0100\u0101\5(\25\2\u0101\u0106\7.\2\2\u0102\u0103"+
		"\7\5\2\2\u0103\u0104\5\34\17\2\u0104\u0105\b\16\1\2\u0105\u0107\3\2\2"+
		"\2\u0106\u0102\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\7)\2\2\u0109\u010a\b\16\1\2\u010a\33\3\2\2\2\u010b\u010c\5D#\2\u010c"+
		"\u010d\b\17\1\2\u010d\35\3\2\2\2\u010e\u010f\7.\2\2\u010f\u0110\7\6\2"+
		"\2\u0110\u0111\7\7\2\2\u0111\u0119\b\20\1\2\u0112\u0113\7.\2\2\u0113\u0114"+
		"\7\6\2\2\u0114\u0115\5\"\22\2\u0115\u0116\7\7\2\2\u0116\u0117\b\20\1\2"+
		"\u0117\u0119\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0112\3\2\2\2\u0119\37"+
		"\3\2\2\2\u011a\u011b\5*\26\2\u011b\u011c\7\24\2\2\u011c\u011d\7.\2\2\u011d"+
		"\u011e\7\6\2\2\u011e\u011f\7\7\2\2\u011f\u0120\b\21\1\2\u0120\u012a\3"+
		"\2\2\2\u0121\u0122\5*\26\2\u0122\u0123\7\24\2\2\u0123\u0124\7.\2\2\u0124"+
		"\u0125\7\6\2\2\u0125\u0126\5\"\22\2\u0126\u0127\7\7\2\2\u0127\u0128\b"+
		"\21\1\2\u0128\u012a\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u0121\3\2\2\2\u012a"+
		"!\3\2\2\2\u012b\u012c\b\22\1\2\u012c\u012d\5\34\17\2\u012d\u012e\b\22"+
		"\1\2\u012e\u0135\3\2\2\2\u012f\u0130\7\25\2\2\u0130\u0131\5\34\17\2\u0131"+
		"\u0132\b\22\1\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136#\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0138\u0139\7-\2\2\u0139\u0141\b\23\1\2\u013a\u013b\7+\2\2\u013b"+
		"\u0141\b\23\1\2\u013c\u013d\7*\2\2\u013d\u0141\b\23\1\2\u013e\u013f\7"+
		",\2\2\u013f\u0141\b\23\1\2\u0140\u0138\3\2\2\2\u0140\u013a\3\2\2\2\u0140"+
		"\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0141%\3\2\2\2\u0142\u0143\b\24\1\2"+
		"\u0143\u0144\7.\2\2\u0144\u014d\b\24\1\2\u0145\u0146\7\24\2\2\u0146\u0147"+
		"\7.\2\2\u0147\u014c\b\24\1\2\u0148\u0149\7\26\2\2\u0149\u014a\7.\2\2\u014a"+
		"\u014c\b\24\1\2\u014b\u0145\3\2\2\2\u014b\u0148\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\b\24\1\2\u0151\'\3\2\2\2\u0152\u0153\b\25\1"+
		"\2\u0153\u0154\7.\2\2\u0154\u015a\b\25\1\2\u0155\u0156\7\24\2\2\u0156"+
		"\u0157\7.\2\2\u0157\u0159\b\25\1\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0160\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7\3\2\2\u015e\u015f\7\4\2\2\u015f\u0161\b\25"+
		"\1\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b\25\1\2\u0163)\3\2\2\2\u0164\u0165\7.\2\2\u0165\u0174\b\26\1\2"+
		"\u0166\u0167\7\24\2\2\u0167\u0168\7.\2\2\u0168\u0173\b\26\1\2\u0169\u016a"+
		"\7\3\2\2\u016a\u016b\7*\2\2\u016b\u016c\7\4\2\2\u016c\u0173\b\26\1\2\u016d"+
		"\u016e\7\3\2\2\u016e\u016f\5*\26\2\u016f\u0170\7\4\2\2\u0170\u0171\b\26"+
		"\1\2\u0171\u0173\3\2\2\2\u0172\u0166\3\2\2\2\u0172\u0169\3\2\2\2\u0172"+
		"\u016d\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175+\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7\3\2\2\u0178\u0179"+
		"\b\27\1\2\u0179\u017a\5\60\31\2\u017a\u017b\b\27\1\2\u017b\u0182\3\2\2"+
		"\2\u017c\u017d\7\25\2\2\u017d\u017e\5\60\31\2\u017e\u017f\b\27\1\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017c\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\7\4\2\2\u0186\u0187\b\27\1\2\u0187\u0190\3\2\2\2\u0188\u0189\7"+
		"\3\2\2\u0189\u018a\5\34\17\2\u018a\u018b\7\27\2\2\u018b\u018c\5\34\17"+
		"\2\u018c\u018d\7\4\2\2\u018d\u018e\b\27\1\2\u018e\u0190\3\2\2\2\u018f"+
		"\u0177\3\2\2\2\u018f\u0188\3\2\2\2\u0190-\3\2\2\2\u0191\u0192\7.\2\2\u0192"+
		"\u01a0\b\30\1\2\u0193\u0194\5*\26\2\u0194\u0195\b\30\1\2\u0195\u01a0\3"+
		"\2\2\2\u0196\u0197\5\36\20\2\u0197\u0198\b\30\1\2\u0198\u01a0\3\2\2\2"+
		"\u0199\u019a\5 \21\2\u019a\u019b\b\30\1\2\u019b\u01a0\3\2\2\2\u019c\u019d"+
		"\5,\27\2\u019d\u019e\b\30\1\2\u019e\u01a0\3\2\2\2\u019f\u0191\3\2\2\2"+
		"\u019f\u0193\3\2\2\2\u019f\u0196\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019c"+
		"\3\2\2\2\u01a0/\3\2\2\2\u01a1\u01a2\5$\23\2\u01a2\u01a3\b\31\1\2\u01a3"+
		"\u01b3\3\2\2\2\u01a4\u01a5\7.\2\2\u01a5\u01b3\b\31\1\2\u01a6\u01a7\5*"+
		"\26\2\u01a7\u01a8\b\31\1\2\u01a8\u01b3\3\2\2\2\u01a9\u01aa\5\36\20\2\u01aa"+
		"\u01ab\b\31\1\2\u01ab\u01b3\3\2\2\2\u01ac\u01ad\5 \21\2\u01ad\u01ae\b"+
		"\31\1\2\u01ae\u01b3\3\2\2\2\u01af\u01b0\5,\27\2\u01b0\u01b1\b\31\1\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01a1\3\2\2\2\u01b2\u01a4\3\2\2\2\u01b2\u01a6\3\2"+
		"\2\2\u01b2\u01a9\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01af\3\2\2\2\u01b3"+
		"\61\3\2\2\2\u01b4\u01b7\b\32\1\2\u01b5\u01b6\7\30\2\2\u01b6\u01b8\b\32"+
		"\1\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01c1\3\2\2\2\u01b9"+
		"\u01ba\5\60\31\2\u01ba\u01bb\b\32\1\2\u01bb\u01c2\3\2\2\2\u01bc\u01bd"+
		"\7\6\2\2\u01bd\u01be\5D#\2\u01be\u01bf\7\7\2\2\u01bf\u01c0\b\32\1\2\u01c0"+
		"\u01c2\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c4\b\32\1\2\u01c4\63\3\2\2\2\u01c5\u01c6\5\62\32\2\u01c6"+
		"\u01c9\b\33\1\2\u01c7\u01c8\7\31\2\2\u01c8\u01ca\b\33\1\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\65\3\2\2\2\u01cb\u01cc\5\64\33\2\u01cc"+
		"\u01d3\b\34\1\2\u01cd\u01ce\7\32\2\2\u01ce\u01cf\5\64\33\2\u01cf\u01d0"+
		"\b\34\1\2\u01d0\u01d2\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2\u01d5\3\2\2\2"+
		"\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\67\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d6\u01d7\5\66\34\2\u01d7\u01e2\b\35\1\2\u01d8\u01d9\7\33\2"+
		"\2\u01d9\u01da\5\66\34\2\u01da\u01db\b\35\1\2\u01db\u01e1\3\2\2\2\u01dc"+
		"\u01dd\7\26\2\2\u01dd\u01de\5\66\34\2\u01de\u01df\b\35\1\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01d8\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e39\3\2\2\2\u01e4\u01e2\3\2\2\2"+
		"\u01e5\u01e6\58\35\2\u01e6\u01f1\b\36\1\2\u01e7\u01e8\7\34\2\2\u01e8\u01e9"+
		"\58\35\2\u01e9\u01ea\b\36\1\2\u01ea\u01f0\3\2\2\2\u01eb\u01ec\7\30\2\2"+
		"\u01ec\u01ed\58\35\2\u01ed\u01ee\b\36\1\2\u01ee\u01f0\3\2\2\2\u01ef\u01e7"+
		"\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2;\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\5:\36\2"+
		"\u01f5\u021d\b\37\1\2\u01f6\u01f7\7\35\2\2\u01f7\u01f8\5:\36\2\u01f8\u01f9"+
		"\b\37\1\2\u01f9\u021c\3\2\2\2\u01fa\u01fb\7\36\2\2\u01fb\u01fc\5:\36\2"+
		"\u01fc\u01fd\b\37\1\2\u01fd\u021c\3\2\2\2\u01fe\u01ff\7\37\2\2\u01ff\u0200"+
		"\5:\36\2\u0200\u0201\b\37\1\2\u0201\u021c\3\2\2\2\u0202\u0203\7 \2\2\u0203"+
		"\u0204\5:\36\2\u0204\u0205\b\37\1\2\u0205\u021c\3\2\2\2\u0206\u0207\7"+
		"\36\2\2\u0207\u0208\7!\2\2\u0208\u0209\5:\36\2\u0209\u020a\b\37\1\2\u020a"+
		"\u021c\3\2\2\2\u020b\u020c\7\"\2\2\u020c\u020d\5:\36\2\u020d\u020e\b\37"+
		"\1\2\u020e\u021c\3\2\2\2\u020f\u0210\7#\2\2\u0210\u0211\5:\36\2\u0211"+
		"\u0212\b\37\1\2\u0212\u021c\3\2\2\2\u0213\u0214\7$\2\2\u0214\u0215\5:"+
		"\36\2\u0215\u0216\b\37\1\2\u0216\u021c\3\2\2\2\u0217\u0218\7%\2\2\u0218"+
		"\u0219\5:\36\2\u0219\u021a\b\37\1\2\u021a\u021c\3\2\2\2\u021b\u01f6\3"+
		"\2\2\2\u021b\u01fa\3\2\2\2\u021b\u01fe\3\2\2\2\u021b\u0202\3\2\2\2\u021b"+
		"\u0206\3\2\2\2\u021b\u020b\3\2\2\2\u021b\u020f\3\2\2\2\u021b\u0213\3\2"+
		"\2\2\u021b\u0217\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e=\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\5<\37\2"+
		"\u0221\u0222\b \1\2\u0222\u0228\3\2\2\2\u0223\u0224\7!\2\2\u0224\u0225"+
		"\5<\37\2\u0225\u0226\b \1\2\u0226\u0228\3\2\2\2\u0227\u0220\3\2\2\2\u0227"+
		"\u0223\3\2\2\2\u0228?\3\2\2\2\u0229\u022a\5> \2\u022a\u0235\b!\1\2\u022b"+
		"\u022c\7&\2\2\u022c\u022d\5D#\2\u022d\u022e\b!\1\2\u022e\u0234\3\2\2\2"+
		"\u022f\u0230\7\'\2\2\u0230\u0231\5D#\2\u0231\u0232\b!\1\2\u0232\u0234"+
		"\3\2\2\2\u0233\u022b\3\2\2\2\u0233\u022f\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236A\3\2\2\2\u0237\u0235\3\2\2\2"+
		"\u0238\u0239\5@!\2\u0239\u023a\7(\2\2\u023a\u023b\5D#\2\u023b\u023c\7"+
		"\27\2\2\u023c\u023d\5D#\2\u023d\u023e\b\"\1\2\u023eC\3\2\2\2\u023f\u0240"+
		"\5@!\2\u0240\u0241\b#\1\2\u0241\u0246\3\2\2\2\u0242\u0243\5B\"\2\u0243"+
		"\u0244\b#\1\2\u0244\u0246\3\2\2\2\u0245\u023f\3\2\2\2\u0245\u0242\3\2"+
		"\2\2\u0246E\3\2\2\2.KOZ`f\177\u0081\u0087\u0097\u00a9\u00c3\u00ce\u00da"+
		"\u00ef\u00fa\u0106\u0118\u0129\u0135\u0140\u014b\u014d\u015a\u0160\u0172"+
		"\u0174\u0182\u018f\u019f\u01b2\u01b7\u01c1\u01c9\u01d3\u01e0\u01e2\u01ef"+
		"\u01f1\u021b\u021d\u0227\u0233\u0235\u0245";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}