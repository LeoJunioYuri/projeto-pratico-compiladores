grammar MinhaGramatica;

@header{ package antlr; }

programa: declaracao comandos;

declaracao: (declr)*;

declr: TIPO ID ('=' NUMERO)?;

comandos: comando comandos | ;

comando: soma | subtracao | multiplicacao | divisao | resto | condicional | classe | metodo | repeticao | ler | escrever;

valor: ID | NUMERO;

valorneg: valor | NEGATIVO;

comparacao: valorneg OP valorneg;

op_for: ID SOMA SOMA | ID SUBTRACAO SUBTRACAO;

instrucao: ID ATR valorneg PV comparacao PV op_for | comparacao;

soma: ID ATR valor SOMA valor;

subtracao: ID ATR valorneg SUBTRACAO valor;

multiplicacao: ID ATR valorneg MULTI valor;

divisao: ID ATR valorneg DIVISAO valor;

resto: ID ATR valorneg RESTO valor;

condicional: CONDICIONAL AP comparacao FP DELINI comando DELFIM |
            CONDICIONAL AP comparacao FP DELINI comando DELFIM CONDICIONAL DELINI comando DELFIM;

classe: CLASSE DELINI comando DELFIM;

metodo: METODO AP ID FP DELINI comando DELFIM;

repeticao: REP AP instrucao FP DELINI comando DELFIM;

ler: LER valorneg;

escrever: ESCREVER valorneg; 

retorno: RETORNO valorneg | RETORNO;

ATR: '<-';
TIPO: 'INT';
SOMA: '+';
SUBTRACAO: '-';
MULTI: '*';
DIVISAO: '/';
RESTO: '%';
NUMERO: [0-9];
AP: '(' ;
FP: ')';
NEGATIVO: '-'[0-9]*;
DELINI: '{';
DELFIM: '}';
PV: ';';
CONDICIONAL: 'SENAO' | 'SE';
CLASSE: [A-Z];
METODO: [A-Z] [a-z]*;
ID: [a-z] [a-z 0-9]*;
OP: '<=' | '>=' | '!=' | '=' | '<' | '>';
BOOLOP: '||' | '&&' | '$$' | '!!';
REP: 'FOR' | 'WHILE'; 
LER: 'LENDO<<';
ESCREVER: 'ESCREVENDO>>';
RETORNO: 'retorna' | 'n_retorna';
WS: [\t\n\r] ->skip;

