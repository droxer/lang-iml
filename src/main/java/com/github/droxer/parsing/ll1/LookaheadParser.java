package com.github.droxer.parsing.ll1;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;

public class LookaheadParser extends Parser {

    public LookaheadParser(Lexer lexer) {
        super(lexer);
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

}
