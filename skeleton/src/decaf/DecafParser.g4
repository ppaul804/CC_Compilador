parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

//program: TK_class ID LCURLY RCURLY EOF;

programa: CLASS PROGRAM ABRE_CHAVE campo* metodo* FECHA_CHAVE EOF;

campo: elemento_campo (VIRGULA elemento_campo)*;

elemento_campo: TIPO ID PONTOEVIRGULA | TIPO ID ABRE_COLCHETE INT FECHA_COLCHETE PONTOEVIRGULA;

metodo: (TIPO | VOID) ID ABRE_PARENTESE parametro? FECHA_PARENTESE bloco;

parametro: elemento_parametro (VIRGULA elemento_parametro)*;

elemento_parametro: TIPO ID;

bloco: ABRE_CHAVE var_decl* estrutura* FECHA_CHAVE;

var_decl: TIPO ID (VIRGULA ID)* PONTOEVIRGULA;

estrutura: 	localizacao (IGUAL | ATRIBUICAO_OP) expressao PONTOEVIRGULA
		| chamada_metodo PONTOEVIRGULA
		| IF ABRE_PARENTESE expressao FECHA_PARENTESE bloco 
		| IF ABRE_PARENTESE expressao FECHA_PARENTESE bloco ELSE bloco
		| FOR ID IGUAL expressao VIRGULA expressao bloco
		| RETURN expressao? PONTOEVIRGULA
		| BREAK PONTOEVIRGULA
		| CONTINUE PONTOEVIRGULA
		| bloco;

expressao: 	localizacao
		| chamada_metodo
		| literal
		| expressao (OPERADOR_BIN | SUBTRACAO) expressao
		| SUBTRACAO expressao
		| EXCLAMACAO expressao
		| ABRE_PARENTESE expressao FECHA_PARENTESE;

localizacao: ID | ID ABRE_COLCHETE expressao FECHA_COLCHETE;

chamada_metodo: ID ABRE_PARENTESE elemento_chamada_metodo? FECHA_PARENTESE
		| CALLOUT ABRE_PARENTESE STRING_LITERAL (VIRGULA elemento_callout)* FECHA_PARENTESE;

elemento_argumento_chamada: argumento_chamada (VIRGULA argumento_chamada)*;

argumento_chamada: expressao;

elemento_callout: STRING_LITERAL | expressao;

elemento_chamada_metodo: expressao (VIRGULA expressao)*;

literal: INT | CHAR_LITERAL | BOOLEAN_LITERAL;
