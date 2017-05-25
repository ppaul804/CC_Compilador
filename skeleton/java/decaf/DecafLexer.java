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
		CHAR_LITERAL=17, STRING_LITERAL=18, ID=19, OPERADOR_BINARIO=20, ARITH_OP=21, 
		REL_OP=22, EQ_OP=23, COND_OP=24, ATRIBUICAO_OP=25, PONTOEVIRGULA=26, SOMA=27, 
		SUBTRACAO=28, MULTIPLICACAO=29, DIVISAO=30, PORCENTAGEM=31, IGUAL=32, 
		MAIORIGUAL=33, MENORIGUAL=34, EXCLAMACAO=35, COMPARADORES=36, IGUALDADE=37, 
		DIFERENCA=38, ECONDICIONAL=39, OUCONDICIONAL=40, PONTOS=41, VIRGULA=42, 
		ABRE_CHAVE=43, FECHA_CHAVE=44, ABRE_PARENTESE=45, FECHA_PARENTESE=46, 
		ABRE_COLCHETE=47, FECHA_COLCHETE=48, WS_=49, COMENTARIO=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "PROGRAM", "BREAK", "CALLOUT", "CONTINUE", "DO", "ELSE", "FOR", 
		"IF", "RETURN", "VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", "HEXA", 
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "ID_LETRA", "DIGITO", "STRING_CARS", 
		"STRING_CAR", "CHAR", "OPERADOR_BINARIO", "ARITH_OP", "REL_OP", "EQ_OP", 
		"COND_OP", "ATRIBUICAO_OP", "PONTOEVIRGULA", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
		"DIVISAO", "PORCENTAGEM", "IGUAL", "MAIORIGUAL", "MENORIGUAL", "EXCLAMACAO", 
		"COMPARADORES", "IGUALDADE", "DIFERENCA", "ECONDICIONAL", "OUCONDICIONAL", 
		"PONTOS", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", "FECHA_PARENTESE", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "WS_", "COMENTARIO", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'class'", "'Program'", "'break'", "'callout'", "'continue'", 
		"'do'", "'else'", "'for'", "'if'", "'return'", "'void'", "'while'", null, 
		null, null, null, null, null, null, null, null, null, null, null, "';'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'!'", null, 
		"'=='", "'!='", "'&&'", "'||'", null, "','", "'{'", "'}'", "'('", "')'", 
		"'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "CLASS", "PROGRAM", "BREAK", "CALLOUT", "CONTINUE", 
		"DO", "ELSE", "FOR", "IF", "RETURN", "VOID", "WHILE", "TIPO", "INT", "BOOLEAN_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "OPERADOR_BINARIO", "ARITH_OP", 
		"REL_OP", "EQ_OP", "COND_OP", "ATRIBUICAO_OP", "PONTOEVIRGULA", "SOMA", 
		"SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "PORCENTAGEM", "IGUAL", "MAIORIGUAL", 
		"MENORIGUAL", "EXCLAMACAO", "COMPARADORES", "IGUALDADE", "DIFERENCA", 
		"ECONDICIONAL", "OUCONDICIONAL", "PONTOS", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", 
		"ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", 
		"WS_", "COMENTARIO"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u0177\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\6\17\u00c7\n"+
		"\17\r\17\16\17\u00c8\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d7\n\20\3\21\3\21\3\21\3\21\6\21\u00dd\n\21\r"+
		"\21\16\21\u00de\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00e7\n\22\r\22\16"+
		"\22\u00e8\3\22\3\22\5\22\u00ed\n\22\3\23\3\23\5\23\u00f1\n\23\3\23\3\23"+
		"\3\24\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\25\3\25\3\26"+
		"\3\26\3\27\6\27\u0102\n\27\r\27\16\27\u0103\3\30\3\30\5\30\u0108\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0110\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0117\n\33\3\34\3\34\3\35\3\35\5\35\u011d\n\35\3\36\3\36\5\36\u0121"+
		"\n\36\3\37\3\37\3\37\5\37\u0126\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\5*\u0143\n*\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\6\67\u0162\n\67\r\67\16\67"+
		"\u0163\3\67\3\67\38\38\38\38\78\u016c\n8\f8\168\u016f\138\38\38\38\38"+
		"\39\39\39\2\2:\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r\27\16\31"+
		"\17\33\20\35\21\37\22!\2#\23%\24\'\25)\2+\2-\2/\2\61\2\63\26\65\27\67"+
		"\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60"+
		"i\61k\62m\63o\64q\2\3\2\n\5\2\62;CHch\5\2C\\aac|\5\2$$))^^\4\2>>@@\4\2"+
		"\60\60<=\5\2\13\f\17\17\"\"\3\2\f\f\n\2$$))^^ddhhppttvv\u018a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\3s\3\2\2\2\5y\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u008f"+
		"\3\2\2\2\r\u0098\3\2\2\2\17\u009b\3\2\2\2\21\u00a0\3\2\2\2\23\u00a4\3"+
		"\2\2\2\25\u00a7\3\2\2\2\27\u00ae\3\2\2\2\31\u00b3\3\2\2\2\33\u00c3\3\2"+
		"\2\2\35\u00cb\3\2\2\2\37\u00d6\3\2\2\2!\u00d8\3\2\2\2#\u00ec\3\2\2\2%"+
		"\u00ee\3\2\2\2\'\u00f4\3\2\2\2)\u00fc\3\2\2\2+\u00fe\3\2\2\2-\u0101\3"+
		"\2\2\2/\u0107\3\2\2\2\61\u0109\3\2\2\2\63\u010f\3\2\2\2\65\u0116\3\2\2"+
		"\2\67\u0118\3\2\2\29\u011c\3\2\2\2;\u0120\3\2\2\2=\u0125\3\2\2\2?\u0127"+
		"\3\2\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G\u012f\3\2\2\2I"+
		"\u0131\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2\2\2O\u0138\3\2\2\2Q\u013b\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0147\3\2\2\2Y\u014a\3\2\2\2[\u014d"+
		"\3\2\2\2]\u0150\3\2\2\2_\u0152\3\2\2\2a\u0154\3\2\2\2c\u0156\3\2\2\2e"+
		"\u0158\3\2\2\2g\u015a\3\2\2\2i\u015c\3\2\2\2k\u015e\3\2\2\2m\u0161\3\2"+
		"\2\2o\u0167\3\2\2\2q\u0174\3\2\2\2st\7e\2\2tu\7n\2\2uv\7c\2\2vw\7u\2\2"+
		"wx\7u\2\2x\4\3\2\2\2yz\7R\2\2z{\7t\2\2{|\7q\2\2|}\7i\2\2}~\7t\2\2~\177"+
		"\7c\2\2\177\u0080\7o\2\2\u0080\6\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7m\2\2\u0086"+
		"\b\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e\7v\2\2"+
		"\u008e\n\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7p"+
		"\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096"+
		"\7w\2\2\u0096\u0097\7g\2\2\u0097\f\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a"+
		"\7q\2\2\u009a\16\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7g\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\22\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\26\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5\7j\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\32\3\2\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00c4\7v\2\2\u00bc\u00bd\7d\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c4\7p\2\2\u00c3\u00b9\3\2\2\2\u00c3"+
		"\u00bc\3\2\2\2\u00c4\34\3\2\2\2\u00c5\u00c7\5+\26\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00cc\5!\21\2\u00cb\u00c6\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\36\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d7\7g\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\u00d5\7u\2\2\u00d5\u00d7\7g\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d1"+
		"\3\2\2\2\u00d7 \3\2\2\2\u00d8\u00d9\7\62\2\2\u00d9\u00da\7z\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\"\3\2\2\2\u00e0\u00e1"+
		"\7)\2\2\u00e1\u00e2\5\61\31\2\u00e2\u00e3\7)\2\2\u00e3\u00ed\3\2\2\2\u00e4"+
		"\u00e6\7)\2\2\u00e5\u00e7\5q9\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\7)\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ed"+
		"$\3\2\2\2\u00ee\u00f0\7$\2\2\u00ef\u00f1\5-\27\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3&\3\2\2\2\u00f4"+
		"\u00f9\5)\25\2\u00f5\u00f8\5)\25\2\u00f6\u00f8\5+\26\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa(\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\t\3\2\2"+
		"\u00fd*\3\2\2\2\u00fe\u00ff\4\62;\2\u00ff,\3\2\2\2\u0100\u0102\5/\30\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104.\3\2\2\2\u0105\u0108\5\61\31\2\u0106\u0108\5q9\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\60\3\2\2\2\u0109\u010a\n\4\2"+
		"\2\u010a\62\3\2\2\2\u010b\u0110\5\65\33\2\u010c\u0110\5\67\34\2\u010d"+
		"\u0110\59\35\2\u010e\u0110\5;\36\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\64\3\2\2\2\u0111\u0117"+
		"\5A!\2\u0112\u0117\5C\"\2\u0113\u0117\5E#\2\u0114\u0117\5G$\2\u0115\u0117"+
		"\5I%\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\66\3\2\2\2\u0118\u0119\5S*\2"+
		"\u01198\3\2\2\2\u011a\u011d\5U+\2\u011b\u011d\5W,\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011b\3\2\2\2\u011d:\3\2\2\2\u011e\u0121\5Y-\2\u011f\u0121\5"+
		"[.\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121<\3\2\2\2\u0122\u0126"+
		"\5K&\2\u0123\u0126\5M\'\2\u0124\u0126\5O(\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126>\3\2\2\2\u0127\u0128\7=\2\2\u0128"+
		"@\3\2\2\2\u0129\u012a\7-\2\2\u012aB\3\2\2\2\u012b\u012c\7/\2\2\u012cD"+
		"\3\2\2\2\u012d\u012e\7,\2\2\u012eF\3\2\2\2\u012f\u0130\7\61\2\2\u0130"+
		"H\3\2\2\2\u0131\u0132\7\'\2\2\u0132J\3\2\2\2\u0133\u0134\7?\2\2\u0134"+
		"L\3\2\2\2\u0135\u0136\7-\2\2\u0136\u0137\7?\2\2\u0137N\3\2\2\2\u0138\u0139"+
		"\7/\2\2\u0139\u013a\7?\2\2\u013aP\3\2\2\2\u013b\u013c\7#\2\2\u013cR\3"+
		"\2\2\2\u013d\u0143\t\5\2\2\u013e\u013f\7>\2\2\u013f\u0143\7?\2\2\u0140"+
		"\u0141\7@\2\2\u0141\u0143\7?\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0143T\3\2\2\2\u0144\u0145\7?\2\2\u0145\u0146\7"+
		"?\2\2\u0146V\3\2\2\2\u0147\u0148\7#\2\2\u0148\u0149\7?\2\2\u0149X\3\2"+
		"\2\2\u014a\u014b\7(\2\2\u014b\u014c\7(\2\2\u014cZ\3\2\2\2\u014d\u014e"+
		"\7~\2\2\u014e\u014f\7~\2\2\u014f\\\3\2\2\2\u0150\u0151\t\6\2\2\u0151^"+
		"\3\2\2\2\u0152\u0153\7.\2\2\u0153`\3\2\2\2\u0154\u0155\7}\2\2\u0155b\3"+
		"\2\2\2\u0156\u0157\7\177\2\2\u0157d\3\2\2\2\u0158\u0159\7*\2\2\u0159f"+
		"\3\2\2\2\u015a\u015b\7+\2\2\u015bh\3\2\2\2\u015c\u015d\7]\2\2\u015dj\3"+
		"\2\2\2\u015e\u015f\7_\2\2\u015fl\3\2\2\2\u0160\u0162\t\7\2\2\u0161\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\b\67\2\2\u0166n\3\2\2\2\u0167\u0168\7\61\2"+
		"\2\u0168\u0169\7\61\2\2\u0169\u016d\3\2\2\2\u016a\u016c\n\b\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\f\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\b8\2\2\u0173p\3\2\2\2\u0174\u0175\7^\2\2\u0175"+
		"\u0176\t\t\2\2\u0176r\3\2\2\2\27\2\u00c3\u00c8\u00cb\u00d6\u00de\u00e8"+
		"\u00ec\u00f0\u00f7\u00f9\u0103\u0107\u010f\u0116\u011c\u0120\u0125\u0142"+
		"\u0163\u016d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}