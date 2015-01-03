package com.github.droxer.parsing.simple;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.Token;

public class Parser {
    Lexer lexer;
    Token token;

    public Parser(Lexer lexer) {
        this.lexer = lexer;
        token = this.lexer.nextToken();
    }

    public void match(int x) {
        if(token.getType() == x){
            consume();
        }else{
            throw new Error("expecting " + lexer.getTokenName(x) + ";\n found " + token);
        }
    }

    public void consume(){
        token = lexer.nextToken();
    }
}
