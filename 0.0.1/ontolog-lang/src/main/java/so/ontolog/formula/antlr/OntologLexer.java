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
		T__38=39, END_OF_STMT=40, NUMBER=41, STRING_LITERAL=42, NULL=43, BOOLEAN=44, 
		IDENT=45, WS=46, COMMENT=47, LINE_COMMENT=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "DIGIT", "LETTER", 
		"END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "'('", "')'", "'importJava'", "'import'", "'return'", 
		"'if'", "'{'", "'}'", "'else'", "'foreach'", "'in'", "'while'", "'->'", 
		"'param'", "'as'", "'.'", "','", "'/'", "':'", "'-'", "'%'", "'^'", "'*'", 
		"'+'", "'=='", "'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", "'<'", 
		"'<='", "'and'", "'or'", "'?'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\6,\u00f0\n,\r,\16,\u00f1\3,\3,\6,\u00f6\n,\r,\16,\u00f7\5,"+
		"\u00fa\n,\3-\3-\7-\u00fe\n-\f-\16-\u0101\13-\3-\3-\3-\7-\u0106\n-\f-\16"+
		"-\u0109\13-\3-\5-\u010c\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0119\n"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u012d\n/\3"+
		"\60\3\60\3\60\7\60\u0132\n\60\f\60\16\60\u0135\13\60\3\61\6\61\u0138\n"+
		"\61\r\61\16\61\u0139\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0142\n\62\f\62"+
		"\16\62\u0145\13\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0150"+
		"\n\63\f\63\16\63\u0153\13\63\3\63\3\63\3\u0143\2\64\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q\2S\2U*W+Y,[-]._/a\60c\61e\62\3\2\7\t\2&&C\\aac|\u1102\u1201\u3132"+
		"\u3191\uac02\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2"+
		"\13o\3\2\2\2\rq\3\2\2\2\17|\3\2\2\2\21\u0083\3\2\2\2\23\u008a\3\2\2\2"+
		"\25\u008d\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0096\3\2\2\2\35"+
		"\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a7\3\2\2\2#\u00aa\3\2\2\2%\u00b0\3"+
		"\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00b9\3\2\2\2/\u00bb"+
		"\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c1\3\2\2\2\67\u00c3\3"+
		"\2\2\29\u00c5\3\2\2\2;\u00c8\3\2\2\2=\u00cb\3\2\2\2?\u00ce\3\2\2\2A\u00d1"+
		"\3\2\2\2C\u00d5\3\2\2\2E\u00d7\3\2\2\2G\u00da\3\2\2\2I\u00dc\3\2\2\2K"+
		"\u00df\3\2\2\2M\u00e3\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00ea\3\2"+
		"\2\2U\u00ec\3\2\2\2W\u00ef\3\2\2\2Y\u010b\3\2\2\2[\u0118\3\2\2\2]\u012c"+
		"\3\2\2\2_\u012e\3\2\2\2a\u0137\3\2\2\2c\u013d\3\2\2\2e\u014b\3\2\2\2g"+
		"h\7]\2\2h\4\3\2\2\2ij\7_\2\2j\6\3\2\2\2kl\7?\2\2l\b\3\2\2\2mn\7*\2\2n"+
		"\n\3\2\2\2op\7+\2\2p\f\3\2\2\2qr\7k\2\2rs\7o\2\2st\7r\2\2tu\7q\2\2uv\7"+
		"t\2\2vw\7v\2\2wx\7L\2\2xy\7c\2\2yz\7x\2\2z{\7c\2\2{\16\3\2\2\2|}\7k\2"+
		"\2}~\7o\2\2~\177\7r\2\2\177\u0080\7q\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7v\2\2\u0082\20\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088\u0089\7p\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7}\2\2\u008e\26\3\2\2\2\u008f\u0090\7\177\2\2\u0090\30\3\2\2\2"+
		"\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095"+
		"\7g\2\2\u0095\32\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098\u0099"+
		"\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7e\2\2\u009c"+
		"\u009d\7j\2\2\u009d\34\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\36\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7/\2\2\u00a8"+
		"\u00a9\7@\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7o\2\2\u00af$\3\2\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7u\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4"+
		"(\3\2\2\2\u00b5\u00b6\7.\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		",\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\60"+
		"\3\2\2\2\u00bd\u00be\7\'\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7`\2\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7\7?\2\2\u00c7:\3\2\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7u\2\2\u00ca<\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7@\2\2\u00d0@\3"+
		"\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"B\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9F\3\2\2\2\u00da\u00db\7>\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7"+
		">\2\2\u00dd\u00de\7?\2\2\u00deJ\3\2\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7f\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7t\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7A\2\2\u00e7P\3\2\2\2\u00e8\u00e9\4"+
		"\62;\2\u00e9R\3\2\2\2\u00ea\u00eb\t\2\2\2\u00ebT\3\2\2\2\u00ec\u00ed\7"+
		"=\2\2\u00edV\3\2\2\2\u00ee\u00f0\5Q)\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f9\3\2\2\2\u00f3"+
		"\u00f5\7\60\2\2\u00f4\u00f6\5Q)\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f3\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faX\3\2\2\2\u00fb\u00ff\7$\2\2\u00fc"+
		"\u00fe\n\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u010c\7$\2\2\u0103\u0107\7)\2\2\u0104\u0106\n\4\2\2\u0105\u0104\3\2\2"+
		"\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7)\2\2\u010b\u00fb\3\2\2\2\u010b"+
		"\u0103\3\2\2\2\u010cZ\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7n\2\2\u0110\u0119\7n\2\2\u0111\u0112\7p\2\2\u0112\u0113\7k\2\2"+
		"\u0113\u0119\7n\2\2\u0114\u0115\7P\2\2\u0115\u0116\7W\2\2\u0116\u0117"+
		"\7N\2\2\u0117\u0119\7N\2\2\u0118\u010d\3\2\2\2\u0118\u0111\3\2\2\2\u0118"+
		"\u0114\3\2\2\2\u0119\\\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c"+
		"\u011d\7w\2\2\u011d\u012d\7g\2\2\u011e\u011f\7h\2\2\u011f\u0120\7c\2\2"+
		"\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2\u0122\u012d\7g\2\2\u0123\u0124"+
		"\7V\2\2\u0124\u0125\7T\2\2\u0125\u0126\7W\2\2\u0126\u012d\7G\2\2\u0127"+
		"\u0128\7H\2\2\u0128\u0129\7C\2\2\u0129\u012a\7N\2\2\u012a\u012b\7U\2\2"+
		"\u012b\u012d\7G\2\2\u012c\u011a\3\2\2\2\u012c\u011e\3\2\2\2\u012c\u0123"+
		"\3\2\2\2\u012c\u0127\3\2\2\2\u012d^\3\2\2\2\u012e\u0133\5S*\2\u012f\u0132"+
		"\5S*\2\u0130\u0132\5Q)\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134`\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0136\u0138\t\5\2\2\u0137\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\b\61\2\2\u013cb\3\2\2\2\u013d\u013e\7\61\2\2\u013e\u013f\7,\2\2"+
		"\u013f\u0143\3\2\2\2\u0140\u0142\13\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7,\2\2\u0147\u0148\7\61\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\b\62\2\2\u014ad\3\2\2\2\u014b\u014c\7\61\2\2\u014c\u014d"+
		"\7\61\2\2\u014d\u0151\3\2\2\2\u014e\u0150\n\6\2\2\u014f\u014e\3\2\2\2"+
		"\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\63\2\2\u0155f\3\2\2\2\20\2"+
		"\u00f1\u00f7\u00f9\u00ff\u0107\u010b\u0118\u012c\u0131\u0133\u0139\u0143"+
		"\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}