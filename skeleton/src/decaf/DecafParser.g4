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

metodo: (TIPO | VOID) ID ABRE_PARENTESE parametro* FECHA_PARENTESE bloco;

parametro: elemento_parametro (VIRGULA elemento_parametro)*;

elemento_parametro: TIPO ID;

bloco: ABRE_CHAVE var_decl* estrutura* FECHA_CHAVE;

var_decl: elemento_var_decl (VIRGULA elemento_var_decl)* PONTOEVIRGULA;

elemento_var_decl: TIPO ID+ ;

estrutura: 	localizacao ATRIBUICAO_OP expressao PONTOEVIRGULA
		| chamada_metodo PONTOEVIRGULA
		| IF ABRE_PARENTESE expressao FECHA_PARENTESE bloco 
		| IF ABRE_PARENTESE expressao FECHA_PARENTESE bloco ELSE bloco
		| FOR ABRE_PARENTESE ID IGUAL expressao PONTOEVIRGULA expressao PONTOEVIRGULA bloco FECHA_PARENTESE
		| RETURN expressao PONTOEVIRGULA
		| BREAK PONTOEVIRGULA
		| CONTINUE PONTOEVIRGULA
		| bloco;

expressao: 	localizacao
		| chamada_metodo
		| literal
		| expressao OPERADOR_BIN expressao
		| SUBTRACAO expressao
		| EXCLAMACAO expressao
		| ABRE_PARENTESE expressao FECHA_PARENTESE
		| var_decl;

localizacao: ID | ID ABRE_COLCHETE expressao FECHA_COLCHETE | literal;

chamada_metodo: nome_metodo ABRE_PARENTESE elemento_chamada_metodo* FECHA_PARENTESE
		| CALLOUT ABRE_PARENTESE STRING_LITERAL elemento_argumento_chamada FECHA_PARENTESE;

elemento_argumento_chamada: argumento_chamada (VIRGULA argumento_chamada)*;

argumento_chamada: expressao | STRING_LITERAL;

elemento_chamada_metodo: expressao (VIRGULA expressao)*;

nome_metodo: ID;

literal: INT | CHAR_LITERAL | BOOLEAN_LITERAL;
