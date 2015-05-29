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
		RULE_functionDecl = 16, RULE_expression = 17, RULE_funcCallExp = 18, RULE_methodCallExp = 19, 
		RULE_arguments = 20, RULE_chooseExpr = 21, RULE_chooseWhenExpr = 22, RULE_literalTerm = 23, 
		RULE_pathExpr = 24, RULE_typeExpr = 25, RULE_qualifiedName = 26, RULE_array = 27, 
		RULE_iterableTerm = 28, RULE_formulaTerm = 29, RULE_unary = 30, RULE_percent = 31, 
		RULE_exponential = 32, RULE_multiplicative = 33, RULE_additiveExpression = 34, 
		RULE_comparison = 35, RULE_notExpression = 36, RULE_logicalExpression = 37, 
		RULE_ternaryExpression = 38, RULE_operatorExpression = 39;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"foreachStatement", "loopCondition", "whileStatement", "assignStatement", 
		"leftAssign", "rightAssign", "paramDecl", "variableDecl", "functionDecl", 
		"expression", "funcCallExp", "methodCallExp", "arguments", "chooseExpr", 
		"chooseWhenExpr", "literalTerm", "pathExpr", "typeExpr", "qualifiedName", 
		"array", "iterableTerm", "formulaTerm", "unary", "percent", "exponential", 
		"multiplicative", "additiveExpression", "comparison", "notExpression", 
		"logicalExpression", "ternaryExpression", "operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'foreach'", "'in'", "'while'", "'->'", 
		"'param'", "'as'", "'function'", "':'", "'.'", "','", "'case'", "'=='", 
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
			setState(89);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(81);
				match(T__0);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(82);
					paramDecl(_localctx.result);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(T__1);
				}
			}

			setState(91);
			match(T__2);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(92);
				match(T__3);
				setState(93);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(94);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(97);
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(103);
				importStatement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(109);
				paramDecl(_localctx.result);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			blockContents(_localctx.result);
			setState(116);
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
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__22) | (1L << T__27) | (1L << T__33) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << NULL) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				setState(140);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(119);
					((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(122);
					((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(125);
					((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(128);
					((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				case 5:
					{
					setState(131);
					((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.result); 
					}
					break;
				case 6:
					{
					setState(134);
					((BlockContentsContext)_localctx).whileStatement = whileStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).whileStatement.result); 
					}
					break;
				case 7:
					{
					setState(137);
					((BlockContentsContext)_localctx).assignStatement = assignStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).assignStatement.result); 
					}
					break;
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(145);
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
			setState(164);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(150);
				match(T__5);
				setState(151);
				((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(152);
				match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__6:
				{
				{
				setState(155);
				match(T__6);
				setState(156);
				((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(158);
				((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(161);
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
			setState(166);
			((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(168);
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
			setState(170);
			((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(172);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(174);
				match(T__7);
				setState(175);
				((ReturnStatementContext)_localctx).expression = expression();
				setState(176);
				match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(179);
				match(T__7);
				setState(180);
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
			setState(184);
			match(T__8);
			 beginScope(); 
			setState(186);
			match(T__3);
			setState(187);
			((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(188);
			match(T__4);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(190);
			match(T__9);
			setState(191);
			blockContents(_localctx.result);
			setState(192);
			match(T__10);
				endScope(); 
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(T__11);
					setState(195);
					match(T__8);
					 beginScope(); 
					setState(197);
					match(T__3);
					setState(198);
					((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(199);
					match(T__4);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(201);
					match(T__9);
					setState(202);
					blockContents(elseIfStmt);
					setState(203);
					match(T__10);
						endScope(); 
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(219);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(211);
				match(T__11);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(214);
				match(T__9);
				setState(215);
				blockContents(elseStmt);
				setState(216);
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
			setState(221);
			match(T__12);
				beginScope(); 
			setState(223);
			match(T__3);
			setState(224);
			((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(225);
			match(T__4);
			 	((ForeachStatementContext)_localctx).result =  loopStatement(FOREACH, ((ForeachStatementContext)_localctx).loopCondition.result);  
			setState(227);
			match(T__9);
			setState(228);
			blockContents(_localctx.result);
			setState(229);
			match(T__10);
			setState(231);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(230);
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
			setState(235);
			((LoopConditionContext)_localctx).typeExpr = typeExpr();
			setState(236);
			((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
						ASTDeclaration varDecl = variableDecl(VAR_DECL, ((LoopConditionContext)_localctx).typeExpr.result, (((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null),null );
					
			setState(238);
			match(T__13);
			setState(239);
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
			setState(242);
			match(T__14);
			 beginScope(); 
			setState(244);
			match(T__3);
			setState(245);
			((WhileStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(246);
			match(T__4);
			 	((WhileStatementContext)_localctx).result =  loopStatement(WHILE, ((WhileStatementContext)_localctx).logicalExpression.result);  
			setState(248);
			match(T__9);
			setState(249);
			blockContents(_localctx.result);
			setState(250);
			match(T__10);
			setState(252);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(251);
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
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(256);
				((AssignStatementContext)_localctx).leftAssign = leftAssign();
				 ((AssignStatementContext)_localctx).result =  ((AssignStatementContext)_localctx).leftAssign.result ; 
				}
				break;
			case 2:
				{
				setState(259);
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
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(265);
				((LeftAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((LeftAssignContext)_localctx).IDENT!=null?((LeftAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(267);
				((LeftAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((LeftAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(272);
			match(T__2);
			setState(273);
			((LeftAssignContext)_localctx).expression = expression();
			setState(274);
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
			setState(278);
			((RightAssignContext)_localctx).expression = expression();
			setState(279);
			match(T__15);
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(280);
				((RightAssignContext)_localctx).IDENT = match(IDENT);
				 settable = variable( (((RightAssignContext)_localctx).IDENT!=null?((RightAssignContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(282);
				((RightAssignContext)_localctx).qualifiedName = qualifiedName();
				 settable = variable(((RightAssignContext)_localctx).qualifiedName.result);
				}
				break;
			}
			setState(287);
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
			setState(290);
			match(T__16);
			 String alias = null; 
			setState(292);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(293);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(297);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(294);
				match(T__17);
				setState(295);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(300);
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
			setState(303);
			((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(304);
			((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(309);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(305);
				match(T__2);
				setState(306);
				((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(311);
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
		public TypeExprContext typeExpr;
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
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
			setState(314);
			match(T__18);
			 TypeSpec returnType = null; 
			setState(316);
			match(IDENT);
			setState(317);
			match(T__3);
			setState(318);
			match(T__4);
			setState(323);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(319);
				match(T__19);
				setState(320);
				((FunctionDeclContext)_localctx).typeExpr = typeExpr();
				 returnType = ((FunctionDeclContext)_localctx).typeExpr.result; 
				}
			}

			setState(325);
			match(T__9);
			setState(326);
			blockContents(_localctx.result);
			setState(327);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(329);
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
		enterRule(_localctx, 36, RULE_funcCallExp);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(332);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(333);
				match(T__3);
				setState(334);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(336);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(337);
				match(T__3);
				setState(338);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(339);
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
		enterRule(_localctx, 38, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(344);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(345);
				match(T__20);
				setState(346);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(347);
				match(T__3);
				setState(348);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(351);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(352);
				match(T__20);
				setState(353);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(354);
				match(T__3);
				setState(355);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(356);
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
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).argList =  new LinkedList<ASTExpr>(); 
			{
			setState(362);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(365);
				match(T__21);
				setState(366);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(373);
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
		enterRule(_localctx, 42, RULE_chooseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__22);
			setState(375);
			match(T__3);
			setState(376);
			formulaTerm();
			setState(377);
			match(T__4);
			setState(378);
			match(T__9);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				{
				setState(379);
				chooseWhenExpr();
				setState(380);
				match(T__19);
				setState(381);
				expression();
				setState(382);
				match(END_OF_STMT);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
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
		enterRule(_localctx, 44, RULE_chooseWhenExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(391);
				match(T__23);
				setState(392);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 2:
				{
				setState(395);
				match(T__24);
				setState(396);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 3:
				{
				setState(399);
				match(T__25);
				setState(400);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 4:
				{
				setState(403);
				match(T__26);
				setState(404);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 5:
				{
				setState(407);
				match(T__24);
				setState(408);
				match(T__27);
				setState(409);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 6:
				{
				setState(412);
				match(T__28);
				setState(413);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 7:
				{
				setState(416);
				match(T__29);
				setState(417);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 8:
				{
				setState(420);
				match(T__30);
				setState(421);
				((ChooseWhenExprContext)_localctx).op2 = additiveExpression();
				((ChooseWhenExprContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ChooseWhenExprContext)_localctx).op2.result); 
				}
				break;
			case 9:
				{
				setState(424);
				match(T__31);
				setState(425);
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
		enterRule(_localctx, 46, RULE_literalTerm);
		try {
			setState(438);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
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
		enterRule(_localctx, 48, RULE_pathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(441);
			((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__32) {
				{
				setState(449);
				switch (_input.LA(1)) {
				case T__20:
					{
					{
					setState(443);
					match(T__20);
					setState(444);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__32:
					{
					{
					setState(446);
					match(T__32);
					setState(447);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(453);
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
		enterRule(_localctx, 50, RULE_typeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(457);
			((TypeExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(459);
				match(T__20);
				setState(460);
				((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(467);
				match(T__0);
				setState(468);
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
		enterRule(_localctx, 52, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(488);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						{
						setState(476);
						match(T__20);
						setState(477);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(479);
						match(T__0);
						setState(480);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(481);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(483);
						match(T__0);
						setState(484);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(485);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				match(T__0);
				 List<ASTExpr> elements = new LinkedList<ASTExpr>(); 
				{
				setState(495);
				((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(498);
					match(T__21);
					setState(499);
					((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(507);
				match(T__1);
					((ArrayContext)_localctx).result =  array(elements); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(510);
				match(T__0);
				setState(511);
				((ArrayContext)_localctx).from = expression();
				setState(512);
				match(T__19);
				setState(513);
				((ArrayContext)_localctx).to = expression();
				setState(514);
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
		enterRule(_localctx, 56, RULE_iterableTerm);
		try {
			setState(533);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  variable( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  variable( ((IterableTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
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
		enterRule(_localctx, 58, RULE_formulaTerm);
		try {
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
				((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).array.result ; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
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
		enterRule(_localctx, 60, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(560);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(558);
				match(T__33);
				 negative = true; 
				}
			}

			setState(570);
			switch (_input.LA(1)) {
			case T__0:
			case T__22:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(562);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(565);
				match(T__3);
				setState(566);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(567);
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
		enterRule(_localctx, 62, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(578);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(576);
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
		enterRule(_localctx, 64, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35) {
				{
				{
				setState(582);
				match(T__35);
				setState(583);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(590);
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
		enterRule(_localctx, 66, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__36) {
				{
				setState(601);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(593);
					match(T__36);
					setState(594);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__32:
					{
					setState(597);
					match(T__32);
					setState(598);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(605);
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
		enterRule(_localctx, 68, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__37) {
				{
				setState(616);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(608);
					match(T__37);
					setState(609);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__33:
					{
					setState(612);
					match(T__33);
					setState(613);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 70, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(660);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(623);
					match(T__23);
					setState(624);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(627);
					match(T__24);
					setState(628);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(631);
					match(T__25);
					setState(632);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(635);
					match(T__26);
					setState(636);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(639);
					match(T__24);
					setState(640);
					match(T__27);
					setState(641);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(644);
					match(T__28);
					setState(645);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(648);
					match(T__29);
					setState(649);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(652);
					match(T__30);
					setState(653);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(656);
					match(T__31);
					setState(657);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(664);
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
		enterRule(_localctx, 72, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
				setState(665);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__27:
				{
				setState(668);
				match(T__27);
				setState(669);
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
		enterRule(_localctx, 74, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(684);
					switch (_input.LA(1)) {
					case T__38:
						{
						setState(676);
						match(T__38);
						setState(677);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__39:
						{
						setState(680);
						match(T__39);
						setState(681);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 76, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(690);
			match(T__40);
			{
			setState(691);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(692);
			match(T__19);
			{
			setState(693);
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
		enterRule(_localctx, 78, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(696);
				((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(699);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u02c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\7"+
		"\2V\n\2\f\2\16\2Y\13\2\3\2\5\2\\\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2g\n\2\3\3\3\3\7\3k\n\3\f\3\16\3n\13\3\3\3\7\3q\n\3\f\3\16\3t\13"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4"+
		"\3\4\3\4\5\4\u0097\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00a7\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00b9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d1\n\t\f\t\16"+
		"\t\u00d4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ea\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ff\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0109\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0111\n\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0120\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u012c\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0138\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0146\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0159\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u016a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0174\n\26\f"+
		"\26\16\26\u0177\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0183\n\27\f\27\16\27\u0186\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01af\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u01b9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u01c4\n\32\f\32\16\32\u01c7\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u01d1\n\33\f\33\16\33\u01d4\13\33\3\33\3\33\3\33\5\33"+
		"\u01d9\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\7\34\u01eb\n\34\f\34\16\34\u01ee\13\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01f9\n\35\f\35\16\35\u01fc\13"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0208\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0218\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u022e\n\37\3 \3 \3"+
		" \5 \u0233\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u023d\n \3 \3 \3!\3!\3!\3!\5"+
		"!\u0245\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u024d\n\"\f\"\16\"\u0250\13\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u025c\n#\f#\16#\u025f\13#\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u026b\n$\f$\16$\u026e\13$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0297\n%\f%\16%\u029a\13%\3&\3&\3&\3&\3&"+
		"\3&\3&\5&\u02a3\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u02af\n"+
		"\'\f\'\16\'\u02b2\13\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u02c1"+
		"\n)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNP\2\2\u02ea\2R\3\2\2\2\4h\3\2\2\2\6\u0090\3\2\2\2\b\u00a6"+
		"\3\2\2\2\n\u00a8\3\2\2\2\f\u00ac\3\2\2\2\16\u00b8\3\2\2\2\20\u00ba\3\2"+
		"\2\2\22\u00df\3\2\2\2\24\u00ed\3\2\2\2\26\u00f4\3\2\2\2\30\u0108\3\2\2"+
		"\2\32\u010a\3\2\2\2\34\u0117\3\2\2\2\36\u0124\3\2\2\2 \u0130\3\2\2\2\""+
		"\u013c\3\2\2\2$\u014b\3\2\2\2&\u0158\3\2\2\2(\u0169\3\2\2\2*\u016b\3\2"+
		"\2\2,\u0178\3\2\2\2.\u01ae\3\2\2\2\60\u01b8\3\2\2\2\62\u01ba\3\2\2\2\64"+
		"\u01ca\3\2\2\2\66\u01dc\3\2\2\28\u0207\3\2\2\2:\u0217\3\2\2\2<\u022d\3"+
		"\2\2\2>\u022f\3\2\2\2@\u0240\3\2\2\2B\u0246\3\2\2\2D\u0251\3\2\2\2F\u0260"+
		"\3\2\2\2H\u026f\3\2\2\2J\u02a2\3\2\2\2L\u02a4\3\2\2\2N\u02b3\3\2\2\2P"+
		"\u02c0\3\2\2\2R[\b\2\1\2SW\7\3\2\2TV\5\36\20\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z\\\7\4\2\2[S\3\2\2\2[\\\3\2\2\2\\"+
		"]\3\2\2\2]f\7\5\2\2^_\7\6\2\2_`\5$\23\2`a\7\7\2\2ab\b\2\1\2bg\3\2\2\2"+
		"cd\5$\23\2de\b\2\1\2eg\3\2\2\2f^\3\2\2\2fc\3\2\2\2g\3\3\2\2\2hl\b\3\1"+
		"\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mr\3\2\2\2nl\3\2\2"+
		"\2oq\5\36\20\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2"+
		"\2\2uv\5\6\4\2vw\7\2\2\3wx\b\3\1\2x\5\3\2\2\2yz\5 \21\2z{\b\4\1\2{\u008f"+
		"\3\2\2\2|}\5\n\6\2}~\b\4\1\2~\u008f\3\2\2\2\177\u0080\5\f\7\2\u0080\u0081"+
		"\b\4\1\2\u0081\u008f\3\2\2\2\u0082\u0083\5\20\t\2\u0083\u0084\b\4\1\2"+
		"\u0084\u008f\3\2\2\2\u0085\u0086\5\22\n\2\u0086\u0087\b\4\1\2\u0087\u008f"+
		"\3\2\2\2\u0088\u0089\5\26\f\2\u0089\u008a\b\4\1\2\u008a\u008f\3\2\2\2"+
		"\u008b\u008c\5\30\r\2\u008c\u008d\b\4\1\2\u008d\u008f\3\2\2\2\u008ey\3"+
		"\2\2\2\u008e|\3\2\2\2\u008e\177\3\2\2\2\u008e\u0082\3\2\2\2\u008e\u0085"+
		"\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\5\16\b\2\u0094\u0095\b\4\1\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\7\3\2\2\2\u0098\u0099\7\b\2\2"+
		"\u0099\u009a\5\66\34\2\u009a\u009b\7,\2\2\u009b\u009c\b\5\1\2\u009c\u00a7"+
		"\3\2\2\2\u009d\u009e\7\t\2\2\u009e\u009f\5\62\32\2\u009f\u00a0\b\5\1\2"+
		"\u00a0\u00a1\7\61\2\2\u00a1\u00a2\b\5\1\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\7,\2\2\u00a4\u00a5\b\5\1\2\u00a5\u00a7\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6"+
		"\u009d\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\b\6\1\2"+
		"\u00aa\u00ab\7,\2\2\u00ab\13\3\2\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\b"+
		"\7\1\2\u00ae\u00af\7,\2\2\u00af\r\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2"+
		"\5$\23\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\b\b\1\2\u00b4\u00b9\3\2\2\2\u00b5"+
		"\u00b6\7\n\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b9\b\b\1\2\u00b8\u00b0\3\2"+
		"\2\2\u00b8\u00b5\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc"+
		"\b\t\1\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\5L\'\2\u00be\u00bf\7\7\2\2\u00bf"+
		"\u00c0\b\t\1\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\7\r"+
		"\2\2\u00c3\u00d2\b\t\1\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c7\b\t\1\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\5L\'\2\u00c9\u00ca\7\7"+
		"\2\2\u00ca\u00cb\b\t\1\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\5\6\4\2\u00cd"+
		"\u00ce\7\r\2\2\u00ce\u00cf\b\t\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c4\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00dd\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\b"+
		"\t\1\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\5\6\4\2\u00da"+
		"\u00db\7\r\2\2\u00db\u00dc\b\t\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\21\3\2\2\2\u00df\u00e0\7\17\2\2\u00e0\u00e1"+
		"\b\n\1\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00e4\7\7\2\2"+
		"\u00e4\u00e5\b\n\1\2\u00e5\u00e6\7\f\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e9"+
		"\7\r\2\2\u00e8\u00ea\7,\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\b\n\1\2\u00ec\23\3\2\2\2\u00ed\u00ee\5\64\33"+
		"\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\b\13\1\2\u00f0\u00f1\7\20\2\2\u00f1"+
		"\u00f2\5:\36\2\u00f2\u00f3\b\13\1\2\u00f3\25\3\2\2\2\u00f4\u00f5\7\21"+
		"\2\2\u00f5\u00f6\b\f\1\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5L\'\2\u00f8"+
		"\u00f9\7\7\2\2\u00f9\u00fa\b\f\1\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\5\6"+
		"\4\2\u00fc\u00fe\7\r\2\2\u00fd\u00ff\7,\2\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\f\1\2\u0101\27\3\2\2"+
		"\2\u0102\u0103\5\32\16\2\u0103\u0104\b\r\1\2\u0104\u0109\3\2\2\2\u0105"+
		"\u0106\5\34\17\2\u0106\u0107\b\r\1\2\u0107\u0109\3\2\2\2\u0108\u0102\3"+
		"\2\2\2\u0108\u0105\3\2\2\2\u0109\31\3\2\2\2\u010a\u0110\b\16\1\2\u010b"+
		"\u010c\7\61\2\2\u010c\u0111\b\16\1\2\u010d\u010e\5\66\34\2\u010e\u010f"+
		"\b\16\1\2\u010f\u0111\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010d\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0113\7\5\2\2\u0113\u0114\5$\23\2\u0114\u0115"+
		"\7,\2\2\u0115\u0116\b\16\1\2\u0116\33\3\2\2\2\u0117\u0118\b\17\1\2\u0118"+
		"\u0119\5$\23\2\u0119\u011f\7\22\2\2\u011a\u011b\7\61\2\2\u011b\u0120\b"+
		"\17\1\2\u011c\u011d\5\66\34\2\u011d\u011e\b\17\1\2\u011e\u0120\3\2\2\2"+
		"\u011f\u011a\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\7,\2\2\u0122\u0123\b\17\1\2\u0123\35\3\2\2\2\u0124\u0125\7\23\2\2\u0125"+
		"\u0126\b\20\1\2\u0126\u0127\5\66\34\2\u0127\u012b\7\61\2\2\u0128\u0129"+
		"\7\24\2\2\u0129\u012a\7\61\2\2\u012a\u012c\b\20\1\2\u012b\u0128\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\20\1\2\u012e"+
		"\u012f\7,\2\2\u012f\37\3\2\2\2\u0130\u0131\b\21\1\2\u0131\u0132\5\64\33"+
		"\2\u0132\u0137\7\61\2\2\u0133\u0134\7\5\2\2\u0134\u0135\5$\23\2\u0135"+
		"\u0136\b\21\1\2\u0136\u0138\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7,\2\2\u013a\u013b\b\21\1\2\u013b"+
		"!\3\2\2\2\u013c\u013d\7\25\2\2\u013d\u013e\b\22\1\2\u013e\u013f\7\61\2"+
		"\2\u013f\u0140\7\6\2\2\u0140\u0145\7\7\2\2\u0141\u0142\7\26\2\2\u0142"+
		"\u0143\5\64\33\2\u0143\u0144\b\22\1\2\u0144\u0146\3\2\2\2\u0145\u0141"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\f\2\2\u0148"+
		"\u0149\5\6\4\2\u0149\u014a\7\r\2\2\u014a#\3\2\2\2\u014b\u014c\5P)\2\u014c"+
		"\u014d\b\23\1\2\u014d%\3\2\2\2\u014e\u014f\7\61\2\2\u014f\u0150\7\6\2"+
		"\2\u0150\u0151\7\7\2\2\u0151\u0159\b\24\1\2\u0152\u0153\7\61\2\2\u0153"+
		"\u0154\7\6\2\2\u0154\u0155\5*\26\2\u0155\u0156\7\7\2\2\u0156\u0157\b\24"+
		"\1\2\u0157\u0159\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u0152\3\2\2\2\u0159"+
		"\'\3\2\2\2\u015a\u015b\5\66\34\2\u015b\u015c\7\27\2\2\u015c\u015d\7\61"+
		"\2\2\u015d\u015e\7\6\2\2\u015e\u015f\7\7\2\2\u015f\u0160\b\25\1\2\u0160"+
		"\u016a\3\2\2\2\u0161\u0162\5\66\34\2\u0162\u0163\7\27\2\2\u0163\u0164"+
		"\7\61\2\2\u0164\u0165\7\6\2\2\u0165\u0166\5*\26\2\u0166\u0167\7\7\2\2"+
		"\u0167\u0168\b\25\1\2\u0168\u016a\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u0161"+
		"\3\2\2\2\u016a)\3\2\2\2\u016b\u016c\b\26\1\2\u016c\u016d\5$\23\2\u016d"+
		"\u016e\b\26\1\2\u016e\u0175\3\2\2\2\u016f\u0170\7\30\2\2\u0170\u0171\5"+
		"$\23\2\u0171\u0172\b\26\1\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176+\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u0179\7\31\2\2\u0179\u017a\7\6\2\2\u017a\u017b"+
		"\5<\37\2\u017b\u017c\7\7\2\2\u017c\u0184\7\f\2\2\u017d\u017e\5.\30\2\u017e"+
		"\u017f\7\26\2\2\u017f\u0180\5$\23\2\u0180\u0181\7,\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u017d\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7\r"+
		"\2\2\u0188-\3\2\2\2\u0189\u018a\7\32\2\2\u018a\u018b\5F$\2\u018b\u018c"+
		"\b\30\1\2\u018c\u01af\3\2\2\2\u018d\u018e\7\33\2\2\u018e\u018f\5F$\2\u018f"+
		"\u0190\b\30\1\2\u0190\u01af\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u0193\5"+
		"F$\2\u0193\u0194\b\30\1\2\u0194\u01af\3\2\2\2\u0195\u0196\7\35\2\2\u0196"+
		"\u0197\5F$\2\u0197\u0198\b\30\1\2\u0198\u01af\3\2\2\2\u0199\u019a\7\33"+
		"\2\2\u019a\u019b\7\36\2\2\u019b\u019c\5F$\2\u019c\u019d\b\30\1\2\u019d"+
		"\u01af\3\2\2\2\u019e\u019f\7\37\2\2\u019f\u01a0\5F$\2\u01a0\u01a1\b\30"+
		"\1\2\u01a1\u01af\3\2\2\2\u01a2\u01a3\7 \2\2\u01a3\u01a4\5F$\2\u01a4\u01a5"+
		"\b\30\1\2\u01a5\u01af\3\2\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a8\5F$\2\u01a8"+
		"\u01a9\b\30\1\2\u01a9\u01af\3\2\2\2\u01aa\u01ab\7\"\2\2\u01ab\u01ac\5"+
		"F$\2\u01ac\u01ad\b\30\1\2\u01ad\u01af\3\2\2\2\u01ae\u0189\3\2\2\2\u01ae"+
		"\u018d\3\2\2\2\u01ae\u0191\3\2\2\2\u01ae\u0195\3\2\2\2\u01ae\u0199\3\2"+
		"\2\2\u01ae\u019e\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae"+
		"\u01aa\3\2\2\2\u01af/\3\2\2\2\u01b0\u01b1\7\60\2\2\u01b1\u01b9\b\31\1"+
		"\2\u01b2\u01b3\7.\2\2\u01b3\u01b9\b\31\1\2\u01b4\u01b5\7-\2\2\u01b5\u01b9"+
		"\b\31\1\2\u01b6\u01b7\7/\2\2\u01b7\u01b9\b\31\1\2\u01b8\u01b0\3\2\2\2"+
		"\u01b8\u01b2\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\61"+
		"\3\2\2\2\u01ba\u01bb\b\32\1\2\u01bb\u01bc\7\61\2\2\u01bc\u01c5\b\32\1"+
		"\2\u01bd\u01be\7\27\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c4\b\32\1\2\u01c0"+
		"\u01c1\7#\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c4\b\32\1\2\u01c3\u01bd\3"+
		"\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b\32"+
		"\1\2\u01c9\63\3\2\2\2\u01ca\u01cb\b\33\1\2\u01cb\u01cc\7\61\2\2\u01cc"+
		"\u01d2\b\33\1\2\u01cd\u01ce\7\27\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d1"+
		"\b\33\1\2\u01d0\u01cd\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3\u01d8\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6"+
		"\7\3\2\2\u01d6\u01d7\7\4\2\2\u01d7\u01d9\b\33\1\2\u01d8\u01d5\3\2\2\2"+
		"\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\b\33\1\2\u01db\65"+
		"\3\2\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01ec\b\34\1\2\u01de\u01df\7\27\2"+
		"\2\u01df\u01e0\7\61\2\2\u01e0\u01eb\b\34\1\2\u01e1\u01e2\7\3\2\2\u01e2"+
		"\u01e3\7-\2\2\u01e3\u01e4\7\4\2\2\u01e4\u01eb\b\34\1\2\u01e5\u01e6\7\3"+
		"\2\2\u01e6\u01e7\5\66\34\2\u01e7\u01e8\7\4\2\2\u01e8\u01e9\b\34\1\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01de\3\2\2\2\u01ea\u01e1\3\2\2\2\u01ea\u01e5\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\67\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\3\2\2\u01f0\u01f1\b\35\1"+
		"\2\u01f1\u01f2\5<\37\2\u01f2\u01f3\b\35\1\2\u01f3\u01fa\3\2\2\2\u01f4"+
		"\u01f5\7\30\2\2\u01f5\u01f6\5<\37\2\u01f6\u01f7\b\35\1\2\u01f7\u01f9\3"+
		"\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\4"+
		"\2\2\u01fe\u01ff\b\35\1\2\u01ff\u0208\3\2\2\2\u0200\u0201\7\3\2\2\u0201"+
		"\u0202\5$\23\2\u0202\u0203\7\26\2\2\u0203\u0204\5$\23\2\u0204\u0205\7"+
		"\4\2\2\u0205\u0206\b\35\1\2\u0206\u0208\3\2\2\2\u0207\u01ef\3\2\2\2\u0207"+
		"\u0200\3\2\2\2\u02089\3\2\2\2\u0209\u020a\7\61\2\2\u020a\u0218\b\36\1"+
		"\2\u020b\u020c\5\66\34\2\u020c\u020d\b\36\1\2\u020d\u0218\3\2\2\2\u020e"+
		"\u020f\5&\24\2\u020f\u0210\b\36\1\2\u0210\u0218\3\2\2\2\u0211\u0212\5"+
		"(\25\2\u0212\u0213\b\36\1\2\u0213\u0218\3\2\2\2\u0214\u0215\58\35\2\u0215"+
		"\u0216\b\36\1\2\u0216\u0218\3\2\2\2\u0217\u0209\3\2\2\2\u0217\u020b\3"+
		"\2\2\2\u0217\u020e\3\2\2\2\u0217\u0211\3\2\2\2\u0217\u0214\3\2\2\2\u0218"+
		";\3\2\2\2\u0219\u021a\5\60\31\2\u021a\u021b\b\37\1\2\u021b\u022e\3\2\2"+
		"\2\u021c\u021d\7\61\2\2\u021d\u022e\b\37\1\2\u021e\u021f\5\66\34\2\u021f"+
		"\u0220\b\37\1\2\u0220\u022e\3\2\2\2\u0221\u0222\5&\24\2\u0222\u0223\b"+
		"\37\1\2\u0223\u022e\3\2\2\2\u0224\u0225\5(\25\2\u0225\u0226\b\37\1\2\u0226"+
		"\u022e\3\2\2\2\u0227\u0228\58\35\2\u0228\u0229\b\37\1\2\u0229\u022e\3"+
		"\2\2\2\u022a\u022b\5,\27\2\u022b\u022c\b\37\1\2\u022c\u022e\3\2\2\2\u022d"+
		"\u0219\3\2\2\2\u022d\u021c\3\2\2\2\u022d\u021e\3\2\2\2\u022d\u0221\3\2"+
		"\2\2\u022d\u0224\3\2\2\2\u022d\u0227\3\2\2\2\u022d\u022a\3\2\2\2\u022e"+
		"=\3\2\2\2\u022f\u0232\b \1\2\u0230\u0231\7$\2\2\u0231\u0233\b \1\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023c\3\2\2\2\u0234\u0235\5<"+
		"\37\2\u0235\u0236\b \1\2\u0236\u023d\3\2\2\2\u0237\u0238\7\6\2\2\u0238"+
		"\u0239\5P)\2\u0239\u023a\7\7\2\2\u023a\u023b\b \1\2\u023b\u023d\3\2\2"+
		"\2\u023c\u0234\3\2\2\2\u023c\u0237\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f"+
		"\b \1\2\u023f?\3\2\2\2\u0240\u0241\5> \2\u0241\u0244\b!\1\2\u0242\u0243"+
		"\7%\2\2\u0243\u0245\b!\1\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"A\3\2\2\2\u0246\u0247\5@!\2\u0247\u024e\b\"\1\2\u0248\u0249\7&\2\2\u0249"+
		"\u024a\5@!\2\u024a\u024b\b\"\1\2\u024b\u024d\3\2\2\2\u024c\u0248\3\2\2"+
		"\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fC"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\5B\"\2\u0252\u025d\b#\1\2\u0253"+
		"\u0254\7\'\2\2\u0254\u0255\5B\"\2\u0255\u0256\b#\1\2\u0256\u025c\3\2\2"+
		"\2\u0257\u0258\7#\2\2\u0258\u0259\5B\"\2\u0259\u025a\b#\1\2\u025a\u025c"+
		"\3\2\2\2\u025b\u0253\3\2\2\2\u025b\u0257\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eE\3\2\2\2\u025f\u025d\3\2\2\2"+
		"\u0260\u0261\5D#\2\u0261\u026c\b$\1\2\u0262\u0263\7(\2\2\u0263\u0264\5"+
		"D#\2\u0264\u0265\b$\1\2\u0265\u026b\3\2\2\2\u0266\u0267\7$\2\2\u0267\u0268"+
		"\5D#\2\u0268\u0269\b$\1\2\u0269\u026b\3\2\2\2\u026a\u0262\3\2\2\2\u026a"+
		"\u0266\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026dG\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\5F$\2\u0270\u0298"+
		"\b%\1\2\u0271\u0272\7\32\2\2\u0272\u0273\5F$\2\u0273\u0274\b%\1\2\u0274"+
		"\u0297\3\2\2\2\u0275\u0276\7\33\2\2\u0276\u0277\5F$\2\u0277\u0278\b%\1"+
		"\2\u0278\u0297\3\2\2\2\u0279\u027a\7\34\2\2\u027a\u027b\5F$\2\u027b\u027c"+
		"\b%\1\2\u027c\u0297\3\2\2\2\u027d\u027e\7\35\2\2\u027e\u027f\5F$\2\u027f"+
		"\u0280\b%\1\2\u0280\u0297\3\2\2\2\u0281\u0282\7\33\2\2\u0282\u0283\7\36"+
		"\2\2\u0283\u0284\5F$\2\u0284\u0285\b%\1\2\u0285\u0297\3\2\2\2\u0286\u0287"+
		"\7\37\2\2\u0287\u0288\5F$\2\u0288\u0289\b%\1\2\u0289\u0297\3\2\2\2\u028a"+
		"\u028b\7 \2\2\u028b\u028c\5F$\2\u028c\u028d\b%\1\2\u028d\u0297\3\2\2\2"+
		"\u028e\u028f\7!\2\2\u028f\u0290\5F$\2\u0290\u0291\b%\1\2\u0291\u0297\3"+
		"\2\2\2\u0292\u0293\7\"\2\2\u0293\u0294\5F$\2\u0294\u0295\b%\1\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0271\3\2\2\2\u0296\u0275\3\2\2\2\u0296\u0279\3\2"+
		"\2\2\u0296\u027d\3\2\2\2\u0296\u0281\3\2\2\2\u0296\u0286\3\2\2\2\u0296"+
		"\u028a\3\2\2\2\u0296\u028e\3\2\2\2\u0296\u0292\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299I\3\2\2\2\u029a\u0298"+
		"\3\2\2\2\u029b\u029c\5H%\2\u029c\u029d\b&\1\2\u029d\u02a3\3\2\2\2\u029e"+
		"\u029f\7\36\2\2\u029f\u02a0\5H%\2\u02a0\u02a1\b&\1\2\u02a1\u02a3\3\2\2"+
		"\2\u02a2\u029b\3\2\2\2\u02a2\u029e\3\2\2\2\u02a3K\3\2\2\2\u02a4\u02a5"+
		"\5J&\2\u02a5\u02b0\b\'\1\2\u02a6\u02a7\7)\2\2\u02a7\u02a8\5P)\2\u02a8"+
		"\u02a9\b\'\1\2\u02a9\u02af\3\2\2\2\u02aa\u02ab\7*\2\2\u02ab\u02ac\5P)"+
		"\2\u02ac\u02ad\b\'\1\2\u02ad\u02af\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae\u02aa"+
		"\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"M\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b4\5L\'\2\u02b4\u02b5\7+\2\2\u02b5"+
		"\u02b6\5P)\2\u02b6\u02b7\7\26\2\2\u02b7\u02b8\5P)\2\u02b8\u02b9\b(\1\2"+
		"\u02b9O\3\2\2\2\u02ba\u02bb\5L\'\2\u02bb\u02bc\b)\1\2\u02bc\u02c1\3\2"+
		"\2\2\u02bd\u02be\5N(\2\u02be\u02bf\b)\1\2\u02bf\u02c1\3\2\2\2\u02c0\u02ba"+
		"\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c1Q\3\2\2\2\64W[flr\u008e\u0090\u0096"+
		"\u00a6\u00b8\u00d2\u00dd\u00e9\u00fe\u0108\u0110\u011f\u012b\u0137\u0145"+
		"\u0158\u0169\u0175\u0184\u01ae\u01b8\u01c3\u01c5\u01d2\u01d8\u01ea\u01ec"+
		"\u01fa\u0207\u0217\u022d\u0232\u023c\u0244\u024e\u025b\u025d\u026a\u026c"+
		"\u0296\u0298\u02a2\u02ae\u02b0\u02c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}