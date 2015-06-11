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
		T__38=39, T__39=40, T__40=41, END_OF_STMT=42, NUMBER=43, STRING_LITERAL=44, 
		NULL=45, BOOLEAN=46, IDENT=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_ontologExpression = 0, RULE_ontologScript = 1, RULE_blockContents = 2, 
		RULE_importStatement = 3, RULE_methodCallStatement = 4, RULE_functionCallStatement = 5, 
		RULE_returnStatement = 6, RULE_ifStatement = 7, RULE_foreachStatement = 8, 
		RULE_loopCondition = 9, RULE_whileStatement = 10, RULE_assignStatement = 11, 
		RULE_leftAssign = 12, RULE_rightAssign = 13, RULE_paramDecl = 14, RULE_variableDecl = 15, 
		RULE_functionDecl = 16, RULE_argsDecl = 17, RULE_expression = 18, RULE_funcCallExp = 19, 
		RULE_methodCallExp = 20, RULE_arguments = 21, RULE_chooseExpr = 22, RULE_chooseWhenExpr = 23, 
		RULE_literalTerm = 24, RULE_pathExpr = 25, RULE_typeExpr = 26, RULE_qualifiedName = 27, 
		RULE_array = 28, RULE_mapExpr = 29, RULE_iterableTerm = 30, RULE_formulaTerm = 31, 
		RULE_unary = 32, RULE_percent = 33, RULE_exponential = 34, RULE_multiplicative = 35, 
		RULE_additiveExpression = 36, RULE_comparison = 37, RULE_notExpression = 38, 
		RULE_logicalExpression = 39, RULE_ternaryExpression = 40, RULE_operatorExpression = 41;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"foreachStatement", "loopCondition", "whileStatement", "assignStatement", 
		"leftAssign", "rightAssign", "paramDecl", "variableDecl", "functionDecl", 
		"argsDecl", "expression", "funcCallExp", "methodCallExp", "arguments", 
		"chooseExpr", "chooseWhenExpr", "literalTerm", "pathExpr", "typeExpr", 
		"qualifiedName", "array", "mapExpr", "iterableTerm", "formulaTerm", "unary", 
		"percent", "exponential", "multiplicative", "additiveExpression", "comparison", 
		"notExpression", "logicalExpression", "ternaryExpression", "operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'foreach'", "'in'", "'while'", "'->'", 
		"'param'", "'as'", "'function'", "':'", "','", "'.'", "'case'", "'=='", 
		"'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", "'<'", "'<='", "'/'", 
		"'-'", "'%'", "'^'", "'*'", "'+'", "'and'", "'or'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", 
		"NULL", "BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(93);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(85);
				match(T__0);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(86);
					paramDecl(_localctx.result);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__1);
				}
			}

			setState(95);
			match(T__2);
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(96);
				match(T__3);
				setState(97);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(98);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(101);
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
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(107);
				importStatement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(113);
				paramDecl(_localctx.result);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			blockContents(_localctx.result);
			setState(120);
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
		public AssignStatementContext assignStatement;
		public FunctionDeclContext functionDecl;
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
		public List<AssignStatementContext> assignStatement() {
			return getRuleContexts(AssignStatementContext.class);
		}
		public AssignStatementContext assignStatement(int i) {
			return getRuleContext(AssignStatementContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
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
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__22) | (1L << T__27) | (1L << T__33) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(147);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(123);
					((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(126);
					((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(129);
					((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(132);
					((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				case 5:
					{
					setState(135);
					((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.result); 
					}
					break;
				case 6:
					{
					setState(138);
					((BlockContentsContext)_localctx).whileStatement = whileStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).whileStatement.result); 
					}
					break;
				case 7:
					{
					setState(141);
					((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.result); 
					}
					break;
				case 8:
					{
					setState(144);
					((BlockContentsContext)_localctx).functionDecl = functionDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionDecl.result); 
					}
					break;
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(152);
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
			setState(171);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(157);
				match(T__5);
				setState(158);
				((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(159);
				match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__6:
				{
				{
				setState(162);
				match(T__6);
				setState(163);
				((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(165);
				((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(168);
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
			setState(173);
			((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(175);
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
			setState(177);
			((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(179);
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
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(181);
				match(T__7);
				setState(182);
				((ReturnStatementContext)_localctx).expression = expression();
				setState(183);
				match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(186);
				match(T__7);
				setState(187);
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
			setState(191);
			match(T__8);
			 beginScope(); 
			setState(193);
			match(T__3);
			setState(194);
			((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(195);
			match(T__4);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(197);
			match(T__9);
			setState(198);
			blockContents(_localctx.result);
			setState(199);
			match(T__10);
				endScope(); 
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					match(T__11);
					setState(202);
					match(T__8);
					 beginScope(); 
					setState(204);
					match(T__3);
					setState(205);
					((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(206);
					match(T__4);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(208);
					match(T__9);
					setState(209);
					blockContents(elseIfStmt);
					setState(210);
					match(T__10);
						endScope(); 
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(226);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(218);
				match(T__11);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(221);
				match(T__9);
				setState(222);
				blockContents(elseStmt);
				setState(223);
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
			setState(228);
			match(T__12);
				beginScope(); 
			setState(230);
			match(T__3);
			setState(231);
			((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(232);
			match(T__4);
			 	((ForeachStatementContext)_localctx).result =  loopStatement(FOREACH, ((ForeachStatementContext)_localctx).loopCondition.result);  
			setState(234);
			match(T__9);
			setState(235);
			blockContents(_localctx.result);
			setState(236);
			match(T__10);
			setState(238);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(237);
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
			setState(242);
			((LoopConditionContext)_localctx).typeExpr = typeExpr();
			setState(243);
			((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
						ASTDeclaration varDecl = variableDecl(VAR_DECL, ((LoopConditionContext)_localctx).typeExpr.result, (((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null),null );
					
			setState(245);
			match(T__13);
			setState(246);
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
			setState(249);
			match(T__14);
			 beginScope(); 
			setState(251);
			match(T__3);
			setState(252);
			((WhileStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(253);
			match(T__4);
			 	((WhileStatementContext)_localctx).result =  loopStatement(WHILE, ((WhileStatementContext)_localctx).logicalExpression.result);  
			setState(255);
			match(T__9);
			setState(256);
			blockContents(_localctx.result);
			setState(257);
			match(T__10);
			setState(259);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(258);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public ASTStatement result;
		public LeftAssignContext leftAssign;
		public RightAssignContext rightAssign;
		public LeftAssignContext leftAssign() {
			return getRuleContext(LeftAssignContext.class,0);
		}
		public RightAssignContext rightAssign() {
			return getRuleContext(RightAssignContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitAssignStatement(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(263);
				((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).result =  ((AssignStatementContext)_localctx).leftAssign.result ; 
				}
				break;
			case 2:
				{
				setState(266);
				((AssignStatementContext)_localctx).rightAssign = rightAssign();
				 ((AssignStatementContext)_localctx).result =  ((AssignStatementContext)_localctx).rightAssign.result ; 
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

	public static class LeftAssignContext extends ParserRuleContext {
		public ASTStatement result;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LeftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterLeftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitLeftAssign(this);
		}
	}

	public final LeftAssignContext leftAssign() throws RecognitionException {
		LeftAssignContext _localctx = new LeftAssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ASTExpr settable = null; 
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(272);
				((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(274);
				((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((LeftAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(279);
			match(T__2);
			setState(280);
			((LeftAssignContext)_localctx).expression = expression();
			setState(281);
			match(END_OF_STMT);
			 ((LeftAssignContext)_localctx).result =  assignStatement(LEFT_ASSIGN_STMT, settable, ((LeftAssignContext)_localctx).expression.result); 
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

	public static class RightAssignContext extends ParserRuleContext {
		public ASTStatement result;
		public ExpressionContext expression;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public RightAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterRightAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitRightAssign(this);
		}
	}

	public final RightAssignContext rightAssign() throws RecognitionException {
		RightAssignContext _localctx = new RightAssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rightAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ASTExpr settable = null; 
			setState(285);
			((RightAssignContext)_localctx).expression = expression();
			setState(286);
			match(T__15);
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(287);
				((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(289);
				((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((RightAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(294);
			match(END_OF_STMT);
			 ((RightAssignContext)_localctx).result =  assignStatement(RIGHT_ASSIGN_STMT, settable, ((RightAssignContext)_localctx).expression.result); 
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
		enterRule(_localctx, 28, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__16);
			 String alias = null; 
			setState(299);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(300);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(304);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(301);
				match(T__17);
				setState(302);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(307);
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
		enterRule(_localctx, 30, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ASTExpr valueExpr = null; 
			setState(310);
			((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(311);
			((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(316);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(312);
				match(T__2);
				setState(313);
				((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(318);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public ASTBlock result;
		public Token IDENT;
		public TypeExprContext typeExpr;
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public ArgsDeclContext argsDecl() {
			return getRuleContext(ArgsDeclContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__18);
			 	beginScope();
						TypeSpec returnType = null; 
						List<ASTDeclaration> args = new LinkedList<ASTDeclaration>();
					
			setState(323);
			((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(324);
			match(T__3);
			setState(326);
			_la = _input.LA(1);
			if (_la==T__18 || _la==IDENT) {
				{
				setState(325);
				argsDecl(args);
				}
			}

			setState(328);
			match(T__4);
			setState(333);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(329);
				match(T__19);
				setState(330);
				((FunctionDeclContext)_localctx).typeExpr = typeExpr();
				 returnType = ((FunctionDeclContext)_localctx).typeExpr.result; 
				}
			}


						((FunctionDeclContext)_localctx).result =  functionDecl(FUNC_DECL,returnType, (((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args );
					
			setState(336);
			match(T__9);
			setState(337);
			blockContents(_localctx.result);
			setState(338);
			match(T__10);
			setState(340);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(339);
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

	public static class ArgsDeclContext extends ParserRuleContext {
		public List<ASTDeclaration> args;
		public TypeExprContext typeExpr;
		public Token IDENT;
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public ArgsDeclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsDeclContext(ParserRuleContext parent, int invokingState, List<ASTDeclaration> args) {
			super(parent, invokingState);
			this.args = args;
		}
		@Override public int getRuleIndex() { return RULE_argsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterArgsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitArgsDecl(this);
		}
	}

	public final ArgsDeclContext argsDecl(List<ASTDeclaration> args) throws RecognitionException {
		ArgsDeclContext _localctx = new ArgsDeclContext(_ctx, getState(), args);
		enterRule(_localctx, 34, RULE_argsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			((ArgsDeclContext)_localctx).typeExpr = typeExpr();
			setState(345);
			((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( variableDecl(ARG_DECL, ((ArgsDeclContext)_localctx).typeExpr.result, (((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null), null ) ); 
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(347);
				match(T__20);
				setState(348);
				((ArgsDeclContext)_localctx).typeExpr = typeExpr();
				setState(349);
				((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( variableDecl(ARG_DECL, ((ArgsDeclContext)_localctx).typeExpr.result, (((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null), null ) ); 
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(357);
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
		enterRule(_localctx, 38, RULE_funcCallExp);
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(360);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(361);
				match(T__3);
				setState(362);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(364);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(365);
				match(T__3);
				setState(366);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(367);
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
		enterRule(_localctx, 40, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(372);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(373);
				match(T__21);
				setState(374);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(375);
				match(T__3);
				setState(376);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(379);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(380);
				match(T__21);
				setState(381);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(382);
				match(T__3);
				setState(383);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(384);
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
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).argList =  new LinkedList<ASTExpr>(); 
			{
			setState(390);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(393);
				match(T__20);
				setState(394);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(401);
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

	public static class ChooseExprContext extends ParserRuleContext {
		public ASTExpr result;
		public FormulaTermContext formulaTerm() {
			return getRuleContext(FormulaTermContext.class,0);
		}
		public List<ChooseWhenExprContext> chooseWhenExpr() {
			return getRuleContexts(ChooseWhenExprContext.class);
		}
		public ChooseWhenExprContext chooseWhenExpr(int i) {
			return getRuleContext(ChooseWhenExprContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> END_OF_STMT() { return getTokens(OntologParser.END_OF_STMT); }
		public TerminalNode END_OF_STMT(int i) {
			return getToken(OntologParser.END_OF_STMT, i);
		}
		public ChooseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterChooseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitChooseExpr(this);
		}
	}

	public final ChooseExprContext chooseExpr() throws RecognitionException {
		ChooseExprContext _localctx = new ChooseExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chooseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__22);
			setState(403);
			match(T__3);
			setState(404);
			formulaTerm();
			setState(405);
			match(T__4);
			setState(406);
			match(T__9);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				{
				setState(407);
				chooseWhenExpr();
				setState(408);
				match(T__19);
				setState(409);
				expression();
				setState(410);
				match(END_OF_STMT);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(T__10);
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

	public static class ChooseWhenExprContext extends ParserRuleContext {
		public ASTExpr result;
		public AdditiveExpressionContext op2;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ChooseWhenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chooseWhenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterChooseWhenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitChooseWhenExpr(this);
		}
	}

	public final ChooseWhenExprContext chooseWhenExpr() throws RecognitionException {
		ChooseWhenExprContext _localctx = new ChooseWhenExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chooseWhenExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(419);
				match(T__23);
				setState(420);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(423);
				match(T__24);
				setState(424);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(427);
				match(T__25);
				setState(428);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(431);
				match(T__26);
				setState(432);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(435);
				match(T__24);
				setState(436);
				match(T__27);
				setState(437);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(440);
				match(T__28);
				setState(441);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(444);
				match(T__29);
				setState(445);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(448);
				match(T__30);
				setState(449);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(452);
				match(T__31);
				setState(453);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
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
		enterRule(_localctx, 48, RULE_literalTerm);
		try {
			setState(466);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
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
		enterRule(_localctx, 50, RULE_pathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(469);
			((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__32) {
				{
				setState(477);
				switch (_input.LA(1)) {
				case T__21:
					{
					{
					setState(471);
					match(T__21);
					setState(472);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__32:
					{
					{
					setState(474);
					match(T__32);
					setState(475);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(481);
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
		enterRule(_localctx, 52, RULE_typeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(497);
			switch (_input.LA(1)) {
			case T__18:
				{
				{
				setState(485);
				match(T__18);
				 builder.append( "function"); 
				}
				}
				break;
			case IDENT:
				{
				{
				setState(487);
				((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(489);
					match(T__21);
					setState(490);
					((TypeExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(502);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(499);
				match(T__0);
				setState(500);
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
		enterRule(_localctx, 54, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(520);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						{
						setState(508);
						match(T__21);
						setState(509);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(511);
						match(T__0);
						setState(512);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(513);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(515);
						match(T__0);
						setState(516);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(517);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
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
		enterRule(_localctx, 56, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				{
				setState(525);
				match(T__0);
				 List<ASTExpr> elements = new LinkedList<ASTExpr>(); 
				{
				setState(527);
				((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(530);
					match(T__20);
					setState(531);
					((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				match(T__1);
					((ArrayContext)_localctx).result =  array(elements); 
				}
				}
				break;
			case 2:
				{
				{
				setState(542);
				match(T__0);
				setState(543);
				((ArrayContext)_localctx).from = expression();
				setState(544);
				match(T__19);
				setState(545);
				((ArrayContext)_localctx).to = expression();
				setState(546);
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

	public static class MapExprContext extends ParserRuleContext {
		public ASTExpr result;
		public Token IDENT;
		public Token STRING_LITERAL;
		public FormulaTermContext formulaTerm;
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(OntologParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(OntologParser.STRING_LITERAL, i);
		}
		public MapExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).enterMapExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OntologListener ) ((OntologListener)listener).exitMapExpr(this);
		}
	}

	public final MapExprContext mapExpr() throws RecognitionException {
		MapExprContext _localctx = new MapExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__9);
			 ((MapExprContext)_localctx).result =  map(SIMPLE_MAP); String key;
			setState(578);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENT) {
				{
				setState(557);
				switch (_input.LA(1)) {
				case IDENT:
					{
					{
					setState(553);
					((MapExprContext)_localctx).IDENT = match(IDENT);
					key = (((MapExprContext)_localctx).IDENT!=null?((MapExprContext)_localctx).IDENT.getText():null); 
					}
					}
					break;
				case STRING_LITERAL:
					{
					{
					setState(555);
					((MapExprContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					key = strip((((MapExprContext)_localctx).STRING_LITERAL!=null?((MapExprContext)_localctx).STRING_LITERAL.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(559);
				match(T__19);
				setState(560);
				((MapExprContext)_localctx).formulaTerm = formulaTerm();
				 mapEntry( SIMPLE_MAP, _localctx.result, null, key, ((MapExprContext)_localctx).formulaTerm.result ); 
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(562);
					match(T__20);
					setState(567);
					switch (_input.LA(1)) {
					case IDENT:
						{
						{
						setState(563);
						((MapExprContext)_localctx).IDENT = match(IDENT);
						key = (((MapExprContext)_localctx).IDENT!=null?((MapExprContext)_localctx).IDENT.getText():null); 
						}
						}
						break;
					case STRING_LITERAL:
						{
						{
						setState(565);
						((MapExprContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
						key = strip((((MapExprContext)_localctx).STRING_LITERAL!=null?((MapExprContext)_localctx).STRING_LITERAL.getText():null)); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(569);
					match(T__19);
					setState(570);
					((MapExprContext)_localctx).formulaTerm = formulaTerm();
					 mapEntry(SIMPLE_MAP,  _localctx.result, null, key, ((MapExprContext)_localctx).formulaTerm.result ); 
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(580);
			match(T__10);
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
		enterRule(_localctx, 60, RULE_iterableTerm);
		try {
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  variable( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  variable( ((IterableTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
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
		public MapExprContext mapExpr;
		public ChooseExprContext chooseExpr;
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
		public MapExprContext mapExpr() {
			return getRuleContext(MapExprContext.class,0);
		}
		public ChooseExprContext chooseExpr() {
			return getRuleContext(ChooseExprContext.class,0);
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
		enterRule(_localctx, 62, RULE_formulaTerm);
		try {
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(609);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).array.result ; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(615);
				((FormulaTermContext)_localctx).mapExpr = mapExpr();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).mapExpr.result ; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(618);
				((FormulaTermContext)_localctx).chooseExpr = chooseExpr();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).chooseExpr.result ; 
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
		enterRule(_localctx, 64, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(626);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(624);
				match(T__33);
				 negative = true; 
				}
			}

			setState(636);
			switch (_input.LA(1)) {
			case T__0:
			case T__9:
			case T__22:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(628);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(631);
				match(T__3);
				setState(632);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(633);
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
		enterRule(_localctx, 66, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(644);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(642);
				match(T__34);
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
		enterRule(_localctx, 68, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(648);
				match(T__35);
				setState(649);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(656);
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
		enterRule(_localctx, 70, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__36) {
				{
				setState(667);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(659);
					match(T__36);
					setState(660);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__32:
					{
					setState(663);
					match(T__32);
					setState(664);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(671);
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
		enterRule(_localctx, 72, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__37) {
				{
				setState(682);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(674);
					match(T__37);
					setState(675);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__33:
					{
					setState(678);
					match(T__33);
					setState(679);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(686);
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
		enterRule(_localctx, 74, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(726);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(689);
					match(T__23);
					setState(690);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(693);
					match(T__24);
					setState(694);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(697);
					match(T__25);
					setState(698);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(701);
					match(T__26);
					setState(702);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(705);
					match(T__24);
					setState(706);
					match(T__27);
					setState(707);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(710);
					match(T__28);
					setState(711);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(714);
					match(T__29);
					setState(715);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(718);
					match(T__30);
					setState(719);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(722);
					match(T__31);
					setState(723);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(730);
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
		enterRule(_localctx, 76, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__9:
			case T__22:
			case T__33:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(731);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__27:
				{
				setState(734);
				match(T__27);
				setState(735);
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
		enterRule(_localctx, 78, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(750);
					switch (_input.LA(1)) {
					case T__38:
						{
						setState(742);
						match(T__38);
						setState(743);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__39:
						{
						setState(746);
						match(T__39);
						setState(747);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
		enterRule(_localctx, 80, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(756);
			match(T__40);
			{
			setState(757);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(758);
			match(T__19);
			{
			setState(759);
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
		enterRule(_localctx, 82, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(762);
				((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(765);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u0305\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\5\2`\n\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2k\n\2\3\3\3\3\7\3o\n\3\f\3\16\3r\13\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0096\n\4"+
		"\f\4\16\4\u0099\13\4\3\4\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c0\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00d8\n\t\f\t\16\t\u00db\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00e5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0106\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0110\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0118\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0127\n\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0133\n\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013f\n\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0149\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0150\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0157\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0163\n\23\f\23\16\23\u0166\13\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0175"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0186\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0190\n\27\f\27\16\27\u0193\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u019f\n\30\f\30\16\30\u01a2\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01cb\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01d5\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u01e0\n\33\f\33\16\33\u01e3\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01ef\n\34\f\34\16\34\u01f2\13"+
		"\34\5\34\u01f4\n\34\3\34\3\34\3\34\5\34\u01f9\n\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u020b"+
		"\n\35\f\35\16\35\u020e\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u0219\n\36\f\36\16\36\u021c\13\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0228\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0230\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u023a\n"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0240\n\37\f\37\16\37\u0243\13\37\5\37\u0245"+
		"\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0257\n "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\5!\u0270\n!\3\"\3\"\3\"\5\"\u0275\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u027f\n\"\3\"\3\"\3#\3#\3#\3#\5#\u0287\n#\3$\3$\3$\3$\3$\3$\7$\u028f"+
		"\n$\f$\16$\u0292\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u029e\n%\f%\16%"+
		"\u02a1\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02ad\n&\f&\16&\u02b0\13&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\7\'\u02d9\n\'\f\'\16\'\u02dc\13\'\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u02e5\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02f1\n)\f)\16)\u02f4\13"+
		")\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u0303\n+\3+\2\2,\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\2"+
		"\u0334\2V\3\2\2\2\4l\3\2\2\2\6\u0097\3\2\2\2\b\u00ad\3\2\2\2\n\u00af\3"+
		"\2\2\2\f\u00b3\3\2\2\2\16\u00bf\3\2\2\2\20\u00c1\3\2\2\2\22\u00e6\3\2"+
		"\2\2\24\u00f4\3\2\2\2\26\u00fb\3\2\2\2\30\u010f\3\2\2\2\32\u0111\3\2\2"+
		"\2\34\u011e\3\2\2\2\36\u012b\3\2\2\2 \u0137\3\2\2\2\"\u0143\3\2\2\2$\u015a"+
		"\3\2\2\2&\u0167\3\2\2\2(\u0174\3\2\2\2*\u0185\3\2\2\2,\u0187\3\2\2\2."+
		"\u0194\3\2\2\2\60\u01ca\3\2\2\2\62\u01d4\3\2\2\2\64\u01d6\3\2\2\2\66\u01e6"+
		"\3\2\2\28\u01fc\3\2\2\2:\u0227\3\2\2\2<\u0229\3\2\2\2>\u0256\3\2\2\2@"+
		"\u026f\3\2\2\2B\u0271\3\2\2\2D\u0282\3\2\2\2F\u0288\3\2\2\2H\u0293\3\2"+
		"\2\2J\u02a2\3\2\2\2L\u02b1\3\2\2\2N\u02e4\3\2\2\2P\u02e6\3\2\2\2R\u02f5"+
		"\3\2\2\2T\u0302\3\2\2\2V_\b\2\1\2W[\7\3\2\2XZ\5\36\20\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^`\7\4\2\2_W\3\2\2\2_"+
		"`\3\2\2\2`a\3\2\2\2aj\7\5\2\2bc\7\6\2\2cd\5&\24\2de\7\7\2\2ef\b\2\1\2"+
		"fk\3\2\2\2gh\5&\24\2hi\b\2\1\2ik\3\2\2\2jb\3\2\2\2jg\3\2\2\2k\3\3\2\2"+
		"\2lp\b\3\1\2mo\5\b\5\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2"+
		"\2rp\3\2\2\2su\5\36\20\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2"+
		"\2\2xv\3\2\2\2yz\5\6\4\2z{\7\2\2\3{|\b\3\1\2|\5\3\2\2\2}~\5 \21\2~\177"+
		"\b\4\1\2\177\u0096\3\2\2\2\u0080\u0081\5\n\6\2\u0081\u0082\b\4\1\2\u0082"+
		"\u0096\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\b\4\1\2\u0085\u0096\3\2"+
		"\2\2\u0086\u0087\5\20\t\2\u0087\u0088\b\4\1\2\u0088\u0096\3\2\2\2\u0089"+
		"\u008a\5\22\n\2\u008a\u008b\b\4\1\2\u008b\u0096\3\2\2\2\u008c\u008d\5"+
		"\26\f\2\u008d\u008e\b\4\1\2\u008e\u0096\3\2\2\2\u008f\u0090\5\30\r\2\u0090"+
		"\u0091\b\4\1\2\u0091\u0096\3\2\2\2\u0092\u0093\5\"\22\2\u0093\u0094\b"+
		"\4\1\2\u0094\u0096\3\2\2\2\u0095}\3\2\2\2\u0095\u0080\3\2\2\2\u0095\u0083"+
		"\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\5\16\b\2\u009b\u009c\b\4\1\2\u009c\u009e\3\2\2\2\u009d\u009a\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\7\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1"+
		"\58\35\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\b\5\1\2\u00a3\u00ae\3\2\2\2\u00a4"+
		"\u00a5\7\t\2\2\u00a5\u00a6\5\64\33\2\u00a6\u00a7\b\5\1\2\u00a7\u00a8\7"+
		"\61\2\2\u00a8\u00a9\b\5\1\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab"+
		"\u00ac\b\5\1\2\u00ac\u00ae\3\2\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a4\3\2"+
		"\2\2\u00ae\t\3\2\2\2\u00af\u00b0\5*\26\2\u00b0\u00b1\b\6\1\2\u00b1\u00b2"+
		"\7,\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\b\7\1\2\u00b5"+
		"\u00b6\7,\2\2\u00b6\r\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\5&\24\2"+
		"\u00b9\u00ba\7,\2\2\u00ba\u00bb\b\b\1\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd"+
		"\7\n\2\2\u00bd\u00be\7,\2\2\u00be\u00c0\b\b\1\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00bc\3\2\2\2\u00c0\17\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3\b\t\1"+
		"\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5P)\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7"+
		"\b\t\1\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00ca\7\r\2\2\u00ca"+
		"\u00d9\b\t\1\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\7\13\2\2\u00cd\u00ce\b"+
		"\t\1\2\u00ce\u00cf\7\6\2\2\u00cf\u00d0\5P)\2\u00d0\u00d1\7\7\2\2\u00d1"+
		"\u00d2\b\t\1\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7\r"+
		"\2\2\u00d5\u00d6\b\t\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e4\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\b\t\1\2\u00de"+
		"\u00df\b\t\1\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\7\r"+
		"\2\2\u00e2\u00e3\b\t\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\21\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\b\n\1"+
		"\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ec\b\n\1\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\5\6\4\2\u00ee\u00f0\7\r"+
		"\2\2\u00ef\u00f1\7,\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\b\n\1\2\u00f3\23\3\2\2\2\u00f4\u00f5\5\66\34"+
		"\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\b\13\1\2\u00f7\u00f8\7\20\2\2\u00f8"+
		"\u00f9\5> \2\u00f9\u00fa\b\13\1\2\u00fa\25\3\2\2\2\u00fb\u00fc\7\21\2"+
		"\2\u00fc\u00fd\b\f\1\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\5P)\2\u00ff\u0100"+
		"\7\7\2\2\u0100\u0101\b\f\1\2\u0101\u0102\7\f\2\2\u0102\u0103\5\6\4\2\u0103"+
		"\u0105\7\r\2\2\u0104\u0106\7,\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\f\1\2\u0108\27\3\2\2\2\u0109\u010a"+
		"\5\32\16\2\u010a\u010b\b\r\1\2\u010b\u0110\3\2\2\2\u010c\u010d\5\34\17"+
		"\2\u010d\u010e\b\r\1\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f\u010c"+
		"\3\2\2\2\u0110\31\3\2\2\2\u0111\u0117\b\16\1\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0118\b\16\1\2\u0114\u0115\58\35\2\u0115\u0116\b\16\1\2\u0116\u0118\3"+
		"\2\2\2\u0117\u0112\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7\5\2\2\u011a\u011b\5&\24\2\u011b\u011c\7,\2\2\u011c\u011d\b\16"+
		"\1\2\u011d\33\3\2\2\2\u011e\u011f\b\17\1\2\u011f\u0120\5&\24\2\u0120\u0126"+
		"\7\22\2\2\u0121\u0122\7\61\2\2\u0122\u0127\b\17\1\2\u0123\u0124\58\35"+
		"\2\u0124\u0125\b\17\1\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7,\2\2\u0129\u012a\b\17"+
		"\1\2\u012a\35\3\2\2\2\u012b\u012c\7\23\2\2\u012c\u012d\b\20\1\2\u012d"+
		"\u012e\58\35\2\u012e\u0132\7\61\2\2\u012f\u0130\7\24\2\2\u0130\u0131\7"+
		"\61\2\2\u0131\u0133\b\20\1\2\u0132\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\b\20\1\2\u0135\u0136\7,\2\2\u0136\37\3\2\2"+
		"\2\u0137\u0138\b\21\1\2\u0138\u0139\5\66\34\2\u0139\u013e\7\61\2\2\u013a"+
		"\u013b\7\5\2\2\u013b\u013c\5&\24\2\u013c\u013d\b\21\1\2\u013d\u013f\3"+
		"\2\2\2\u013e\u013a\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7,\2\2\u0141\u0142\b\21\1\2\u0142!\3\2\2\2\u0143\u0144\7\25\2\2"+
		"\u0144\u0145\b\22\1\2\u0145\u0146\7\61\2\2\u0146\u0148\7\6\2\2\u0147\u0149"+
		"\5$\23\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014f\7\7\2\2\u014b\u014c\7\26\2\2\u014c\u014d\5\66\34\2\u014d\u014e"+
		"\b\22\1\2\u014e\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u0152\b\22\1\2\u0152\u0153\7\f\2\2\u0153\u0154"+
		"\5\6\4\2\u0154\u0156\7\r\2\2\u0155\u0157\7,\2\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\22\1\2\u0159#\3\2\2\2"+
		"\u015a\u015b\5\66\34\2\u015b\u015c\7\61\2\2\u015c\u0164\b\23\1\2\u015d"+
		"\u015e\7\27\2\2\u015e\u015f\5\66\34\2\u015f\u0160\7\61\2\2\u0160\u0161"+
		"\b\23\1\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165%\3\2\2\2\u0166\u0164\3"+
		"\2\2\2\u0167\u0168\5T+\2\u0168\u0169\b\24\1\2\u0169\'\3\2\2\2\u016a\u016b"+
		"\7\61\2\2\u016b\u016c\7\6\2\2\u016c\u016d\7\7\2\2\u016d\u0175\b\25\1\2"+
		"\u016e\u016f\7\61\2\2\u016f\u0170\7\6\2\2\u0170\u0171\5,\27\2\u0171\u0172"+
		"\7\7\2\2\u0172\u0173\b\25\1\2\u0173\u0175\3\2\2\2\u0174\u016a\3\2\2\2"+
		"\u0174\u016e\3\2\2\2\u0175)\3\2\2\2\u0176\u0177\58\35\2\u0177\u0178\7"+
		"\30\2\2\u0178\u0179\7\61\2\2\u0179\u017a\7\6\2\2\u017a\u017b\7\7\2\2\u017b"+
		"\u017c\b\26\1\2\u017c\u0186\3\2\2\2\u017d\u017e\58\35\2\u017e\u017f\7"+
		"\30\2\2\u017f\u0180\7\61\2\2\u0180\u0181\7\6\2\2\u0181\u0182\5,\27\2\u0182"+
		"\u0183\7\7\2\2\u0183\u0184\b\26\1\2\u0184\u0186\3\2\2\2\u0185\u0176\3"+
		"\2\2\2\u0185\u017d\3\2\2\2\u0186+\3\2\2\2\u0187\u0188\b\27\1\2\u0188\u0189"+
		"\5&\24\2\u0189\u018a\b\27\1\2\u018a\u0191\3\2\2\2\u018b\u018c\7\27\2\2"+
		"\u018c\u018d\5&\24\2\u018d\u018e\b\27\1\2\u018e\u0190\3\2\2\2\u018f\u018b"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"-\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\31\2\2\u0195\u0196\7\6\2\2"+
		"\u0196\u0197\5@!\2\u0197\u0198\7\7\2\2\u0198\u01a0\7\f\2\2\u0199\u019a"+
		"\5\60\31\2\u019a\u019b\7\26\2\2\u019b\u019c\5&\24\2\u019c\u019d\7,\2\2"+
		"\u019d\u019f\3\2\2\2\u019e\u0199\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a4\7\r\2\2\u01a4/\3\2\2\2\u01a5\u01a6\7\32\2\2\u01a6\u01a7\5J&\2\u01a7"+
		"\u01a8\b\31\1\2\u01a8\u01cb\3\2\2\2\u01a9\u01aa\7\33\2\2\u01aa\u01ab\5"+
		"J&\2\u01ab\u01ac\b\31\1\2\u01ac\u01cb\3\2\2\2\u01ad\u01ae\7\34\2\2\u01ae"+
		"\u01af\5J&\2\u01af\u01b0\b\31\1\2\u01b0\u01cb\3\2\2\2\u01b1\u01b2\7\35"+
		"\2\2\u01b2\u01b3\5J&\2\u01b3\u01b4\b\31\1\2\u01b4\u01cb\3\2\2\2\u01b5"+
		"\u01b6\7\33\2\2\u01b6\u01b7\7\36\2\2\u01b7\u01b8\5J&\2\u01b8\u01b9\b\31"+
		"\1\2\u01b9\u01cb\3\2\2\2\u01ba\u01bb\7\37\2\2\u01bb\u01bc\5J&\2\u01bc"+
		"\u01bd\b\31\1\2\u01bd\u01cb\3\2\2\2\u01be\u01bf\7 \2\2\u01bf\u01c0\5J"+
		"&\2\u01c0\u01c1\b\31\1\2\u01c1\u01cb\3\2\2\2\u01c2\u01c3\7!\2\2\u01c3"+
		"\u01c4\5J&\2\u01c4\u01c5\b\31\1\2\u01c5\u01cb\3\2\2\2\u01c6\u01c7\7\""+
		"\2\2\u01c7\u01c8\5J&\2\u01c8\u01c9\b\31\1\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01a5\3\2\2\2\u01ca\u01a9\3\2\2\2\u01ca\u01ad\3\2\2\2\u01ca\u01b1\3\2"+
		"\2\2\u01ca\u01b5\3\2\2\2\u01ca\u01ba\3\2\2\2\u01ca\u01be\3\2\2\2\u01ca"+
		"\u01c2\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\61\3\2\2\2\u01cc\u01cd\7\60\2"+
		"\2\u01cd\u01d5\b\32\1\2\u01ce\u01cf\7.\2\2\u01cf\u01d5\b\32\1\2\u01d0"+
		"\u01d1\7-\2\2\u01d1\u01d5\b\32\1\2\u01d2\u01d3\7/\2\2\u01d3\u01d5\b\32"+
		"\1\2\u01d4\u01cc\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\63\3\2\2\2\u01d6\u01d7\b\33\1\2\u01d7\u01d8\7\61"+
		"\2\2\u01d8\u01e1\b\33\1\2\u01d9\u01da\7\30\2\2\u01da\u01db\7\61\2\2\u01db"+
		"\u01e0\b\33\1\2\u01dc\u01dd\7#\2\2\u01dd\u01de\7\61\2\2\u01de\u01e0\b"+
		"\33\1\2\u01df\u01d9\3\2\2\2\u01df\u01dc\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e5\b\33\1\2\u01e5\65\3\2\2\2\u01e6\u01f3\b\34\1\2\u01e7"+
		"\u01e8\7\25\2\2\u01e8\u01f4\b\34\1\2\u01e9\u01ea\7\61\2\2\u01ea\u01f0"+
		"\b\34\1\2\u01eb\u01ec\7\30\2\2\u01ec\u01ed\7\61\2\2\u01ed\u01ef\b\34\1"+
		"\2\u01ee\u01eb\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01e7\3\2\2\2\u01f3"+
		"\u01e9\3\2\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f6\7\3\2\2\u01f6\u01f7\7\4"+
		"\2\2\u01f7\u01f9\b\34\1\2\u01f8\u01f5\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\b\34\1\2\u01fb\67\3\2\2\2\u01fc\u01fd\7\61"+
		"\2\2\u01fd\u020c\b\35\1\2\u01fe\u01ff\7\30\2\2\u01ff\u0200\7\61\2\2\u0200"+
		"\u020b\b\35\1\2\u0201\u0202\7\3\2\2\u0202\u0203\7-\2\2\u0203\u0204\7\4"+
		"\2\2\u0204\u020b\b\35\1\2\u0205\u0206\7\3\2\2\u0206\u0207\58\35\2\u0207"+
		"\u0208\7\4\2\2\u0208\u0209\b\35\1\2\u0209\u020b\3\2\2\2\u020a\u01fe\3"+
		"\2\2\2\u020a\u0201\3\2\2\2\u020a\u0205\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d9\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020f\u0210\7\3\2\2\u0210\u0211\b\36\1\2\u0211\u0212\5@!\2\u0212\u0213"+
		"\b\36\1\2\u0213\u021a\3\2\2\2\u0214\u0215\7\27\2\2\u0215\u0216\5@!\2\u0216"+
		"\u0217\b\36\1\2\u0217\u0219\3\2\2\2\u0218\u0214\3\2\2\2\u0219\u021c\3"+
		"\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021e\7\4\2\2\u021e\u021f\b\36\1\2\u021f\u0228\3"+
		"\2\2\2\u0220\u0221\7\3\2\2\u0221\u0222\5&\24\2\u0222\u0223\7\26\2\2\u0223"+
		"\u0224\5&\24\2\u0224\u0225\7\4\2\2\u0225\u0226\b\36\1\2\u0226\u0228\3"+
		"\2\2\2\u0227\u020f\3\2\2\2\u0227\u0220\3\2\2\2\u0228;\3\2\2\2\u0229\u022a"+
		"\7\f\2\2\u022a\u0244\b\37\1\2\u022b\u022c\7\61\2\2\u022c\u0230\b\37\1"+
		"\2\u022d\u022e\7.\2\2\u022e\u0230\b\37\1\2\u022f\u022b\3\2\2\2\u022f\u022d"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7\26\2\2\u0232\u0233\5@!\2\u0233"+
		"\u0241\b\37\1\2\u0234\u0239\7\27\2\2\u0235\u0236\7\61\2\2\u0236\u023a"+
		"\b\37\1\2\u0237\u0238\7.\2\2\u0238\u023a\b\37\1\2\u0239\u0235\3\2\2\2"+
		"\u0239\u0237\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\26\2\2\u023c\u023d"+
		"\5@!\2\u023d\u023e\b\37\1\2\u023e\u0240\3\2\2\2\u023f\u0234\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u022f\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\7\r\2\2\u0247=\3\2\2\2\u0248\u0249\7\61\2\2"+
		"\u0249\u0257\b \1\2\u024a\u024b\58\35\2\u024b\u024c\b \1\2\u024c\u0257"+
		"\3\2\2\2\u024d\u024e\5(\25\2\u024e\u024f\b \1\2\u024f\u0257\3\2\2\2\u0250"+
		"\u0251\5*\26\2\u0251\u0252\b \1\2\u0252\u0257\3\2\2\2\u0253\u0254\5:\36"+
		"\2\u0254\u0255\b \1\2\u0255\u0257\3\2\2\2\u0256\u0248\3\2\2\2\u0256\u024a"+
		"\3\2\2\2\u0256\u024d\3\2\2\2\u0256\u0250\3\2\2\2\u0256\u0253\3\2\2\2\u0257"+
		"?\3\2\2\2\u0258\u0259\5\62\32\2\u0259\u025a\b!\1\2\u025a\u0270\3\2\2\2"+
		"\u025b\u025c\7\61\2\2\u025c\u0270\b!\1\2\u025d\u025e\58\35\2\u025e\u025f"+
		"\b!\1\2\u025f\u0270\3\2\2\2\u0260\u0261\5(\25\2\u0261\u0262\b!\1\2\u0262"+
		"\u0270\3\2\2\2\u0263\u0264\5*\26\2\u0264\u0265\b!\1\2\u0265\u0270\3\2"+
		"\2\2\u0266\u0267\5:\36\2\u0267\u0268\b!\1\2\u0268\u0270\3\2\2\2\u0269"+
		"\u026a\5<\37\2\u026a\u026b\b!\1\2\u026b\u0270\3\2\2\2\u026c\u026d\5.\30"+
		"\2\u026d\u026e\b!\1\2\u026e\u0270\3\2\2\2\u026f\u0258\3\2\2\2\u026f\u025b"+
		"\3\2\2\2\u026f\u025d\3\2\2\2\u026f\u0260\3\2\2\2\u026f\u0263\3\2\2\2\u026f"+
		"\u0266\3\2\2\2\u026f\u0269\3\2\2\2\u026f\u026c\3\2\2\2\u0270A\3\2\2\2"+
		"\u0271\u0274\b\"\1\2\u0272\u0273\7$\2\2\u0273\u0275\b\"\1\2\u0274\u0272"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u027e\3\2\2\2\u0276\u0277\5@!\2\u0277"+
		"\u0278\b\"\1\2\u0278\u027f\3\2\2\2\u0279\u027a\7\6\2\2\u027a\u027b\5T"+
		"+\2\u027b\u027c\7\7\2\2\u027c\u027d\b\"\1\2\u027d\u027f\3\2\2\2\u027e"+
		"\u0276\3\2\2\2\u027e\u0279\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\b\""+
		"\1\2\u0281C\3\2\2\2\u0282\u0283\5B\"\2\u0283\u0286\b#\1\2\u0284\u0285"+
		"\7%\2\2\u0285\u0287\b#\1\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"E\3\2\2\2\u0288\u0289\5D#\2\u0289\u0290\b$\1\2\u028a\u028b\7&\2\2\u028b"+
		"\u028c\5D#\2\u028c\u028d\b$\1\2\u028d\u028f\3\2\2\2\u028e\u028a\3\2\2"+
		"\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291G"+
		"\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\5F$\2\u0294\u029f\b%\1\2\u0295"+
		"\u0296\7\'\2\2\u0296\u0297\5F$\2\u0297\u0298\b%\1\2\u0298\u029e\3\2\2"+
		"\2\u0299\u029a\7#\2\2\u029a\u029b\5F$\2\u029b\u029c\b%\1\2\u029c\u029e"+
		"\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u0299\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0I\3\2\2\2\u02a1\u029f\3\2\2\2"+
		"\u02a2\u02a3\5H%\2\u02a3\u02ae\b&\1\2\u02a4\u02a5\7(\2\2\u02a5\u02a6\5"+
		"H%\2\u02a6\u02a7\b&\1\2\u02a7\u02ad\3\2\2\2\u02a8\u02a9\7$\2\2\u02a9\u02aa"+
		"\5H%\2\u02aa\u02ab\b&\1\2\u02ab\u02ad\3\2\2\2\u02ac\u02a4\3\2\2\2\u02ac"+
		"\u02a8\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02afK\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2\5J&\2\u02b2\u02da"+
		"\b\'\1\2\u02b3\u02b4\7\32\2\2\u02b4\u02b5\5J&\2\u02b5\u02b6\b\'\1\2\u02b6"+
		"\u02d9\3\2\2\2\u02b7\u02b8\7\33\2\2\u02b8\u02b9\5J&\2\u02b9\u02ba\b\'"+
		"\1\2\u02ba\u02d9\3\2\2\2\u02bb\u02bc\7\34\2\2\u02bc\u02bd\5J&\2\u02bd"+
		"\u02be\b\'\1\2\u02be\u02d9\3\2\2\2\u02bf\u02c0\7\35\2\2\u02c0\u02c1\5"+
		"J&\2\u02c1\u02c2\b\'\1\2\u02c2\u02d9\3\2\2\2\u02c3\u02c4\7\33\2\2\u02c4"+
		"\u02c5\7\36\2\2\u02c5\u02c6\5J&\2\u02c6\u02c7\b\'\1\2\u02c7\u02d9\3\2"+
		"\2\2\u02c8\u02c9\7\37\2\2\u02c9\u02ca\5J&\2\u02ca\u02cb\b\'\1\2\u02cb"+
		"\u02d9\3\2\2\2\u02cc\u02cd\7 \2\2\u02cd\u02ce\5J&\2\u02ce\u02cf\b\'\1"+
		"\2\u02cf\u02d9\3\2\2\2\u02d0\u02d1\7!\2\2\u02d1\u02d2\5J&\2\u02d2\u02d3"+
		"\b\'\1\2\u02d3\u02d9\3\2\2\2\u02d4\u02d5\7\"\2\2\u02d5\u02d6\5J&\2\u02d6"+
		"\u02d7\b\'\1\2\u02d7\u02d9\3\2\2\2\u02d8\u02b3\3\2\2\2\u02d8\u02b7\3\2"+
		"\2\2\u02d8\u02bb\3\2\2\2\u02d8\u02bf\3\2\2\2\u02d8\u02c3\3\2\2\2\u02d8"+
		"\u02c8\3\2\2\2\u02d8\u02cc\3\2\2\2\u02d8\u02d0\3\2\2\2\u02d8\u02d4\3\2"+
		"\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"M\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02de\5L\'\2\u02de\u02df\b(\1\2\u02df"+
		"\u02e5\3\2\2\2\u02e0\u02e1\7\36\2\2\u02e1\u02e2\5L\'\2\u02e2\u02e3\b("+
		"\1\2\u02e3\u02e5\3\2\2\2\u02e4\u02dd\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5"+
		"O\3\2\2\2\u02e6\u02e7\5N(\2\u02e7\u02f2\b)\1\2\u02e8\u02e9\7)\2\2\u02e9"+
		"\u02ea\5T+\2\u02ea\u02eb\b)\1\2\u02eb\u02f1\3\2\2\2\u02ec\u02ed\7*\2\2"+
		"\u02ed\u02ee\5T+\2\u02ee\u02ef\b)\1\2\u02ef\u02f1\3\2\2\2\u02f0\u02e8"+
		"\3\2\2\2\u02f0\u02ec\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3Q\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02f6\5P)\2\u02f6"+
		"\u02f7\7+\2\2\u02f7\u02f8\5T+\2\u02f8\u02f9\7\26\2\2\u02f9\u02fa\5T+\2"+
		"\u02fa\u02fb\b*\1\2\u02fbS\3\2\2\2\u02fc\u02fd\5P)\2\u02fd\u02fe\b+\1"+
		"\2\u02fe\u0303\3\2\2\2\u02ff\u0300\5R*\2\u0300\u0301\b+\1\2\u0301\u0303"+
		"\3\2\2\2\u0302\u02fc\3\2\2\2\u0302\u02ff\3\2\2\2\u0303U\3\2\2\2<[_jpv"+
		"\u0095\u0097\u009d\u00ad\u00bf\u00d9\u00e4\u00f0\u0105\u010f\u0117\u0126"+
		"\u0132\u013e\u0148\u014f\u0156\u0164\u0174\u0185\u0191\u01a0\u01ca\u01d4"+
		"\u01df\u01e1\u01f0\u01f3\u01f8\u020a\u020c\u021a\u0227\u022f\u0239\u0241"+
		"\u0244\u0256\u026f\u0274\u027e\u0286\u0290\u029d\u029f\u02ac\u02ae\u02d8"+
		"\u02da\u02e4\u02f0\u02f2\u0302";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}