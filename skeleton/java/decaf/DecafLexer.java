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
		TK_class=1, ABRE_CHAVE=2, FECHA_CHAVE=3, ABRE_PARENTESE=4, FECHA_PARENTESE=5, 
		ABRE_COLCHETE=6, FECHA_COLCHETE=7, OPERADORES=8, COMPARADORES=9, CONDICIONADORES=10, 
		ID=11, ID_LETRA=12, DIGITO=13, INT=14, FLOAT=15, HEXA=16, WS_=17, COMENTARIO=18, 
		CHAR_LITERAL=19, STRING_LITERAL=20, CHAR=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_COLCHETE", 
		"FECHA_COLCHETE", "OPERADORES", "COMPARADORES", "CONDICIONADORES", "ID", 
		"ID_LETRA", "DIGITO", "INT", "FLOAT", "HEXA", "WS_", "COMENTARIO", "CHAR_LITERAL", 
		"STRING_LITERAL", "CHAR", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", "FECHA_PARENTESE", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "OPERADORES", "COMPARADORES", "CONDICIONADORES", 
		"ID", "ID_LETRA", "DIGITO", "INT", "FLOAT", "HEXA", "WS_", "COMENTARIO", 
		"CHAR_LITERAL", "STRING_LITERAL", "CHAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tE\n\t\3\n\3\n\3\n\3\n\5\nK\n\n\3\13\3\13\3\13\7\13P\n\13\f\13\16\13"+
		"S\13\13\3\f\3\f\3\r\3\r\3\16\6\16Z\n\16\r\16\16\16[\3\17\6\17_\n\17\r"+
		"\17\16\17`\3\17\3\17\7\17e\n\17\f\17\16\17h\13\17\3\17\3\17\6\17l\n\17"+
		"\r\17\16\17m\5\17p\n\17\3\20\3\20\3\20\3\20\6\20v\n\20\r\20\16\20w\3\21"+
		"\6\21{\n\21\r\21\16\21|\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0085\n\22"+
		"\f\22\16\22\u0088\13\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\7\24\u0094\n\24\f\24\16\24\u0097\13\24\3\24\3\24\3\25\3\25\5\25\u009d"+
		"\n\25\3\26\3\26\3\26\3\u0095\2\27\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13"+
		"\23\f\25\r\27\16\31\17\33\20\35\21\37\22!\23#\24%\25\'\26)\27+\2\3\2\n"+
		"\7\2\'\',-//\61\61??\4\2>>@@\5\2C\\aac|\5\2\62;CHch\5\2\13\f\17\17\"\""+
		"\3\2\f\f\5\2$$))^^\b\2$$^^ddppttvv\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2"+
		"\r\67\3\2\2\2\179\3\2\2\2\21D\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27T\3\2"+
		"\2\2\31V\3\2\2\2\33Y\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!z\3\2\2\2#\u0080"+
		"\3\2\2\2%\u008d\3\2\2\2\'\u0091\3\2\2\2)\u009c\3\2\2\2+\u009e\3\2\2\2"+
		"-.\7}\2\2.\4\3\2\2\2/\60\7\177\2\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2"+
		"\2\2\63\64\7+\2\2\64\n\3\2\2\2\65\66\7]\2\2\66\f\3\2\2\2\678\7_\2\28\16"+
		"\3\2\2\29:\t\2\2\2:\20\3\2\2\2;E\t\3\2\2<=\7>\2\2=E\7?\2\2>?\7@\2\2?E"+
		"\7?\2\2@A\7?\2\2AE\7?\2\2BC\7#\2\2CE\7?\2\2D;\3\2\2\2D<\3\2\2\2D>\3\2"+
		"\2\2D@\3\2\2\2DB\3\2\2\2E\22\3\2\2\2FG\7(\2\2GK\7(\2\2HI\7~\2\2IK\7~\2"+
		"\2JF\3\2\2\2JH\3\2\2\2K\24\3\2\2\2LQ\5\27\f\2MP\5\27\f\2NP\5\31\r\2OM"+
		"\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\26\3\2\2\2SQ\3\2\2\2"+
		"TU\t\4\2\2U\30\3\2\2\2VW\4\62;\2W\32\3\2\2\2XZ\5\31\r\2YX\3\2\2\2Z[\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\34\3\2\2\2]_\5\31\r\2^]\3\2\2\2_`\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bf\7\60\2\2ce\5\31\r\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gp\3\2\2\2hf\3\2\2\2ik\7\60\2\2jl\5\31\r\2kj\3"+
		"\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2o^\3\2\2\2oi\3\2\2\2p\36"+
		"\3\2\2\2qr\7\62\2\2rs\7z\2\2su\3\2\2\2tv\t\5\2\2ut\3\2\2\2vw\3\2\2\2w"+
		"u\3\2\2\2wx\3\2\2\2x \3\2\2\2y{\t\6\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}~\3\2\2\2~\177\b\21\2\2\177\"\3\2\2\2\u0080\u0081\7\61\2\2"+
		"\u0081\u0082\7\61\2\2\u0082\u0086\3\2\2\2\u0083\u0085\n\7\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\b\22\2\2\u008c$\3\2\2\2\u008d\u008e\7)\2\2\u008e\u008f"+
		"\5)\25\2\u008f\u0090\7)\2\2\u0090&\3\2\2\2\u0091\u0095\7$\2\2\u0092\u0094"+
		"\5)\25\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7$"+
		"\2\2\u0099(\3\2\2\2\u009a\u009d\5+\26\2\u009b\u009d\n\b\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d*\3\2\2\2\u009e\u009f\7^\2\2\u009f\u00a0"+
		"\t\t\2\2\u00a0,\3\2\2\2\21\2DJOQ[`fmow|\u0086\u0095\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}