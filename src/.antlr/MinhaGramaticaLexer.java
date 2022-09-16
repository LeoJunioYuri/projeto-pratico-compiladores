// Generated from c:\Users\Leo\Desktop\projeto-pratico-compiladores\src\MinhaGramatica.g4 by ANTLR 4.9.2
 package antlr; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ATR=2, TIPO=3, SOMA=4, SUBTRACAO=5, MULTI=6, DIVISAO=7, RESTO=8, 
		NUMERO=9, AP=10, FP=11, NEGATIVO=12, DELINI=13, DELFIM=14, PV=15, CONDICIONAL=16, 
		CLASSE=17, METODO=18, ID=19, OP=20, BOOLOP=21, REP=22, LER=23, ESCREVER=24, 
		RETORNO=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ATR", "TIPO", "SOMA", "SUBTRACAO", "MULTI", "DIVISAO", "RESTO", 
			"NUMERO", "AP", "FP", "NEGATIVO", "DELINI", "DELFIM", "PV", "CONDICIONAL", 
			"CLASSE", "METODO", "ID", "OP", "BOOLOP", "REP", "LER", "ESCREVER", "RETORNO", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'<-'", "'INT'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			"'('", "')'", null, "'{'", "'}'", "';'", null, null, null, null, null, 
			null, null, "'LENDO<<'", "'ESCREVENDO>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ATR", "TIPO", "SOMA", "SUBTRACAO", "MULTI", "DIVISAO", "RESTO", 
			"NUMERO", "AP", "FP", "NEGATIVO", "DELINI", "DELFIM", "PV", "CONDICIONAL", 
			"CLASSE", "METODO", "ID", "OP", "BOOLOP", "REP", "LER", "ESCREVER", "RETORNO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r"+
		"S\n\r\f\r\16\rV\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21e\n\21\3\22\3\22\3\23\3\23\7\23k\n\23\f\23\16\23n"+
		"\13\23\3\24\3\24\7\24r\n\24\f\24\16\24u\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25~\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0088"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0092\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00b9\n\32\3\33\3\33\3\33\3\33"+
		"\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\7"+
		"\3\2\62;\3\2C\\\3\2c|\5\2\"\"\62;c|\4\2\13\f\17\17\2\u00c9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7<\3\2\2\2\t@\3\2"+
		"\2\2\13B\3\2\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3"+
		"\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!d\3"+
		"\2\2\2#f\3\2\2\2%h\3\2\2\2\'o\3\2\2\2)}\3\2\2\2+\u0087\3\2\2\2-\u0091"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u009b\3\2\2\2\63\u00b8\3\2\2\2\65\u00ba\3\2"+
		"\2\2\678\7?\2\28\4\3\2\2\29:\7>\2\2:;\7/\2\2;\6\3\2\2\2<=\7K\2\2=>\7P"+
		"\2\2>?\7V\2\2?\b\3\2\2\2@A\7-\2\2A\n\3\2\2\2BC\7/\2\2C\f\3\2\2\2DE\7,"+
		"\2\2E\16\3\2\2\2FG\7\61\2\2G\20\3\2\2\2HI\7\'\2\2I\22\3\2\2\2JK\t\2\2"+
		"\2K\24\3\2\2\2LM\7*\2\2M\26\3\2\2\2NO\7+\2\2O\30\3\2\2\2PT\7/\2\2QS\t"+
		"\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VT\3\2\2\2W"+
		"X\7}\2\2X\34\3\2\2\2YZ\7\177\2\2Z\36\3\2\2\2[\\\7=\2\2\\ \3\2\2\2]^\7"+
		"U\2\2^_\7G\2\2_`\7P\2\2`a\7C\2\2ae\7Q\2\2bc\7U\2\2ce\7G\2\2d]\3\2\2\2"+
		"db\3\2\2\2e\"\3\2\2\2fg\t\3\2\2g$\3\2\2\2hl\t\3\2\2ik\t\4\2\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2\2nl\3\2\2\2os\t\4\2\2pr\t\5\2"+
		"\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t(\3\2\2\2us\3\2\2\2vw\7>\2"+
		"\2w~\7?\2\2xy\7@\2\2y~\7?\2\2z{\7#\2\2{~\7?\2\2|~\4>@\2}v\3\2\2\2}x\3"+
		"\2\2\2}z\3\2\2\2}|\3\2\2\2~*\3\2\2\2\177\u0080\7~\2\2\u0080\u0088\7~\2"+
		"\2\u0081\u0082\7(\2\2\u0082\u0088\7(\2\2\u0083\u0084\7&\2\2\u0084\u0088"+
		"\7&\2\2\u0085\u0086\7#\2\2\u0086\u0088\7#\2\2\u0087\177\3\2\2\2\u0087"+
		"\u0081\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088,\3\2\2\2"+
		"\u0089\u008a\7H\2\2\u008a\u008b\7Q\2\2\u008b\u0092\7T\2\2\u008c\u008d"+
		"\7Y\2\2\u008d\u008e\7J\2\2\u008e\u008f\7K\2\2\u008f\u0090\7N\2\2\u0090"+
		"\u0092\7G\2\2\u0091\u0089\3\2\2\2\u0091\u008c\3\2\2\2\u0092.\3\2\2\2\u0093"+
		"\u0094\7N\2\2\u0094\u0095\7G\2\2\u0095\u0096\7P\2\2\u0096\u0097\7F\2\2"+
		"\u0097\u0098\7Q\2\2\u0098\u0099\7>\2\2\u0099\u009a\7>\2\2\u009a\60\3\2"+
		"\2\2\u009b\u009c\7G\2\2\u009c\u009d\7U\2\2\u009d\u009e\7E\2\2\u009e\u009f"+
		"\7T\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7X\2\2\u00a1\u00a2\7G\2\2\u00a2"+
		"\u00a3\7P\2\2\u00a3\u00a4\7F\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7@\2\2"+
		"\u00a6\u00a7\7@\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7"+
		"g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\u00b9\7c\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7a\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b9\7c\2\2\u00b8\u00a8"+
		"\3\2\2\2\u00b8\u00af\3\2\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\t\6\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\33\2\2\u00bd\66\3\2\2\2\13\2Tdls}\u0087\u0091"+
		"\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}