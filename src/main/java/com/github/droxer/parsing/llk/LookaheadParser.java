package com.github.droxer.parsing.llk;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;

public class LookaheadParser extends Parser {

    public LookaheadParser(Lexer lexer, int k) {
        super(lexer, k);
    }

    public void list() {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead(1).getType() == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if (lookahead(1).getType() == ListLexer.NAME && lookahead(2).getType() == ListLexer.EQUALS) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        } else if (lookahead(1).getType() == ListLexer.NAME) {
            match(ListLexer.NAME);
        } else if (lookahead(1).getType() == ListLexer.LBRACK) {
            list();
        } else {
            throw new Error("expecting name or list; found " + lookahead(1));
        }
    }
}
