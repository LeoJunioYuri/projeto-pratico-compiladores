// Generated from MinhaGramatica.g4 by ANTLR 4.9
 package antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ATR=2, TIPO=3, SOMA=4, SUBTRACAO=5, MULTI=6, DIVISAO=7, RESTO=8, 
		NUMERO=9, AP=10, FP=11, NEGATIVO=12, DELINI=13, DELFIM=14, PV=15, CONDICIONAL=16, 
		CLASSE=17, METODO=18, ID=19, OP=20, BOOLOP=21, REP=22, LER=23, ESCREVER=24, 
		RETORNO=25, WS=26, ErrorChar=27;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_declr = 2, RULE_comandos = 3, 
		RULE_comando = 4, RULE_valor = 5, RULE_valorneg = 6, RULE_comparacao = 7, 
		RULE_op_for = 8, RULE_instrucao = 9, RULE_soma = 10, RULE_subtracao = 11, 
		RULE_multiplicacao = 12, RULE_divisao = 13, RULE_resto = 14, RULE_condicional = 15, 
		RULE_classe = 16, RULE_metodo = 17, RULE_repeticao = 18, RULE_ler = 19, 
		RULE_escrever = 20, RULE_retorno = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "declr", "comandos", "comando", "valor", "valorneg", 
			"comparacao", "op_for", "instrucao", "soma", "subtracao", "multiplicacao", 
			"divisao", "resto", "condicional", "classe", "metodo", "repeticao", "ler", 
			"escrever", "retorno"
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
			"WS", "ErrorChar"
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

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinhaGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			declaracao();
			setState(45);
			comandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public List<DeclrContext> declr() {
			return getRuleContexts(DeclrContext.class);
		}
		public DeclrContext declr(int i) {
			return getRuleContext(DeclrContext.class,i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(47);
				declr();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclrContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MinhaGramaticaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(MinhaGramaticaParser.NUMERO, 0); }
		public DeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDeclr(this);
		}
	}

	public final DeclrContext declr() throws RecognitionException {
		DeclrContext _localctx = new DeclrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(TIPO);
			setState(54);
			match(ID);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(55);
				match(T__0);
				setState(56);
				match(NUMERO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandos);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDICIONAL:
			case CLASSE:
			case METODO:
			case ID:
			case REP:
			case LER:
			case ESCREVER:
			case RETORNO:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				comando();
				setState(60);
				comandos();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public SubtracaoContext subtracao() {
			return getRuleContext(SubtracaoContext.class,0);
		}
		public MultiplicacaoContext multiplicacao() {
			return getRuleContext(MultiplicacaoContext.class,0);
		}
		public DivisaoContext divisao() {
			return getRuleContext(DivisaoContext.class,0);
		}
		public RestoContext resto() {
			return getRuleContext(RestoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				soma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				subtracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				multiplicacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				divisao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				resto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				condicional();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				classe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				metodo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				repeticao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				ler();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(75);
				escrever();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(76);
				retorno();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(MinhaGramaticaParser.NUMERO, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==NUMERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValornegContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode NEGATIVO() { return getToken(MinhaGramaticaParser.NEGATIVO, 0); }
		public ValornegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterValorneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitValorneg(this);
		}
	}

	public final ValornegContext valorneg() throws RecognitionException {
		ValornegContext _localctx = new ValornegContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valorneg);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				valor();
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(NEGATIVO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacaoContext extends ParserRuleContext {
		public List<ValornegContext> valorneg() {
			return getRuleContexts(ValornegContext.class);
		}
		public ValornegContext valorneg(int i) {
			return getRuleContext(ValornegContext.class,i);
		}
		public TerminalNode OP() { return getToken(MinhaGramaticaParser.OP, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitComparacao(this);
		}
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			valorneg();
			setState(86);
			match(OP);
			setState(87);
			valorneg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_forContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public List<TerminalNode> SOMA() { return getTokens(MinhaGramaticaParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(MinhaGramaticaParser.SOMA, i);
		}
		public List<TerminalNode> SUBTRACAO() { return getTokens(MinhaGramaticaParser.SUBTRACAO); }
		public TerminalNode SUBTRACAO(int i) {
			return getToken(MinhaGramaticaParser.SUBTRACAO, i);
		}
		public Op_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterOp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitOp_for(this);
		}
	}

	public final Op_forContext op_for() throws RecognitionException {
		Op_forContext _localctx = new Op_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_for);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				setState(90);
				match(SOMA);
				setState(91);
				match(SOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				match(SUBTRACAO);
				setState(94);
				match(SUBTRACAO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public List<TerminalNode> PV() { return getTokens(MinhaGramaticaParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(MinhaGramaticaParser.PV, i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public Op_forContext op_for() {
			return getRuleContext(Op_forContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucao);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				setState(98);
				match(ATR);
				setState(99);
				valorneg();
				setState(100);
				match(PV);
				setState(101);
				comparacao();
				setState(102);
				match(PV);
				setState(103);
				op_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				comparacao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode SOMA() { return getToken(MinhaGramaticaParser.SOMA, 0); }
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitSoma(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(ATR);
			setState(110);
			valor();
			setState(111);
			match(SOMA);
			setState(112);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public TerminalNode SUBTRACAO() { return getToken(MinhaGramaticaParser.SUBTRACAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public SubtracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitSubtracao(this);
		}
	}

	public final SubtracaoContext subtracao() throws RecognitionException {
		SubtracaoContext _localctx = new SubtracaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subtracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(ATR);
			setState(116);
			valorneg();
			setState(117);
			match(SUBTRACAO);
			setState(118);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(MinhaGramaticaParser.MULTI, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitMultiplicacao(this);
		}
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ATR);
			setState(122);
			valorneg();
			setState(123);
			match(MULTI);
			setState(124);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public TerminalNode DIVISAO() { return getToken(MinhaGramaticaParser.DIVISAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public DivisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDivisao(this);
		}
	}

	public final DivisaoContext divisao() throws RecognitionException {
		DivisaoContext _localctx = new DivisaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_divisao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(ATR);
			setState(128);
			valorneg();
			setState(129);
			match(DIVISAO);
			setState(130);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public TerminalNode RESTO() { return getToken(MinhaGramaticaParser.RESTO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public RestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitResto(this);
		}
	}

	public final RestoContext resto() throws RecognitionException {
		RestoContext _localctx = new RestoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_resto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(ATR);
			setState(134);
			valorneg();
			setState(135);
			match(RESTO);
			setState(136);
			valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public List<TerminalNode> CONDICIONAL() { return getTokens(MinhaGramaticaParser.CONDICIONAL); }
		public TerminalNode CONDICIONAL(int i) {
			return getToken(MinhaGramaticaParser.CONDICIONAL, i);
		}
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public List<TerminalNode> DELINI() { return getTokens(MinhaGramaticaParser.DELINI); }
		public TerminalNode DELINI(int i) {
			return getToken(MinhaGramaticaParser.DELINI, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> DELFIM() { return getTokens(MinhaGramaticaParser.DELFIM); }
		public TerminalNode DELFIM(int i) {
			return getToken(MinhaGramaticaParser.DELFIM, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicional);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(CONDICIONAL);
				setState(139);
				match(AP);
				setState(140);
				comparacao();
				setState(141);
				match(FP);
				setState(142);
				match(DELINI);
				setState(143);
				comando();
				setState(144);
				match(DELFIM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(CONDICIONAL);
				setState(147);
				match(AP);
				setState(148);
				comparacao();
				setState(149);
				match(FP);
				setState(150);
				match(DELINI);
				setState(151);
				comando();
				setState(152);
				match(DELFIM);
				setState(153);
				match(CONDICIONAL);
				setState(154);
				match(DELINI);
				setState(155);
				comando();
				setState(156);
				match(DELFIM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasseContext extends ParserRuleContext {
		public TerminalNode CLASSE() { return getToken(MinhaGramaticaParser.CLASSE, 0); }
		public TerminalNode DELINI() { return getToken(MinhaGramaticaParser.DELINI, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode DELFIM() { return getToken(MinhaGramaticaParser.DELFIM, 0); }
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitClasse(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(CLASSE);
			setState(161);
			match(DELINI);
			setState(162);
			comando();
			setState(163);
			match(DELFIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode METODO() { return getToken(MinhaGramaticaParser.METODO, 0); }
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public TerminalNode ID() { return getToken(MinhaGramaticaParser.ID, 0); }
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public TerminalNode DELINI() { return getToken(MinhaGramaticaParser.DELINI, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode DELFIM() { return getToken(MinhaGramaticaParser.DELFIM, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(METODO);
			setState(166);
			match(AP);
			setState(167);
			match(ID);
			setState(168);
			match(FP);
			setState(169);
			match(DELINI);
			setState(170);
			comando();
			setState(171);
			match(DELFIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(MinhaGramaticaParser.REP, 0); }
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public TerminalNode DELINI() { return getToken(MinhaGramaticaParser.DELINI, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode DELFIM() { return getToken(MinhaGramaticaParser.DELFIM, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(REP);
			setState(174);
			match(AP);
			setState(175);
			instrucao();
			setState(176);
			match(FP);
			setState(177);
			match(DELINI);
			setState(178);
			comando();
			setState(179);
			match(DELFIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(MinhaGramaticaParser.LER, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LER);
			setState(182);
			valorneg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscreverContext extends ParserRuleContext {
		public TerminalNode ESCREVER() { return getToken(MinhaGramaticaParser.ESCREVER, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ESCREVER);
			setState(185);
			valorneg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(MinhaGramaticaParser.RETORNO, 0); }
		public ValornegContext valorneg() {
			return getRuleContext(ValornegContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retorno);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(RETORNO);
				setState(188);
				valorneg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(RETORNO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\5\5"+
		"B\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7"+
		"\3\b\3\b\5\bV\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00c1\n\27\3\27\2\2\30\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\4\2\13\13\25\25\2\u00bf"+
		"\2.\3\2\2\2\4\64\3\2\2\2\6\67\3\2\2\2\bA\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2"+
		"\16U\3\2\2\2\20W\3\2\2\2\22a\3\2\2\2\24l\3\2\2\2\26n\3\2\2\2\30t\3\2\2"+
		"\2\32z\3\2\2\2\34\u0080\3\2\2\2\36\u0086\3\2\2\2 \u00a0\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00a7\3\2\2\2&\u00af\3\2\2\2(\u00b7\3\2\2\2*\u00ba\3\2\2\2,"+
		"\u00c0\3\2\2\2./\5\4\3\2/\60\5\b\5\2\60\3\3\2\2\2\61\63\5\6\4\2\62\61"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64"+
		"\3\2\2\2\678\7\5\2\28;\7\25\2\29:\7\3\2\2:<\7\13\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<\7\3\2\2\2=>\5\n\6\2>?\5\b\5\2?B\3\2\2\2@B\3\2\2\2A=\3\2\2\2A@\3\2"+
		"\2\2B\t\3\2\2\2CP\5\26\f\2DP\5\30\r\2EP\5\32\16\2FP\5\34\17\2GP\5\36\20"+
		"\2HP\5 \21\2IP\5\"\22\2JP\5$\23\2KP\5&\24\2LP\5(\25\2MP\5*\26\2NP\5,\27"+
		"\2OC\3\2\2\2OD\3\2\2\2OE\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2\2"+
		"\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\13\3\2\2\2QR\t\2"+
		"\2\2R\r\3\2\2\2SV\5\f\7\2TV\7\16\2\2US\3\2\2\2UT\3\2\2\2V\17\3\2\2\2W"+
		"X\5\16\b\2XY\7\26\2\2YZ\5\16\b\2Z\21\3\2\2\2[\\\7\25\2\2\\]\7\6\2\2]b"+
		"\7\6\2\2^_\7\25\2\2_`\7\7\2\2`b\7\7\2\2a[\3\2\2\2a^\3\2\2\2b\23\3\2\2"+
		"\2cd\7\25\2\2de\7\4\2\2ef\5\16\b\2fg\7\21\2\2gh\5\20\t\2hi\7\21\2\2ij"+
		"\5\22\n\2jm\3\2\2\2km\5\20\t\2lc\3\2\2\2lk\3\2\2\2m\25\3\2\2\2no\7\25"+
		"\2\2op\7\4\2\2pq\5\f\7\2qr\7\6\2\2rs\5\f\7\2s\27\3\2\2\2tu\7\25\2\2uv"+
		"\7\4\2\2vw\5\16\b\2wx\7\7\2\2xy\5\f\7\2y\31\3\2\2\2z{\7\25\2\2{|\7\4\2"+
		"\2|}\5\16\b\2}~\7\b\2\2~\177\5\f\7\2\177\33\3\2\2\2\u0080\u0081\7\25\2"+
		"\2\u0081\u0082\7\4\2\2\u0082\u0083\5\16\b\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\5\f\7\2\u0085\35\3\2\2\2\u0086\u0087\7\25\2\2\u0087\u0088\7\4\2"+
		"\2\u0088\u0089\5\16\b\2\u0089\u008a\7\n\2\2\u008a\u008b\5\f\7\2\u008b"+
		"\37\3\2\2\2\u008c\u008d\7\22\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\20"+
		"\t\2\u008f\u0090\7\r\2\2\u0090\u0091\7\17\2\2\u0091\u0092\5\n\6\2\u0092"+
		"\u0093\7\20\2\2\u0093\u00a1\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7"+
		"\f\2\2\u0096\u0097\5\20\t\2\u0097\u0098\7\r\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\5\n\6\2\u009a\u009b\7\20\2\2\u009b\u009c\7\22\2\2\u009c\u009d\7"+
		"\17\2\2\u009d\u009e\5\n\6\2\u009e\u009f\7\20\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u008c\3\2\2\2\u00a0\u0094\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\7\23\2\2"+
		"\u00a3\u00a4\7\17\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\7\20\2\2\u00a6#"+
		"\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00aa\7\25\2\2"+
		"\u00aa\u00ab\7\r\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae"+
		"\7\20\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\7\f\2\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5"+
		"\5\n\6\2\u00b5\u00b6\7\20\2\2\u00b6\'\3\2\2\2\u00b7\u00b8\7\31\2\2\u00b8"+
		"\u00b9\5\16\b\2\u00b9)\3\2\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\5\16\b"+
		"\2\u00bc+\3\2\2\2\u00bd\u00be\7\33\2\2\u00be\u00c1\5\16\b\2\u00bf\u00c1"+
		"\7\33\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1-\3\2\2\2\13\64"+
		";AOUal\u00a0\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}