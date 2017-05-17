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

programa: class program abre_chave campo* metodo* fecha_chave*;

//campo: id | id abre_parentese fecha_parentese;

metodo: (tipo | void) id abre_parentese parametro* fecha_parentese bloco;

parametro: elemento_parametro (virgula elemento_parametro)*;

elemento_parametro: tipo id;


//estrutra -> expressao -> localizacao, chamada_metodo, literal, operador_bin
bloco: abre_chave var_decl* estrutura* fecha_chave;

var_decl: elemento_var_decl (virgula elemento_var_decl)*;

elemento_var_decl: tipo id+;

estrutura: 	break 
		| continue 
		| if abre_parentese expressao fecha_parentese bloco
		| if abre_parentese expressao fecha_parentese bloco else bloco
		| 

expressao: 	localizacao
		| chamada_metodo
		| literal
		| expressao operador_bin expressao
		| subtracao expressao
		| exclamacao expressao

		

