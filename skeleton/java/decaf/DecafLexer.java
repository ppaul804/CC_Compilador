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
		TK_class=1, ABRE_CHAVE=2, FECHA_CHAVE=3, ID=4, ID_LETRA=5, DIGITO=6, INT=7, 
		FLOAT=8, HEXA=9, WS_=10, COMENTARIO=11, CHAR_LITERAL=12, STRING=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABRE_CHAVE", "FECHA_CHAVE", "ID", "ID_LETRA", "DIGITO", "INT", "FLOAT", 
		"HEXA", "WS_", "COMENTARIO", "CHAR_LITERAL", "STRING", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "ABRE_CHAVE", "FECHA_CHAVE", "ID", "ID_LETRA", "DIGITO", 
		"INT", "FLOAT", "HEXA", "WS_", "COMENTARIO", "CHAR_LITERAL", "STRING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4%\n\4\f\4"+
		"\16\4(\13\4\3\5\3\5\3\6\3\6\3\7\6\7/\n\7\r\7\16\7\60\3\b\6\b\64\n\b\r"+
		"\b\16\b\65\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\3\b\6\bA\n\b\r\b\16\bB"+
		"\5\bE\n\b\3\t\3\t\3\t\3\t\6\tK\n\t\r\t\16\tL\3\n\6\nP\n\n\r\n\16\nQ\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\7\13Z\n\13\f\13\16\13]\13\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\ff\n\f\3\f\3\f\3\r\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\2\2\17\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23"+
		"\f\25\r\27\16\31\17\33\2\3\2\t\5\2C\\aac|\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\3\2\f\f\3\2))\3\2$$\4\2$$pp\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\35\3\2\2\2\5\37\3\2"+
		"\2\2\7!\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r.\3\2\2\2\17D\3\2\2\2\21F\3\2"+
		"\2\2\23O\3\2\2\2\25U\3\2\2\2\27b\3\2\2\2\31i\3\2\2\2\33s\3\2\2\2\35\36"+
		"\7}\2\2\36\4\3\2\2\2\37 \7\177\2\2 \6\3\2\2\2!&\5\t\5\2\"%\5\t\5\2#%\5"+
		"\13\6\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\b\3\2\2"+
		"\2(&\3\2\2\2)*\t\2\2\2*\n\3\2\2\2+,\4\62;\2,\f\3\2\2\2-/\5\13\6\2.-\3"+
		"\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\16\3\2\2\2\62\64\5\13"+
		"\6\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2"+
		"\2\2\67;\7\60\2\28:\5\13\6\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"E\3\2\2\2=;\3\2\2\2>@\7\60\2\2?A\5\13\6\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CE\3\2\2\2D\63\3\2\2\2D>\3\2\2\2E\20\3\2\2\2FG\7\62\2\2GH"+
		"\7z\2\2HJ\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\22"+
		"\3\2\2\2NP\t\4\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2S"+
		"T\b\n\2\2T\24\3\2\2\2UV\7\61\2\2VW\7\61\2\2W[\3\2\2\2XZ\n\5\2\2YX\3\2"+
		"\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\f\2\2_`\3"+
		"\2\2\2`a\b\13\2\2a\26\3\2\2\2be\7)\2\2cf\5\33\16\2df\n\6\2\2ec\3\2\2\2"+
		"ed\3\2\2\2fg\3\2\2\2gh\7)\2\2h\30\3\2\2\2in\7$\2\2jm\5\33\16\2km\n\7\2"+
		"\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2"+
		"\2qr\7$\2\2r\32\3\2\2\2st\7^\2\2tu\t\b\2\2u\34\3\2\2\2\20\2$&\60\65;B"+
		"DLQ[eln\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}