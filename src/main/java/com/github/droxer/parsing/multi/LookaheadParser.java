package com.github.droxer.parsing.multi;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;

public class LookaheadParser extends Parser {

    public LookaheadParser(Lexer lexer, int k) {
        super(lexer, k);
    }

    public void list(){
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    private void elements() {
        element();
        while ( LA(1)  == ListLexer.COMMA){
            match(ListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if ( LA(1)== ListLexer.NAME && LA(2)== ListLexer.EQUALS ) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        }
        else if ( LA(1)== ListLexer.NAME ) match(ListLexer.NAME); else if ( LA(1)== ListLexer.LBRACK ) list();
        else throw new Error("expecting name or list; found "+LT(1));
    }
}
