import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import antlr.MinhaGramaticaLexer;

import java.io.IOException;

public class ExampleLexer {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Leo\\Desktop\\projeto-pratico-compiladores\\src\\teste\\codigo.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            Token token;
            while (!lexer._hitEOF) {
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("    Lexema: " + token.getText());
                System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
                if (lexer.getVocabulary().getDisplayName(token.getType()) == "ErrorChar") {
                    System.out.println("Lexema desconhecido: " + token.getText());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
