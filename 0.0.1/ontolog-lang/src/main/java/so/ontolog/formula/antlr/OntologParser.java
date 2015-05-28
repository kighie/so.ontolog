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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__37=1, T__36=2, T__35=3, T__34=4, T__33=5, T__32=6, T__31=7, T__30=8, 
		T__29=9, T__28=10, T__27=11, T__26=12, T__25=13, T__24=14, T__23=15, T__22=16, 
		T__21=17, T__20=18, T__19=19, T__18=20, T__17=21, T__16=22, T__15=23, 
		T__14=24, T__13=25, T__12=26, T__11=27, T__10=28, T__9=29, T__8=30, T__7=31, 
		T__6=32, T__5=33, T__4=34, T__3=35, T__2=36, T__1=37, T__0=38, END_OF_STMT=39, 
		NUMBER=40, STRING_LITERAL=41, NULL=42, BOOLEAN=43, IDENT=44, WS=45, COMMENT=46, 
		LINE_COMMENT=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'as'", "'foreach'", "'return'", "'importJava'", "'!='", 
		"'while'", "'{'", "'}'", "'='", "'^'", "'if'", "'?'", "'<='", "'('", "'is'", 
		"'*'", "','", "'.'", "'param'", "':'", "'>='", "'['", "'<'", "'=='", "']'", 
		"'>'", "'or'", "'<>'", "'%'", "'in'", "'else'", "')'", "'and'", "'+'", 
		"'not'", "'-'", "'import'", "';'", "NUMBER", "STRING_LITERAL", "NULL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_ontologExpression = 0, RULE_ontologScript = 1, RULE_blockContents = 2, 
		RULE_importStatement = 3, RULE_methodCallStatement = 4, RULE_functionCallStatement = 5, 
		RULE_returnStatement = 6, RULE_ifStatement = 7, RULE_foreachStatement = 8, 
		RULE_whileStatement = 9, RULE_loopCondition = 10, RULE_paramDecl = 11, 
		RULE_variableDecl = 12, RULE_expression = 13, RULE_funcCallExp = 14, RULE_methodCallExp = 15, 
		RULE_arguments = 16, RULE_literalTerm = 17, RULE_pathExpr = 18, RULE_typeExpr = 19, 
		RULE_qualifiedName = 20, RULE_array = 21, RULE_iterableTerm = 22, RULE_formulaTerm = 23, 
		RULE_unary = 24, RULE_percent = 25, RULE_exponential = 26, RULE_multiplicative = 27, 
		RULE_additiveExpression = 28, RULE_comparison = 29, RULE_notExpression = 30, 
		RULE_logicalExpression = 31, RULE_ternaryExpression = 32, RULE_operatorExpression = 33;
	public static final String[] ruleNames = {
		"ontologExpression", "ontologScript", "blockContents", "importStatement", 
		"methodCallStatement", "functionCallStatement", "returnStatement", "ifStatement", 
		"foreachStatement", "whileStatement", "loopCondition", "paramDecl", "variableDecl", 
		"expression", "funcCallExp", "methodCallExp", "arguments", "literalTerm", 
		"pathExpr", "typeExpr", "qualifiedName", "array", "iterableTerm", "formulaTerm", 
		"unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"comparison", "notExpression", "logicalExpression", "ternaryExpression", 
		"operatorExpression"
	};

	@Override
	public String getGrammarFileName() { return "Ontolog.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
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
			if (_la==T__15) {
				{
				setState(69); match(T__15);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(70); paramDecl(_localctx.result);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76); match(T__12);
				}
			}

			setState(79); match(T__28);
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(80); match(T__23);
				setState(81); ((OntologExpressionContext)_localctx).expression = expression();
				setState(82); match(T__5);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(85); ((OntologExpressionContext)_localctx).expression = expression();
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
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public TerminalNode EOF() { return getToken(OntologParser.EOF, 0); }
		public ParamDeclContext paramDecl(int i) {
			return getRuleContext(ParamDeclContext.class,i);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ParamDeclContext> paramDecl() {
			return getRuleContexts(ParamDeclContext.class);
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
			while (_la==T__33 || _la==T__0) {
				{
				{
				setState(91); importStatement();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(97); paramDecl(_localctx.result);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); blockContents(_localctx.result);
			setState(104); match(EOF);
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
		public ReturnStatementContext returnStatement;
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public List<ForeachStatementContext> foreachStatement() {
			return getRuleContexts(ForeachStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<MethodCallStatementContext> methodCallStatement() {
			return getRuleContexts(MethodCallStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public ForeachStatementContext foreachStatement(int i) {
			return getRuleContext(ForeachStatementContext.class,i);
		}
		public MethodCallStatementContext methodCallStatement(int i) {
			return getRuleContext(MethodCallStatementContext.class,i);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__26) | (1L << IDENT))) != 0)) {
				{
				setState(122);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(107); ((BlockContentsContext)_localctx).variableDecl = variableDecl();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).variableDecl.result); 
					}
					break;
				case 2:
					{
					setState(110); ((BlockContentsContext)_localctx).methodCallStatement = methodCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).methodCallStatement.result); 
					}
					break;
				case 3:
					{
					setState(113); ((BlockContentsContext)_localctx).functionCallStatement = functionCallStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).functionCallStatement.result); 
					}
					break;
				case 4:
					{
					setState(116); ((BlockContentsContext)_localctx).ifStatement = ifStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).ifStatement.result); 
					}
					break;
				case 5:
					{
					setState(119); ((BlockContentsContext)_localctx).foreachStatement = foreachStatement();
					 _localctx.stmtHolder.append(((BlockContentsContext)_localctx).foreachStatement.result); 
					}
					break;
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(127); ((BlockContentsContext)_localctx).returnStatement = returnStatement();
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
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
			setState(146);
			switch (_input.LA(1)) {
			case T__33:
				{
				{
				setState(132); match(T__33);
				setState(133); ((ImportStatementContext)_localctx).qualifiedName = qualifiedName();
				setState(134); match(END_OF_STMT);
				 importJava(((ImportStatementContext)_localctx).qualifiedName.result); 
				}
				}
				break;
			case T__0:
				{
				{
				setState(137); match(T__0);
				setState(138); ((ImportStatementContext)_localctx).pathExpr = pathExpr();
				 String alias = null; 
				{
				setState(140); ((ImportStatementContext)_localctx).IDENT = match(IDENT);
					alias = (((ImportStatementContext)_localctx).IDENT!=null?((ImportStatementContext)_localctx).IDENT.getText():null); 
				}
				setState(143); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
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
			setState(148); ((MethodCallStatementContext)_localctx).methodCallExp = methodCallExp();
			 ((MethodCallStatementContext)_localctx).result =  asStatement(((MethodCallStatementContext)_localctx).methodCallExp.result); 
			setState(150); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
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
			setState(152); ((FunctionCallStatementContext)_localctx).funcCallExp = funcCallExp();
			 ((FunctionCallStatementContext)_localctx).result =  asStatement(((FunctionCallStatementContext)_localctx).funcCallExp.result); 
			setState(154); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(156); match(T__34);
				setState(157); ((ReturnStatementContext)_localctx).expression = expression();
				setState(158); match(END_OF_STMT);
				 ((ReturnStatementContext)_localctx).result =  returnStatement(((ReturnStatementContext)_localctx).expression.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(161); match(T__34);
				setState(162); match(END_OF_STMT);
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
		public BlockContentsContext blockContents(int i) {
			return getRuleContext(BlockContentsContext.class,i);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<BlockContentsContext> blockContents() {
			return getRuleContexts(BlockContentsContext.class);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
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
			setState(166); match(T__26);
			 beginScope(); 
			setState(168); match(T__23);
			setState(169); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(170); match(T__5);

						((IfStatementContext)_localctx).result =  ifStatement(IF, ((IfStatementContext)_localctx).logicalExpression.result); 
					
			setState(172); match(T__30);
			setState(173); blockContents(_localctx.result);
			setState(174); match(T__29);
				endScope(); 
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176); match(T__6);
					setState(177); match(T__26);
					 beginScope(); 
					setState(179); match(T__23);
					setState(180); ((IfStatementContext)_localctx).logicalExpression = logicalExpression();
					setState(181); match(T__5);
					 ASTBlock elseIfStmt = _localctx.result.createElseIf(createASTToken(ELSEIF), ((IfStatementContext)_localctx).logicalExpression.result); 
					setState(183); match(T__30);
					setState(184); blockContents(elseIfStmt);
					setState(185); match(T__29);
						endScope(); 
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(201);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(193); match(T__6);
				 beginScope(); 
				 ASTBlock elseStmt = _localctx.result.checkOutElse(createASTToken(ELSE)); 
				setState(196); match(T__30);
				setState(197); blockContents(elseStmt);
				setState(198); match(T__29);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public LoopConditionContext loopCondition() {
			return getRuleContext(LoopConditionContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
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
			setState(203); match(T__35);
				beginScope(); 
			setState(205); match(T__23);
			setState(206); ((ForeachStatementContext)_localctx).loopCondition = loopCondition();
			setState(207); match(T__5);
			 	((ForeachStatementContext)_localctx).result =  foreachStatement(FOREACH, ((ForeachStatementContext)_localctx).loopCondition.result);  
			setState(209); match(T__30);
			setState(210); blockContents(_localctx.result);
			setState(211); match(T__29);
			setState(213);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(212); match(END_OF_STMT);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ASTBlock result;
		public LogicalExpressionContext logicalExpression;
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(T__31);
				beginScope(); 
			setState(219); match(T__23);
			setState(220); ((WhileStatementContext)_localctx).logicalExpression = logicalExpression();
			setState(221); match(T__5);
			 	((WhileStatementContext)_localctx).result =  foreachStatement(FOREACH, ((WhileStatementContext)_localctx).logicalExpression.result);  
			setState(223); match(T__30);
			setState(224); blockContents(_localctx.result);
			setState(225); match(T__29);
			setState(227);
			_la = _input.LA(1);
			if (_la==END_OF_STMT) {
				{
				setState(226); match(END_OF_STMT);
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
		public IterableTermContext iterableTerm() {
			return getRuleContext(IterableTermContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
		enterRule(_localctx, 20, RULE_loopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); ((LoopConditionContext)_localctx).typeExpr = typeExpr();
			setState(232); ((LoopConditionContext)_localctx).IDENT = match(IDENT);
			 
						ASTDeclaration varDecl = variableDecl(VAR_DECL, ((LoopConditionContext)_localctx).typeExpr.result, (((LoopConditionContext)_localctx).IDENT!=null?((LoopConditionContext)_localctx).IDENT.getText():null),null );
					
			setState(234); match(T__7);
			setState(235); ((LoopConditionContext)_localctx).iterableTerm = iterableTerm();
				
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

	public static class ParamDeclContext extends ParserRuleContext {
		public CompilationUnit module;
		public QualifiedNameContext type;
		public Token name;
		public Token IDENT;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
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
			setState(238); match(T__18);
			 String alias = null; 
			setState(240); ((ParamDeclContext)_localctx).type = qualifiedName();
			setState(241); ((ParamDeclContext)_localctx).name = match(IDENT);
			setState(245);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(242); match(T__36);
				setState(243); ((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( paramDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(248); match(END_OF_STMT);
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
		public TerminalNode END_OF_STMT() { return getToken(OntologParser.END_OF_STMT, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
			setState(251); ((VariableDeclContext)_localctx).typeExpr = typeExpr();
			setState(252); ((VariableDeclContext)_localctx).IDENT = match(IDENT);
			setState(257);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(253); match(T__28);
				setState(254); ((VariableDeclContext)_localctx).expression = expression();
					valueExpr = ((VariableDeclContext)_localctx).expression.result;  
				}
			}

			setState(259); match(END_OF_STMT);
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
			setState(262); ((ExpressionContext)_localctx).operatorExpression = operatorExpression();
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(265); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(266); match(T__23);
				setState(267); match(T__5);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(269); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(270); match(T__23);
				setState(271); ((FuncCallExpContext)_localctx).arguments = arguments();
				setState(272); match(T__5);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(277); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(278); match(T__19);
				setState(279); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(280); match(T__23);
				setState(281); match(T__5);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(284); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(285); match(T__19);
				setState(286); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(287); match(T__23);
				setState(288); ((MethodCallExpContext)_localctx).arguments = arguments();
				setState(289); match(T__5);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
			setState(295); ((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(298); match(T__20);
				setState(299); ((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(306);
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
		public TerminalNode NULL() { return getToken(OntologParser.NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(OntologParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(OntologParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(OntologParser.NUMBER, 0); }
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
			setState(315);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(307); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(313); match(NULL);
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
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
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
			setState(318); ((PathExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37 || _la==T__19) {
				{
				setState(326);
				switch (_input.LA(1)) {
				case T__19:
					{
					{
					setState(320); match(T__19);
					setState(321); ((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append(".").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case T__37:
					{
					{
					setState(323); match(T__37);
					setState(324); ((PathExprContext)_localctx).IDENT = match(IDENT);
					 builder.append("/").append( (((PathExprContext)_localctx).IDENT!=null?((PathExprContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(330);
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
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
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
			setState(334); ((TypeExprContext)_localctx).IDENT = match(IDENT);
			 builder.append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(336); match(T__19);
				setState(337); ((TypeExprContext)_localctx).IDENT = match(IDENT);
				 builder.append(".").append( (((TypeExprContext)_localctx).IDENT!=null?((TypeExprContext)_localctx).IDENT.getText():null)); 
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(344); match(T__15);
				setState(345); match(T__12);
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
		public TerminalNode NUMBER(int i) {
			return getToken(OntologParser.NUMBER, i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(OntologParser.IDENT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OntologParser.NUMBER); }
		public List<TerminalNode> IDENT() { return getTokens(OntologParser.IDENT); }
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
			setState(351); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(365);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						{
						setState(353); match(T__19);
						setState(354); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(356); match(T__15);
						setState(357); ((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(358); match(T__12);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(360); match(T__15);
						setState(361); ((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(362); match(T__12);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(369);
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
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(370); match(T__15);
				 List<ASTExpr> elements = new LinkedList<ASTExpr>(); 
				{
				setState(372); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(375); match(T__20);
					setState(376); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384); match(T__12);
					((ArrayContext)_localctx).result =  array(elements); 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(387); match(T__15);
				setState(388); ((ArrayContext)_localctx).from = expression();
				setState(389); match(T__17);
				setState(390); ((ArrayContext)_localctx).to = expression();
				setState(391); match(T__12);
				 
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
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  variable( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  variable( ((IterableTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407); ((IterableTermContext)_localctx).array = array();
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
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
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
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415); ((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =   ((FormulaTermContext)_localctx).methodCallExp.result ; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426); ((FormulaTermContext)_localctx).array = array();
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
			setState(434);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(432); match(T__1);
				 negative = true; 
				}
			}

			setState(444);
			switch (_input.LA(1)) {
			case T__15:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(436); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__23:
				{
				setState(439); match(T__23);
				setState(440); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(441); match(T__5);
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
			setState(448); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(452);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(450); match(T__8);
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
			setState(454); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(456); match(T__27);
				setState(457); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(464);
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
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
		}
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
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
			setState(465); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37 || _la==T__21) {
				{
				setState(475);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(467); match(T__21);
					setState(468); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__37:
					{
					setState(471); match(T__37);
					setState(472); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
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
			setState(480); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__1) {
				{
				setState(490);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(482); match(T__3);
					setState(483); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__1:
					{
					setState(486); match(T__1);
					setState(487); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(494);
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
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
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
			setState(495); ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__24) | (1L << T__22) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__9))) != 0)) {
				{
				setState(534);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(497); match(T__13);
					setState(498); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(501); match(T__22);
					setState(502); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(505); match(T__32);
					setState(506); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(509); match(T__9);
					setState(510); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(513); match(T__22);
					setState(514); match(T__2);
					setState(515); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(518); match(T__11);
					setState(519); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(522); match(T__16);
					setState(523); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(526); match(T__14);
					setState(527); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(530); match(T__24);
					setState(531); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(538);
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
			setState(546);
			switch (_input.LA(1)) {
			case T__23:
			case T__15:
			case T__1:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(539); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__2:
				{
				setState(542); match(T__2);
				setState(543); ((NotExpressionContext)_localctx).comparison = comparison();
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
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
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
			setState(548); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(558);
					switch (_input.LA(1)) {
					case T__4:
						{
						setState(550); match(T__4);
						setState(551); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__10:
						{
						setState(554); match(T__10);
						setState(555); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(562);
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
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
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
			setState(563); ((TernaryExpressionContext)_localctx).op1 = logicalExpression();
			setState(564); match(T__25);
			{
			setState(565); ((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(566); match(T__17);
			{
			setState(567); ((TernaryExpressionContext)_localctx).op3 = operatorExpression();
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
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
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
			setState(576);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(570); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
				 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
				}
				break;
			case 2:
				{
				setState(573); ((OperatorExpressionContext)_localctx).ternaryExpression = ternaryExpression();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0245\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\5\2P\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\7\3_\n\3\f\3\16\3b\13"+
		"\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4"+
		"\3\4\3\4\5\4\u0085\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0095\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bf\n\t\f\t\16"+
		"\t\u00c2\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e6\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0104\n\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0116"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0127\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0131\n\22\f\22\16\22\u0134\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u013e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0149\n\24\f\24\16\24\u014c\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0156\n\25\f\25\16\25\u0159\13\25\3\25\3\25\3\25\5\25\u015e"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0170\n\26\f\26\16\26\u0173\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u017e\n\27\f\27\16\27\u0181\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u018d\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u019d\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01b0\n\31\3\32\3\32\3\32\5\32\u01b5\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01bf\n\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\5\33\u01c7\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u01cf\n\34\f\34\16\34\u01d2\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u01de\n\35\f\35\16\35\u01e1\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01ed\n\36\f\36\16\36\u01f0\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0219"+
		"\n\37\f\37\16\37\u021c\13\37\3 \3 \3 \3 \3 \3 \3 \5 \u0225\n \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\7!\u0231\n!\f!\16!\u0234\13!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0243\n#\3#\2\2$\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\2\u0262\2F\3\2\2\2\4"+
		"\\\3\2\2\2\6~\3\2\2\2\b\u0094\3\2\2\2\n\u0096\3\2\2\2\f\u009a\3\2\2\2"+
		"\16\u00a6\3\2\2\2\20\u00a8\3\2\2\2\22\u00cd\3\2\2\2\24\u00db\3\2\2\2\26"+
		"\u00e9\3\2\2\2\30\u00f0\3\2\2\2\32\u00fc\3\2\2\2\34\u0108\3\2\2\2\36\u0115"+
		"\3\2\2\2 \u0126\3\2\2\2\"\u0128\3\2\2\2$\u013d\3\2\2\2&\u013f\3\2\2\2"+
		"(\u014f\3\2\2\2*\u0161\3\2\2\2,\u018c\3\2\2\2.\u019c\3\2\2\2\60\u01af"+
		"\3\2\2\2\62\u01b1\3\2\2\2\64\u01c2\3\2\2\2\66\u01c8\3\2\2\28\u01d3\3\2"+
		"\2\2:\u01e2\3\2\2\2<\u01f1\3\2\2\2>\u0224\3\2\2\2@\u0226\3\2\2\2B\u0235"+
		"\3\2\2\2D\u0242\3\2\2\2FO\b\2\1\2GK\7\31\2\2HJ\5\30\r\2IH\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NP\7\34\2\2OG\3\2\2\2OP"+
		"\3\2\2\2PQ\3\2\2\2QZ\7\f\2\2RS\7\21\2\2ST\5\34\17\2TU\7#\2\2UV\b\2\1\2"+
		"V[\3\2\2\2WX\5\34\17\2XY\b\2\1\2Y[\3\2\2\2ZR\3\2\2\2ZW\3\2\2\2[\3\3\2"+
		"\2\2\\`\b\3\1\2]_\5\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3"+
		"\2\2\2b`\3\2\2\2ce\5\30\r\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi"+
		"\3\2\2\2hf\3\2\2\2ij\5\6\4\2jk\7\2\2\3kl\b\3\1\2l\5\3\2\2\2mn\5\32\16"+
		"\2no\b\4\1\2o}\3\2\2\2pq\5\n\6\2qr\b\4\1\2r}\3\2\2\2st\5\f\7\2tu\b\4\1"+
		"\2u}\3\2\2\2vw\5\20\t\2wx\b\4\1\2x}\3\2\2\2yz\5\22\n\2z{\b\4\1\2{}\3\2"+
		"\2\2|m\3\2\2\2|p\3\2\2\2|s\3\2\2\2|v\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5"+
		"\16\b\2\u0082\u0083\b\4\1\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\7\2\2\u0087\u0088\5*\26\2"+
		"\u0088\u0089\7)\2\2\u0089\u008a\b\5\1\2\u008a\u0095\3\2\2\2\u008b\u008c"+
		"\7(\2\2\u008c\u008d\5&\24\2\u008d\u008e\b\5\1\2\u008e\u008f\7.\2\2\u008f"+
		"\u0090\b\5\1\2\u0090\u0091\3\2\2\2\u0091\u0092\7)\2\2\u0092\u0093\b\5"+
		"\1\2\u0093\u0095\3\2\2\2\u0094\u0086\3\2\2\2\u0094\u008b\3\2\2\2\u0095"+
		"\t\3\2\2\2\u0096\u0097\5 \21\2\u0097\u0098\b\6\1\2\u0098\u0099\7)\2\2"+
		"\u0099\13\3\2\2\2\u009a\u009b\5\36\20\2\u009b\u009c\b\7\1\2\u009c\u009d"+
		"\7)\2\2\u009d\r\3\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\5\34\17\2\u00a0"+
		"\u00a1\7)\2\2\u00a1\u00a2\b\b\1\2\u00a2\u00a7\3\2\2\2\u00a3\u00a4\7\6"+
		"\2\2\u00a4\u00a5\7)\2\2\u00a5\u00a7\b\b\1\2\u00a6\u009e\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\b\t\1"+
		"\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\5@!\2\u00ac\u00ad\7#\2\2\u00ad\u00ae"+
		"\b\t\1\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\7\13\2\2"+
		"\u00b1\u00c0\b\t\1\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5"+
		"\b\t\1\2\u00b5\u00b6\7\21\2\2\u00b6\u00b7\5@!\2\u00b7\u00b8\7#\2\2\u00b8"+
		"\u00b9\b\t\1\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\5\6\4\2\u00bb\u00bc\7\13"+
		"\2\2\u00bc\u00bd\b\t\1\2\u00bd\u00bf\3\2\2\2\u00be\u00b2\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cb\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\b\t\1\2\u00c5"+
		"\u00c6\b\t\1\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9\7\13"+
		"\2\2\u00c9\u00ca\b\t\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00cf\b\n\1"+
		"\2\u00cf\u00d0\7\21\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7#\2\2\u00d2"+
		"\u00d3\b\n\1\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\5\6\4\2\u00d5\u00d7\7\13"+
		"\2\2\u00d6\u00d8\7)\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\b\n\1\2\u00da\23\3\2\2\2\u00db\u00dc\7\t\2"+
		"\2\u00dc\u00dd\b\13\1\2\u00dd\u00de\7\21\2\2\u00de\u00df\5@!\2\u00df\u00e0"+
		"\7#\2\2\u00e0\u00e1\b\13\1\2\u00e1\u00e2\7\n\2\2\u00e2\u00e3\5\6\4\2\u00e3"+
		"\u00e5\7\13\2\2\u00e4\u00e6\7)\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\13\1\2\u00e8\25\3\2\2\2\u00e9\u00ea"+
		"\5(\25\2\u00ea\u00eb\7.\2\2\u00eb\u00ec\b\f\1\2\u00ec\u00ed\7!\2\2\u00ed"+
		"\u00ee\5.\30\2\u00ee\u00ef\b\f\1\2\u00ef\27\3\2\2\2\u00f0\u00f1\7\26\2"+
		"\2\u00f1\u00f2\b\r\1\2\u00f2\u00f3\5*\26\2\u00f3\u00f7\7.\2\2\u00f4\u00f5"+
		"\7\4\2\2\u00f5\u00f6\7.\2\2\u00f6\u00f8\b\r\1\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\r\1\2\u00fa\u00fb\7)"+
		"\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\b\16\1\2\u00fd\u00fe\5(\25\2\u00fe\u0103"+
		"\7.\2\2\u00ff\u0100\7\f\2\2\u0100\u0101\5\34\17\2\u0101\u0102\b\16\1\2"+
		"\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\7)\2\2\u0106\u0107\b\16\1\2\u0107\33\3\2\2\2\u0108"+
		"\u0109\5D#\2\u0109\u010a\b\17\1\2\u010a\35\3\2\2\2\u010b\u010c\7.\2\2"+
		"\u010c\u010d\7\21\2\2\u010d\u010e\7#\2\2\u010e\u0116\b\20\1\2\u010f\u0110"+
		"\7.\2\2\u0110\u0111\7\21\2\2\u0111\u0112\5\"\22\2\u0112\u0113\7#\2\2\u0113"+
		"\u0114\b\20\1\2\u0114\u0116\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010f\3"+
		"\2\2\2\u0116\37\3\2\2\2\u0117\u0118\5*\26\2\u0118\u0119\7\25\2\2\u0119"+
		"\u011a\7.\2\2\u011a\u011b\7\21\2\2\u011b\u011c\7#\2\2\u011c\u011d\b\21"+
		"\1\2\u011d\u0127\3\2\2\2\u011e\u011f\5*\26\2\u011f\u0120\7\25\2\2\u0120"+
		"\u0121\7.\2\2\u0121\u0122\7\21\2\2\u0122\u0123\5\"\22\2\u0123\u0124\7"+
		"#\2\2\u0124\u0125\b\21\1\2\u0125\u0127\3\2\2\2\u0126\u0117\3\2\2\2\u0126"+
		"\u011e\3\2\2\2\u0127!\3\2\2\2\u0128\u0129\b\22\1\2\u0129\u012a\5\34\17"+
		"\2\u012a\u012b\b\22\1\2\u012b\u0132\3\2\2\2\u012c\u012d\7\24\2\2\u012d"+
		"\u012e\5\34\17\2\u012e\u012f\b\22\1\2\u012f\u0131\3\2\2\2\u0130\u012c"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"#\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7-\2\2\u0136\u013e\b\23\1\2"+
		"\u0137\u0138\7+\2\2\u0138\u013e\b\23\1\2\u0139\u013a\7*\2\2\u013a\u013e"+
		"\b\23\1\2\u013b\u013c\7,\2\2\u013c\u013e\b\23\1\2\u013d\u0135\3\2\2\2"+
		"\u013d\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e%\3"+
		"\2\2\2\u013f\u0140\b\24\1\2\u0140\u0141\7.\2\2\u0141\u014a\b\24\1\2\u0142"+
		"\u0143\7\25\2\2\u0143\u0144\7.\2\2\u0144\u0149\b\24\1\2\u0145\u0146\7"+
		"\3\2\2\u0146\u0147\7.\2\2\u0147\u0149\b\24\1\2\u0148\u0142\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\24\1\2\u014e"+
		"\'\3\2\2\2\u014f\u0150\b\25\1\2\u0150\u0151\7.\2\2\u0151\u0157\b\25\1"+
		"\2\u0152\u0153\7\25\2\2\u0153\u0154\7.\2\2\u0154\u0156\b\25\1\2\u0155"+
		"\u0152\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015d\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\31\2\2\u015b"+
		"\u015c\7\34\2\2\u015c\u015e\b\25\1\2\u015d\u015a\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\25\1\2\u0160)\3\2\2\2\u0161\u0162"+
		"\7.\2\2\u0162\u0171\b\26\1\2\u0163\u0164\7\25\2\2\u0164\u0165\7.\2\2\u0165"+
		"\u0170\b\26\1\2\u0166\u0167\7\31\2\2\u0167\u0168\7*\2\2\u0168\u0169\7"+
		"\34\2\2\u0169\u0170\b\26\1\2\u016a\u016b\7\31\2\2\u016b\u016c\5*\26\2"+
		"\u016c\u016d\7\34\2\2\u016d\u016e\b\26\1\2\u016e\u0170\3\2\2\2\u016f\u0163"+
		"\3\2\2\2\u016f\u0166\3\2\2\2\u016f\u016a\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172+\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0174\u0175\7\31\2\2\u0175\u0176\b\27\1\2\u0176\u0177\5\60\31\2\u0177"+
		"\u0178\b\27\1\2\u0178\u017f\3\2\2\2\u0179\u017a\7\24\2\2\u017a\u017b\5"+
		"\60\31\2\u017b\u017c\b\27\1\2\u017c\u017e\3\2\2\2\u017d\u0179\3\2\2\2"+
		"\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\34\2\2\u0183\u0184\b\27\1\2"+
		"\u0184\u018d\3\2\2\2\u0185\u0186\7\31\2\2\u0186\u0187\5\34\17\2\u0187"+
		"\u0188\7\27\2\2\u0188\u0189\5\34\17\2\u0189\u018a\7\34\2\2\u018a\u018b"+
		"\b\27\1\2\u018b\u018d\3\2\2\2\u018c\u0174\3\2\2\2\u018c\u0185\3\2\2\2"+
		"\u018d-\3\2\2\2\u018e\u018f\7.\2\2\u018f\u019d\b\30\1\2\u0190\u0191\5"+
		"*\26\2\u0191\u0192\b\30\1\2\u0192\u019d\3\2\2\2\u0193\u0194\5\36\20\2"+
		"\u0194\u0195\b\30\1\2\u0195\u019d\3\2\2\2\u0196\u0197\5 \21\2\u0197\u0198"+
		"\b\30\1\2\u0198\u019d\3\2\2\2\u0199\u019a\5,\27\2\u019a\u019b\b\30\1\2"+
		"\u019b\u019d\3\2\2\2\u019c\u018e\3\2\2\2\u019c\u0190\3\2\2\2\u019c\u0193"+
		"\3\2\2\2\u019c\u0196\3\2\2\2\u019c\u0199\3\2\2\2\u019d/\3\2\2\2\u019e"+
		"\u019f\5$\23\2\u019f\u01a0\b\31\1\2\u01a0\u01b0\3\2\2\2\u01a1\u01a2\7"+
		".\2\2\u01a2\u01b0\b\31\1\2\u01a3\u01a4\5*\26\2\u01a4\u01a5\b\31\1\2\u01a5"+
		"\u01b0\3\2\2\2\u01a6\u01a7\5\36\20\2\u01a7\u01a8\b\31\1\2\u01a8\u01b0"+
		"\3\2\2\2\u01a9\u01aa\5 \21\2\u01aa\u01ab\b\31\1\2\u01ab\u01b0\3\2\2\2"+
		"\u01ac\u01ad\5,\27\2\u01ad\u01ae\b\31\1\2\u01ae\u01b0\3\2\2\2\u01af\u019e"+
		"\3\2\2\2\u01af\u01a1\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a6\3\2\2\2\u01af"+
		"\u01a9\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0\61\3\2\2\2\u01b1\u01b4\b\32\1"+
		"\2\u01b2\u01b3\7\'\2\2\u01b3\u01b5\b\32\1\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01be\3\2\2\2\u01b6\u01b7\5\60\31\2\u01b7\u01b8\b"+
		"\32\1\2\u01b8\u01bf\3\2\2\2\u01b9\u01ba\7\21\2\2\u01ba\u01bb\5D#\2\u01bb"+
		"\u01bc\7#\2\2\u01bc\u01bd\b\32\1\2\u01bd\u01bf\3\2\2\2\u01be\u01b6\3\2"+
		"\2\2\u01be\u01b9\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\b\32\1\2\u01c1"+
		"\63\3\2\2\2\u01c2\u01c3\5\62\32\2\u01c3\u01c6\b\33\1\2\u01c4\u01c5\7 "+
		"\2\2\u01c5\u01c7\b\33\1\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\65\3\2\2\2\u01c8\u01c9\5\64\33\2\u01c9\u01d0\b\34\1\2\u01ca\u01cb\7\r"+
		"\2\2\u01cb\u01cc\5\64\33\2\u01cc\u01cd\b\34\1\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01ca\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\67\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\5\66\34\2\u01d4"+
		"\u01df\b\35\1\2\u01d5\u01d6\7\23\2\2\u01d6\u01d7\5\66\34\2\u01d7\u01d8"+
		"\b\35\1\2\u01d8\u01de\3\2\2\2\u01d9\u01da\7\3\2\2\u01da\u01db\5\66\34"+
		"\2\u01db\u01dc\b\35\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd"+
		"\u01d9\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e09\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\58\35\2\u01e3\u01ee"+
		"\b\36\1\2\u01e4\u01e5\7%\2\2\u01e5\u01e6\58\35\2\u01e6\u01e7\b\36\1\2"+
		"\u01e7\u01ed\3\2\2\2\u01e8\u01e9\7\'\2\2\u01e9\u01ea\58\35\2\u01ea\u01eb"+
		"\b\36\1\2\u01eb\u01ed\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01e8\3\2\2\2"+
		"\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef;\3"+
		"\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\5:\36\2\u01f2\u021a\b\37\1\2\u01f3"+
		"\u01f4\7\33\2\2\u01f4\u01f5\5:\36\2\u01f5\u01f6\b\37\1\2\u01f6\u0219\3"+
		"\2\2\2\u01f7\u01f8\7\22\2\2\u01f8\u01f9\5:\36\2\u01f9\u01fa\b\37\1\2\u01fa"+
		"\u0219\3\2\2\2\u01fb\u01fc\7\b\2\2\u01fc\u01fd\5:\36\2\u01fd\u01fe\b\37"+
		"\1\2\u01fe\u0219\3\2\2\2\u01ff\u0200\7\37\2\2\u0200\u0201\5:\36\2\u0201"+
		"\u0202\b\37\1\2\u0202\u0219\3\2\2\2\u0203\u0204\7\22\2\2\u0204\u0205\7"+
		"&\2\2\u0205\u0206\5:\36\2\u0206\u0207\b\37\1\2\u0207\u0219\3\2\2\2\u0208"+
		"\u0209\7\35\2\2\u0209\u020a\5:\36\2\u020a\u020b\b\37\1\2\u020b\u0219\3"+
		"\2\2\2\u020c\u020d\7\30\2\2\u020d\u020e\5:\36\2\u020e\u020f\b\37\1\2\u020f"+
		"\u0219\3\2\2\2\u0210\u0211\7\32\2\2\u0211\u0212\5:\36\2\u0212\u0213\b"+
		"\37\1\2\u0213\u0219\3\2\2\2\u0214\u0215\7\20\2\2\u0215\u0216\5:\36\2\u0216"+
		"\u0217\b\37\1\2\u0217\u0219\3\2\2\2\u0218\u01f3\3\2\2\2\u0218\u01f7\3"+
		"\2\2\2\u0218\u01fb\3\2\2\2\u0218\u01ff\3\2\2\2\u0218\u0203\3\2\2\2\u0218"+
		"\u0208\3\2\2\2\u0218\u020c\3\2\2\2\u0218\u0210\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"=\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\5<\37\2\u021e\u021f\b \1\2\u021f"+
		"\u0225\3\2\2\2\u0220\u0221\7&\2\2\u0221\u0222\5<\37\2\u0222\u0223\b \1"+
		"\2\u0223\u0225\3\2\2\2\u0224\u021d\3\2\2\2\u0224\u0220\3\2\2\2\u0225?"+
		"\3\2\2\2\u0226\u0227\5> \2\u0227\u0232\b!\1\2\u0228\u0229\7$\2\2\u0229"+
		"\u022a\5D#\2\u022a\u022b\b!\1\2\u022b\u0231\3\2\2\2\u022c\u022d\7\36\2"+
		"\2\u022d\u022e\5D#\2\u022e\u022f\b!\1\2\u022f\u0231\3\2\2\2\u0230\u0228"+
		"\3\2\2\2\u0230\u022c\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233A\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\5@!\2\u0236"+
		"\u0237\7\17\2\2\u0237\u0238\5D#\2\u0238\u0239\7\27\2\2\u0239\u023a\5D"+
		"#\2\u023a\u023b\b\"\1\2\u023bC\3\2\2\2\u023c\u023d\5@!\2\u023d\u023e\b"+
		"#\1\2\u023e\u0243\3\2\2\2\u023f\u0240\5B\"\2\u0240\u0241\b#\1\2\u0241"+
		"\u0243\3\2\2\2\u0242\u023c\3\2\2\2\u0242\u023f\3\2\2\2\u0243E\3\2\2\2"+
		".KOZ`f|~\u0084\u0094\u00a6\u00c0\u00cb\u00d7\u00e5\u00f7\u0103\u0115\u0126"+
		"\u0132\u013d\u0148\u014a\u0157\u015d\u016f\u0171\u017f\u018c\u019c\u01af"+
		"\u01b4\u01be\u01c6\u01d0\u01dd\u01df\u01ec\u01ee\u0218\u021a\u0224\u0230"+
		"\u0232\u0242";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}