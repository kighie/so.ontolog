// Generated from Ontolog.g4 by ANTLR 4.4
package so.ontolog.lang.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OntologLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, NUMBER=4, STRING_LITERAL=5, NULL=6, BOOLEAN=7, 
		IDENT=8, WS=9, COMMENT=10, LINE_COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", 
		"NULL", "BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
	};


	public OntologLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ontolog.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u008f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\6\7)\n\7\r\7\16\7*\3\7\3\7\6\7/\n\7\r\7\16\7\60\5\7\63\n\7\3\b"+
		"\3\b\7\b\67\n\b\f\b\16\b:\13\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b"+
		"\5\bE\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nf"+
		"\n\n\3\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\6\fq\n\f\r\f\16\f"+
		"r\3\f\3\f\3\r\3\r\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16\3\16\3\16"+
		"\3|\2\17\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\3\2\7\t\2&&C\\aac|\u1102\u1201\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17"+
		"$$\5\2\f\f\17\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u009c\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2"+
		"\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r(\3\2\2\2\17D\3\2\2"+
		"\2\21Q\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27p\3\2\2\2\31v\3\2\2\2\33\u0084"+
		"\3\2\2\2\35\36\7*\2\2\36\4\3\2\2\2\37 \7+\2\2 \6\3\2\2\2!\"\7?\2\2\"\b"+
		"\3\2\2\2#$\4\62;\2$\n\3\2\2\2%&\t\2\2\2&\f\3\2\2\2\')\5\t\5\2(\'\3\2\2"+
		"\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62\3\2\2\2,.\7\60\2\2-/\5\t\5\2.-\3"+
		"\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62,\3\2\2\2"+
		"\62\63\3\2\2\2\63\16\3\2\2\2\648\7$\2\2\65\67\n\3\2\2\66\65\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;E\7$\2\2<@\7)\2\2"+
		"=?\n\4\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2"+
		"CE\7)\2\2D\64\3\2\2\2D<\3\2\2\2E\20\3\2\2\2FG\7p\2\2GH\7w\2\2HI\7n\2\2"+
		"IR\7n\2\2JK\7p\2\2KL\7k\2\2LR\7n\2\2MN\7P\2\2NO\7W\2\2OP\7N\2\2PR\7N\2"+
		"\2QF\3\2\2\2QJ\3\2\2\2QM\3\2\2\2R\22\3\2\2\2ST\7v\2\2TU\7t\2\2UV\7w\2"+
		"\2Vf\7g\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2Z[\7u\2\2[f\7g\2\2\\]\7V\2\2]^\7"+
		"T\2\2^_\7W\2\2_f\7G\2\2`a\7H\2\2ab\7C\2\2bc\7N\2\2cd\7U\2\2df\7G\2\2e"+
		"S\3\2\2\2eW\3\2\2\2e\\\3\2\2\2e`\3\2\2\2f\24\3\2\2\2gl\5\13\6\2hk\5\13"+
		"\6\2ik\5\t\5\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\26\3"+
		"\2\2\2nl\3\2\2\2oq\t\5\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3"+
		"\2\2\2tu\b\f\2\2u\30\3\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2"+
		"zy\3\2\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7,\2\2\u0080\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\r\2\2\u0083"+
		"\32\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7\61\2\2\u0086\u008a\3\2"+
		"\2\2\u0087\u0089\n\6\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\b\16\2\2\u008e\34\3\2\2\2\20\2*\60\628@DQejlr|\u008a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}