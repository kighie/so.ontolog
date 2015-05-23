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
		T__24=25, T__25=26, T__26=27, NUMBER=28, STRING_LITERAL=29, NULL=30, BOOLEAN=31, 
		IDENT=32, WS=33, COMMENT=34, LINE_COMMENT=35;
	public static final int
		RULE_ontologExpression = 0, RULE_paramDecl = 1, RULE_expression = 2, RULE_literalTerm = 3, 
		RULE_qualifiedName = 4, RULE_formulaTerm = 5, RULE_unary = 6, RULE_percent = 7, 
		RULE_exponential = 8, RULE_multiplicative = 9, RULE_additiveExpression = 10, 
		RULE_comparison = 11, RULE_notExpression = 12, RULE_logicalExpression = 13, 
		RULE_ternaryExpression = 14, RULE_operatorExpression = 15;
	public static final String[] ruleNames = {
		"ontologExpression", "paramDecl", "expression", "literalTerm", "qualifiedName", 
		"formulaTerm", "unary", "percent", "exponential", "multiplicative", "additiveExpression", 
		"comparison", "notExpression", "logicalExpression", "ternaryExpression", 
		"operatorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'param'", "'as'", "';'", "'.'", 
		"'-'", "'%'", "'^'", "'*'", "'/'", "'+'", "'is'", "'!='", "'<>'", "'not'", 
		"'>'", "'>='", "'<'", "'<='", "'and'", "'or'", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
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
			setState(41);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(33);
				match(T__0);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(34);
					paramDecl(_localctx.result);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(T__1);
				}
			}

			setState(43);
			match(T__2);
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(44);
				match(T__3);
				setState(45);
				((OntologExpressionContext)_localctx).expression = expression();
				setState(46);
				match(T__4);
				 _localctx.result.append( createEvalStmt (EVAL_EXPR_STMT, ((OntologExpressionContext)_localctx).expression.result) ) ; 
				}
				}
				break;
			case 2:
				{
				{
				setState(49);
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
			setState(54);
			match(T__5);
			 String alias = null; 
			setState(56);
			((ParamDeclContext)_localctx).type = qualifiedName();
			setState(57);
			((ParamDeclContext)_localctx).name = match(IDENT);
			setState(61);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(58);
				match(T__6);
				setState(59);
				((ParamDeclContext)_localctx).IDENT = match(IDENT);
				 alias = (((ParamDeclContext)_localctx).IDENT!=null?((ParamDeclContext)_localctx).IDENT.getText():null); 
				}
			}

			 _localctx.module.append( asStatement( createParamDecl(PARAM_DECL, ((ParamDeclContext)_localctx).type.result, (((ParamDeclContext)_localctx).name!=null?((ParamDeclContext)_localctx).name.getText():null), alias) ) ); 
			setState(64);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(66);
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
		enterRule(_localctx, 6, RULE_literalTerm);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
		enterRule(_localctx, 8, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  qname( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__8) {
				{
				setState(93);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(81);
					match(T__8);
					setState(82);
					((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  qname( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					}
					break;
				case 2:
					{
					{
					setState(84);
					match(T__0);
					setState(85);
					((QualifiedNameContext)_localctx).NUMBER = match(NUMBER);
					setState(86);
					match(T__1);
					 ((QualifiedNameContext)_localctx).result =  indexedQname( _localctx.result, (((QualifiedNameContext)_localctx).NUMBER!=null?((QualifiedNameContext)_localctx).NUMBER.getText():null)); 
					}
					}
					break;
				case 3:
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					((QualifiedNameContext)_localctx).index = qualifiedName();
					setState(90);
					match(T__1);
					 ((QualifiedNameContext)_localctx).result =  varQname( _localctx.result, ((QualifiedNameContext)_localctx).index.result ); 
					}
					}
					break;
				}
				}
				setState(97);
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
		enterRule(_localctx, 10, RULE_formulaTerm);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((FormulaTermContext)_localctx).IDENT = match(IDENT);
				 ((FormulaTermContext)_localctx).result =  variable( (((FormulaTermContext)_localctx).IDENT!=null?((FormulaTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
		enterRule(_localctx, 12, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(111);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(109);
				match(T__9);
				 negative = true; 
				}
			}

			setState(121);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(113);
				((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__3:
				{
				setState(116);
				match(T__3);
				setState(117);
				((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(118);
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
		enterRule(_localctx, 14, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(129);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(127);
				match(T__10);
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
		enterRule(_localctx, 16, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(133);
				match(T__11);
				setState(134);
				((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  binary(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(141);
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
		enterRule(_localctx, 18, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				setState(152);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(144);
					match(T__12);
					setState(145);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__13:
					{
					setState(148);
					match(T__13);
					setState(149);
					((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  binary(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(156);
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
		enterRule(_localctx, 20, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__14) {
				{
				setState(167);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(159);
					match(T__14);
					setState(160);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__9:
					{
					setState(163);
					match(T__9);
					setState(164);
					((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  binary(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
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
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((ComparisonContext)_localctx).additiveExpression = additiveExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).additiveExpression.result;  
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				setState(211);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(174);
					match(T__2);
					setState(175);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(178);
					match(T__15);
					setState(179);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(182);
					match(T__16);
					setState(183);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(186);
					match(T__17);
					setState(187);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(190);
					match(T__15);
					setState(191);
					match(T__18);
					setState(192);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(195);
					match(T__19);
					setState(196);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(199);
					match(T__20);
					setState(200);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(203);
					match(T__21);
					setState(204);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(207);
					match(T__22);
					setState(208);
					((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).additiveExpression = additiveExpression();
					((ComparisonContext)_localctx).result =  binary(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(215);
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
		enterRule(_localctx, 24, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(216);
				((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__18:
				{
				setState(219);
				match(T__18);
				setState(220);
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
		enterRule(_localctx, 26, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(235);
					switch (_input.LA(1)) {
					case T__23:
						{
						setState(227);
						match(T__23);
						setState(228);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__24:
						{
						setState(231);
						match(T__24);
						setState(232);
						((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  binary(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 28, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((TernaryExpressionContext)_localctx).logicalExpression = logicalExpression();
			 ((TernaryExpressionContext)_localctx).result =  ((TernaryExpressionContext)_localctx).logicalExpression.result;  
			{
			setState(242);
			match(T__25);
			{
			setState(243);
			((TernaryExpressionContext)_localctx).op2 = operatorExpression();
			}
			setState(244);
			match(T__26);
			{
			setState(245);
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
		enterRule(_localctx, 30, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\5\br\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0084\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009b\n\13\f\13\16\13\u009e\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00ee\n\17\f\17\16\17\u00f1\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\2\u010d\2\"\3\2\2\2\48\3\2\2\2\6D\3\2\2\2\bO"+
		"\3\2\2\2\nQ\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20\177\3\2\2\2\22\u0085\3\2"+
		"\2\2\24\u0090\3\2\2\2\26\u009f\3\2\2\2\30\u00ae\3\2\2\2\32\u00e1\3\2\2"+
		"\2\34\u00e3\3\2\2\2\36\u00f2\3\2\2\2 \u00fa\3\2\2\2\"+\b\2\1\2#\'\7\3"+
		"\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'"+
		"\3\2\2\2*,\7\4\2\2+#\3\2\2\2+,\3\2\2\2,-\3\2\2\2-\66\7\5\2\2./\7\6\2\2"+
		"/\60\5\6\4\2\60\61\7\7\2\2\61\62\b\2\1\2\62\67\3\2\2\2\63\64\5\6\4\2\64"+
		"\65\b\2\1\2\65\67\3\2\2\2\66.\3\2\2\2\66\63\3\2\2\2\67\3\3\2\2\289\7\b"+
		"\2\29:\b\3\1\2:;\5\n\6\2;?\7\"\2\2<=\7\t\2\2=>\7\"\2\2>@\b\3\1\2?<\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AB\b\3\1\2BC\7\n\2\2C\5\3\2\2\2DE\5 \21\2EF\b"+
		"\4\1\2F\7\3\2\2\2GH\7!\2\2HP\b\5\1\2IJ\7\37\2\2JP\b\5\1\2KL\7\36\2\2L"+
		"P\b\5\1\2MN\7 \2\2NP\b\5\1\2OG\3\2\2\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2P"+
		"\t\3\2\2\2QR\7\"\2\2Ra\b\6\1\2ST\7\13\2\2TU\7\"\2\2U`\b\6\1\2VW\7\3\2"+
		"\2WX\7\36\2\2XY\7\4\2\2Y`\b\6\1\2Z[\7\3\2\2[\\\5\n\6\2\\]\7\4\2\2]^\b"+
		"\6\1\2^`\3\2\2\2_S\3\2\2\2_V\3\2\2\2_Z\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\13\3\2\2\2ca\3\2\2\2de\5\b\5\2ef\b\7\1\2fm\3\2\2\2gh\7\"\2\2h"+
		"m\b\7\1\2ij\5\n\6\2jk\b\7\1\2km\3\2\2\2ld\3\2\2\2lg\3\2\2\2li\3\2\2\2"+
		"m\r\3\2\2\2nq\b\b\1\2op\7\f\2\2pr\b\b\1\2qo\3\2\2\2qr\3\2\2\2r{\3\2\2"+
		"\2st\5\f\7\2tu\b\b\1\2u|\3\2\2\2vw\7\6\2\2wx\5 \21\2xy\7\7\2\2yz\b\b\1"+
		"\2z|\3\2\2\2{s\3\2\2\2{v\3\2\2\2|}\3\2\2\2}~\b\b\1\2~\17\3\2\2\2\177\u0080"+
		"\5\16\b\2\u0080\u0083\b\t\1\2\u0081\u0082\7\r\2\2\u0082\u0084\b\t\1\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086"+
		"\5\20\t\2\u0086\u008d\b\n\1\2\u0087\u0088\7\16\2\2\u0088\u0089\5\20\t"+
		"\2\u0089\u008a\b\n\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\5\22\n\2\u0091\u009c\b\13\1\2\u0092\u0093\7"+
		"\17\2\2\u0093\u0094\5\22\n\2\u0094\u0095\b\13\1\2\u0095\u009b\3\2\2\2"+
		"\u0096\u0097\7\20\2\2\u0097\u0098\5\22\n\2\u0098\u0099\b\13\1\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\5\24\13\2\u00a0\u00ab\b\f\1\2\u00a1\u00a2\7\21\2"+
		"\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\b\f\1\2\u00a4\u00aa\3\2\2\2\u00a5"+
		"\u00a6\7\f\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\b\f\1\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00af\5\26\f\2\u00af\u00d7\b\r\1\2\u00b0\u00b1\7\5\2\2\u00b1"+
		"\u00b2\5\26\f\2\u00b2\u00b3\b\r\1\2\u00b3\u00d6\3\2\2\2\u00b4\u00b5\7"+
		"\22\2\2\u00b5\u00b6\5\26\f\2\u00b6\u00b7\b\r\1\2\u00b7\u00d6\3\2\2\2\u00b8"+
		"\u00b9\7\23\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\b\r\1\2\u00bb\u00d6\3"+
		"\2\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\b\r\1\2\u00bf"+
		"\u00d6\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\5"+
		"\26\f\2\u00c3\u00c4\b\r\1\2\u00c4\u00d6\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6"+
		"\u00c7\5\26\f\2\u00c7\u00c8\b\r\1\2\u00c8\u00d6\3\2\2\2\u00c9\u00ca\7"+
		"\27\2\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\b\r\1\2\u00cc\u00d6\3\2\2\2\u00cd"+
		"\u00ce\7\30\2\2\u00ce\u00cf\5\26\f\2\u00cf\u00d0\b\r\1\2\u00d0\u00d6\3"+
		"\2\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4\b\r\1\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00b0\3\2\2\2\u00d5\u00b4\3\2\2\2\u00d5\u00b8\3\2"+
		"\2\2\u00d5\u00bc\3\2\2\2\u00d5\u00c0\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5"+
		"\u00c9\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\b\16\1\2\u00dc\u00e2\3\2\2\2"+
		"\u00dd\u00de\7\25\2\2\u00de\u00df\5\30\r\2\u00df\u00e0\b\16\1\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\33\3\2\2"+
		"\2\u00e3\u00e4\5\32\16\2\u00e4\u00ef\b\17\1\2\u00e5\u00e6\7\32\2\2\u00e6"+
		"\u00e7\5 \21\2\u00e7\u00e8\b\17\1\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\7"+
		"\33\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec\b\17\1\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\35\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3"+
		"\5\34\17\2\u00f3\u00f4\b\20\1\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\5 \21"+
		"\2\u00f6\u00f7\7\35\2\2\u00f7\u00f8\5 \21\2\u00f8\u00f9\b\20\1\2\u00f9"+
		"\37\3\2\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\b\21\1\2\u00fc!\3\2\2\2"+
		"\27\'+\66?O_alq{\u0083\u008d\u009a\u009c\u00a9\u00ab\u00d5\u00d7\u00e1"+
		"\u00ed\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}