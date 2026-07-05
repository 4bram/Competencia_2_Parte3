grammar Expr;

root : expr EOF;

expr : NMAP FLG IPADDRESS | SS FLG | SUDO TCPDUMP FLG IDT FLG NUM | CURL FLG DOM| DIG IDT DOM| JOURNAL FLG IDT|GREP STR RT|SUDO UFW DENY FROM IPADDRESS|EOF;

NMAP    : 'nmap' ;
TCPDUMP : 'tcpdump' ;
JOURNAL : 'journalctl' ;
DIG     : 'dig' ;
CURL    : 'curl' ;
GREP    : 'grep' ;
SUDO    : 'sudo' ;
SS      : 'ss' ;
UFW     : 'ufw' ;
DENY : 'deny' ;
FROM : 'from' ;

FLG: '--' [a-zA-Z]+ | '-' [a-zA-Z]+ ;
IPADDRESS: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ ('/' [0-9]+)? ;
DOM: [a-zA-Z0-9]+ '.' [a-zA-Z]+ ;
RT: '/' [a-zA-Z0-9_/.]+ ;
IDT: [a-zA-Z_][a-zA-Z0-9_]* ;
NUM: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;
STR: '"' .*? '"' ;