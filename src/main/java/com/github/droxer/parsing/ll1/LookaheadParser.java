package com.github.droxer.parsing.ll1;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;
import com.github.droxer.Token;

public final class LookaheadParser{

    private final Lexer lexer;
    private Token token;

    public LookaheadParser(Lexer lexer) {
        this.lexer = lexer;
        token = this.lexer.nextToken();
    }

    public void list(){
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (token.getType() == ListLexer.COMMA){
            match(ListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(token.getType() == ListLexer.NAME) {
            match(ListLexer.NAME);
        }else if( token.getType() == ListLexer.LBRACK){
            list();
        }else{
            throw new Error("expecting name or list;\n found " + token);
        }
    }

    private void match(int x) {
        if(token.getType() == x){
            consume();
        }else{
            throw new Error("expecting " + lexer.getTokenName(x) + ";\n found " + token);
        }
    }

    private void consume(){
        token = lexer.nextToken();
    }
}
