// Generated from /home/uniceub/igortullio/CC_Compilador/skeleton/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

  package decaf;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, CLASS=2, BREAK=3, CALLOUT=4, CONTINUE=5, DO=6, ELSE=7, FOR=8, 
		IF=9, RETURN=10, VOID=11, WHILE=12, TIPO=13, INT=14, BOOLEAN_LITERAL=15, 
		CHAR_LITERAL=16, STRING_LITERAL=17, ID=18, OPERADORES=19, COMPARADORES=20, 
		CONDICIONADORES=21, PONTOS=22, ABRE_CHAVE=23, FECHA_CHAVE=24, ABRE_PARENTESE=25, 
		FECHA_PARENTESE=26, ABRE_COLCHETE=27, FECHA_COLCHETE=28, WS_=29, COMENTARIO=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "BREAK", "CALLOUT", "CONTINUE", "DO", "ELSE", "FOR", "IF", "RETURN", 
		"VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", "HEXA", "CHAR_LITERAL", 
		"STRING_LITERAL", "ID", "ID_LETRA", "DIGITO", "STRING_CARS", "STRING_CAR", 
		"CHAR", "OPERADORES", "COMPARADORES", "CONDICIONADORES", "PONTOS", "ABRE_CHAVE", 
		"FECHA_CHAVE", "ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
		"WS_", "COMENTARIO", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'class'", "'break'", "'callout'", "'continue'", "'do'", "'else'", 
		"'for'", "'if'", "'return'", "'void'", "'while'", null, null, null, null, 
		null, null, null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "CLASS", "BREAK", "CALLOUT", "CONTINUE", "DO", "ELSE", 
		"FOR", "IF", "RETURN", "VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "OPERADORES", "COMPARADORES", 
		"CONDICIONADORES", "PONTOS", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", 
		"FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", "WS_", "COMENTARIO"
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


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\16\6\16\u0097"+
		"\n\16\r\16\16\16\u0098\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3\20\3\20\6\20\u00ad\n\20"+
		"\r\20\16\20\u00ae\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00b7\n\21\r\21\16"+
		"\21\u00b8\3\21\3\21\5\21\u00bd\n\21\3\22\3\22\5\22\u00c1\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\3\24\3\24\3\25"+
		"\3\25\3\26\6\26\u00d2\n\26\r\26\16\26\u00d3\3\27\3\27\5\27\u00d8\n\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00e7\n\32\3\33\3\33\3\33\3\33\5\33\u00ed\n\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\6#\u00fe\n#\r#\16#\u00ff\3#"+
		"\3#\3$\3$\3$\3$\7$\u0108\n$\f$\16$\u010b\13$\3$\3$\3$\3$\3%\3%\3%\2\2"+
		"&\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31\17\33\20\35\21"+
		"\37\2!\22#\23%\24\'\2)\2+\2-\2/\2\61\25\63\26\65\27\67\309\31;\32=\33"+
		"?\34A\35C\36E\37G I\2\3\2\13\5\2\62;CHch\5\2C\\aac|\5\2$$))^^\7\2\'\'"+
		",-//\61\61??\4\2>>@@\5\2..\60\60<=\5\2\13\f\17\17\"\"\3\2\f\f\n\2$$))"+
		"^^ddhhppttvv\u011e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\3K\3\2\2\2\5Q\3\2\2\2\7W\3\2\2\2\t_\3\2\2\2\13h\3"+
		"\2\2\2\rk\3\2\2\2\17p\3\2\2\2\21t\3\2\2\2\23w\3\2\2\2\25~\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u009b\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3"+
		"\2\2\2!\u00bc\3\2\2\2#\u00be\3\2\2\2%\u00c4\3\2\2\2\'\u00cc\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00d1\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00db\3\2\2\2"+
		"\63\u00e6\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E"+
		"\u00fd\3\2\2\2G\u0103\3\2\2\2I\u0110\3\2\2\2KL\7e\2\2LM\7n\2\2MN\7c\2"+
		"\2NO\7u\2\2OP\7u\2\2P\4\3\2\2\2QR\7d\2\2RS\7t\2\2ST\7g\2\2TU\7c\2\2UV"+
		"\7m\2\2V\6\3\2\2\2WX\7e\2\2XY\7c\2\2YZ\7n\2\2Z[\7n\2\2[\\\7q\2\2\\]\7"+
		"w\2\2]^\7v\2\2^\b\3\2\2\2_`\7e\2\2`a\7q\2\2ab\7p\2\2bc\7v\2\2cd\7k\2\2"+
		"de\7p\2\2ef\7w\2\2fg\7g\2\2g\n\3\2\2\2hi\7f\2\2ij\7q\2\2j\f\3\2\2\2kl"+
		"\7g\2\2lm\7n\2\2mn\7u\2\2no\7g\2\2o\16\3\2\2\2pq\7h\2\2qr\7q\2\2rs\7t"+
		"\2\2s\20\3\2\2\2tu\7k\2\2uv\7h\2\2v\22\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7v"+
		"\2\2z{\7w\2\2{|\7t\2\2|}\7p\2\2}\24\3\2\2\2~\177\7x\2\2\177\u0080\7q\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\26\3\2\2\2\u0083\u0084"+
		"\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087"+
		"\u0088\7g\2\2\u0088\30\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u0094\7v\2\2\u008c\u008d\7d\2\2\u008d\u008e\7q\2\2\u008e\u008f\7q\2\2"+
		"\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u0094"+
		"\7p\2\2\u0093\u0089\3\2\2\2\u0093\u008c\3\2\2\2\u0094\32\3\2\2\2\u0095"+
		"\u0097\5)\25\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009c\5\37\20\2\u009b"+
		"\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\34\3\2\2\2\u009d\u009e\7v\2\2"+
		"\u009e\u009f\7t\2\2\u009f\u00a0\7w\2\2\u00a0\u00a7\7g\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a7\7g\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\36\3\2\2\2"+
		"\u00a8\u00a9\7\62\2\2\u00a9\u00aa\7z\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad"+
		"\t\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af \3\2\2\2\u00b0\u00b1\7)\2\2\u00b1\u00b2\5/\30\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00bd\3\2\2\2\u00b4\u00b6\7)\2\2\u00b5\u00b7\5I%\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7)\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bd\"\3\2\2\2\u00be\u00c0\7$\2\2"+
		"\u00bf\u00c1\5+\26\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3$\3\2\2\2\u00c4\u00c9\5\'\24\2\u00c5"+
		"\u00c8\5\'\24\2\u00c6\u00c8\5)\25\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"&\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd(\3\2\2\2\u00ce"+
		"\u00cf\4\62;\2\u00cf*\3\2\2\2\u00d0\u00d2\5-\27\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4,\3"+
		"\2\2\2\u00d5\u00d8\5/\30\2\u00d6\u00d8\5I%\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8.\3\2\2\2\u00d9\u00da\n\4\2\2\u00da\60\3\2\2\2\u00db"+
		"\u00dc\t\5\2\2\u00dc\62\3\2\2\2\u00dd\u00e7\t\6\2\2\u00de\u00df\7>\2\2"+
		"\u00df\u00e7\7?\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e7\7?\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3\u00e7\7?\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e7\7?\2\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ed"+
		"\7(\2\2\u00ea\u00eb\7~\2\2\u00eb\u00ed\7~\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\t\7\2\2\u00ef8\3\2\2\2\u00f0"+
		"\u00f1\7}\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7\177\2\2\u00f3<\3\2\2\2\u00f4"+
		"\u00f5\7*\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7@\3\2\2\2\u00f8\u00f9"+
		"\7]\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7_\2\2\u00fbD\3\2\2\2\u00fc\u00fe\t"+
		"\b\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b#\2\2\u0102F\3\2\2\2\u0103"+
		"\u0104\7\61\2\2\u0104\u0105\7\61\2\2\u0105\u0109\3\2\2\2\u0106\u0108\n"+
		"\t\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\f"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b$\2\2\u010fH\3\2\2\2\u0110\u0111"+
		"\7^\2\2\u0111\u0112\t\n\2\2\u0112J\3\2\2\2\23\2\u0093\u0098\u009b\u00a6"+
		"\u00ae\u00b8\u00bc\u00c0\u00c7\u00c9\u00d3\u00d7\u00e6\u00ec\u00ff\u0109"+
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