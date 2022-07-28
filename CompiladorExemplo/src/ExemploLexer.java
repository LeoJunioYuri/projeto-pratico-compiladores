import java.io.IOException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class ExemploLexer {
    public static void main (String[] args){
        String filename = "C:\\Users\\Gustavo\\Desktop\\Compiladores\\CompiladorExemplo\\codigo.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
            } 
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
