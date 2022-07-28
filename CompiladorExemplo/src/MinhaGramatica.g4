grammar MinhaGramatica;

ART: '<-';
OA: '+' | '-' | '*' | '/' | '%';
NUMERO: [0-9];
AP: '(' ;
FP: ')';
NEGATIVO: '-'[0-9]*;
DELINI: '{';
DELFIM: '}';
CONDICIONAL: 'SENAO' | 'SE' | 'ENTAO';
CLASSE: [A-Z][A-Z]*;
METODO: [A-Z][a-z]*;
ID: [a-z][a-z0-9]*;
OP: '<=' | '>=' | '!=' | '=' | '<' | '>';
BOOLOP: '||' | '&&' | '$$' | '!!';
REP: 'FOR' | 'WHILE'; 
LER: 'LENDO<<';
ESCREVER: 'ESCREVENDO>>';
RETORNO: 'retorno' | 'n_retorno';
WS: [ \t\n\r]* ->skip;