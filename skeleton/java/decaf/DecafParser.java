// Generated from /home/paul-pc/Downloads/CC_Compilador/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

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
		CHAR_LITERAL=17, STRING_LITERAL=18, ID=19, OPERADOR_BIN=20, ARITH_OP=21, 
		REL_OP=22, EQ_OP=23, COND_OP=24, ATRIBUICAO_OP=25, PONTOEVIRGULA=26, SOMA=27, 
		SUBTRACAO=28, MULTIPLICACAO=29, DIVISAO=30, PORCENTAGEM=31, IGUAL=32, 
		MAIORIGUAL=33, MENORIGUAL=34, EXCLAMACAO=35, COMPARADORES=36, IGUALDADE=37, 
		DIFERENCA=38, ECONDICIONAL=39, OUCONDICIONAL=40, PONTOS=41, VIRGULA=42, 
		ABRE_CHAVE=43, FECHA_CHAVE=44, ABRE_PARENTESE=45, FECHA_PARENTESE=46, 
		ABRE_COLCHETE=47, FECHA_COLCHETE=48, WS_=49, COMENTARIO=50;
	public static final int
		RULE_programa = 0, RULE_campo = 1, RULE_elemento_campo = 2, RULE_metodo = 3, 
		RULE_parametro = 4, RULE_elemento_parametro = 5, RULE_bloco = 6, RULE_var_decl = 7, 
		RULE_elemento_var_decl = 8, RULE_estrutura = 9, RULE_expressao = 10, RULE_localizacao = 11, 
		RULE_chamada_metodo = 12, RULE_elemento_argumento_chamada = 13, RULE_argumento_chamada = 14, 
		RULE_elemento_chamada_metodo = 15, RULE_nome_metodo = 16, RULE_literal = 17;
	public static final String[] ruleNames = {
		"programa", "campo", "elemento_campo", "metodo", "parametro", "elemento_parametro", 
		"bloco", "var_decl", "elemento_var_decl", "estrutura", "expressao", "localizacao", 
		"chamada_metodo", "elemento_argumento_chamada", "argumento_chamada", "elemento_chamada_metodo", 
		"nome_metodo", "literal"
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
		"CHAR_LITERAL", "STRING_LITERAL", "ID", "OPERADOR_BIN", "ARITH_OP", "REL_OP", 
		"EQ_OP", "COND_OP", "ATRIBUICAO_OP", "PONTOEVIRGULA", "SOMA", "SUBTRACAO", 
		"MULTIPLICACAO", "DIVISAO", "PORCENTAGEM", "IGUAL", "MAIORIGUAL", "MENORIGUAL", 
		"EXCLAMACAO", "COMPARADORES", "IGUALDADE", "DIFERENCA", "ECONDICIONAL", 
		"OUCONDICIONAL", "PONTOS", "VIRGULA", "ABRE_CHAVE", "FECHA_CHAVE", "ABRE_PARENTESE", 
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
			setState(36);
			match(CLASS);
			setState(37);
			match(PROGRAM);
			setState(38);
			match(ABRE_CHAVE);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					campo();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==TIPO) {
				{
				{
				setState(45);
				metodo();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(FECHA_CHAVE);
			setState(52);
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
			setState(54);
			elemento_campo();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(55);
				match(VIRGULA);
				setState(56);
				elemento_campo();
				}
				}
				setState(61);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(TIPO);
				setState(63);
				match(ID);
				setState(64);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(TIPO);
				setState(66);
				match(ID);
				setState(67);
				match(ABRE_COLCHETE);
				setState(68);
				match(INT);
				setState(69);
				match(FECHA_COLCHETE);
				setState(70);
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
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==TIPO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(74);
			match(ID);
			setState(75);
			match(ABRE_PARENTESE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(76);
				parametro();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(FECHA_PARENTESE);
			setState(83);
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
			setState(85);
			elemento_parametro();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(86);
				match(VIRGULA);
				setState(87);
				elemento_parametro();
				}
				}
				setState(92);
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
			setState(93);
			match(TIPO);
			setState(94);
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
			setState(96);
			match(ABRE_CHAVE);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(97);
				var_decl();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << INT) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID) | (1L << ABRE_CHAVE))) != 0)) {
				{
				{
				setState(103);
				estrutura();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		public List<Elemento_var_declContext> elemento_var_decl() {
			return getRuleContexts(Elemento_var_declContext.class);
		}
		public Elemento_var_declContext elemento_var_decl(int i) {
			return getRuleContext(Elemento_var_declContext.class,i);
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
			setState(111);
			elemento_var_decl();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(112);
				match(VIRGULA);
				setState(113);
				elemento_var_decl();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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

	public static class Elemento_var_declContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(DecafParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public Elemento_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterElemento_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitElemento_var_decl(this);
		}
	}

	public final Elemento_var_declContext elemento_var_decl() throws RecognitionException {
		Elemento_var_declContext _localctx = new Elemento_var_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elemento_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(TIPO);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(ID);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public TerminalNode ATRIBUICAO_OP() { return getToken(DecafParser.ATRIBUICAO_OP, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(DecafParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(DecafParser.PONTOEVIRGULA, i);
		}
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
		public TerminalNode IGUAL() { return getToken(DecafParser.IGUAL, 0); }
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
		enterRule(_localctx, 18, RULE_estrutura);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				localizacao();
				setState(128);
				match(ATRIBUICAO_OP);
				setState(129);
				expressao(0);
				setState(130);
				match(PONTOEVIRGULA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				chamada_metodo();
				setState(133);
				match(PONTOEVIRGULA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(IF);
				setState(136);
				match(ABRE_PARENTESE);
				setState(137);
				expressao(0);
				setState(138);
				match(FECHA_PARENTESE);
				setState(139);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(IF);
				setState(142);
				match(ABRE_PARENTESE);
				setState(143);
				expressao(0);
				setState(144);
				match(FECHA_PARENTESE);
				setState(145);
				bloco();
				setState(146);
				match(ELSE);
				setState(147);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(FOR);
				setState(150);
				match(ABRE_PARENTESE);
				setState(151);
				match(ID);
				setState(152);
				match(IGUAL);
				setState(153);
				expressao(0);
				setState(154);
				match(PONTOEVIRGULA);
				setState(155);
				expressao(0);
				setState(156);
				match(PONTOEVIRGULA);
				setState(157);
				bloco();
				setState(158);
				match(FECHA_PARENTESE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(RETURN);
				setState(161);
				expressao(0);
				setState(162);
				match(PONTOEVIRGULA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				match(BREAK);
				setState(165);
				match(PONTOEVIRGULA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(CONTINUE);
				setState(167);
				match(PONTOEVIRGULA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
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
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(172);
				localizacao();
				}
				break;
			case 2:
				{
				setState(173);
				chamada_metodo();
				}
				break;
			case 3:
				{
				setState(174);
				literal();
				}
				break;
			case 4:
				{
				setState(175);
				match(SUBTRACAO);
				setState(176);
				expressao(4);
				}
				break;
			case 5:
				{
				setState(177);
				match(EXCLAMACAO);
				setState(178);
				expressao(3);
				}
				break;
			case 6:
				{
				setState(179);
				match(ABRE_PARENTESE);
				setState(180);
				expressao(0);
				setState(181);
				match(FECHA_PARENTESE);
				}
				break;
			case 7:
				{
				setState(183);
				var_decl();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
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
					setState(186);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(187);
					match(OPERADOR_BIN);
					setState(188);
					expressao(6);
					}
					} 
				}
				setState(193);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_localizacao);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(ID);
				setState(196);
				match(ABRE_COLCHETE);
				setState(197);
				expressao(0);
				setState(198);
				match(FECHA_COLCHETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				literal();
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
		public Nome_metodoContext nome_metodo() {
			return getRuleContext(Nome_metodoContext.class,0);
		}
		public TerminalNode ABRE_PARENTESE() { return getToken(DecafParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(DecafParser.FECHA_PARENTESE, 0); }
		public List<Elemento_chamada_metodoContext> elemento_chamada_metodo() {
			return getRuleContexts(Elemento_chamada_metodoContext.class);
		}
		public Elemento_chamada_metodoContext elemento_chamada_metodo(int i) {
			return getRuleContext(Elemento_chamada_metodoContext.class,i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
		public Elemento_argumento_chamadaContext elemento_argumento_chamada() {
			return getRuleContext(Elemento_argumento_chamadaContext.class,0);
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
		enterRule(_localctx, 24, RULE_chamada_metodo);
		int _la;
		try {
			setState(219);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				nome_metodo();
				setState(204);
				match(ABRE_PARENTESE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALLOUT) | (1L << TIPO) | (1L << INT) | (1L << BOOLEAN_LITERAL) | (1L << CHAR_LITERAL) | (1L << ID) | (1L << SUBTRACAO) | (1L << EXCLAMACAO) | (1L << ABRE_PARENTESE))) != 0)) {
					{
					{
					setState(205);
					elemento_chamada_metodo();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(FECHA_PARENTESE);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(CALLOUT);
				setState(214);
				match(ABRE_PARENTESE);
				setState(215);
				match(STRING_LITERAL);
				setState(216);
				elemento_argumento_chamada();
				setState(217);
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
		enterRule(_localctx, 26, RULE_elemento_argumento_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			argumento_chamada();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(222);
				match(VIRGULA);
				setState(223);
				argumento_chamada();
				}
				}
				setState(228);
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
		public TerminalNode STRING_LITERAL() { return getToken(DecafParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 28, RULE_argumento_chamada);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case CALLOUT:
			case TIPO:
			case INT:
			case BOOLEAN_LITERAL:
			case CHAR_LITERAL:
			case ID:
			case SUBTRACAO:
			case EXCLAMACAO:
			case ABRE_PARENTESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				expressao(0);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(STRING_LITERAL);
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
			setState(233);
			expressao(0);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(234);
				match(VIRGULA);
				setState(235);
				expressao(0);
				}
				}
				setState(240);
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

	public static class Nome_metodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Nome_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterNome_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitNome_metodo(this);
		}
	}

	public final Nome_metodoContext nome_metodo() throws RecognitionException {
		Nome_metodoContext _localctx = new Nome_metodoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nome_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		case 10:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u00f8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16"+
		"\5S\13\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7\3"+
		"\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\3\t\3\n\3\n\6\n~\n\n\r\n\16\n\177"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00bb\n\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00cc\n\r\3\16\3\16\3\16\7\16\u00d1\n\16\f\16\16"+
		"\16\u00d4\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00de\n\16"+
		"\3\17\3\17\3\17\7\17\u00e3\n\17\f\17\16\17\u00e6\13\17\3\20\3\20\5\20"+
		"\u00ea\n\20\3\21\3\21\3\21\7\21\u00ef\n\21\f\21\16\21\u00f2\13\21\3\22"+
		"\3\22\3\23\3\23\3\23\2\3\26\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\4\4\2\16\16\20\20\3\2\21\23\u0105\2&\3\2\2\2\48\3\2\2\2\6I\3\2"+
		"\2\2\bK\3\2\2\2\nW\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20q\3\2\2\2\22{\3\2"+
		"\2\2\24\u00ab\3\2\2\2\26\u00ba\3\2\2\2\30\u00cb\3\2\2\2\32\u00dd\3\2\2"+
		"\2\34\u00df\3\2\2\2\36\u00e9\3\2\2\2 \u00eb\3\2\2\2\"\u00f3\3\2\2\2$\u00f5"+
		"\3\2\2\2&\'\7\4\2\2\'(\7\5\2\2(,\7-\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\5\b\5\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\7.\2\2\66\67\7\2\2\3\67\3\3\2\2\28=\5\6\4\29:\7,\2\2:<\5\6\4\2;9\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\7\20\2\2A"+
		"B\7\25\2\2BJ\7\34\2\2CD\7\20\2\2DE\7\25\2\2EF\7\61\2\2FG\7\21\2\2GH\7"+
		"\62\2\2HJ\7\34\2\2I@\3\2\2\2IC\3\2\2\2J\7\3\2\2\2KL\t\2\2\2LM\7\25\2\2"+
		"MQ\7/\2\2NP\5\n\6\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2"+
		"SQ\3\2\2\2TU\7\60\2\2UV\5\16\b\2V\t\3\2\2\2W\\\5\f\7\2XY\7,\2\2Y[\5\f"+
		"\7\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2"+
		"_`\7\20\2\2`a\7\25\2\2a\r\3\2\2\2bf\7-\2\2ce\5\20\t\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3\2\2\2ik\5\24\13\2ji\3\2\2\2kn\3"+
		"\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7.\2\2p\17\3\2\2\2qv"+
		"\5\22\n\2rs\7,\2\2su\5\22\n\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wy\3\2\2\2xv\3\2\2\2yz\7\34\2\2z\21\3\2\2\2{}\7\20\2\2|~\7\25\2\2}|\3"+
		"\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\23\3\2\2\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0083\7\33\2\2\u0083\u0084\5\26\f\2\u0084\u0085"+
		"\7\34\2\2\u0085\u00ac\3\2\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7\34\2"+
		"\2\u0088\u00ac\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\5\26\f\2\u008c\u008d\7\60\2\2\u008d\u008e\5\16\b\2\u008e\u00ac\3\2\2"+
		"\2\u008f\u0090\7\f\2\2\u0090\u0091\7/\2\2\u0091\u0092\5\26\f\2\u0092\u0093"+
		"\7\60\2\2\u0093\u0094\5\16\b\2\u0094\u0095\7\n\2\2\u0095\u0096\5\16\b"+
		"\2\u0096\u00ac\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7/\2\2\u0099\u009a"+
		"\7\25\2\2\u009a\u009b\7\"\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\34\2"+
		"\2\u009d\u009e\5\26\f\2\u009e\u009f\7\34\2\2\u009f\u00a0\5\16\b\2\u00a0"+
		"\u00a1\7\60\2\2\u00a1\u00ac\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5"+
		"\26\f\2\u00a4\u00a5\7\34\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00ac\7\34\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00ac\7\34\2\2\u00aa\u00ac\5"+
		"\16\b\2\u00ab\u0081\3\2\2\2\u00ab\u0086\3\2\2\2\u00ab\u0089\3\2\2\2\u00ab"+
		"\u008f\3\2\2\2\u00ab\u0097\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae"+
		"\b\f\1\2\u00ae\u00bb\5\30\r\2\u00af\u00bb\5\32\16\2\u00b0\u00bb\5$\23"+
		"\2\u00b1\u00b2\7\36\2\2\u00b2\u00bb\5\26\f\6\u00b3\u00b4\7%\2\2\u00b4"+
		"\u00bb\5\26\f\5\u00b5\u00b6\7/\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7"+
		"\60\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5\20\t\2\u00ba\u00ad\3\2\2\2\u00ba"+
		"\u00af\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b3\3\2"+
		"\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc"+
		"\u00bd\f\7\2\2\u00bd\u00be\7\26\2\2\u00be\u00c0\5\26\f\b\u00bf\u00bc\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\27\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cc\7\25\2\2\u00c5\u00c6\7\25"+
		"\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7\62\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00cc\5$\23\2\u00cb\u00c4\3\2\2\2\u00cb\u00c5\3\2"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00d2"+
		"\7/\2\2\u00cf\u00d1\5 \21\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00de\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8"+
		"\u00d9\7/\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\5\34\17\2\u00db\u00dc\7"+
		"\60\2\2\u00dc\u00de\3\2\2\2\u00dd\u00cd\3\2\2\2\u00dd\u00d7\3\2\2\2\u00de"+
		"\33\3\2\2\2\u00df\u00e4\5\36\20\2\u00e0\u00e1\7,\2\2\u00e1\u00e3\5\36"+
		"\20\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\35\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\5\26\f"+
		"\2\u00e8\u00ea\7\24\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\37\3\2\2\2\u00eb\u00f0\5\26\f\2\u00ec\u00ed\7,\2\2\u00ed\u00ef\5\26\f"+
		"\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1!\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\25\2\2\u00f4"+
		"#\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6%\3\2\2\2\25,\62=IQ\\flv\177\u00ab"+
		"\u00ba\u00c1\u00cb\u00d2\u00dd\u00e4\u00e9\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}