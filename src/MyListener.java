import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.MinhaGramaticaBaseListener;
import antlr.MinhaGramaticaParser;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends MinhaGramaticaBaseListener {

    private Map<String, String> tabelaSimbolos = new HashMap<String, String>();

    @Override
    public void enterDeclr(MinhaGramaticaParser.DeclrContext ctx) {
        System.out.println("In declaração: " + ctx.getText());
    }

    @Override
    public void exitSoma(MinhaGramaticaParser.SomaContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitOp_for(MinhaGramaticaParser.Op_forContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitInstrucao(MinhaGramaticaParser.InstrucaoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitSubtracao(MinhaGramaticaParser.SubtracaoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitMultiplicacao(MinhaGramaticaParser.MultiplicacaoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitDivisao(MinhaGramaticaParser.DivisaoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitResto(MinhaGramaticaParser.RestoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitMetodo(MinhaGramaticaParser.MetodoContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitValor(MinhaGramaticaParser.ValorContext ctx) {
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)) {
            System.out.println("Variável " + id + " não declarada");
        }
    }

    @Override
    public void exitDeclr(MinhaGramaticaParser.DeclrContext ctx) {
        System.out.println("Out declaração: " + ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        if (tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}