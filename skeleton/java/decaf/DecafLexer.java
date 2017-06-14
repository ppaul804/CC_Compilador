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
		TK_class=1, CLASS=2, PROGRAM=3, BREAK=4, CALLOUT=5, CONTINUE=6, DO=7, 
		ELSE=8, FOR=9, IF=10, RETURN=11, VOID=12, WHILE=13, TIPO=14, INT=15, BOOLEAN_LITERAL=16, 
		CHAR_LITERAL=17, STRING_LITERAL=18, ID=19, EXCLAMACAO=20, IGUAL=21, ATRIBUICAO_OP=22, 
		SUBTRACAO=23, OPERADOR_BIN=24, OPERADOR_BASICO=25, OPERADOR_RELACIONAL=26, 
		PONTOEVIRGULA=27, PONTOS=28, VIRGULA=29, ABRE_CHAVE=30, FECHA_CHAVE=31, 
		ABRE_PARENTESE=32, FECHA_PARENTESE=33, ABRE_COLCHETE=34, FECHA_COLCHETE=35, 
		WS_=36, COMENTARIO=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "PROGRAM", "BREAK", "CALLOUT", "CONTINUE", "DO", "ELSE", "FOR", 
		"IF", "RETURN", "VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", "HEXA", 
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "ID_LETRA", "DIGITO", "STRING_CARS", 
		"STRING_CAR", "CHAR", "EXCLAMACAO", "IGUAL", "ATRIBUICAO_OP", "SUBTRACAO", 
		"OPERADOR_BIN", "OPERADOR_BASICO", "OPERADOR_RELACIONAL", "PONTOEVIRGULA", 
		"PONTOS", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", "FECHA_PARENTESE", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "WS_", "COMENTARIO", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'class'", "'Program'", "'break'", "'callout'", "'continue'", 
		"'do'", "'else'", "'for'", "'if'", "'return'", "'void'", "'while'", null, 
		null, null, null, null, null, "'!'", "'='", null, "'-'", null, null, null, 
		"';'", null, "','", "'{'", "'}'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "CLASS", "PROGRAM", "BREAK", "CALLOUT", "CONTINUE", 
		"DO", "ELSE", "FOR", "IF", "RETURN", "VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "EXCLAMACAO", "IGUAL", "ATRIBUICAO_OP", 
		"SUBTRACAO", "OPERADOR_BIN", "OPERADOR_BASICO", "OPERADOR_RELACIONAL", 
		"PONTOEVIRGULA", "PONTOS", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0147\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00aa"+
		"\n\16\3\17\6\17\u00ad\n\17\r\17\16\17\u00ae\3\17\3\17\3\17\6\17\u00b4"+
		"\n\17\r\17\16\17\u00b5\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21\6\21\u00c9\n\21\r\21"+
		"\16\21\u00ca\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00d3\n\22\r\22\16\22"+
		"\u00d4\3\22\3\22\5\22\u00d9\n\22\3\23\3\23\5\23\u00dd\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u00e4\n\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\26\3"+
		"\26\3\27\6\27\u00ee\n\27\r\27\16\27\u00ef\3\30\3\30\5\30\u00f4\n\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0104\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0113\n\36\3\37\3\37\5\37\u0117\n\37\3 \3 \3 \3 \5 \u011d"+
		"\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u0132"+
		"\n*\r*\16*\u0133\3*\3*\3+\3+\3+\3+\7+\u013c\n+\f+\16+\u013f\13+\3+\3+"+
		"\3+\3+\3,\3,\3,\2\2-\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27"+
		"\16\31\17\33\20\35\21\37\22!\2#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65"+
		"\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W\2\3\2\13\5\2"+
		"\62;CHch\5\2C\\aac|\5\2$$))^^\5\2\'\'>>@@\4\2,-\61\61\4\2\60\60<=\5\2"+
		"\13\f\17\17\"\"\3\2\f\f\n\2$$))^^ddhhppttvv\u015a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3Y\3\2\2"+
		"\2\5_\3\2\2\2\7g\3\2\2\2\tm\3\2\2\2\13u\3\2\2\2\r~\3\2\2\2\17\u0081\3"+
		"\2\2\2\21\u0086\3\2\2\2\23\u008a\3\2\2\2\25\u008d\3\2\2\2\27\u0094\3\2"+
		"\2\2\31\u0099\3\2\2\2\33\u00a9\3\2\2\2\35\u00b7\3\2\2\2\37\u00c2\3\2\2"+
		"\2!\u00c4\3\2\2\2#\u00d8\3\2\2\2%\u00da\3\2\2\2\'\u00e0\3\2\2\2)\u00e8"+
		"\3\2\2\2+\u00ea\3\2\2\2-\u00ed\3\2\2\2/\u00f3\3\2\2\2\61\u00f5\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00f9\3\2\2\2\67\u0103\3\2\2\29\u0105\3\2\2\2;\u0112"+
		"\3\2\2\2=\u0116\3\2\2\2?\u011c\3\2\2\2A\u011e\3\2\2\2C\u0120\3\2\2\2E"+
		"\u0122\3\2\2\2G\u0124\3\2\2\2I\u0126\3\2\2\2K\u0128\3\2\2\2M\u012a\3\2"+
		"\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0131\3\2\2\2U\u0137\3\2\2\2W\u0144"+
		"\3\2\2\2YZ\7e\2\2Z[\7n\2\2[\\\7c\2\2\\]\7u\2\2]^\7u\2\2^\4\3\2\2\2_`\7"+
		"R\2\2`a\7t\2\2ab\7q\2\2bc\7i\2\2cd\7t\2\2de\7c\2\2ef\7o\2\2f\6\3\2\2\2"+
		"gh\7d\2\2hi\7t\2\2ij\7g\2\2jk\7c\2\2kl\7m\2\2l\b\3\2\2\2mn\7e\2\2no\7"+
		"c\2\2op\7n\2\2pq\7n\2\2qr\7q\2\2rs\7w\2\2st\7v\2\2t\n\3\2\2\2uv\7e\2\2"+
		"vw\7q\2\2wx\7p\2\2xy\7v\2\2yz\7k\2\2z{\7p\2\2{|\7w\2\2|}\7g\2\2}\f\3\2"+
		"\2\2~\177\7f\2\2\177\u0080\7q\2\2\u0080\16\3\2\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\20\3\2"+
		"\2\2\u0086\u0087\7h\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089\22"+
		"\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\24\3\2\2\2\u008d"+
		"\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2"+
		"\u0091\u0092\7t\2\2\u0092\u0093\7p\2\2\u0093\26\3\2\2\2\u0094\u0095\7"+
		"x\2\2\u0095\u0096\7q\2\2\u0096\u0097\7k\2\2\u0097\u0098\7f\2\2\u0098\30"+
		"\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\32\3\2\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00aa\7v\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7q\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7c\2\2\u00a8\u00aa\7p\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa"+
		"\34\3\2\2\2\u00ab\u00ad\5+\26\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b8\3\2\2\2\u00b0\u00b8"+
		"\5!\21\2\u00b1\u00b3\59\35\2\u00b2\u00b4\5+\26\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b8"+
		"\36\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00c3\7g\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7u\2\2\u00c1\u00c3\7g\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c6\7z\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\"\3\2\2\2\u00cc\u00cd"+
		"\7)\2\2\u00cd\u00ce\5\61\31\2\u00ce\u00cf\7)\2\2\u00cf\u00d9\3\2\2\2\u00d0"+
		"\u00d2\7)\2\2\u00d1\u00d3\5W,\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\7)\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d9"+
		"$\3\2\2\2\u00da\u00dc\7$\2\2\u00db\u00dd\5-\27\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7$\2\2\u00df&\3\2\2\2\u00e0"+
		"\u00e5\5)\25\2\u00e1\u00e4\5)\25\2\u00e2\u00e4\5+\26\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6(\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\t\3\2\2"+
		"\u00e9*\3\2\2\2\u00ea\u00eb\4\62;\2\u00eb,\3\2\2\2\u00ec\u00ee\5/\30\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0.\3\2\2\2\u00f1\u00f4\5\61\31\2\u00f2\u00f4\5W,\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\60\3\2\2\2\u00f5\u00f6\n\4\2"+
		"\2\u00f6\62\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7"+
		"?\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7-\2\2\u00fc\u0104\7?\2\2\u00fd\u00fe"+
		"\7/\2\2\u00fe\u0104\7?\2\2\u00ff\u0100\7,\2\2\u0100\u0104\7?\2\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0104\7?\2\2\u0103\u00fb\3\2\2\2\u0103\u00fd\3\2"+
		"\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u01048\3\2\2\2\u0105\u0106"+
		"\7/\2\2\u0106:\3\2\2\2\u0107\u0113\5=\37\2\u0108\u0113\5? \2\u0109\u0113"+
		"\t\5\2\2\u010a\u010b\7@\2\2\u010b\u0113\7?\2\2\u010c\u010d\7>\2\2\u010d"+
		"\u0113\7?\2\2\u010e\u010f\7#\2\2\u010f\u0113\7?\2\2\u0110\u0111\7?\2\2"+
		"\u0111\u0113\7?\2\2\u0112\u0107\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0109"+
		"\3\2\2\2\u0112\u010a\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113<\3\2\2\2\u0114\u0117\t\6\2\2\u0115\u0117\59\35\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117>\3\2\2\2\u0118\u0119\7"+
		"(\2\2\u0119\u011d\7(\2\2\u011a\u011b\7~\2\2\u011b\u011d\7~\2\2\u011c\u0118"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d@\3\2\2\2\u011e\u011f\7=\2\2\u011fB"+
		"\3\2\2\2\u0120\u0121\t\7\2\2\u0121D\3\2\2\2\u0122\u0123\7.\2\2\u0123F"+
		"\3\2\2\2\u0124\u0125\7}\2\2\u0125H\3\2\2\2\u0126\u0127\7\177\2\2\u0127"+
		"J\3\2\2\2\u0128\u0129\7*\2\2\u0129L\3\2\2\2\u012a\u012b\7+\2\2\u012bN"+
		"\3\2\2\2\u012c\u012d\7]\2\2\u012dP\3\2\2\2\u012e\u012f\7_\2\2\u012fR\3"+
		"\2\2\2\u0130\u0132\t\b\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b*"+
		"\2\2\u0136T\3\2\2\2\u0137\u0138\7\61\2\2\u0138\u0139\7\61\2\2\u0139\u013d"+
		"\3\2\2\2\u013a\u013c\n\t\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0141\7\f\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b+\2\2\u0143"+
		"V\3\2\2\2\u0144\u0145\7^\2\2\u0145\u0146\t\n\2\2\u0146X\3\2\2\2\26\2\u00a9"+
		"\u00ae\u00b5\u00b7\u00c2\u00ca\u00d4\u00d8\u00dc\u00e3\u00e5\u00ef\u00f3"+
		"\u0103\u0112\u0116\u011c\u0133\u013d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}