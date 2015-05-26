// Generated from Ontolog.g4 by ANTLR 4.5
package so.ontolog.formula.antlr;

	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.data.type.TypeSpec;
	import so.ontolog.formula.runtime.QName;
	import so.ontolog.formula.ast.*;
	import so.ontolog.formula.ast.stmt.ASTIfStatement;
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
		T__31=32, T__32=33, T__33=34, T__34=35, END_OF_STMT=36, NUMBER=37, STRING_LITERAL=38, 
		NULL=39, BOOLEAN=40, IDENT=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_ontologExpression = 0, RULE_ontologScript = 1, RULE_blockContents = 2, 
		RULE_importStatement = 3, RULE_methodCallStatement = 4, RULE_functionCallStatement = 5, 
		RULE_returnStatement = 6, RULE_ifStatement = 7, RULE_paramDecl = 8, RULE_variableDecl = 9, 
		RULE_expression = 10, RULE_funcCallExp = 11, RULE_methodCallExp = 12, 
		RULE_arguments = 13, RULE_literalTerm = 14, RULE_pathExpr = 15, RULE_typeExpr = 16, 
		RULE_qualifiedName = 17, RULE_formulaTerm = 18, RULE_unary = 19, RULE_percent = 20, 
		RULE_exponential = 21, RULE_multiplicative = 22, RULE_additiveExpression = 23, 
		RULE_comparison = 24, RULE_notExpression = 25, RULE_logicalExpression = 26, 
		RULE_ternaryExpression = 27, RULE_operatorExpression = 28;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"paramDecl", "variableDecl", "expression", "funcCallExp", "methodCallExp", 
		"arguments", "literalTerm", "pathExpr", "typeExpr", "qualifiedName", "formulaTerm", 
		"unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"comparison", "notExpression", "logicalExpression", "ternaryExpression", 
		"operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'param'", "'as'", "'.'", "','", "'/'", 
		"'-'", "'%'", "'^'", "'*'", "'+'", "'=='", "'is'", "'!='", "'<>'", "'not'", 
		"'>'", "'>='", "'<'", "'<='", "'and'", "'or'", "'?'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", 
		"WS", "COMMENT", "LINE_COMMENT"
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
			setState(67);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(59);
				match(T__0);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(60);
					paramDecl(_localctx.result);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(T__1);
				}
			}

			setState(69);
			match(T__2);
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(70);
				match(T__3);
				setState(71);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(72);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(75);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__6) {
				{
				{
				setState(81);
				importStatement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(87);
				paramDecl(_localctx.result);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			blockContents(_localctx.result);
			setState(94);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==IDENT) {
				{
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(97);
					((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(100);
					((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(103);
					((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(106);
					((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(114);
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
			setState(133);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(119);
				match(T__5);
				setState(120);
				((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(121);
				match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__6:
				{
				{
				setState(124);
				match(T__6);
				setState(125);
				((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(127);
				((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(130);
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
			setState(135);
			((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(137);
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
			setState(139);
			((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(141);
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
			setState(143);
			match(T__7);
			setState(144);
			((ReturnStatementContext)_localctx).expression = expression();
			setState(145);
			match(END_OF_STMT);
			 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
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
			setState(148);
			match(T__8);
			 beginScope(); 
			setState(150);
			match(T__3);
			setState(151);
			((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(152);
			match(T__4);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(154);
			match(T__9);
			setState(155);
			blockContents(_localctx.result);
			setState(156);
			match(T__10);
				endScope(); 
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(T__11);
					setState(159);
					match(T__8);
					 beginScope(); 
					setState(161);
					match(T__3);
					setState(162);
					((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(163);
					match(T__4);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(165);
					match(T__9);
					setState(166);
					blockContents(elseIfStmt);
					setState(167);
					match(T__10);
						endScope(); 
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(183);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(175);
				match(T__11);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(178);
				match(T__9);
				setState(179);
				blockContents(elseStmt);
				setState(180);
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
		enterRule(_localctx, 16, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__12);
			 String alias = null; 
			setState(187);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(188);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(192);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(189);
				match(T__13);
				setState(190);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(195);
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
		enterRule(_localctx, 18, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ASTExpr valueExpr = null; 
			setState(198);
			((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(199);
			((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(204);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(200);
				match(T__2);
				setState(201);
				((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(206);
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
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
		enterRule(_localctx, 22, RULE_funcCallExp);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(212);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(213);
				match(T__3);
				setState(214);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(216);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(217);
				match(T__3);
				setState(218);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(219);
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
		enterRule(_localctx, 24, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(224);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(225);
				match(T__14);
				setState(226);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(227);
				match(T__3);
				setState(228);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(231);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(232);
				match(T__14);
				setState(233);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(234);
				match(T__3);
				setState(235);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(236);
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
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).argList =  new LinkedList<ASTExpr>(); 
			{
			setState(242);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(245);
				match(T__15);
				setState(246);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(253);
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
		enterRule(_localctx, 28, RULE_literalTerm);
		try {
			setState(262);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
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
		enterRule(_localctx, 30, RULE_pathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(265);
			((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__16) {
				{
				setState(273);
				switch (_input.LA(1)) {
				case T__14:
					{
					{
					setState(267);
					match(T__14);
					setState(268);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__16:
					{
					{
					setState(270);
					match(T__16);
					setState(271);
					((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(277);
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
		enterRule(_localctx, 32, RULE_typeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 StringBuilder builder = new StringBuilder(); boolean isArray = false;
			setState(281);
			((TypeExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(283);
				match(T__14);
				setState(284);
				((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(291);
				match(T__0);
				setState(292);
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
		enterRule(_localctx, 34, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(312);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						{
						setState(300);
						match(T__14);
						setState(301);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(303);
						match(T__0);
						setState(304);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(305);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(307);
						match(T__0);
						setState(308);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(309);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class FormulaTermContext extends ParserRuleContext {
		public ASTExpr result;
		public LiteralTermContext literalTerm;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
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
		enterRule(_localctx, 36, RULE_formulaTerm);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
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
		enterRule(_localctx, 38, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(336);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(334);
				match(T__17);
				 negative = true; 
				}
			}

			setState(346);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(338);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(341);
				match(T__3);
				setState(342);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(343);
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
		enterRule(_localctx, 40, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(354);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(352);
				match(T__18);
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
		enterRule(_localctx, 42, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(358);
				match(T__19);
				setState(359);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(366);
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
		enterRule(_localctx, 44, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__20) {
				{
				setState(377);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(369);
					match(T__20);
					setState(370);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__16:
					{
					setState(373);
					match(T__16);
					setState(374);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(381);
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
		enterRule(_localctx, 46, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__21) {
				{
				setState(392);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(384);
					match(T__21);
					setState(385);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__17:
					{
					setState(388);
					match(T__17);
					setState(389);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(396);
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
		enterRule(_localctx, 48, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(436);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(399);
					match(T__22);
					setState(400);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(403);
					match(T__23);
					setState(404);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(407);
					match(T__24);
					setState(408);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(411);
					match(T__25);
					setState(412);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(415);
					match(T__23);
					setState(416);
					match(T__26);
					setState(417);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(420);
					match(T__27);
					setState(421);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(424);
					match(T__28);
					setState(425);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(428);
					match(T__29);
					setState(429);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(432);
					match(T__30);
					setState(433);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(440);
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
		enterRule(_localctx, 50, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			switch (_input.LA(1)) {
			case T__3:
			case T__17:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(441);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__26:
				{
				setState(444);
				match(T__26);
				setState(445);
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
		enterRule(_localctx, 52, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(460);
					switch (_input.LA(1)) {
					case T__31:
						{
						setState(452);
						match(T__31);
						setState(453);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__32:
						{
						setState(456);
						match(T__32);
						setState(457);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 54, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(466);
			match(T__33);
			{
			setState(467);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(468);
			match(T__34);
			{
			setState(469);
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
		enterRule(_localctx, 56, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(472);
				((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(475);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u01e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\5\2F\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"Q\n\2\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4"+
		"\f\4\16\4s\13\4\3\4\3\4\3\4\5\4x\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00c3\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00cf\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00e1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f2\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00fc\n\17\f\17\16\17\u00ff\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0109\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0114\n\21\f\21\16\21\u0117\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0121\n\22\f\22\16\22\u0124\13\22\3\22"+
		"\3\22\3\22\5\22\u0129\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013b\n\23\f\23\16\23\u013e\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u014e\n\24\3\25\3\25\3\25\5\25\u0153\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u015d\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u0165\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u016d\n\27\f\27\16\27\u0170"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u017c\n"+
		"\30\f\30\16\30\u017f\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u018b\n\31\f\31\16\31\u018e\13\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01b7\n\32\f\32\16\32\u01ba\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c3\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01cf\n\34\f\34\16\34\u01d2\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01e1\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:\2\2\u01fa\2<\3\2\2\2\4R\3\2\2\2\6q\3\2\2\2\b\u0087\3"+
		"\2\2\2\n\u0089\3\2\2\2\f\u008d\3\2\2\2\16\u0091\3\2\2\2\20\u0096\3\2\2"+
		"\2\22\u00bb\3\2\2\2\24\u00c7\3\2\2\2\26\u00d3\3\2\2\2\30\u00e0\3\2\2\2"+
		"\32\u00f1\3\2\2\2\34\u00f3\3\2\2\2\36\u0108\3\2\2\2 \u010a\3\2\2\2\"\u011a"+
		"\3\2\2\2$\u012c\3\2\2\2&\u014d\3\2\2\2(\u014f\3\2\2\2*\u0160\3\2\2\2,"+
		"\u0166\3\2\2\2.\u0171\3\2\2\2\60\u0180\3\2\2\2\62\u018f\3\2\2\2\64\u01c2"+
		"\3\2\2\2\66\u01c4\3\2\2\28\u01d3\3\2\2\2:\u01e0\3\2\2\2<E\b\2\1\2=A\7"+
		"\3\2\2>@\5\22\n\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA"+
		"\3\2\2\2DF\7\4\2\2E=\3\2\2\2EF\3\2\2\2FG\3\2\2\2GP\7\5\2\2HI\7\6\2\2I"+
		"J\5\26\f\2JK\7\7\2\2KL\b\2\1\2LQ\3\2\2\2MN\5\26\f\2NO\b\2\1\2OQ\3\2\2"+
		"\2PH\3\2\2\2PM\3\2\2\2Q\3\3\2\2\2RV\b\3\1\2SU\5\b\5\2TS\3\2\2\2UX\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XV\3\2\2\2Y[\5\22\n\2ZY\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\6\4\2`a\7\2\2\3"+
		"ab\b\3\1\2b\5\3\2\2\2cd\5\24\13\2de\b\4\1\2ep\3\2\2\2fg\5\n\6\2gh\b\4"+
		"\1\2hp\3\2\2\2ij\5\f\7\2jk\b\4\1\2kp\3\2\2\2lm\5\20\t\2mn\b\4\1\2np\3"+
		"\2\2\2oc\3\2\2\2of\3\2\2\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3"+
		"\2\2\2rw\3\2\2\2sq\3\2\2\2tu\5\16\b\2uv\b\4\1\2vx\3\2\2\2wt\3\2\2\2wx"+
		"\3\2\2\2x\7\3\2\2\2yz\7\b\2\2z{\5$\23\2{|\7&\2\2|}\b\5\1\2}\u0088\3\2"+
		"\2\2~\177\7\t\2\2\177\u0080\5 \21\2\u0080\u0081\b\5\1\2\u0081\u0082\7"+
		"+\2\2\u0082\u0083\b\5\1\2\u0083\u0084\3\2\2\2\u0084\u0085\7&\2\2\u0085"+
		"\u0086\b\5\1\2\u0086\u0088\3\2\2\2\u0087y\3\2\2\2\u0087~\3\2\2\2\u0088"+
		"\t\3\2\2\2\u0089\u008a\5\32\16\2\u008a\u008b\b\6\1\2\u008b\u008c\7&\2"+
		"\2\u008c\13\3\2\2\2\u008d\u008e\5\30\r\2\u008e\u008f\b\7\1\2\u008f\u0090"+
		"\7&\2\2\u0090\r\3\2\2\2\u0091\u0092\7\n\2\2\u0092\u0093\5\26\f\2\u0093"+
		"\u0094\7&\2\2\u0094\u0095\b\b\1\2\u0095\17\3\2\2\2\u0096\u0097\7\13\2"+
		"\2\u0097\u0098\b\t\1\2\u0098\u0099\7\6\2\2\u0099\u009a\5\66\34\2\u009a"+
		"\u009b\7\7\2\2\u009b\u009c\b\t\1\2\u009c\u009d\7\f\2\2\u009d\u009e\5\6"+
		"\4\2\u009e\u009f\7\r\2\2\u009f\u00ae\b\t\1\2\u00a0\u00a1\7\16\2\2\u00a1"+
		"\u00a2\7\13\2\2\u00a2\u00a3\b\t\1\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5"+
		"\66\34\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\b\t\1\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\u00a9\5\6\4\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\b\t\1\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00a0\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b9\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\16"+
		"\2\2\u00b2\u00b3\b\t\1\2\u00b3\u00b4\b\t\1\2\u00b4\u00b5\7\f\2\2\u00b5"+
		"\u00b6\5\6\4\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\b\t\1\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc"+
		"\7\17\2\2\u00bc\u00bd\b\n\1\2\u00bd\u00be\5$\23\2\u00be\u00c2\7+\2\2\u00bf"+
		"\u00c0\7\20\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c3\b\n\1\2\u00c2\u00bf\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\n\1\2\u00c5"+
		"\u00c6\7&\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\b\13\1\2\u00c8\u00c9\5\"\22"+
		"\2\u00c9\u00ce\7+\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd"+
		"\b\13\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1\u00d2\b\13\1\2\u00d2\25"+
		"\3\2\2\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\b\f\1\2\u00d5\27\3\2\2\2\u00d6"+
		"\u00d7\7+\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00e1\b\r"+
		"\1\2\u00da\u00db\7+\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\5\34\17\2\u00dd"+
		"\u00de\7\7\2\2\u00de\u00df\b\r\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d6\3\2"+
		"\2\2\u00e0\u00da\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4"+
		"\7\21\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\7\7\2\2\u00e7"+
		"\u00e8\b\16\1\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7"+
		"\21\2\2\u00eb\u00ec\7+\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5\34\17\2\u00ee"+
		"\u00ef\7\7\2\2\u00ef\u00f0\b\16\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e2\3"+
		"\2\2\2\u00f1\u00e9\3\2\2\2\u00f2\33\3\2\2\2\u00f3\u00f4\b\17\1\2\u00f4"+
		"\u00f5\5\26\f\2\u00f5\u00f6\b\17\1\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\7"+
		"\22\2\2\u00f8\u00f9\5\26\f\2\u00f9\u00fa\b\17\1\2\u00fa\u00fc\3\2\2\2"+
		"\u00fb\u00f7\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\35\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7*\2\2\u0101"+
		"\u0109\b\20\1\2\u0102\u0103\7(\2\2\u0103\u0109\b\20\1\2\u0104\u0105\7"+
		"\'\2\2\u0105\u0109\b\20\1\2\u0106\u0107\7)\2\2\u0107\u0109\b\20\1\2\u0108"+
		"\u0100\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\37\3\2\2\2\u010a\u010b\b\21\1\2\u010b\u010c\7+\2\2\u010c\u0115"+
		"\b\21\1\2\u010d\u010e\7\21\2\2\u010e\u010f\7+\2\2\u010f\u0114\b\21\1\2"+
		"\u0110\u0111\7\23\2\2\u0111\u0112\7+\2\2\u0112\u0114\b\21\1\2\u0113\u010d"+
		"\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\b\21"+
		"\1\2\u0119!\3\2\2\2\u011a\u011b\b\22\1\2\u011b\u011c\7+\2\2\u011c\u0122"+
		"\b\22\1\2\u011d\u011e\7\21\2\2\u011e\u011f\7+\2\2\u011f\u0121\b\22\1\2"+
		"\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0128\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\3\2\2\u0126"+
		"\u0127\7\4\2\2\u0127\u0129\b\22\1\2\u0128\u0125\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\22\1\2\u012b#\3\2\2\2\u012c\u012d"+
		"\7+\2\2\u012d\u013c\b\23\1\2\u012e\u012f\7\21\2\2\u012f\u0130\7+\2\2\u0130"+
		"\u013b\b\23\1\2\u0131\u0132\7\3\2\2\u0132\u0133\7\'\2\2\u0133\u0134\7"+
		"\4\2\2\u0134\u013b\b\23\1\2\u0135\u0136\7\3\2\2\u0136\u0137\5$\23\2\u0137"+
		"\u0138\7\4\2\2\u0138\u0139\b\23\1\2\u0139\u013b\3\2\2\2\u013a\u012e\3"+
		"\2\2\2\u013a\u0131\3\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d%\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0140\5\36\20\2\u0140\u0141\b\24\1\2\u0141\u014e\3\2\2\2\u0142"+
		"\u0143\7+\2\2\u0143\u014e\b\24\1\2\u0144\u0145\5$\23\2\u0145\u0146\b\24"+
		"\1\2\u0146\u014e\3\2\2\2\u0147\u0148\5\30\r\2\u0148\u0149\b\24\1\2\u0149"+
		"\u014e\3\2\2\2\u014a\u014b\5\32\16\2\u014b\u014c\b\24\1\2\u014c\u014e"+
		"\3\2\2\2\u014d\u013f\3\2\2\2\u014d\u0142\3\2\2\2\u014d\u0144\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\'\3\2\2\2\u014f\u0152\b\25\1"+
		"\2\u0150\u0151\7\24\2\2\u0151\u0153\b\25\1\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u015c\3\2\2\2\u0154\u0155\5&\24\2\u0155\u0156\b\25"+
		"\1\2\u0156\u015d\3\2\2\2\u0157\u0158\7\6\2\2\u0158\u0159\5:\36\2\u0159"+
		"\u015a\7\7\2\2\u015a\u015b\b\25\1\2\u015b\u015d\3\2\2\2\u015c\u0154\3"+
		"\2\2\2\u015c\u0157\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b\25\1\2\u015f"+
		")\3\2\2\2\u0160\u0161\5(\25\2\u0161\u0164\b\26\1\2\u0162\u0163\7\25\2"+
		"\2\u0163\u0165\b\26\1\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"+\3\2\2\2\u0166\u0167\5*\26\2\u0167\u016e\b\27\1\2\u0168\u0169\7\26\2"+
		"\2\u0169\u016a\5*\26\2\u016a\u016b\b\27\1\2\u016b\u016d\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f-\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\5,\27\2\u0172\u017d"+
		"\b\30\1\2\u0173\u0174\7\27\2\2\u0174\u0175\5,\27\2\u0175\u0176\b\30\1"+
		"\2\u0176\u017c\3\2\2\2\u0177\u0178\7\23\2\2\u0178\u0179\5,\27\2\u0179"+
		"\u017a\b\30\1\2\u017a\u017c\3\2\2\2\u017b\u0173\3\2\2\2\u017b\u0177\3"+
		"\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"/\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\5.\30\2\u0181\u018c\b\31\1\2"+
		"\u0182\u0183\7\30\2\2\u0183\u0184\5.\30\2\u0184\u0185\b\31\1\2\u0185\u018b"+
		"\3\2\2\2\u0186\u0187\7\24\2\2\u0187\u0188\5.\30\2\u0188\u0189\b\31\1\2"+
		"\u0189\u018b\3\2\2\2\u018a\u0182\3\2\2\2\u018a\u0186\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\61\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\5\60\31\2\u0190\u01b8\b\32\1\2\u0191\u0192"+
		"\7\31\2\2\u0192\u0193\5\60\31\2\u0193\u0194\b\32\1\2\u0194\u01b7\3\2\2"+
		"\2\u0195\u0196\7\32\2\2\u0196\u0197\5\60\31\2\u0197\u0198\b\32\1\2\u0198"+
		"\u01b7\3\2\2\2\u0199\u019a\7\33\2\2\u019a\u019b\5\60\31\2\u019b\u019c"+
		"\b\32\1\2\u019c\u01b7\3\2\2\2\u019d\u019e\7\34\2\2\u019e\u019f\5\60\31"+
		"\2\u019f\u01a0\b\32\1\2\u01a0\u01b7\3\2\2\2\u01a1\u01a2\7\32\2\2\u01a2"+
		"\u01a3\7\35\2\2\u01a3\u01a4\5\60\31\2\u01a4\u01a5\b\32\1\2\u01a5\u01b7"+
		"\3\2\2\2\u01a6\u01a7\7\36\2\2\u01a7\u01a8\5\60\31\2\u01a8\u01a9\b\32\1"+
		"\2\u01a9\u01b7\3\2\2\2\u01aa\u01ab\7\37\2\2\u01ab\u01ac\5\60\31\2\u01ac"+
		"\u01ad\b\32\1\2\u01ad\u01b7\3\2\2\2\u01ae\u01af\7 \2\2\u01af\u01b0\5\60"+
		"\31\2\u01b0\u01b1\b\32\1\2\u01b1\u01b7\3\2\2\2\u01b2\u01b3\7!\2\2\u01b3"+
		"\u01b4\5\60\31\2\u01b4\u01b5\b\32\1\2\u01b5\u01b7\3\2\2\2\u01b6\u0191"+
		"\3\2\2\2\u01b6\u0195\3\2\2\2\u01b6\u0199\3\2\2\2\u01b6\u019d\3\2\2\2\u01b6"+
		"\u01a1\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01aa\3\2\2\2\u01b6\u01ae\3\2"+
		"\2\2\u01b6\u01b2\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\63\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\5\62\32"+
		"\2\u01bc\u01bd\b\33\1\2\u01bd\u01c3\3\2\2\2\u01be\u01bf\7\35\2\2\u01bf"+
		"\u01c0\5\62\32\2\u01c0\u01c1\b\33\1\2\u01c1\u01c3\3\2\2\2\u01c2\u01bb"+
		"\3\2\2\2\u01c2\u01be\3\2\2\2\u01c3\65\3\2\2\2\u01c4\u01c5\5\64\33\2\u01c5"+
		"\u01d0\b\34\1\2\u01c6\u01c7\7\"\2\2\u01c7\u01c8\5:\36\2\u01c8\u01c9\b"+
		"\34\1\2\u01c9\u01cf\3\2\2\2\u01ca\u01cb\7#\2\2\u01cb\u01cc\5:\36\2\u01cc"+
		"\u01cd\b\34\1\2\u01cd\u01cf\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01ca\3"+
		"\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\67\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5\66\34\2\u01d4\u01d5\7$\2"+
		"\2\u01d5\u01d6\5:\36\2\u01d6\u01d7\7%\2\2\u01d7\u01d8\5:\36\2\u01d8\u01d9"+
		"\b\35\1\2\u01d99\3\2\2\2\u01da\u01db\5\66\34\2\u01db\u01dc\b\36\1\2\u01dc"+
		"\u01e1\3\2\2\2\u01dd\u01de\58\35\2\u01de\u01df\b\36\1\2\u01df\u01e1\3"+
		"\2\2\2\u01e0\u01da\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e1;\3\2\2\2(AEPV\\o"+
		"qw\u0087\u00ae\u00b9\u00c2\u00ce\u00e0\u00f1\u00fd\u0108\u0113\u0115\u0122"+
		"\u0128\u013a\u013c\u014d\u0152\u015c\u0164\u016e\u017b\u017d\u018a\u018c"+
		"\u01b6\u01b8\u01c2\u01ce\u01d0\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}