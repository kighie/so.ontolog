// Generated from Ontolog.g4 by ANTLR 4.5
package so.ontolog.lang.antlr;

	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.lang.runtime.*;
	import so.ontolog.lang.ast.*;
	import so.ontolog.lang.build.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OntologParser extends so.ontolog.lang.antlr.AbstractOntologHandlerParser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NUMBER=29, STRING_LITERAL=30, 
		NULL=31, BOOLEAN=32, IDENT=33, WS=34, COMMENT=35, LINE_COMMENT=36;
	public static final int
		RULE_ontologExpression = 0, RULE_paramDecl = 1, RULE_expression = 2, RULE_funcCallExp = 3, 
		RULE_methodCallExp = 4, RULE_arguments = 5, RULE_literalTerm = 6, RULE_qualifiedName = 7, 
		RULE_formulaTerm = 8, RULE_unary = 9, RULE_percent = 10, RULE_exponential = 11, 
		RULE_multiplicative = 12, RULE_additiveExpression = 13, RULE_comparison = 14, 
		RULE_notExpression = 15, RULE_logicalExpression = 16, RULE_ternaryExpression = 17, 
		RULE_operatorExpression = 18;
	public static final String[] ruleNames = {
		"ontologExpression", "paramDecl", "expression", "funcCallExp", "methodCallExp", 
		"arguments", "literalTerm", "qualifiedName", "formulaTerm", "unary", "percent", 
		"exponential", "multiplicative", "additiveExpression", "comparison", "notExpression", 
		"logicalExpression", "ternaryExpression", "operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'param'", "'as'", "';'", "'.'", 
		"','", "'-'", "'%'", "'^'", "'*'", "'/'", "'+'", "'is'", "'!='", "'<>'", 
		"'not'", "'>'", "'>='", "'<'", "'<='", "'and'", "'or'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
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
			setState(47);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(39);
				match(T__0);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(40);
					paramDecl(_localctx.result);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(T__1);
				}
			}

			setState(49);
			match(T__2);
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(50);
				match(T__3);
				setState(51);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(52);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(55);
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
		enterRule(_localctx, 2, RULE_paramDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			 String alias = null; 
			setState(62);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(63);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(67);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(64);
				match(T__6);
				setState(65);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( createParamDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(70);
			match(T__7);
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
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(72);
				((ExpressionContext)_localctx).operatorExpression = operatorExpression();
				 ((ExpressionContext)_localctx).result =  ((ExpressionContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(75);
				((ExpressionContext)_localctx).funcCallExp = funcCallExp();
				 ((ExpressionContext)_localctx).result =   ((ExpressionContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(78);
				((ExpressionContext)_localctx).methodCallExp = methodCallExp();
				 ((ExpressionContext)_localctx).result =   ((ExpressionContext)_localctx).methodCallExp.result ; 
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
		enterRule(_localctx, 6, RULE_funcCallExp);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(83);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(84);
				match(T__3);
				setState(85);
				match(T__4);
				 ((FuncCallExpContext)_localctx).result =  call(FUNC_CALL, null, (((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(88);
				match(T__3);
				setState(89);
				((FuncCallExpContext)_localctx).arguments = arguments();
				setState(90);
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
		enterRule(_localctx, 8, RULE_methodCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(95);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(96);
				match(T__8);
				setState(97);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(98);
				match(T__3);
				setState(99);
				match(T__4);
				 ((MethodCallExpContext)_localctx).result =  call(METHOD_CALL, variable( ((MethodCallExpContext)_localctx).qualifiedName.result), (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(102);
				((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(103);
				match(T__8);
				setState(104);
				((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(105);
				match(T__3);
				setState(106);
				((MethodCallExpContext)_localctx).arguments = arguments();
				setState(107);
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
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).argList =  new LinkedList<ASTExpr>(); 
			{
			setState(113);
			((ArgumentsContext)_localctx).arg2 = expression();
			 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(116);
				match(T__9);
				setState(117);
				((ArgumentsContext)_localctx).arg2 = expression();
				 _localctx.argList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(124);
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
		enterRule(_localctx, 12, RULE_literalTerm);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
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
		enterRule(_localctx, 14, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						{
						setState(137);
						match(T__8);
						setState(138);
						((QualifiedNameContext)_localctx).IDENT = match(IDENT);
						 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
						}
						}
						break;
					case 2:
						{
						{
						setState(140);
						match(T__0);
						setState(141);
						((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
						setState(142);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
						}
						}
						break;
					case 3:
						{
						{
						setState(144);
						match(T__0);
						setState(145);
						((QualifiedNameContext)_localctx).index = qualifiedName();
						setState(146);
						match(T__1);
						 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
						}
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(OntologParser.IDENT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
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
		enterRule(_localctx, 16, RULE_formulaTerm);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  variable( ((FormulaTermContext)_localctx).qualifiedName.result) ; 
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
		enterRule(_localctx, 18, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(167);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(165);
				match(T__10);
				 negative = true; 
				}
			}

			setState(177);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(169);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(172);
				match(T__3);
				setState(173);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(174);
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
		enterRule(_localctx, 20, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(185);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(183);
				match(T__11);
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
		enterRule(_localctx, 22, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(189);
				match(T__12);
				setState(190);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(197);
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
		enterRule(_localctx, 24, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				setState(208);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(200);
					match(T__13);
					setState(201);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__14:
					{
					setState(204);
					match(T__14);
					setState(205);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(212);
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
		enterRule(_localctx, 26, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__15) {
				{
				setState(223);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(215);
					match(T__15);
					setState(216);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__10:
					{
					setState(219);
					match(T__10);
					setState(220);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
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
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
				{
				setState(267);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(230);
					match(T__2);
					setState(231);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(234);
					match(T__16);
					setState(235);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(238);
					match(T__17);
					setState(239);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(242);
					match(T__18);
					setState(243);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(246);
					match(T__16);
					setState(247);
					match(T__19);
					setState(248);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(251);
					match(T__20);
					setState(252);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(255);
					match(T__21);
					setState(256);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(259);
					match(T__22);
					setState(260);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(263);
					match(T__23);
					setState(264);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(271);
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
		enterRule(_localctx, 30, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			switch (_input.LA(1)) {
			case T__3:
			case T__10:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(272);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__19:
				{
				setState(275);
				match(T__19);
				setState(276);
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
		enterRule(_localctx, 32, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(291);
					switch (_input.LA(1)) {
					case T__24:
						{
						setState(283);
						match(T__24);
						setState(284);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__25:
						{
						setState(287);
						match(T__25);
						setState(288);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public LogicalExpressionContext logicalExpression;
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
		enterRule(_localctx, 34, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((TernaryExpressionContext)_localctx).logicalExpression = logicalExpression();
			 ((TernaryExpressionContext)_localctx).result =  ((TernaryExpressionContext)_localctx).logicalExpression.result;  
			{
			setState(298);
			match(T__26);
			{
			setState(299);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(300);
			match(T__27);
			{
			setState(301);
			((TernaryExpressionContext)_localctx).op3 = operatorExpression();
			}
			((TernaryExpressionContext)_localctx).result =  ternary(OP_TERNARY, _localctx.result, ((TernaryExpressionContext)_localctx).op2.result, ((TernaryExpressionContext)_localctx).op3.result); 
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

	public static class OperatorExpressionContext extends ParserRuleContext {
		public ASTExpr result;
		public LogicalExpressionContext logicalExpression;
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
		enterRule(_localctx, 36, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
			 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\5\2\62\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00a5\n\n\3\13\3\13\3\13\5\13\u00aa\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e2\n\17"+
		"\f\17\16\17\u00e5\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\7\20\u010e\n\20\f\20\16\20\u0111\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u011a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u0126\n\22\f\22\16\22\u0129\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&\2\2\u0147\2(\3\2\2\2\4>\3\2\2\2\6S\3\2\2\2\b_\3\2"+
		"\2\2\np\3\2\2\2\fr\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u00a4"+
		"\3\2\2\2\24\u00a6\3\2\2\2\26\u00b7\3\2\2\2\30\u00bd\3\2\2\2\32\u00c8\3"+
		"\2\2\2\34\u00d7\3\2\2\2\36\u00e6\3\2\2\2 \u0119\3\2\2\2\"\u011b\3\2\2"+
		"\2$\u012a\3\2\2\2&\u0132\3\2\2\2(\61\b\2\1\2)-\7\3\2\2*,\5\4\3\2+*\3\2"+
		"\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\62\7\4\2\2"+
		"\61)\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63<\7\5\2\2\64\65\7\6\2\2\65"+
		"\66\5\6\4\2\66\67\7\7\2\2\678\b\2\1\28=\3\2\2\29:\5\6\4\2:;\b\2\1\2;="+
		"\3\2\2\2<\64\3\2\2\2<9\3\2\2\2=\3\3\2\2\2>?\7\b\2\2?@\b\3\1\2@A\5\20\t"+
		"\2AE\7#\2\2BC\7\t\2\2CD\7#\2\2DF\b\3\1\2EB\3\2\2\2EF\3\2\2\2FG\3\2\2\2"+
		"GH\b\3\1\2HI\7\n\2\2I\5\3\2\2\2JK\5&\24\2KL\b\4\1\2LT\3\2\2\2MN\5\b\5"+
		"\2NO\b\4\1\2OT\3\2\2\2PQ\5\n\6\2QR\b\4\1\2RT\3\2\2\2SJ\3\2\2\2SM\3\2\2"+
		"\2SP\3\2\2\2T\7\3\2\2\2UV\7#\2\2VW\7\6\2\2WX\7\7\2\2X`\b\5\1\2YZ\7#\2"+
		"\2Z[\7\6\2\2[\\\5\f\7\2\\]\7\7\2\2]^\b\5\1\2^`\3\2\2\2_U\3\2\2\2_Y\3\2"+
		"\2\2`\t\3\2\2\2ab\5\20\t\2bc\7\13\2\2cd\7#\2\2de\7\6\2\2ef\7\7\2\2fg\b"+
		"\6\1\2gq\3\2\2\2hi\5\20\t\2ij\7\13\2\2jk\7#\2\2kl\7\6\2\2lm\5\f\7\2mn"+
		"\7\7\2\2no\b\6\1\2oq\3\2\2\2pa\3\2\2\2ph\3\2\2\2q\13\3\2\2\2rs\b\7\1\2"+
		"st\5\6\4\2tu\b\7\1\2u|\3\2\2\2vw\7\f\2\2wx\5\6\4\2xy\b\7\1\2y{\3\2\2\2"+
		"zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\"\2\2\u0080\u0088\b\b\1\2\u0081\u0082\7 \2\2\u0082\u0088\b\b\1\2\u0083"+
		"\u0084\7\37\2\2\u0084\u0088\b\b\1\2\u0085\u0086\7!\2\2\u0086\u0088\b\b"+
		"\1\2\u0087\177\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\7#\2\2\u008a\u0099\b\t\1\2\u008b"+
		"\u008c\7\13\2\2\u008c\u008d\7#\2\2\u008d\u0098\b\t\1\2\u008e\u008f\7\3"+
		"\2\2\u008f\u0090\7\37\2\2\u0090\u0091\7\4\2\2\u0091\u0098\b\t\1\2\u0092"+
		"\u0093\7\3\2\2\u0093\u0094\5\20\t\2\u0094\u0095\7\4\2\2\u0095\u0096\b"+
		"\t\1\2\u0096\u0098\3\2\2\2\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009e"+
		"\b\n\1\2\u009e\u00a5\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a5\b\n\1\2\u00a1"+
		"\u00a2\5\20\t\2\u00a2\u00a3\b\n\1\2\u00a3\u00a5\3\2\2\2\u00a4\u009c\3"+
		"\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\23\3\2\2\2\u00a6"+
		"\u00a9\b\13\1\2\u00a7\u00a8\7\r\2\2\u00a8\u00aa\b\13\1\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b3\3\2\2\2\u00ab\u00ac\5\22\n\2\u00ac"+
		"\u00ad\b\13\1\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5"+
		"&\24\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\b\13\1\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\13"+
		"\1\2\u00b6\25\3\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00bb\b\f\1\2\u00b9"+
		"\u00ba\7\16\2\2\u00ba\u00bc\b\f\1\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be\5\26\f\2\u00be\u00c5\b\r\1\2\u00bf"+
		"\u00c0\7\17\2\2\u00c0\u00c1\5\26\f\2\u00c1\u00c2\b\r\1\2\u00c2\u00c4\3"+
		"\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\30\r"+
		"\2\u00c9\u00d4\b\16\1\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\5\30\r\2\u00cc"+
		"\u00cd\b\16\1\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\7\21\2\2\u00cf\u00d0\5"+
		"\30\r\2\u00d0\u00d1\b\16\1\2\u00d1\u00d3\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\32\16\2\u00d8"+
		"\u00e3\b\17\1\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\32\16\2\u00db\u00dc"+
		"\b\17\1\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\7\r\2\2\u00de\u00df\5\32\16"+
		"\2\u00df\u00e0\b\17\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1"+
		"\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\35\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\34\17\2\u00e7"+
		"\u010f\b\20\1\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\5\34\17\2\u00ea\u00eb"+
		"\b\20\1\2\u00eb\u010e\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ee\5\34\17"+
		"\2\u00ee\u00ef\b\20\1\2\u00ef\u010e\3\2\2\2\u00f0\u00f1\7\24\2\2\u00f1"+
		"\u00f2\5\34\17\2\u00f2\u00f3\b\20\1\2\u00f3\u010e\3\2\2\2\u00f4\u00f5"+
		"\7\25\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\b\20\1\2\u00f7\u010e\3\2\2"+
		"\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\7\26\2\2\u00fa\u00fb\5\34\17\2\u00fb"+
		"\u00fc\b\20\1\2\u00fc\u010e\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\5"+
		"\34\17\2\u00ff\u0100\b\20\1\2\u0100\u010e\3\2\2\2\u0101\u0102\7\30\2\2"+
		"\u0102\u0103\5\34\17\2\u0103\u0104\b\20\1\2\u0104\u010e\3\2\2\2\u0105"+
		"\u0106\7\31\2\2\u0106\u0107\5\34\17\2\u0107\u0108\b\20\1\2\u0108\u010e"+
		"\3\2\2\2\u0109\u010a\7\32\2\2\u010a\u010b\5\34\17\2\u010b\u010c\b\20\1"+
		"\2\u010c\u010e\3\2\2\2\u010d\u00e8\3\2\2\2\u010d\u00ec\3\2\2\2\u010d\u00f0"+
		"\3\2\2\2\u010d\u00f4\3\2\2\2\u010d\u00f8\3\2\2\2\u010d\u00fd\3\2\2\2\u010d"+
		"\u0101\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\37\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\5\36\20\2\u0113\u0114\b\21\1\2\u0114\u011a\3\2\2"+
		"\2\u0115\u0116\7\26\2\2\u0116\u0117\5\36\20\2\u0117\u0118\b\21\1\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0115\3\2\2\2\u011a!\3\2\2\2"+
		"\u011b\u011c\5 \21\2\u011c\u0127\b\22\1\2\u011d\u011e\7\33\2\2\u011e\u011f"+
		"\5&\24\2\u011f\u0120\b\22\1\2\u0120\u0126\3\2\2\2\u0121\u0122\7\34\2\2"+
		"\u0122\u0123\5&\24\2\u0123\u0124\b\22\1\2\u0124\u0126\3\2\2\2\u0125\u011d"+
		"\3\2\2\2\u0125\u0121\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128#\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\5\"\22\2"+
		"\u012b\u012c\b\23\1\2\u012c\u012d\7\35\2\2\u012d\u012e\5&\24\2\u012e\u012f"+
		"\7\36\2\2\u012f\u0130\5&\24\2\u0130\u0131\b\23\1\2\u0131%\3\2\2\2\u0132"+
		"\u0133\5\"\22\2\u0133\u0134\b\24\1\2\u0134\'\3\2\2\2\33-\61<ES_p|\u0087"+
		"\u0097\u0099\u00a4\u00a9\u00b3\u00bb\u00c5\u00d2\u00d4\u00e1\u00e3\u010d"+
		"\u010f\u0119\u0125\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}