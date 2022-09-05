// Generated from MinhaGramatica.g4 by ANTLR 4.9
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
		ATR=1, SOMA=2, SUBTRACAO=3, MULTI=4, DIVISAO=5, RESTO=6, NUMERO=7, AP=8, 
		FP=9, NEGATIVO=10, DELINI=11, DELFIM=12, PV=13, CONDICIONAL=14, CLASSE=15, 
		METODO=16, ID=17, OP=18, BOOLOP=19, REP=20, LER=21, ESCREVER=22, RETORNO=23, 
		WS=24;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comando = 2, RULE_valor = 3, 
		RULE_valorneg = 4, RULE_comparacao = 5, RULE_op_for = 6, RULE_instrucao = 7, 
		RULE_soma = 8, RULE_subtracao = 9, RULE_multiplicacao = 10, RULE_divisao = 11, 
		RULE_resto = 12, RULE_condicional = 13, RULE_classe = 14, RULE_metodo = 15, 
		RULE_repeticao = 16, RULE_ler = 17, RULE_escrever = 18, RULE_retorno = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comandos", "comando", "valor", "valorneg", "comparacao", 
			"op_for", "instrucao", "soma", "subtracao", "multiplicacao", "divisao", 
			"resto", "condicional", "classe", "metodo", "repeticao", "ler", "escrever", 
			"retorno"
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
			setState(40);
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
		enterRule(_localctx, 2, RULE_comandos);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDICIONAL:
			case CLASSE:
			case METODO:
			case ID:
			case REP:
			case LER:
			case ESCREVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				comando();
				setState(43);
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
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				soma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				subtracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				multiplicacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				divisao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				resto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				condicional();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				classe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				metodo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
				repeticao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(57);
				ler();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(58);
				escrever();
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
		enterRule(_localctx, 6, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 8, RULE_valorneg);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				valor();
				}
				break;
			case NEGATIVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		enterRule(_localctx, 10, RULE_comparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			valorneg();
			setState(68);
			match(OP);
			setState(69);
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
		enterRule(_localctx, 12, RULE_op_for);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ID);
				setState(72);
				match(SOMA);
				setState(73);
				match(SOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
				setState(75);
				match(SUBTRACAO);
				setState(76);
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
		enterRule(_localctx, 14, RULE_instrucao);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				setState(80);
				match(ATR);
				setState(81);
				valorneg();
				setState(82);
				match(PV);
				setState(83);
				comparacao();
				setState(84);
				match(PV);
				setState(85);
				op_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
		enterRule(_localctx, 16, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(ATR);
			setState(92);
			valor();
			setState(93);
			match(SOMA);
			setState(94);
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
		enterRule(_localctx, 18, RULE_subtracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			setState(97);
			match(ATR);
			setState(98);
			valorneg();
			setState(99);
			match(SUBTRACAO);
			setState(100);
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
		enterRule(_localctx, 20, RULE_multiplicacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(ATR);
			setState(104);
			valorneg();
			setState(105);
			match(MULTI);
			setState(106);
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
		enterRule(_localctx, 22, RULE_divisao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(ATR);
			setState(110);
			valorneg();
			setState(111);
			match(DIVISAO);
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
		enterRule(_localctx, 24, RULE_resto);
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
			match(RESTO);
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
		enterRule(_localctx, 26, RULE_condicional);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(CONDICIONAL);
				setState(121);
				match(AP);
				setState(122);
				comparacao();
				setState(123);
				match(FP);
				setState(124);
				match(DELINI);
				setState(125);
				comando();
				setState(126);
				match(DELFIM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(CONDICIONAL);
				setState(129);
				match(AP);
				setState(130);
				comparacao();
				setState(131);
				match(FP);
				setState(132);
				match(DELINI);
				setState(133);
				comando();
				setState(134);
				match(DELFIM);
				setState(135);
				match(CONDICIONAL);
				setState(136);
				match(DELINI);
				setState(137);
				comando();
				setState(138);
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
		enterRule(_localctx, 28, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CLASSE);
			setState(143);
			match(DELINI);
			setState(144);
			comando();
			setState(145);
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
		enterRule(_localctx, 30, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(METODO);
			setState(148);
			match(AP);
			setState(149);
			match(ID);
			setState(150);
			match(FP);
			setState(151);
			match(DELINI);
			setState(152);
			comando();
			setState(153);
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
		enterRule(_localctx, 32, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(REP);
			setState(156);
			match(AP);
			setState(157);
			instrucao();
			setState(158);
			match(FP);
			setState(159);
			match(DELINI);
			setState(160);
			comando();
			setState(161);
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
		enterRule(_localctx, 34, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LER);
			setState(164);
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
		enterRule(_localctx, 36, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ESCREVER);
			setState(167);
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
		enterRule(_localctx, 38, RULE_retorno);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(RETORNO);
				setState(170);
				valorneg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\6\3\6\5\6"+
		"D\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008f\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u00af\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\3\4\2\t\t\23\23\2\u00ac\2*\3\2\2\2\4\60\3\2\2\2\6=\3\2\2\2"+
		"\b?\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16O\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2\2"+
		"\24b\3\2\2\2\26h\3\2\2\2\30n\3\2\2\2\32t\3\2\2\2\34\u008e\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u0095\3\2\2\2\"\u009d\3\2\2\2$\u00a5\3\2\2\2&\u00a8\3\2\2\2"+
		"(\u00ae\3\2\2\2*+\5\4\3\2+\3\3\2\2\2,-\5\6\4\2-.\5\4\3\2.\61\3\2\2\2/"+
		"\61\3\2\2\2\60,\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62>\5\22\n\2\63>\5\24"+
		"\13\2\64>\5\26\f\2\65>\5\30\r\2\66>\5\32\16\2\67>\5\34\17\28>\5\36\20"+
		"\29>\5 \21\2:>\5\"\22\2;>\5$\23\2<>\5&\24\2=\62\3\2\2\2=\63\3\2\2\2=\64"+
		"\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2"+
		"\2\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?@\t\2\2\2@\t\3\2\2\2AD\5\b\5\2BD\7"+
		"\f\2\2CA\3\2\2\2CB\3\2\2\2D\13\3\2\2\2EF\5\n\6\2FG\7\24\2\2GH\5\n\6\2"+
		"H\r\3\2\2\2IJ\7\23\2\2JK\7\4\2\2KP\7\4\2\2LM\7\23\2\2MN\7\5\2\2NP\7\5"+
		"\2\2OI\3\2\2\2OL\3\2\2\2P\17\3\2\2\2QR\7\23\2\2RS\7\3\2\2ST\5\n\6\2TU"+
		"\7\17\2\2UV\5\f\7\2VW\7\17\2\2WX\5\16\b\2X[\3\2\2\2Y[\5\f\7\2ZQ\3\2\2"+
		"\2ZY\3\2\2\2[\21\3\2\2\2\\]\7\23\2\2]^\7\3\2\2^_\5\b\5\2_`\7\4\2\2`a\5"+
		"\b\5\2a\23\3\2\2\2bc\7\23\2\2cd\7\3\2\2de\5\n\6\2ef\7\5\2\2fg\5\b\5\2"+
		"g\25\3\2\2\2hi\7\23\2\2ij\7\3\2\2jk\5\n\6\2kl\7\6\2\2lm\5\b\5\2m\27\3"+
		"\2\2\2no\7\23\2\2op\7\3\2\2pq\5\n\6\2qr\7\7\2\2rs\5\b\5\2s\31\3\2\2\2"+
		"tu\7\23\2\2uv\7\3\2\2vw\5\n\6\2wx\7\b\2\2xy\5\b\5\2y\33\3\2\2\2z{\7\20"+
		"\2\2{|\7\n\2\2|}\5\f\7\2}~\7\13\2\2~\177\7\r\2\2\177\u0080\5\6\4\2\u0080"+
		"\u0081\7\16\2\2\u0081\u008f\3\2\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7"+
		"\n\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7\13\2\2\u0086\u0087\7\r\2\2\u0087"+
		"\u0088\5\6\4\2\u0088\u0089\7\16\2\2\u0089\u008a\7\20\2\2\u008a\u008b\7"+
		"\r\2\2\u008b\u008c\5\6\4\2\u008c\u008d\7\16\2\2\u008d\u008f\3\2\2\2\u008e"+
		"z\3\2\2\2\u008e\u0082\3\2\2\2\u008f\35\3\2\2\2\u0090\u0091\7\21\2\2\u0091"+
		"\u0092\7\r\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7\16\2\2\u0094\37\3\2\2"+
		"\2\u0095\u0096\7\22\2\2\u0096\u0097\7\n\2\2\u0097\u0098\7\23\2\2\u0098"+
		"\u0099\7\13\2\2\u0099\u009a\7\r\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7"+
		"\16\2\2\u009c!\3\2\2\2\u009d\u009e\7\26\2\2\u009e\u009f\7\n\2\2\u009f"+
		"\u00a0\5\20\t\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\5"+
		"\6\4\2\u00a3\u00a4\7\16\2\2\u00a4#\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6"+
		"\u00a7\5\n\6\2\u00a7%\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5\n\6\2"+
		"\u00aa\'\3\2\2\2\u00ab\u00ac\7\31\2\2\u00ac\u00af\5\n\6\2\u00ad\u00af"+
		"\7\31\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af)\3\2\2\2\t\60"+
		"=COZ\u008e\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}