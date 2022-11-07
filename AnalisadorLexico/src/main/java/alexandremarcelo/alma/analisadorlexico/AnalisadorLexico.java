/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexandremarcelo.alma.analisadorlexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author alehe
 */
public class AnalisadorLexico {
        public static void main(String[] args) throws IOException {
        try{
        CharStream cs = CharStreams.fromFileName(args[0]);
        Expressoes lex = new Expressoes(cs);
        Token t = null;
        while ((t = lex.nextToken()).getType() != Token.EOF) {
            System.out.println("<" + Expressoes.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
    }
        }catch (IOException ex){
        }
        
    }

}
