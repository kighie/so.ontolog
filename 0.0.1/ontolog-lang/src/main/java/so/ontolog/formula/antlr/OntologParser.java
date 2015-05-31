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
		RULE_array = 28, RULE_iterableTerm = 29, RULE_formulaTerm = 30, RULE_unary = 31, 
		RULE_percent = 32, RULE_exponential = 33, RULE_multiplicative = 34, RULE_additiveExpression = 35, 
		RULE_comparison = 36, RULE_notExpression = 37, RULE_logicalExpression = 38, 
		RULE_ternaryExpression = 39, RULE_operatorExpression = 40;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"foreachStatement", "loopCondition", "whileStatement", "assignStatement", 
		"leftAssign", "rightAssign", "paramDecl", "variableDecl", "functionDecl", 
		"argsDecl", "expression", "funcCallExp", "methodCallExp", "arguments", 
		"chooseExpr", "chooseWhenExpr", "literalTerm", "pathExpr", "typeExpr", 
		"qualifiedName", "array", "iterableTerm", "formulaTerm", "unary", "percent", 
		"exponential", "multiplicative", "additiveExpression", "comparison", "notExpression", 
		"logicalExpression", "ternaryExpression", "operatorExpression"
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
			setState(91);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(83);
				match(T__0);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(84);
					paramDecl(_localctx.result);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__1);
				}
			}

			setState(93);
			match(T__2);
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(94);
				match(T__3);
				setState(95);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(96);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(99);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(105);
				importStatement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(111);
				paramDecl(_localctx.result);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			blockContents(_localctx.result);
			setState(118);
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
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__22) | (1L << T__27) | (1L << T__33) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(145);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(121);
					((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(124);
					((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(127);
					((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(130);
					((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				case 5:
					{
					setState(133);
					((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.result); 
					}
					break;
				case 6:
					{
					setState(136);
					((BlockContentsContext)_localctx).whileStatement = whileStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).whileStatement.result); 
					}
					break;
				case 7:
					{
					setState(139);
					((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.result); 
					}
					break;
				case 8:
					{
					setState(142);
					((BlockContentsContext)_localctx).functionDecl = functionDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionDecl.result); 
					}
					break;
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(150);
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
			setState(169);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(155);
				match(T__5);
				setState(156);
				((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(157);
				match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__6:
				{
				{
				setState(160);
				match(T__6);
				setState(161);
				((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(163);
				((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(166);
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
			setState(171);
			((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(173);
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
			setState(175);
			((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(177);
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
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(179);
				match(T__7);
				setState(180);
				((ReturnStatementContext)_localctx).expression = expression();
				setState(181);
				match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(184);
				match(T__7);
				setState(185);
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
			setState(189);
			match(T__8);
			 beginScope(); 
			setState(191);
			match(T__3);
			setState(192);
			((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(193);
			match(T__4);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(195);
			match(T__9);
			setState(196);
			blockContents(_localctx.result);
			setState(197);
			match(T__10);
				endScope(); 
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(T__11);
					setState(200);
					match(T__8);
					 beginScope(); 
					setState(202);
					match(T__3);
					setState(203);
					((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(204);
					match(T__4);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(206);
					match(T__9);
					setState(207);
					blockContents(elseIfStmt);
					setState(208);
					match(T__10);
						endScope(); 
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(224);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(216);
				match(T__11);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(219);
				match(T__9);
				setState(220);
				blockContents(elseStmt);
				setState(221);
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
			setState(226);
			match(T__12);
				beginScope(); 
			setState(228);
			match(T__3);
			setState(229);
			((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(230);
			match(T__4);
			 	((ForeachStatementContext)_localctx).result =  loopStatement(FOREACH, ((ForeachStatementContext)_localctx).loopCondition.result);  
			setState(232);
			match(T__9);
			setState(233);
			blockContents(_localctx.result);
			setState(234);
			match(T__10);
			setState(236);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(235);
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
			setState(240);
			((LoopConditionContext)_localctx).typeExpr = typeExpr();
			setState(241);
			((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
						ASTDeclaration varDecl = variableDecl(VAR_DECL, ((LoopConditionContext)_localctx).typeExpr.result, (((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null),null );
					
			setState(243);
			match(T__13);
			setState(244);
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
			setState(247);
			match(T__14);
			 beginScope(); 
			setState(249);
			match(T__3);
			setState(250);
			((WhileStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(251);
			match(T__4);
			 	((WhileStatementContext)_localctx).result =  loopStatement(WHILE, ((WhileStatementContext)_localctx).logicalExpression.result);  
			setState(253);
			match(T__9);
			setState(254);
			blockContents(_localctx.result);
			setState(255);
			match(T__10);
			setState(257);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(256);
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
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(261);
				((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).result =  ((AssignStatementContext)_localctx).leftAssign.result ; 
				}
				break;
			case 2:
				{
				setState(264);
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(270);
				((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(272);
				((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((LeftAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(277);
			match(T__2);
			setState(278);
			((LeftAssignContext)_localctx).expression = expression();
			setState(279);
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
			setState(283);
			((RightAssignContext)_localctx).expression = expression();
			setState(284);
			match(T__15);
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(285);
				((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(287);
				((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((RightAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(292);
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
			setState(295);
			match(T__16);
			 String alias = null; 
			setState(297);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(298);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(302);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(299);
				match(T__17);
				setState(300);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(305);
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
			setState(308);
			((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(309);
			((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(314);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(310);
				match(T__2);
				setState(311);
				((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(316);
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
			setState(319);
			match(T__18);
			 	beginScope();
						TypeSpec returnType = null; 
						List<ASTDeclaration> args = new LinkedList<ASTDeclaration>();
					
			setState(321);
			((FunctionDeclContext)_localctx).IDENT = match(IDENT);
			setState(322);
			match(T__3);
			setState(324);
			_la = _input.LA(1);
			if (_la==T__18 || _la==IDENT) {
				{
				setState(323);
				argsDecl(args);
				}
			}

			setState(326);
			match(T__4);
			setState(331);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(327);
				match(T__19);
				setState(328);
				((FunctionDeclContext)_localctx).typeExpr = typeExpr();
				 returnType = ((FunctionDeclContext)_localctx).typeExpr.result; 
				}
			}


						((FunctionDeclContext)_localctx).result =  functionDecl(FUNC_DECL,returnType, (((FunctionDeclContext)_localctx).IDENT!=null?((FunctionDeclContext)_localctx).IDENT.getText():null), args );
					
			setState(334);
			match(T__9);
			setState(335);
			blockContents(_localctx.result);
			setState(336);
			match(T__10);
			setState(338);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(337);
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
			setState(342);
			((ArgsDeclContext)_localctx).typeExpr = typeExpr();
			setState(343);
			((ArgsDeclContext)_localctx).IDENT = match(IDENT);
			 _localctx.args.add( variableDecl(ARG_DECL, ((ArgsDeclContext)_localctx).typeExpr.result, (((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null), null ) ); 
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(345);
				match(T__20);
				setState(346);
				((ArgsDeclContext)_localctx).typeExpr = typeExpr();
				setState(347);
				((ArgsDeclContext)_localctx).IDENT = match(IDENT);
				 _localctx.args.add( variableDecl(ARG_DECL, ((ArgsDeclContext)_localctx).typeExpr.result, (((ArgsDeclContext)_localctx).IDENT!=null?((ArgsDeclContext)_localctx).IDENT.getText():null), null ) ); 
				}
				}
				setState(354);
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
			setState(355);
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
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(358);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(359);
				match(T__3);
				setState(360);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(362);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(363);
				match(T__3);
				setState(364);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(365);
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
			setState(385);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(370);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(371);
				match(T__21);
				setState(372);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(373);
				match(T__3);
				setState(374);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(377);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(378);
				match(T__21);
				setState(379);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(380);
				match(T__3);
				setState(381);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(382);
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
			setState(388);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(391);
				match(T__20);
				setState(392);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(399);
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
			setState(400);
			match(T__22);
			setState(401);
			match(T__3);
			setState(402);
			formulaTerm();
			setState(403);
			match(T__4);
			setState(404);
			match(T__9);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				{
				setState(405);
				chooseWhenExpr();
				setState(406);
				match(T__19);
				setState(407);
				expression();
				setState(408);
				match(END_OF_STMT);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(417);
				match(T__23);
				setState(418);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(421);
				match(T__24);
				setState(422);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(425);
				match(T__25);
				setState(426);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(429);
				match(T__26);
				setState(430);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(433);
				match(T__24);
				setState(434);
				match(T__27);
				setState(435);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(438);
				match(T__28);
				setState(439);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(442);
				match(T__29);
				setState(443);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(446);
				match(T__30);
				setState(447);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(450);
				match(T__31);
				setState(451);
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
			setState(464);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
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
			setState(467);
			((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__32) {
				{
				setState(475);
				switch (_input.LA(1)) {
				case T__21:
					{
					{
					setState(469);
					match(T__21);
					setState(470);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__32:
					{
					{
					setState(472);
					match(T__32);
					setState(473);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(479);
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
			setState(495);
			switch (_input.LA(1)) {
			case T__18:
				{
				{
				setState(483);
				match(T__18);
				 builder.append( "function"); 
				}
				}
				break;
			case IDENT:
				{
				{
				setState(485);
				((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(487);
					match(T__21);
					setState(488);
					((TypeExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(500);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(497);
				match(T__0);
				setState(498);
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
			setState(504);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(518);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						{
						setState(506);
						match(T__21);
						setState(507);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(509);
						match(T__0);
						setState(510);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(511);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(513);
						match(T__0);
						setState(514);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(515);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(522);
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
		enterRule(_localctx, 56, RULE_array);
		int _la;
		try {
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(523);
				match(T__0);
				 List<ASTExpr> elements = new LinkedList<ASTExpr>(); 
				{
				setState(525);
				((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(528);
					match(T__20);
					setState(529);
					((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(T__1);
					((ArrayContext)_localctx).result =  array(elements); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(540);
				match(T__0);
				setState(541);
				((ArrayContext)_localctx).from = expression();
				setState(542);
				match(T__19);
				setState(543);
				((ArrayContext)_localctx).to = expression();
				setState(544);
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
		enterRule(_localctx, 58, RULE_iterableTerm);
		try {
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  variable( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  variable( ((IterableTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
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
		enterRule(_localctx, 60, RULE_formulaTerm);
		try {
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(579);
				((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).array.result ; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(582);
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
		enterRule(_localctx, 62, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(590);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(588);
				match(T__33);
				 negative = true; 
				}
			}

			setState(600);
			switch (_input.LA(1)) {
			case T__0:
			case T__22:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(592);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(595);
				match(T__3);
				setState(596);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(597);
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
		enterRule(_localctx, 64, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(608);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(606);
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
		enterRule(_localctx, 66, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(612);
				match(T__35);
				setState(613);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(620);
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
		enterRule(_localctx, 68, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__36) {
				{
				setState(631);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(623);
					match(T__36);
					setState(624);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__32:
					{
					setState(627);
					match(T__32);
					setState(628);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(635);
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
		enterRule(_localctx, 70, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__37) {
				{
				setState(646);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(638);
					match(T__37);
					setState(639);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__33:
					{
					setState(642);
					match(T__33);
					setState(643);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(650);
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
		enterRule(_localctx, 72, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(690);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(653);
					match(T__23);
					setState(654);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(657);
					match(T__24);
					setState(658);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(661);
					match(T__25);
					setState(662);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(665);
					match(T__26);
					setState(666);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(669);
					match(T__24);
					setState(670);
					match(T__27);
					setState(671);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(674);
					match(T__28);
					setState(675);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(678);
					match(T__29);
					setState(679);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(682);
					match(T__30);
					setState(683);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(686);
					match(T__31);
					setState(687);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(694);
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
		enterRule(_localctx, 74, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__22:
			case T__33:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(695);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__27:
				{
				setState(698);
				match(T__27);
				setState(699);
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
		enterRule(_localctx, 76, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(714);
					switch (_input.LA(1)) {
					case T__38:
						{
						setState(706);
						match(T__38);
						setState(707);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__39:
						{
						setState(710);
						match(T__39);
						setState(711);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 78, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(720);
			match(T__40);
			{
			setState(721);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(722);
			match(T__19);
			{
			setState(723);
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
		enterRule(_localctx, 80, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(726);
				((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(729);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u02e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\5\2^\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2i\n\2\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\7\3s\n\3\f\3\16"+
		"\3v\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16"+
		"\4\u0097\13\4\3\4\3\4\3\4\5\4\u009c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00d6\n\t\f\t\16\t\u00d9\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e3"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0104\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0116\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0125\n\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0131\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u013d\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0147\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u014e\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0155\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0161\n\23\f\23\16\23\u0164\13\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0173\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0184\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u018e\n"+
		"\27\f\27\16\27\u0191\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u019d\n\30\f\30\16\30\u01a0\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01c9\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u01d3\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u01de\n\33\f\33\16\33\u01e1\13\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u01ed\n\34\f\34\16\34\u01f0\13\34\5\34"+
		"\u01f2\n\34\3\34\3\34\3\34\5\34\u01f7\n\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0209\n\35"+
		"\f\35\16\35\u020c\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7"+
		"\36\u0217\n\36\f\36\16\36\u021a\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0226\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0236\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u024c\n \3!\3!\3!\5!\u0251"+
		"\n!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u025b\n!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0263"+
		"\n\"\3#\3#\3#\3#\3#\3#\7#\u026b\n#\f#\16#\u026e\13#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\7$\u027a\n$\f$\16$\u027d\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\7%\u0289\n%\f%\16%\u028c\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u02b5\n&\f&\16&\u02b8\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u02c1\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u02cd\n(\f(\16(\u02d0\13("+
		"\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u02df\n*\3*\2\2+\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\2\u030c"+
		"\2T\3\2\2\2\4j\3\2\2\2\6\u0095\3\2\2\2\b\u00ab\3\2\2\2\n\u00ad\3\2\2\2"+
		"\f\u00b1\3\2\2\2\16\u00bd\3\2\2\2\20\u00bf\3\2\2\2\22\u00e4\3\2\2\2\24"+
		"\u00f2\3\2\2\2\26\u00f9\3\2\2\2\30\u010d\3\2\2\2\32\u010f\3\2\2\2\34\u011c"+
		"\3\2\2\2\36\u0129\3\2\2\2 \u0135\3\2\2\2\"\u0141\3\2\2\2$\u0158\3\2\2"+
		"\2&\u0165\3\2\2\2(\u0172\3\2\2\2*\u0183\3\2\2\2,\u0185\3\2\2\2.\u0192"+
		"\3\2\2\2\60\u01c8\3\2\2\2\62\u01d2\3\2\2\2\64\u01d4\3\2\2\2\66\u01e4\3"+
		"\2\2\28\u01fa\3\2\2\2:\u0225\3\2\2\2<\u0235\3\2\2\2>\u024b\3\2\2\2@\u024d"+
		"\3\2\2\2B\u025e\3\2\2\2D\u0264\3\2\2\2F\u026f\3\2\2\2H\u027e\3\2\2\2J"+
		"\u028d\3\2\2\2L\u02c0\3\2\2\2N\u02c2\3\2\2\2P\u02d1\3\2\2\2R\u02de\3\2"+
		"\2\2T]\b\2\1\2UY\7\3\2\2VX\5\36\20\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\4\2\2]U\3\2\2\2]^\3\2\2\2^_\3\2\2\2_"+
		"h\7\5\2\2`a\7\6\2\2ab\5&\24\2bc\7\7\2\2cd\b\2\1\2di\3\2\2\2ef\5&\24\2"+
		"fg\b\2\1\2gi\3\2\2\2h`\3\2\2\2he\3\2\2\2i\3\3\2\2\2jn\b\3\1\2km\5\b\5"+
		"\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ot\3\2\2\2pn\3\2\2\2qs\5\36"+
		"\20\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5"+
		"\6\4\2xy\7\2\2\3yz\b\3\1\2z\5\3\2\2\2{|\5 \21\2|}\b\4\1\2}\u0094\3\2\2"+
		"\2~\177\5\n\6\2\177\u0080\b\4\1\2\u0080\u0094\3\2\2\2\u0081\u0082\5\f"+
		"\7\2\u0082\u0083\b\4\1\2\u0083\u0094\3\2\2\2\u0084\u0085\5\20\t\2\u0085"+
		"\u0086\b\4\1\2\u0086\u0094\3\2\2\2\u0087\u0088\5\22\n\2\u0088\u0089\b"+
		"\4\1\2\u0089\u0094\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c\b\4\1\2\u008c"+
		"\u0094\3\2\2\2\u008d\u008e\5\30\r\2\u008e\u008f\b\4\1\2\u008f\u0094\3"+
		"\2\2\2\u0090\u0091\5\"\22\2\u0091\u0092\b\4\1\2\u0092\u0094\3\2\2\2\u0093"+
		"{\3\2\2\2\u0093~\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0084\3\2\2\2\u0093"+
		"\u0087\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u009b\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\16\b\2\u0099\u009a\b"+
		"\4\1\2\u009a\u009c\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\7\3\2\2\2\u009d\u009e\7\b\2\2\u009e\u009f\58\35\2\u009f\u00a0\7,\2\2"+
		"\u00a0\u00a1\b\5\1\2\u00a1\u00ac\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4"+
		"\5\64\33\2\u00a4\u00a5\b\5\1\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\b\5\1"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\b\5\1\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ac\t\3\2\2\2\u00ad"+
		"\u00ae\5*\26\2\u00ae\u00af\b\6\1\2\u00af\u00b0\7,\2\2\u00b0\13\3\2\2\2"+
		"\u00b1\u00b2\5(\25\2\u00b2\u00b3\b\7\1\2\u00b3\u00b4\7,\2\2\u00b4\r\3"+
		"\2\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\7,\2\2\u00b8"+
		"\u00b9\b\b\1\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\7,"+
		"\2\2\u00bc\u00be\b\b\1\2\u00bd\u00b5\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be"+
		"\17\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\b\t\1\2\u00c1\u00c2\7\6\2"+
		"\2\u00c2\u00c3\5N(\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\b\t\1\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00c7\5\6\4\2\u00c7\u00c8\7\r\2\2\u00c8\u00d7\b\t\1\2\u00c9"+
		"\u00ca\7\16\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\b\t\1\2\u00cc\u00cd\7"+
		"\6\2\2\u00cd\u00ce\5N(\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\b\t\1\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\b\t"+
		"\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e2\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00db\7\16\2\2\u00db\u00dc\b\t\1\2\u00dc\u00dd\b\t\1\2\u00dd"+
		"\u00de\7\f\2\2\u00de\u00df\5\6\4\2\u00df\u00e0\7\r\2\2\u00e0\u00e1\b\t"+
		"\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\21\3\2\2\2\u00e4\u00e5\7\17\2\2\u00e5\u00e6\b\n\1\2\u00e6\u00e7\7\6\2"+
		"\2\u00e7\u00e8\5\24\13\2\u00e8\u00e9\7\7\2\2\u00e9\u00ea\b\n\1\2\u00ea"+
		"\u00eb\7\f\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00ee\7\r\2\2\u00ed\u00ef\7,"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b\n\1\2\u00f1\23\3\2\2\2\u00f2\u00f3\5\66\34\2\u00f3\u00f4\7\61"+
		"\2\2\u00f4\u00f5\b\13\1\2\u00f5\u00f6\7\20\2\2\u00f6\u00f7\5<\37\2\u00f7"+
		"\u00f8\b\13\1\2\u00f8\25\3\2\2\2\u00f9\u00fa\7\21\2\2\u00fa\u00fb\b\f"+
		"\1\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\5N(\2\u00fd\u00fe\7\7\2\2\u00fe\u00ff"+
		"\b\f\1\2\u00ff\u0100\7\f\2\2\u0100\u0101\5\6\4\2\u0101\u0103\7\r\2\2\u0102"+
		"\u0104\7,\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\b\f\1\2\u0106\27\3\2\2\2\u0107\u0108\5\32\16\2\u0108"+
		"\u0109\b\r\1\2\u0109\u010e\3\2\2\2\u010a\u010b\5\34\17\2\u010b\u010c\b"+
		"\r\1\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e"+
		"\31\3\2\2\2\u010f\u0115\b\16\1\2\u0110\u0111\7\61\2\2\u0111\u0116\b\16"+
		"\1\2\u0112\u0113\58\35\2\u0113\u0114\b\16\1\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\5"+
		"\2\2\u0118\u0119\5&\24\2\u0119\u011a\7,\2\2\u011a\u011b\b\16\1\2\u011b"+
		"\33\3\2\2\2\u011c\u011d\b\17\1\2\u011d\u011e\5&\24\2\u011e\u0124\7\22"+
		"\2\2\u011f\u0120\7\61\2\2\u0120\u0125\b\17\1\2\u0121\u0122\58\35\2\u0122"+
		"\u0123\b\17\1\2\u0123\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0121\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7,\2\2\u0127\u0128\b\17\1\2\u0128"+
		"\35\3\2\2\2\u0129\u012a\7\23\2\2\u012a\u012b\b\20\1\2\u012b\u012c\58\35"+
		"\2\u012c\u0130\7\61\2\2\u012d\u012e\7\24\2\2\u012e\u012f\7\61\2\2\u012f"+
		"\u0131\b\20\1\2\u0130\u012d\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3"+
		"\2\2\2\u0132\u0133\b\20\1\2\u0133\u0134\7,\2\2\u0134\37\3\2\2\2\u0135"+
		"\u0136\b\21\1\2\u0136\u0137\5\66\34\2\u0137\u013c\7\61\2\2\u0138\u0139"+
		"\7\5\2\2\u0139\u013a\5&\24\2\u013a\u013b\b\21\1\2\u013b\u013d\3\2\2\2"+
		"\u013c\u0138\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f"+
		"\7,\2\2\u013f\u0140\b\21\1\2\u0140!\3\2\2\2\u0141\u0142\7\25\2\2\u0142"+
		"\u0143\b\22\1\2\u0143\u0144\7\61\2\2\u0144\u0146\7\6\2\2\u0145\u0147\5"+
		"$\23\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014d\7\7\2\2\u0149\u014a\7\26\2\2\u014a\u014b\5\66\34\2\u014b\u014c"+
		"\b\22\1\2\u014c\u014e\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\b\22\1\2\u0150\u0151\7\f\2\2\u0151\u0152"+
		"\5\6\4\2\u0152\u0154\7\r\2\2\u0153\u0155\7,\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\22\1\2\u0157#\3\2\2\2"+
		"\u0158\u0159\5\66\34\2\u0159\u015a\7\61\2\2\u015a\u0162\b\23\1\2\u015b"+
		"\u015c\7\27\2\2\u015c\u015d\5\66\34\2\u015d\u015e\7\61\2\2\u015e\u015f"+
		"\b\23\1\2\u015f\u0161\3\2\2\2\u0160\u015b\3\2\2\2\u0161\u0164\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163%\3\2\2\2\u0164\u0162\3"+
		"\2\2\2\u0165\u0166\5R*\2\u0166\u0167\b\24\1\2\u0167\'\3\2\2\2\u0168\u0169"+
		"\7\61\2\2\u0169\u016a\7\6\2\2\u016a\u016b\7\7\2\2\u016b\u0173\b\25\1\2"+
		"\u016c\u016d\7\61\2\2\u016d\u016e\7\6\2\2\u016e\u016f\5,\27\2\u016f\u0170"+
		"\7\7\2\2\u0170\u0171\b\25\1\2\u0171\u0173\3\2\2\2\u0172\u0168\3\2\2\2"+
		"\u0172\u016c\3\2\2\2\u0173)\3\2\2\2\u0174\u0175\58\35\2\u0175\u0176\7"+
		"\30\2\2\u0176\u0177\7\61\2\2\u0177\u0178\7\6\2\2\u0178\u0179\7\7\2\2\u0179"+
		"\u017a\b\26\1\2\u017a\u0184\3\2\2\2\u017b\u017c\58\35\2\u017c\u017d\7"+
		"\30\2\2\u017d\u017e\7\61\2\2\u017e\u017f\7\6\2\2\u017f\u0180\5,\27\2\u0180"+
		"\u0181\7\7\2\2\u0181\u0182\b\26\1\2\u0182\u0184\3\2\2\2\u0183\u0174\3"+
		"\2\2\2\u0183\u017b\3\2\2\2\u0184+\3\2\2\2\u0185\u0186\b\27\1\2\u0186\u0187"+
		"\5&\24\2\u0187\u0188\b\27\1\2\u0188\u018f\3\2\2\2\u0189\u018a\7\27\2\2"+
		"\u018a\u018b\5&\24\2\u018b\u018c\b\27\1\2\u018c\u018e\3\2\2\2\u018d\u0189"+
		"\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"-\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\31\2\2\u0193\u0194\7\6\2\2"+
		"\u0194\u0195\5> \2\u0195\u0196\7\7\2\2\u0196\u019e\7\f\2\2\u0197\u0198"+
		"\5\60\31\2\u0198\u0199\7\26\2\2\u0199\u019a\5&\24\2\u019a\u019b\7,\2\2"+
		"\u019b\u019d\3\2\2\2\u019c\u0197\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a2\7\r\2\2\u01a2/\3\2\2\2\u01a3\u01a4\7\32\2\2\u01a4\u01a5\5H%\2\u01a5"+
		"\u01a6\b\31\1\2\u01a6\u01c9\3\2\2\2\u01a7\u01a8\7\33\2\2\u01a8\u01a9\5"+
		"H%\2\u01a9\u01aa\b\31\1\2\u01aa\u01c9\3\2\2\2\u01ab\u01ac\7\34\2\2\u01ac"+
		"\u01ad\5H%\2\u01ad\u01ae\b\31\1\2\u01ae\u01c9\3\2\2\2\u01af\u01b0\7\35"+
		"\2\2\u01b0\u01b1\5H%\2\u01b1\u01b2\b\31\1\2\u01b2\u01c9\3\2\2\2\u01b3"+
		"\u01b4\7\33\2\2\u01b4\u01b5\7\36\2\2\u01b5\u01b6\5H%\2\u01b6\u01b7\b\31"+
		"\1\2\u01b7\u01c9\3\2\2\2\u01b8\u01b9\7\37\2\2\u01b9\u01ba\5H%\2\u01ba"+
		"\u01bb\b\31\1\2\u01bb\u01c9\3\2\2\2\u01bc\u01bd\7 \2\2\u01bd\u01be\5H"+
		"%\2\u01be\u01bf\b\31\1\2\u01bf\u01c9\3\2\2\2\u01c0\u01c1\7!\2\2\u01c1"+
		"\u01c2\5H%\2\u01c2\u01c3\b\31\1\2\u01c3\u01c9\3\2\2\2\u01c4\u01c5\7\""+
		"\2\2\u01c5\u01c6\5H%\2\u01c6\u01c7\b\31\1\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01a3\3\2\2\2\u01c8\u01a7\3\2\2\2\u01c8\u01ab\3\2\2\2\u01c8\u01af\3\2"+
		"\2\2\u01c8\u01b3\3\2\2\2\u01c8\u01b8\3\2\2\2\u01c8\u01bc\3\2\2\2\u01c8"+
		"\u01c0\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c9\61\3\2\2\2\u01ca\u01cb\7\60\2"+
		"\2\u01cb\u01d3\b\32\1\2\u01cc\u01cd\7.\2\2\u01cd\u01d3\b\32\1\2\u01ce"+
		"\u01cf\7-\2\2\u01cf\u01d3\b\32\1\2\u01d0\u01d1\7/\2\2\u01d1\u01d3\b\32"+
		"\1\2\u01d2\u01ca\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\63\3\2\2\2\u01d4\u01d5\b\33\1\2\u01d5\u01d6\7\61"+
		"\2\2\u01d6\u01df\b\33\1\2\u01d7\u01d8\7\30\2\2\u01d8\u01d9\7\61\2\2\u01d9"+
		"\u01de\b\33\1\2\u01da\u01db\7#\2\2\u01db\u01dc\7\61\2\2\u01dc\u01de\b"+
		"\33\1\2\u01dd\u01d7\3\2\2\2\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e3\b\33\1\2\u01e3\65\3\2\2\2\u01e4\u01f1\b\34\1\2\u01e5"+
		"\u01e6\7\25\2\2\u01e6\u01f2\b\34\1\2\u01e7\u01e8\7\61\2\2\u01e8\u01ee"+
		"\b\34\1\2\u01e9\u01ea\7\30\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ed\b\34\1"+
		"\2\u01ec\u01e9\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01e5\3\2\2\2\u01f1"+
		"\u01e7\3\2\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f4\7\3\2\2\u01f4\u01f5\7\4"+
		"\2\2\u01f5\u01f7\b\34\1\2\u01f6\u01f3\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f9\b\34\1\2\u01f9\67\3\2\2\2\u01fa\u01fb\7\61"+
		"\2\2\u01fb\u020a\b\35\1\2\u01fc\u01fd\7\30\2\2\u01fd\u01fe\7\61\2\2\u01fe"+
		"\u0209\b\35\1\2\u01ff\u0200\7\3\2\2\u0200\u0201\7-\2\2\u0201\u0202\7\4"+
		"\2\2\u0202\u0209\b\35\1\2\u0203\u0204\7\3\2\2\u0204\u0205\58\35\2\u0205"+
		"\u0206\7\4\2\2\u0206\u0207\b\35\1\2\u0207\u0209\3\2\2\2\u0208\u01fc\3"+
		"\2\2\2\u0208\u01ff\3\2\2\2\u0208\u0203\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b9\3\2\2\2\u020c\u020a\3\2\2\2"+
		"\u020d\u020e\7\3\2\2\u020e\u020f\b\36\1\2\u020f\u0210\5> \2\u0210\u0211"+
		"\b\36\1\2\u0211\u0218\3\2\2\2\u0212\u0213\7\27\2\2\u0213\u0214\5> \2\u0214"+
		"\u0215\b\36\1\2\u0215\u0217\3\2\2\2\u0216\u0212\3\2\2\2\u0217\u021a\3"+
		"\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u021c\7\4\2\2\u021c\u021d\b\36\1\2\u021d\u0226\3"+
		"\2\2\2\u021e\u021f\7\3\2\2\u021f\u0220\5&\24\2\u0220\u0221\7\26\2\2\u0221"+
		"\u0222\5&\24\2\u0222\u0223\7\4\2\2\u0223\u0224\b\36\1\2\u0224\u0226\3"+
		"\2\2\2\u0225\u020d\3\2\2\2\u0225\u021e\3\2\2\2\u0226;\3\2\2\2\u0227\u0228"+
		"\7\61\2\2\u0228\u0236\b\37\1\2\u0229\u022a\58\35\2\u022a\u022b\b\37\1"+
		"\2\u022b\u0236\3\2\2\2\u022c\u022d\5(\25\2\u022d\u022e\b\37\1\2\u022e"+
		"\u0236\3\2\2\2\u022f\u0230\5*\26\2\u0230\u0231\b\37\1\2\u0231\u0236\3"+
		"\2\2\2\u0232\u0233\5:\36\2\u0233\u0234\b\37\1\2\u0234\u0236\3\2\2\2\u0235"+
		"\u0227\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u022c\3\2\2\2\u0235\u022f\3\2"+
		"\2\2\u0235\u0232\3\2\2\2\u0236=\3\2\2\2\u0237\u0238\5\62\32\2\u0238\u0239"+
		"\b \1\2\u0239\u024c\3\2\2\2\u023a\u023b\7\61\2\2\u023b\u024c\b \1\2\u023c"+
		"\u023d\58\35\2\u023d\u023e\b \1\2\u023e\u024c\3\2\2\2\u023f\u0240\5(\25"+
		"\2\u0240\u0241\b \1\2\u0241\u024c\3\2\2\2\u0242\u0243\5*\26\2\u0243\u0244"+
		"\b \1\2\u0244\u024c\3\2\2\2\u0245\u0246\5:\36\2\u0246\u0247\b \1\2\u0247"+
		"\u024c\3\2\2\2\u0248\u0249\5.\30\2\u0249\u024a\b \1\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0237\3\2\2\2\u024b\u023a\3\2\2\2\u024b\u023c\3\2\2\2\u024b"+
		"\u023f\3\2\2\2\u024b\u0242\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0248\3\2"+
		"\2\2\u024c?\3\2\2\2\u024d\u0250\b!\1\2\u024e\u024f\7$\2\2\u024f\u0251"+
		"\b!\1\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u025a\3\2\2\2\u0252"+
		"\u0253\5> \2\u0253\u0254\b!\1\2\u0254\u025b\3\2\2\2\u0255\u0256\7\6\2"+
		"\2\u0256\u0257\5R*\2\u0257\u0258\7\7\2\2\u0258\u0259\b!\1\2\u0259\u025b"+
		"\3\2\2\2\u025a\u0252\3\2\2\2\u025a\u0255\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\b!\1\2\u025dA\3\2\2\2\u025e\u025f\5@!\2\u025f\u0262\b\"\1\2\u0260"+
		"\u0261\7%\2\2\u0261\u0263\b\"\1\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263C\3\2\2\2\u0264\u0265\5B\"\2\u0265\u026c\b#\1\2\u0266\u0267"+
		"\7&\2\2\u0267\u0268\5B\"\2\u0268\u0269\b#\1\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0266\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026dE\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\5D#\2\u0270\u027b"+
		"\b$\1\2\u0271\u0272\7\'\2\2\u0272\u0273\5D#\2\u0273\u0274\b$\1\2\u0274"+
		"\u027a\3\2\2\2\u0275\u0276\7#\2\2\u0276\u0277\5D#\2\u0277\u0278\b$\1\2"+
		"\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2\2\u027a\u027d"+
		"\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027cG\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027e\u027f\5F$\2\u027f\u028a\b%\1\2\u0280\u0281\7(\2\2"+
		"\u0281\u0282\5F$\2\u0282\u0283\b%\1\2\u0283\u0289\3\2\2\2\u0284\u0285"+
		"\7$\2\2\u0285\u0286\5F$\2\u0286\u0287\b%\1\2\u0287\u0289\3\2\2\2\u0288"+
		"\u0280\3\2\2\2\u0288\u0284\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028bI\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e"+
		"\5H%\2\u028e\u02b6\b&\1\2\u028f\u0290\7\32\2\2\u0290\u0291\5H%\2\u0291"+
		"\u0292\b&\1\2\u0292\u02b5\3\2\2\2\u0293\u0294\7\33\2\2\u0294\u0295\5H"+
		"%\2\u0295\u0296\b&\1\2\u0296\u02b5\3\2\2\2\u0297\u0298\7\34\2\2\u0298"+
		"\u0299\5H%\2\u0299\u029a\b&\1\2\u029a\u02b5\3\2\2\2\u029b\u029c\7\35\2"+
		"\2\u029c\u029d\5H%\2\u029d\u029e\b&\1\2\u029e\u02b5\3\2\2\2\u029f\u02a0"+
		"\7\33\2\2\u02a0\u02a1\7\36\2\2\u02a1\u02a2\5H%\2\u02a2\u02a3\b&\1\2\u02a3"+
		"\u02b5\3\2\2\2\u02a4\u02a5\7\37\2\2\u02a5\u02a6\5H%\2\u02a6\u02a7\b&\1"+
		"\2\u02a7\u02b5\3\2\2\2\u02a8\u02a9\7 \2\2\u02a9\u02aa\5H%\2\u02aa\u02ab"+
		"\b&\1\2\u02ab\u02b5\3\2\2\2\u02ac\u02ad\7!\2\2\u02ad\u02ae\5H%\2\u02ae"+
		"\u02af\b&\1\2\u02af\u02b5\3\2\2\2\u02b0\u02b1\7\"\2\2\u02b1\u02b2\5H%"+
		"\2\u02b2\u02b3\b&\1\2\u02b3\u02b5\3\2\2\2\u02b4\u028f\3\2\2\2\u02b4\u0293"+
		"\3\2\2\2\u02b4\u0297\3\2\2\2\u02b4\u029b\3\2\2\2\u02b4\u029f\3\2\2\2\u02b4"+
		"\u02a4\3\2\2\2\u02b4\u02a8\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b4\u02b0\3\2"+
		"\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"K\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba\5J&\2\u02ba\u02bb\b\'\1\2\u02bb"+
		"\u02c1\3\2\2\2\u02bc\u02bd\7\36\2\2\u02bd\u02be\5J&\2\u02be\u02bf\b\'"+
		"\1\2\u02bf\u02c1\3\2\2\2\u02c0\u02b9\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c1"+
		"M\3\2\2\2\u02c2\u02c3\5L\'\2\u02c3\u02ce\b(\1\2\u02c4\u02c5\7)\2\2\u02c5"+
		"\u02c6\5R*\2\u02c6\u02c7\b(\1\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\7*\2\2"+
		"\u02c9\u02ca\5R*\2\u02ca\u02cb\b(\1\2\u02cb\u02cd\3\2\2\2\u02cc\u02c4"+
		"\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cfO\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\5N(\2\u02d2"+
		"\u02d3\7+\2\2\u02d3\u02d4\5R*\2\u02d4\u02d5\7\26\2\2\u02d5\u02d6\5R*\2"+
		"\u02d6\u02d7\b)\1\2\u02d7Q\3\2\2\2\u02d8\u02d9\5N(\2\u02d9\u02da\b*\1"+
		"\2\u02da\u02df\3\2\2\2\u02db\u02dc\5P)\2\u02dc\u02dd\b*\1\2\u02dd\u02df"+
		"\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02db\3\2\2\2\u02dfS\3\2\2\28Y]hnt"+
		"\u0093\u0095\u009b\u00ab\u00bd\u00d7\u00e2\u00ee\u0103\u010d\u0115\u0124"+
		"\u0130\u013c\u0146\u014d\u0154\u0162\u0172\u0183\u018f\u019e\u01c8\u01d2"+
		"\u01dd\u01df\u01ee\u01f1\u01f6\u0208\u020a\u0218\u0225\u0235\u024b\u0250"+
		"\u025a\u0262\u026c\u0279\u027b\u0288\u028a\u02b4\u02b6\u02c0\u02cc\u02ce"+
		"\u02de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}