lexer grammar DecafLexer;

@header {
  package decaf;
}

options {
  language=Java;
}

tokens {
  TK_class
}


//PROGRAMA: 'class' 'Program' ABRE_CHAVE CAMPO* METODO* FECHA_CHAVE;
//CAMPO: ;

//PROGRAMA: 'class' 'Program' ABRE_CHAVE METODO* FECHA_CHAVE;

//METODO: (TIPO | 'void') ID '(' PARAMETRO ')' ABRE_CHAVE ESTRUTURA FECHA_CHAVE;

//PARAMETRO: ( (TIPO ID) | ( (TIPO ID) ',' PARAMETRO )*;

//TIPO: 'int' | 'String' | 'char';

//ESTRUTURA: 

ABRE_CHAVE : '{';
FECHA_CHAVE : '}';

ID: ID_LETRA (ID_LETRA | DIGITO)*;

ID_LETRA : 'a'..'z' | 'A'..'Z' | '_';

DIGITO: '0'..'9';

INT: DIGITO+;

FLOAT: DIGITO+ '.' DIGITO* | '.' DIGITO+;

HEXA: '0x' [0-9a-fA-F]+;

WS_ : (' ' | '\n' | '\t' | '\r')+ -> skip;

COMENTARIO : '//' (~'\n')* '\n' -> skip;

CHAR_LITERAL: '\'' (ESC|~'\'') '\'';
//STRING_LITERAL: CHAR;

//CHAR : '\'' (ESC|~'\'') '\'';
STRING : '"' (ESC|~'"')* '"';



fragment
ESC :  '\\' ('n'|'"');
