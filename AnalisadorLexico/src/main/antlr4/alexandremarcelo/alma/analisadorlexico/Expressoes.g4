lexer grammar Expressoes;

PALAVRA_RESERVADA 
	:	'Comeco' | 'Algoritmo' | 'Inteiro' | 'Real' | 'Atribuicao' | 'A' | 'Ler' | 'Print' | 'If' | 'Then' 
	| 'While' | 'Start' | 'End' | 'And' | 'Or' 
	; 
NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
VARIAVEL : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
	;
fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '//' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_RELACIONAL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARITMETICO	:	'+' | '-' | '*' | '/'
	;
DELIMITADOR	:	':'
	;
ABREPARENTESES :	'('
	;
FECHAPARENTESES:	')'
	;
