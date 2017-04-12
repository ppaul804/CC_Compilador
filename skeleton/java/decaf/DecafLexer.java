// Generated from /home/uniceub/igortullio/CC_Compilador/src/decaf/DecafLexer.g4 by ANTLR 4.5.3

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
		TK_class=1, LCURLY=2, RCURLY=3, ID=4, WS_=5, SL_COMMENT=6, CHAR=7, STRING=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCURLY", "RCURLY", "ID", "WS_", "SL_COMMENT", "CHAR", "STRING", "ESC"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_class", "LCURLY", "RCURLY", "ID", "WS_", "SL_COMMENT", "CHAR", 
		"STRING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nA\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\6\4\31\n\4\r\4\16\4\32\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6%\n\6\f"+
		"\6\16\6(\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\61\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\7\b8\n\b\f\b\16\b;\13\b\3\b\3\b\3\t\3\t\3\t\2\2\n\3\4\5\5\7\6\t\7\13"+
		"\b\r\t\17\n\21\2\3\2\b\4\2C\\c|\4\2\f\f\"\"\3\2\f\f\3\2))\3\2$$\4\2$$"+
		"ppD\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\30\3\2\2\2\t\34\3\2\2"+
		"\2\13 \3\2\2\2\r-\3\2\2\2\17\64\3\2\2\2\21>\3\2\2\2\23\24\7}\2\2\24\4"+
		"\3\2\2\2\25\26\7\177\2\2\26\6\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\b\3\2\2\2\34\35\t\3\2\2\35\36"+
		"\3\2\2\2\36\37\b\5\2\2\37\n\3\2\2\2 !\7\61\2\2!\"\7\61\2\2\"&\3\2\2\2"+
		"#%\n\4\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2"+
		"\2)*\7\f\2\2*+\3\2\2\2+,\b\6\2\2,\f\3\2\2\2-\60\7)\2\2.\61\5\21\t\2/\61"+
		"\n\5\2\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\7)\2\2\63\16\3\2"+
		"\2\2\649\7$\2\2\658\5\21\t\2\668\n\6\2\2\67\65\3\2\2\2\67\66\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7$\2\2=\20\3\2\2"+
		"\2>?\7^\2\2?@\t\7\2\2@\22\3\2\2\2\b\2\32&\60\679\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}