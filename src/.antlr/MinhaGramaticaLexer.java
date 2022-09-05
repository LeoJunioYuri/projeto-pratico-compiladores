// Generated from c:\Users\Leo\Desktop\ANTLR4\src\MinhaGramatica.g4 by ANTLR 4.9.2
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
		ATR=1, SOMA=2, SUBTRACAO=3, MULTI=4, DIVISAO=5, RESTO=6, NUMERO=7, AP=8, 
		FP=9, NEGATIVO=10, DELINI=11, DELFIM=12, PV=13, CONDICIONAL=14, CLASSE=15, 
		METODO=16, ID=17, OP=18, BOOLOP=19, REP=20, LER=21, ESCREVER=22, RETORNO=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATR", "SOMA", "SUBTRACAO", "MULTI", "DIVISAO", "RESTO", "NUMERO", "AP", 
			"FP", "NEGATIVO", "DELINI", "DELFIM", "PV", "CONDICIONAL", "CLASSE", 
			"METODO", "ID", "OP", "BOOLOP", "REP", "LER", "ESCREVER", "RETORNO", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<-'", "'+'", "'-'", "'*'", "'/'", "'%'", null, "'('", "')'", 
			null, "'{'", "'}'", "';'", null, null, null, null, null, null, null, 
			"'LENDO<<'", "'ESCREVENDO>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATR", "SOMA", "SUBTRACAO", "MULTI", "DIVISAO", "RESTO", "NUMERO", 
			"AP", "FP", "NEGATIVO", "DELINI", "DELFIM", "PV", "CONDICIONAL", "CLASSE", 
			"METODO", "ID", "OP", "BOOLOP", "REP", "LER", "ESCREVER", "RETORNO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\7\13I\n\13\f\13\16\13L\13\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17[\n\17\3\20\3\20\3\21"+
		"\3\21\7\21a\n\21\f\21\16\21d\13\21\3\22\3\22\7\22h\n\22\f\22\16\22k\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23t\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24~\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0088\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00af"+
		"\n\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\3\2\7\3\2\62;\3\2C\\\3\2c|\5\2\"\"\62;c|\4\2\13\f\17\17\2\u00bf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3"+
		"\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27M"+
		"\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#e"+
		"\3\2\2\2%s\3\2\2\2\'}\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u0091\3\2"+
		"\2\2/\u00ae\3\2\2\2\61\u00b0\3\2\2\2\63\64\7>\2\2\64\65\7/\2\2\65\4\3"+
		"\2\2\2\66\67\7-\2\2\67\6\3\2\2\289\7/\2\29\b\3\2\2\2:;\7,\2\2;\n\3\2\2"+
		"\2<=\7\61\2\2=\f\3\2\2\2>?\7\'\2\2?\16\3\2\2\2@A\t\2\2\2A\20\3\2\2\2B"+
		"C\7*\2\2C\22\3\2\2\2DE\7+\2\2E\24\3\2\2\2FJ\7/\2\2GI\t\2\2\2HG\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LJ\3\2\2\2MN\7}\2\2N\30\3\2"+
		"\2\2OP\7\177\2\2P\32\3\2\2\2QR\7=\2\2R\34\3\2\2\2ST\7U\2\2TU\7G\2\2UV"+
		"\7P\2\2VW\7C\2\2W[\7Q\2\2XY\7U\2\2Y[\7G\2\2ZS\3\2\2\2ZX\3\2\2\2[\36\3"+
		"\2\2\2\\]\t\3\2\2] \3\2\2\2^b\t\3\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2c\"\3\2\2\2db\3\2\2\2ei\t\4\2\2fh\t\5\2\2gf\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j$\3\2\2\2ki\3\2\2\2lm\7>\2\2mt\7?\2\2n"+
		"o\7@\2\2ot\7?\2\2pq\7#\2\2qt\7?\2\2rt\4>@\2sl\3\2\2\2sn\3\2\2\2sp\3\2"+
		"\2\2sr\3\2\2\2t&\3\2\2\2uv\7~\2\2v~\7~\2\2wx\7(\2\2x~\7(\2\2yz\7&\2\2"+
		"z~\7&\2\2{|\7#\2\2|~\7#\2\2}u\3\2\2\2}w\3\2\2\2}y\3\2\2\2}{\3\2\2\2~("+
		"\3\2\2\2\177\u0080\7H\2\2\u0080\u0081\7Q\2\2\u0081\u0088\7T\2\2\u0082"+
		"\u0083\7Y\2\2\u0083\u0084\7J\2\2\u0084\u0085\7K\2\2\u0085\u0086\7N\2\2"+
		"\u0086\u0088\7G\2\2\u0087\177\3\2\2\2\u0087\u0082\3\2\2\2\u0088*\3\2\2"+
		"\2\u0089\u008a\7N\2\2\u008a\u008b\7G\2\2\u008b\u008c\7P\2\2\u008c\u008d"+
		"\7F\2\2\u008d\u008e\7Q\2\2\u008e\u008f\7>\2\2\u008f\u0090\7>\2\2\u0090"+
		",\3\2\2\2\u0091\u0092\7G\2\2\u0092\u0093\7U\2\2\u0093\u0094\7E\2\2\u0094"+
		"\u0095\7T\2\2\u0095\u0096\7G\2\2\u0096\u0097\7X\2\2\u0097\u0098\7G\2\2"+
		"\u0098\u0099\7P\2\2\u0099\u009a\7F\2\2\u009a\u009b\7Q\2\2\u009b\u009c"+
		"\7@\2\2\u009c\u009d\7@\2\2\u009d.\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00af\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7a\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7p\2\2\u00ad\u00af\7c\2\2\u00ae"+
		"\u009e\3\2\2\2\u00ae\u00a5\3\2\2\2\u00af\60\3\2\2\2\u00b0\u00b1\t\6\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\31\2\2\u00b3\62\3\2\2\2\13\2JZbi"+
		"s}\u0087\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}