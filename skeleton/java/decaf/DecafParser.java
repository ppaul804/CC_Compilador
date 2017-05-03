// Generated from /home/uniceub/igortullio/CC_Compilador/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_class=1, CLASS=2, BREAK=3, CALLOUT=4, CONTINUE=5, DO=6, ELSE=7, FOR=8, 
		IF=9, RETURN=10, VOID=11, WHILE=12, TIPO=13, INT=14, BOOLEAN_LITERAL=15, 
		CHAR_LITERAL=16, STRING_LITERAL=17, ID=18, OPERADORES=19, COMPARADORES=20, 
		CONDICIONADORES=21, PONTOS=22, ABRE_CHAVE=23, FECHA_CHAVE=24, ABRE_PARENTESE=25, 
		FECHA_PARENTESE=26, ABRE_COLCHETE=27, FECHA_COLCHETE=28, WS_=29, COMENTARIO=30, 
		LCURLY=31, RCURLY=32;
	public static final int
		RULE_program = 0;
	public static final String[] ruleNames = {
		"program"
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
		"FECHA_PARENTESE", "ABRE_COLCHETE", "FECHA_COLCHETE", "WS_", "COMENTARIO", 
		"LCURLY", "RCURLY"
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

	@Override
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode TK_class() { return getToken(DecafParser.TK_class, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(TK_class);
			setState(3);
			match(ID);
			setState(4);
			match(LCURLY);
			setState(5);
			match(RCURLY);
			setState(6);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\13\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\t\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\24"+
		"\2\2\6\7\7!\2\2\7\b\7\"\2\2\b\t\7\2\2\3\t\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}