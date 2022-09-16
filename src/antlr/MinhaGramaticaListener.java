// Generated from MinhaGramatica.g4 by ANTLR 4.9
 package antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MinhaGramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MinhaGramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(MinhaGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#declr}.
	 * @param ctx the parse tree
	 */
	void enterDeclr(MinhaGramaticaParser.DeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#declr}.
	 * @param ctx the parse tree
	 */
	void exitDeclr(MinhaGramaticaParser.DeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(MinhaGramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(MinhaGramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MinhaGramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MinhaGramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(MinhaGramaticaParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(MinhaGramaticaParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#valorneg}.
	 * @param ctx the parse tree
	 */
	void enterValorneg(MinhaGramaticaParser.ValornegContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#valorneg}.
	 * @param ctx the parse tree
	 */
	void exitValorneg(MinhaGramaticaParser.ValornegContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(MinhaGramaticaParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(MinhaGramaticaParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#op_for}.
	 * @param ctx the parse tree
	 */
	void enterOp_for(MinhaGramaticaParser.Op_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#op_for}.
	 * @param ctx the parse tree
	 */
	void exitOp_for(MinhaGramaticaParser.Op_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(MinhaGramaticaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(MinhaGramaticaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(MinhaGramaticaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(MinhaGramaticaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#subtracao}.
	 * @param ctx the parse tree
	 */
	void enterSubtracao(MinhaGramaticaParser.SubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#subtracao}.
	 * @param ctx the parse tree
	 */
	void exitSubtracao(MinhaGramaticaParser.SubtracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(MinhaGramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(MinhaGramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#divisao}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(MinhaGramaticaParser.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#divisao}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(MinhaGramaticaParser.DivisaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#resto}.
	 * @param ctx the parse tree
	 */
	void enterResto(MinhaGramaticaParser.RestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#resto}.
	 * @param ctx the parse tree
	 */
	void exitResto(MinhaGramaticaParser.RestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MinhaGramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MinhaGramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(MinhaGramaticaParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(MinhaGramaticaParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(MinhaGramaticaParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(MinhaGramaticaParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(MinhaGramaticaParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(MinhaGramaticaParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(MinhaGramaticaParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(MinhaGramaticaParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#escrever}.
	 * @param ctx the parse tree
	 */
	void enterEscrever(MinhaGramaticaParser.EscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#escrever}.
	 * @param ctx the parse tree
	 */
	void exitEscrever(MinhaGramaticaParser.EscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(MinhaGramaticaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(MinhaGramaticaParser.RetornoContext ctx);
}