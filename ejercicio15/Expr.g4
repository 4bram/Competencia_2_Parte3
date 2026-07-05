grammar Expr;

root : expr EOF;

expr : UPDATE IDT SET IDT EQUAL strr COMMA IDT EQUAL strr WHERE IDT EQUAL NUM SEMI;
strr : STRW | STR;

UPDATE : 'update';
SET : 'set';
WHERE : 'where';
EQUAL : '=';
COMMA : ',';
SEMI : ';';
THING : '’';

STRW: '\'' [a-zA-Z_ ]* '’';
IDT: [a-zA-Z_][a-zA-Z0-9_]* ;
NUM: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;
STR: '\'' [a-zA-Z_ ]* '\'' ;