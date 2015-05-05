// Generated from Ontolog.g4 by ANTLR 4.4
package so.ontolog.lang.antlr;

	import java.util.List;
	import java.util.LinkedList;
	
	import so.ontolog.lang.runtime.*;
	import so.ontolog.lang.ast.*;
	import so.ontolog.lang.build.*;
	import so.ontolog.lang.util.*;

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NUMBER=4, STRING_LITERAL=5, NULL=6, BOOLEAN=7, 
		IDENT=8, WS=9, COMMENT=10, LINE_COMMENT=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'='", "NUMBER", "STRING_LITERAL", "NULL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_ontologExpression = 0;
	public static final String[] ruleNames = {
		"ontologExpression"
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
		public Node result;
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
			setState(16);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2); match(T__0);
				setState(6);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(3); match(T__2);
					}
					}
					setState(8);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(9); match(T__1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(10); match(T__0);
					}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\25\4\2\t\2\3\2"+
		"\3\2\7\2\7\n\2\f\2\16\2\n\13\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\5\2"+
		"\23\n\2\3\2\2\2\3\2\2\2\26\2\22\3\2\2\2\4\b\7\5\2\2\5\7\7\3\2\2\6\5\3"+
		"\2\2\2\7\n\3\2\2\2\b\6\3\2\2\2\b\t\3\2\2\2\t\13\3\2\2\2\n\b\3\2\2\2\13"+
		"\23\7\4\2\2\f\16\7\5\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\22\4\3\2\2\2\22\17\3\2\2\2\23\3\3"+
		"\2\2\2\5\b\17\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}