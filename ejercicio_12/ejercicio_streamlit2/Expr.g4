grammar Expr;

root: expr EOF ;    

expr: NUM | IDF | PUBLIC | CLASS | STATIC | VOID | MAIN | INT | STR | MAYOR | DOT | OUT | PRINTLN | CADENA | MAS | LA | LC | PA | PC | CA | CC | ASIG ;

PUBLIC: 'public' ;
CLASS: 'class' ;
STATIC: 'static' ;
VOID: 'void' ;
MAIN: 'main' ;
INT: 'int' ;
SYSTEM: 'System' ;
DOT: '.' ;
OUT: 'out' ;
PRINTLN: 'println' ;
CADENA: '"' (~["\\\r\n])* '"' ;
MAS: '+' ;
LA: '{' ;
LC: '}' ;
PA: '(' ;
PC: ')' ;
CA: '[' ;
CC: ']' ;
ASIG: '=' ;
STR: 'String' ;
MAYOR: '>' ;
NUM: [0-9]+ ;
IDF: [a-zA-Z0-9]+ ;
FIN: ';' ;
WS: [ \t\r\n]+ -> skip ;