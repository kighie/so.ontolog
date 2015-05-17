// Generated from Ontolog.g4 by ANTLR 4.5
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", "NULL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
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


	public OntologLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ontolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u0098\n\37\r\37\16\37\u0099\3\37\3"+
		"\37\6\37\u009e\n\37\r\37\16\37\u009f\5\37\u00a2\n\37\3 \3 \7 \u00a6\n"+
		" \f \16 \u00a9\13 \3 \3 \3 \7 \u00ae\n \f \16 \u00b1\13 \3 \5 \u00b4\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00c1\n!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00d5\n\"\3#\3#\3"+
		"#\7#\u00da\n#\f#\16#\u00dd\13#\3$\6$\u00e0\n$\r$\16$\u00e1\3$\3$\3%\3"+
		"%\3%\3%\7%\u00ea\n%\f%\16%\u00ed\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00f8"+
		"\n&\f&\16&\u00fb\13&\3&\3&\3\u00eb\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37A C!E\"G#I$K%\3\2\7\t\2&&C\\"+
		"aac|\u1102\u1201\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17\17"+
		"))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q"+
		"\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23"+
		"b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2"+
		"\37n\3\2\2\2!p\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'y\3\2\2\2)}\3\2\2\2+\177\3"+
		"\2\2\2-\u0082\3\2\2\2/\u0084\3\2\2\2\61\u0087\3\2\2\2\63\u008b\3\2\2\2"+
		"\65\u008e\3\2\2\2\67\u0090\3\2\2\29\u0092\3\2\2\2;\u0094\3\2\2\2=\u0097"+
		"\3\2\2\2?\u00b3\3\2\2\2A\u00c0\3\2\2\2C\u00d4\3\2\2\2E\u00d6\3\2\2\2G"+
		"\u00df\3\2\2\2I\u00e5\3\2\2\2K\u00f3\3\2\2\2MN\7]\2\2N\4\3\2\2\2OP\7_"+
		"\2\2P\6\3\2\2\2QR\7?\2\2R\b\3\2\2\2ST\7*\2\2T\n\3\2\2\2UV\7+\2\2V\f\3"+
		"\2\2\2WX\7r\2\2XY\7c\2\2YZ\7t\2\2Z[\7c\2\2[\\\7o\2\2\\\16\3\2\2\2]^\7"+
		"c\2\2^_\7u\2\2_\20\3\2\2\2`a\7=\2\2a\22\3\2\2\2bc\7\60\2\2c\24\3\2\2\2"+
		"de\7/\2\2e\26\3\2\2\2fg\7\'\2\2g\30\3\2\2\2hi\7`\2\2i\32\3\2\2\2jk\7,"+
		"\2\2k\34\3\2\2\2lm\7\61\2\2m\36\3\2\2\2no\7-\2\2o \3\2\2\2pq\7k\2\2qr"+
		"\7u\2\2r\"\3\2\2\2st\7#\2\2tu\7?\2\2u$\3\2\2\2vw\7>\2\2wx\7@\2\2x&\3\2"+
		"\2\2yz\7p\2\2z{\7q\2\2{|\7v\2\2|(\3\2\2\2}~\7@\2\2~*\3\2\2\2\177\u0080"+
		"\7@\2\2\u0080\u0081\7?\2\2\u0081,\3\2\2\2\u0082\u0083\7>\2\2\u0083.\3"+
		"\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\7?\2\2\u0086\60\3\2\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\62\3\2\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7t\2\2\u008d\64\3\2\2\2\u008e\u008f\7A\2\2\u008f\66"+
		"\3\2\2\2\u0090\u0091\7<\2\2\u00918\3\2\2\2\u0092\u0093\4\62;\2\u0093:"+
		"\3\2\2\2\u0094\u0095\t\2\2\2\u0095<\3\2\2\2\u0096\u0098\59\35\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u00a1\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\59\35\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		">\3\2\2\2\u00a3\u00a7\7$\2\2\u00a4\u00a6\n\3\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00b4\7$\2\2\u00ab\u00af\7)\2\2\u00ac\u00ae"+
		"\n\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7)"+
		"\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b4@\3\2\2\2\u00b5\u00b6"+
		"\7p\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7n\2\2\u00b8\u00c1\7n\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7k\2\2\u00bb\u00c1\7n\2\2\u00bc\u00bd\7P\2\2"+
		"\u00bd\u00be\7W\2\2\u00be\u00bf\7N\2\2\u00bf\u00c1\7N\2\2\u00c0\u00b5"+
		"\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1B\3\2\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7w\2\2\u00c5\u00d5\7g\2\2"+
		"\u00c6\u00c7\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00d5\7g\2\2\u00cb\u00cc\7V\2\2\u00cc\u00cd\7T\2\2\u00cd"+
		"\u00ce\7W\2\2\u00ce\u00d5\7G\2\2\u00cf\u00d0\7H\2\2\u00d0\u00d1\7C\2\2"+
		"\u00d1\u00d2\7N\2\2\u00d2\u00d3\7U\2\2\u00d3\u00d5\7G\2\2\u00d4\u00c2"+
		"\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00cb\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5"+
		"D\3\2\2\2\u00d6\u00db\5;\36\2\u00d7\u00da\5;\36\2\u00d8\u00da\59\35\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcF\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b$\2\2\u00e4"+
		"H\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7,\2\2\u00e7\u00eb\3\2\2\2"+
		"\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7,\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b%"+
		"\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f9"+
		"\3\2\2\2\u00f6\u00f8\n\6\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00fd\b&\2\2\u00fdL\3\2\2\2\20\2\u0099\u009f\u00a1\u00a7\u00af"+
		"\u00b3\u00c0\u00d4\u00d9\u00db\u00e1\u00eb\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}