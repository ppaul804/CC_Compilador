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
		TK_class=1, CLASS=2, PROGRAM=3, BREAK=4, CALLOUT=5, CONTINUE=6, DO=7, 
		ELSE=8, FOR=9, IF=10, RETURN=11, VOID=12, WHILE=13, TIPO=14, INT=15, BOOLEAN_LITERAL=16, 
		CHAR_LITERAL=17, STRING_LITERAL=18, ID=19, EXCLAMACAO=20, IGUAL=21, ATRIBUICAO_OP=22, 
		SUBTRACAO=23, OPERADOR_BIN=24, OPERADOR_BASICO=25, OPERADOR_RELACIONAL=26, 
		PONTOEVIRGULA=27, PONTOS=28, VIRGULA=29, ABRE_CHAVE=30, FECHA_CHAVE=31, 
		ABRE_PARENTESE=32, FECHA_PARENTESE=33, ABRE_COLCHETE=34, FECHA_COLCHETE=35, 
		WS_=36, COMENTARIO=37;
	public static final int
		RULE_programa = 0, RULE_campo = 1, RULE_elemento_campo = 2, RULE_metodo = 3, 
		RULE_parametro = 4, RULE_elemento_parametro = 5, RULE_bloco = 6, RULE_var_decl = 7, 
		RULE_estrutura = 8, RULE_expressao = 9, RULE_localizacao = 10, RULE_chamada_metodo = 11, 
		RULE_elemento_argumento_chamada = 12, RULE_argumento_chamada = 13, RULE_elemento_callout = 14, 
		RULE_elemento_chamada_metodo = 15, RULE_literal = 16;
	public static final String[] ruleNames = {
		"programa", "campo", "elemento_campo", "metodo", "parametro", "elemento_parametro", 
		"bloco", "var_decl", "estrutura", "expressao", "localizacao", "chamada_metodo", 
		"elemento_argumento_chamada", "argumento_chamada", "elemento_callout", 
		"elemento_chamada_metodo", "literal"
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
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(DecafParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(DecafParser.FECHA_CHAVE, 0); }
		public TerminalNode EOF() { return getToken(DecafParser.EOF, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CLASS);
			setState(35);
			match(PROGRAM);
			setState(36);
			match(ABRE_CHAVE);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					campo();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==TIPO) {
				{
				{
				setState(43);
				metodo();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(FECHA_CHAVE);
			setState(50);
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

	public static class CampoContext extends ParserRuleContext {
		public List<Elemento_campoContext> elemento_campo() {
			return getRuleContexts(Elemento_campoContext.class);
		}
		public Elemento_campoContext elemento_campo(int i) {
			return getRuleContext(Elemento_campoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			elemento_campo();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(53);
				match(VIRGULA);
				setState(54);
				elemento_campo();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Elemento_campoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode PONTOEVIRGULA() { return getToken(DecafParser.PONTOEVIRGULA, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(DecafParser.ABRE_COLCHETE, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode FECHA_COLCHETE() { return getToken(DecafParser.FECHA_COLCHETE, 0); }
		public Elemento_campoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_campo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_campo(this);
		}
	}

	public final Elemento_campoContext elemento_campo() throws RecognitionException {
		Elemento_campoContext _localctx = new Elemento_campoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elemento_campo);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(TIPO);
				setState(61);
				match(ID);
				setState(62);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(TIPO);
				setState(64);
				match(ID);
				setState(65);
				match(ABRE_COLCHETE);
				setState(66);
				match(INT);
				setState(67);
				match(FECHA_COLCHETE);
				setState(68);
				match(PONTOEVIRGULA);
				}
				break;
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

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(DecafParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(DecafParser.FECHA_PARENTESE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TIPO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(72);
			match(ID);
			setState(73);
			match(ABRE_PARENTESE);
			setState(75);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(74);
				parametro();
				}
			}

			setState(77);
			match(FECHA_PARENTESE);
			setState(78);
			bloco();
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

	public static class ParametroContext extends ParserRuleContext {
		public List<Elemento_parametroContext> elemento_parametro() {
			return getRuleContexts(Elemento_parametroContext.class);
		}
		public Elemento_parametroContext elemento_parametro(int i) {
			return getRuleContext(Elemento_parametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			elemento_parametro();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(81);
				match(VIRGULA);
				setState(82);
				elemento_parametro();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Elemento_parametroContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Elemento_parametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_parametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_parametro(this);
		}
	}

	public final Elemento_parametroContext elemento_parametro() throws RecognitionException {
		Elemento_parametroContext _localctx = new Elemento_parametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elemento_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TIPO);
			setState(89);
			match(ID);
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(DecafParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(DecafParser.FECHA_CHAVE, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ABRE_CHAVE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(92);
				var_decl();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << ID) | (1L << ABRE_CHAVE))) != 0)) {
				{
				{
				setState(98);
				estrutura();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(FECHA_CHAVE);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(DecafParser.PONTOEVIRGULA, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TIPO);
			setState(107);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(108);
				match(VIRGULA);
				setState(109);
				match(ID);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(PONTOEVIRGULA);
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

	public static class EstruturaContext extends ParserRuleContext {
		public LocalizacaoContext localizacao() {
			return getRuleContext(LocalizacaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(DecafParser.PONTOEVIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
		public TerminalNode ATRIBUICAO_OP() { return getToken(DecafParser.ATRIBUICAO_OP, 0); }
		public Chamada_metodoContext chamada_metodo() {
			return getRuleContext(Chamada_metodoContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(DecafParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(DecafParser.FECHA_PARENTESE, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode VIRGULA() { return getToken(DecafParser.VIRGULA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEstrutura(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estrutura);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				localizacao();
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==IGUAL || _la==ATRIBUICAO_OP) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(119);
				expressao(0);
				setState(120);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				chamada_metodo();
				setState(123);
				match(PONTOEVIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(IF);
				setState(126);
				match(ABRE_PARENTESE);
				setState(127);
				expressao(0);
				setState(128);
				match(FECHA_PARENTESE);
				setState(129);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(IF);
				setState(132);
				match(ABRE_PARENTESE);
				setState(133);
				expressao(0);
				setState(134);
				match(FECHA_PARENTESE);
				setState(135);
				bloco();
				setState(136);
				match(ELSE);
				setState(137);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(FOR);
				setState(140);
				match(ID);
				setState(141);
				match(IGUAL);
				setState(142);
				expressao(0);
				setState(143);
				match(VIRGULA);
				setState(144);
				expressao(0);
				setState(145);
				bloco();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				match(RETURN);
				setState(149);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << INT) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID) | (1L << EXCLAMACAO) | (1L << SUBTRACAO) | (1L << ABRE_PARENTESE))) != 0)) {
					{
					setState(148);
					expressao(0);
					}
				}

				setState(151);
				match(PONTOEVIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(BREAK);
				setState(153);
				match(PONTOEVIRGULA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(CONTINUE);
				setState(155);
				match(PONTOEVIRGULA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				bloco();
				}
				break;
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

	public static class ExpressaoContext extends ParserRuleContext {
		public LocalizacaoContext localizacao() {
			return getRuleContext(LocalizacaoContext.class,0);
		}
		public Chamada_metodoContext chamada_metodo() {
			return getRuleContext(Chamada_metodoContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SUBTRACAO() { return getToken(DecafParser.SUBTRACAO, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode EXCLAMACAO() { return getToken(DecafParser.EXCLAMACAO, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(DecafParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(DecafParser.FECHA_PARENTESE, 0); }
		public TerminalNode OPERADOR_BIN() { return getToken(DecafParser.OPERADOR_BIN, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(160);
				localizacao();
				}
				break;
			case 2:
				{
				setState(161);
				chamada_metodo();
				}
				break;
			case 3:
				{
				setState(162);
				literal();
				}
				break;
			case 4:
				{
				setState(163);
				match(SUBTRACAO);
				setState(164);
				expressao(3);
				}
				break;
			case 5:
				{
				setState(165);
				match(EXCLAMACAO);
				setState(166);
				expressao(2);
				}
				break;
			case 6:
				{
				setState(167);
				match(ABRE_PARENTESE);
				setState(168);
				expressao(0);
				setState(169);
				match(FECHA_PARENTESE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(173);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(174);
					_la = _input.LA(1);
					if ( !(_la==SUBTRACAO || _la==OPERADOR_BIN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(175);
					expressao(5);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LocalizacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(DecafParser.ABRE_COLCHETE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(DecafParser.FECHA_COLCHETE, 0); }
		public LocalizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocalizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocalizacao(this);
		}
	}

	public final LocalizacaoContext localizacao() throws RecognitionException {
		LocalizacaoContext _localctx = new LocalizacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_localizacao);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(ID);
				setState(183);
				match(ABRE_COLCHETE);
				setState(184);
				expressao(0);
				setState(185);
				match(FECHA_COLCHETE);
				}
				break;
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

	public static class Chamada_metodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(DecafParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(DecafParser.FECHA_PARENTESE, 0); }
		public Elemento_chamada_metodoContext elemento_chamada_metodo() {
			return getRuleContext(Elemento_chamada_metodoContext.class,0);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public List<Elemento_calloutContext> elemento_callout() {
			return getRuleContexts(Elemento_calloutContext.class);
		}
		public Elemento_calloutContext elemento_callout(int i) {
			return getRuleContext(Elemento_calloutContext.class,i);
		}
		public Chamada_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterChamada_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitChamada_metodo(this);
		}
	}

	public final Chamada_metodoContext chamada_metodo() throws RecognitionException {
		Chamada_metodoContext _localctx = new Chamada_metodoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chamada_metodo);
		int _la;
		try {
			setState(206);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				setState(190);
				match(ABRE_PARENTESE);
				setState(192);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << INT) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID) | (1L << EXCLAMACAO) | (1L << SUBTRACAO) | (1L << ABRE_PARENTESE))) != 0)) {
					{
					setState(191);
					elemento_chamada_metodo();
					}
				}

				setState(194);
				match(FECHA_PARENTESE);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(CALLOUT);
				setState(196);
				match(ABRE_PARENTESE);
				setState(197);
				match(STRING_LITERAL);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(198);
					match(VIRGULA);
					setState(199);
					elemento_callout();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(FECHA_PARENTESE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Elemento_argumento_chamadaContext extends ParserRuleContext {
		public List<Argumento_chamadaContext> argumento_chamada() {
			return getRuleContexts(Argumento_chamadaContext.class);
		}
		public Argumento_chamadaContext argumento_chamada(int i) {
			return getRuleContext(Argumento_chamadaContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Elemento_argumento_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_argumento_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_argumento_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_argumento_chamada(this);
		}
	}

	public final Elemento_argumento_chamadaContext elemento_argumento_chamada() throws RecognitionException {
		Elemento_argumento_chamadaContext _localctx = new Elemento_argumento_chamadaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elemento_argumento_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			argumento_chamada();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(209);
				match(VIRGULA);
				setState(210);
				argumento_chamada();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Argumento_chamadaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Argumento_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArgumento_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArgumento_chamada(this);
		}
	}

	public final Argumento_chamadaContext argumento_chamada() throws RecognitionException {
		Argumento_chamadaContext _localctx = new Argumento_chamadaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumento_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			expressao(0);
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

	public static class Elemento_calloutContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Elemento_calloutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_callout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_callout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_callout(this);
		}
	}

	public final Elemento_calloutContext elemento_callout() throws RecognitionException {
		Elemento_calloutContext _localctx = new Elemento_calloutContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elemento_callout);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(STRING_LITERAL);
				}
				break;
			case CALLOUT:
			case INT:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case ID:
			case EXCLAMACAO:
			case SUBTRACAO:
			case ABRE_PARENTESE:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				expressao(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Elemento_chamada_metodoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(DecafParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(DecafParser.VIRGULA, i);
		}
		public Elemento_chamada_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_chamada_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_chamada_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_chamada_metodo(this);
		}
	}

	public final Elemento_chamada_metodoContext elemento_chamada_metodo() throws RecognitionException {
		Elemento_chamada_metodoContext _localctx = new Elemento_chamada_metodoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elemento_chamada_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expressao(0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(223);
				match(VIRGULA);
				setState(224);
				expressao(0);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(DecafParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DecafParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b"+
		"\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\t"+
		"t\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0098\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\13\3\13"+
		"\3\13\7\13\u00b3\n\13\f\13\16\13\u00b6\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00be\n\f\3\r\3\r\3\r\5\r\u00c3\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cb"+
		"\n\r\f\r\16\r\u00ce\13\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\7\16\u00d6\n"+
		"\16\f\16\16\16\u00d9\13\16\3\17\3\17\3\20\3\20\5\20\u00df\n\20\3\21\3"+
		"\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7\13\21\3\22\3\22\3\22\2\3\24"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\16\16\20\20\3\2"+
		"\27\30\3\2\31\32\3\2\21\23\u00f8\2$\3\2\2\2\4\66\3\2\2\2\6G\3\2\2\2\b"+
		"I\3\2\2\2\nR\3\2\2\2\fZ\3\2\2\2\16]\3\2\2\2\20l\3\2\2\2\22\u009f\3\2\2"+
		"\2\24\u00ad\3\2\2\2\26\u00bd\3\2\2\2\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2"+
		"\34\u00da\3\2\2\2\36\u00de\3\2\2\2 \u00e0\3\2\2\2\"\u00e8\3\2\2\2$%\7"+
		"\4\2\2%&\7\5\2\2&*\7 \2\2\')\5\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+"+
		"\3\2\2\2+\60\3\2\2\2,*\3\2\2\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2"+
		"\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7!\2\2\64\65\7\2"+
		"\2\3\65\3\3\2\2\2\66;\5\6\4\2\678\7\37\2\28:\5\6\4\29\67\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2>?\7\20\2\2?@\7\25\2\2@H"+
		"\7\35\2\2AB\7\20\2\2BC\7\25\2\2CD\7$\2\2DE\7\21\2\2EF\7%\2\2FH\7\35\2"+
		"\2G>\3\2\2\2GA\3\2\2\2H\7\3\2\2\2IJ\t\2\2\2JK\7\25\2\2KM\7\"\2\2LN\5\n"+
		"\6\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7#\2\2PQ\5\16\b\2Q\t\3\2\2\2RW\5"+
		"\f\7\2ST\7\37\2\2TV\5\f\7\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13"+
		"\3\2\2\2YW\3\2\2\2Z[\7\20\2\2[\\\7\25\2\2\\\r\3\2\2\2]a\7 \2\2^`\5\20"+
		"\t\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\22"+
		"\n\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7!"+
		"\2\2k\17\3\2\2\2lm\7\20\2\2mr\7\25\2\2no\7\37\2\2oq\7\25\2\2pn\3\2\2\2"+
		"qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\35\2\2v\21\3\2"+
		"\2\2wx\5\26\f\2xy\t\3\2\2yz\5\24\13\2z{\7\35\2\2{\u00a0\3\2\2\2|}\5\30"+
		"\r\2}~\7\35\2\2~\u00a0\3\2\2\2\177\u0080\7\f\2\2\u0080\u0081\7\"\2\2\u0081"+
		"\u0082\5\24\13\2\u0082\u0083\7#\2\2\u0083\u0084\5\16\b\2\u0084\u00a0\3"+
		"\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7\"\2\2\u0087\u0088\5\24\13\2\u0088"+
		"\u0089\7#\2\2\u0089\u008a\5\16\b\2\u008a\u008b\7\n\2\2\u008b\u008c\5\16"+
		"\b\2\u008c\u00a0\3\2\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\25\2\2\u008f"+
		"\u0090\7\27\2\2\u0090\u0091\5\24\13\2\u0091\u0092\7\37\2\2\u0092\u0093"+
		"\5\24\13\2\u0093\u0094\5\16\b\2\u0094\u00a0\3\2\2\2\u0095\u0097\7\r\2"+
		"\2\u0096\u0098\5\24\13\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u00a0\7\35\2\2\u009a\u009b\7\6\2\2\u009b\u00a0\7"+
		"\35\2\2\u009c\u009d\7\b\2\2\u009d\u00a0\7\35\2\2\u009e\u00a0\5\16\b\2"+
		"\u009fw\3\2\2\2\u009f|\3\2\2\2\u009f\177\3\2\2\2\u009f\u0085\3\2\2\2\u009f"+
		"\u008d\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\b\13\1\2\u00a2\u00ae"+
		"\5\26\f\2\u00a3\u00ae\5\30\r\2\u00a4\u00ae\5\"\22\2\u00a5\u00a6\7\31\2"+
		"\2\u00a6\u00ae\5\24\13\5\u00a7\u00a8\7\26\2\2\u00a8\u00ae\5\24\13\4\u00a9"+
		"\u00aa\7\"\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7#\2\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad"+
		"\u00a5\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00b4\3\2"+
		"\2\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\t\4\2\2\u00b1\u00b3\5\24\13\7\u00b2"+
		"\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\25\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00be\7\25\2\2\u00b8\u00b9"+
		"\7\25\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7%\2\2"+
		"\u00bc\u00be\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\27"+
		"\3\2\2\2\u00bf\u00c0\7\25\2\2\u00c0\u00c2\7\"\2\2\u00c1\u00c3\5 \21\2"+
		"\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d1"+
		"\7#\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00cc\7\24\2\2\u00c8"+
		"\u00c9\7\37\2\2\u00c9\u00cb\5\36\20\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\7#\2\2\u00d0\u00bf\3\2\2\2\u00d0\u00c5\3\2"+
		"\2\2\u00d1\31\3\2\2\2\u00d2\u00d7\5\34\17\2\u00d3\u00d4\7\37\2\2\u00d4"+
		"\u00d6\5\34\17\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\33\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\5\24\13\2\u00db\35\3\2\2\2\u00dc\u00df\7\24\2\2\u00dd\u00df\5\24"+
		"\13\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e5"+
		"\5\24\13\2\u00e1\u00e2\7\37\2\2\u00e2\u00e4\5\24\13\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9#\3\2\2\2\26*\60"+
		";GMWagr\u0097\u009f\u00ad\u00b4\u00bd\u00c2\u00cc\u00d0\u00d7\u00de\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}