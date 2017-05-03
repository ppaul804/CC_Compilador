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

//PALAVRAS RESERVADAS
CLASS: 'class';
BREAK: 'break';
CALLOUT: 'callout';
CONTINUE: 'continue';
DO: 'do';
ELSE: 'else';
FOR: 'for';
IF: 'if';
RETURN: 'return';
VOID: 'void';
WHILE: 'while';
TIPO: 'int' | 'boolean';

INT: DIGITO+ | HEXA;

BOOLEAN_LITERAL: 'true' | 'false';

fragment
HEXA: '0x'[0-9a-fA-F]+;

CHAR_LITERAL:  '\'' CHAR '\'' | '\'' ESC+ '\'';

STRING_LITERAL: '\"' STRING_CARS? '\"';

ID: ID_LETRA (ID_LETRA | DIGITO)*;

fragment
ID_LETRA : 'a'..'z' | 'A'..'Z' | '_';

fragment
DIGITO: '0'..'9';

fragment
STRING_CARS: STRING_CAR+;

fragment
STRING_CAR: CHAR | ESC;

fragment
CHAR: ~['"\\];

OPERADORES: '+' | '-' | '*' | '/' | '%' | '=';

COMPARADORES: '<' | '>' | '<=' | '>=' | '==' | '!=';

CONDICIONADORES: '&&' | '||';

PONTOS: ',' | '.' | ';' | ':';

ABRE_CHAVE : '{';
FECHA_CHAVE : '}';

ABRE_PARENTESE : '(';
FECHA_PARENTESE : ')';

ABRE_COLCHETE : '[';
FECHA_COLCHETE : ']';

WS_ : [ \n\t\r]+ -> skip;

COMENTARIO : '//' (~'\n')* '\n' -> skip;


fragment
ESC :  '\\' [btnrf"'\\];
