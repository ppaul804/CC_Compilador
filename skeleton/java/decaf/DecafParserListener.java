// Generated from /home/uniceub/igortullio/CC_Compilador/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DecafParser.ProgramContext ctx);
}