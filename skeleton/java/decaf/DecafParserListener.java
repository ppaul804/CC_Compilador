// Generated from /home/uniceub/igortullio/CC_Compilador/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(DecafParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(DecafParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(DecafParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(DecafParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#elemento_campo}.
	 * @param ctx the parse tree
	 */
	void enterElemento_campo(DecafParser.Elemento_campoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#elemento_campo}.
	 * @param ctx the parse tree
	 */
	void exitElemento_campo(DecafParser.Elemento_campoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(DecafParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(DecafParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(DecafParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(DecafParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#elemento_parametro}.
	 * @param ctx the parse tree
	 */
	void enterElemento_parametro(DecafParser.Elemento_parametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#elemento_parametro}.
	 * @param ctx the parse tree
	 */
	void exitElemento_parametro(DecafParser.Elemento_parametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(DecafParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(DecafParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(DecafParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(DecafParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(DecafParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(DecafParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(DecafParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void enterLocalizacao(DecafParser.LocalizacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#localizacao}.
	 * @param ctx the parse tree
	 */
	void exitLocalizacao(DecafParser.LocalizacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void enterChamada_metodo(DecafParser.Chamada_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void exitChamada_metodo(DecafParser.Chamada_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#elemento_argumento_chamada}.
	 * @param ctx the parse tree
	 */
	void enterElemento_argumento_chamada(DecafParser.Elemento_argumento_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#elemento_argumento_chamada}.
	 * @param ctx the parse tree
	 */
	void exitElemento_argumento_chamada(DecafParser.Elemento_argumento_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#argumento_chamada}.
	 * @param ctx the parse tree
	 */
	void enterArgumento_chamada(DecafParser.Argumento_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#argumento_chamada}.
	 * @param ctx the parse tree
	 */
	void exitArgumento_chamada(DecafParser.Argumento_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#elemento_callout}.
	 * @param ctx the parse tree
	 */
	void enterElemento_callout(DecafParser.Elemento_calloutContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#elemento_callout}.
	 * @param ctx the parse tree
	 */
	void exitElemento_callout(DecafParser.Elemento_calloutContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#elemento_chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void enterElemento_chamada_metodo(DecafParser.Elemento_chamada_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#elemento_chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void exitElemento_chamada_metodo(DecafParser.Elemento_chamada_metodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DecafParser.LiteralContext ctx);
}