// Generated from Ontolog.g4 by ANTLR 4.5
package so.ontolog.formula.antlr;
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		END_OF_STMT=39, NUMBER=40, STRING_LITERAL=41, NULL=42, BOOLEAN=43, IDENT=44, 
		WS=45, COMMENT=46, LINE_COMMENT=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "DIGIT", "LETTER", "END_OF_STMT", 
		"NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'foreach'", "'in'", "'while'", "'param'", 
		"'as'", "'.'", "','", "'/'", "':'", "'-'", "'%'", "'^'", "'*'", "'+'", 
		"'=='", "'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", "'<'", "'<='", 
		"'and'", "'or'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0151\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u00eb"+
		"\n+\r+\16+\u00ec\3+\3+\6+\u00f1\n+\r+\16+\u00f2\5+\u00f5\n+\3,\3,\7,\u00f9"+
		"\n,\f,\16,\u00fc\13,\3,\3,\3,\7,\u0101\n,\f,\16,\u0104\13,\3,\5,\u0107"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0114\n-\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0128\n.\3/\3/\3/\7/\u012d\n/\f/"+
		"\16/\u0130\13/\3\60\6\60\u0133\n\60\r\60\16\60\u0134\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\7\61\u013d\n\61\f\61\16\61\u0140\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u014b\n\62\f\62\16\62\u014e\13\62\3"+
		"\62\3\62\3\u013e\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W+Y,[-]._/a\60c\61\3"+
		"\2\7\t\2&&C\\aac|\u1102\u1201\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17$$"+
		"\5\2\f\f\17\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u015e\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2"+
		"\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17z\3\2\2\2\21\u0081\3"+
		"\2\2\2\23\u0088\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2"+
		"\2\2\33\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\u00a5\3\2\2\2"+
		"#\u00ab\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b2\3\2\2\2+\u00b4\3"+
		"\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2"+
		"\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c3\3\2\2\2;\u00c6\3\2\2\2=\u00c9"+
		"\3\2\2\2?\u00cc\3\2\2\2A\u00d0\3\2\2\2C\u00d2\3\2\2\2E\u00d5\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00da\3\2\2\2K\u00de\3\2\2\2M\u00e1\3\2\2\2O\u00e3\3\2"+
		"\2\2Q\u00e5\3\2\2\2S\u00e7\3\2\2\2U\u00ea\3\2\2\2W\u0106\3\2\2\2Y\u0113"+
		"\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u0132\3\2\2\2a\u0138\3\2\2\2c"+
		"\u0146\3\2\2\2ef\7]\2\2f\4\3\2\2\2gh\7_\2\2h\6\3\2\2\2ij\7?\2\2j\b\3\2"+
		"\2\2kl\7*\2\2l\n\3\2\2\2mn\7+\2\2n\f\3\2\2\2op\7k\2\2pq\7o\2\2qr\7r\2"+
		"\2rs\7q\2\2st\7t\2\2tu\7v\2\2uv\7L\2\2vw\7c\2\2wx\7x\2\2xy\7c\2\2y\16"+
		"\3\2\2\2z{\7k\2\2{|\7o\2\2|}\7r\2\2}~\7q\2\2~\177\7t\2\2\177\u0080\7v"+
		"\2\2\u0080\20\3\2\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084"+
		"\7v\2\2\u0084\u0085\7w\2\2\u0085\u0086\7t\2\2\u0086\u0087\7p\2\2\u0087"+
		"\22\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008c\7}\2\2\u008c\26\3\2\2\2\u008d\u008e\7\177\2\2\u008e\30\3\2\2\2"+
		"\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7g\2\2\u0093\32\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7q\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099\u009a\7e\2\2\u009a"+
		"\u009b\7j\2\2\u009b\34\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e"+
		"\36\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7r\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7o\2\2"+
		"\u00aa\"\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad$\3\2\2\2"+
		"\u00ae\u00af\7\60\2\2\u00af&\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1(\3\2\2\2"+
		"\u00b2\u00b3\7\61\2\2\u00b3*\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5,\3\2\2\2"+
		"\u00b6\u00b7\7/\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9\60\3\2\2"+
		"\2\u00ba\u00bb\7`\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd\64\3\2"+
		"\2\2\u00be\u00bf\7-\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c28\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5:\3"+
		"\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8<\3\2\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca\u00cb\7@\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7v\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1B\3"+
		"\2\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4D\3\2\2\2\u00d5\u00d6"+
		"\7>\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9\7?\2\2\u00d9H\3"+
		"\2\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7f\2\2\u00dd"+
		"J\3\2\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0L\3\2\2\2\u00e1\u00e2"+
		"\7A\2\2\u00e2N\3\2\2\2\u00e3\u00e4\4\62;\2\u00e4P\3\2\2\2\u00e5\u00e6"+
		"\t\2\2\2\u00e6R\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8T\3\2\2\2\u00e9\u00eb"+
		"\5O(\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00f4\3\2\2\2\u00ee\u00f0\7\60\2\2\u00ef\u00f1\5"+
		"O(\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5V\3\2\2\2\u00f6\u00fa\7$\2\2\u00f7\u00f9\n\3\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0107\7$\2\2\u00fe\u0102\7)\2"+
		"\2\u00ff\u0101\n\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0107\7)\2\2\u0106\u00f6\3\2\2\2\u0106\u00fe\3\2\2\2\u0107X\3\2\2\2\u0108"+
		"\u0109\7p\2\2\u0109\u010a\7w\2\2\u010a\u010b\7n\2\2\u010b\u0114\7n\2\2"+
		"\u010c\u010d\7p\2\2\u010d\u010e\7k\2\2\u010e\u0114\7n\2\2\u010f\u0110"+
		"\7P\2\2\u0110\u0111\7W\2\2\u0111\u0112\7N\2\2\u0112\u0114\7N\2\2\u0113"+
		"\u0108\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010f\3\2\2\2\u0114Z\3\2\2\2"+
		"\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118\7w\2\2\u0118\u0128"+
		"\7g\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2\u011c"+
		"\u011d\7u\2\2\u011d\u0128\7g\2\2\u011e\u011f\7V\2\2\u011f\u0120\7T\2\2"+
		"\u0120\u0121\7W\2\2\u0121\u0128\7G\2\2\u0122\u0123\7H\2\2\u0123\u0124"+
		"\7C\2\2\u0124\u0125\7N\2\2\u0125\u0126\7U\2\2\u0126\u0128\7G\2\2\u0127"+
		"\u0115\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0122\3\2"+
		"\2\2\u0128\\\3\2\2\2\u0129\u012e\5Q)\2\u012a\u012d\5Q)\2\u012b\u012d\5"+
		"O(\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f^\3\2\2\2\u0130\u012e\3\2\2\2"+
		"\u0131\u0133\t\5\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\60\2\2"+
		"\u0137`\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7,\2\2\u013a\u013e\3"+
		"\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0142\7,\2\2\u0142\u0143\7\61\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\b\61\2\2\u0145b\3\2\2\2\u0146\u0147\7\61\2\2\u0147\u0148\7\61\2"+
		"\2\u0148\u014c\3\2\2\2\u0149\u014b\n\6\2\2\u014a\u0149\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\b\62\2\2\u0150d\3\2\2\2\20\2\u00ec\u00f2\u00f4"+
		"\u00fa\u0102\u0106\u0113\u0127\u012c\u012e\u0134\u013e\u014c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}