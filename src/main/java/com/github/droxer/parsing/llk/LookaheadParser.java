package com.github.droxer.parsing.llk;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;
import com.github.droxer.Token;

public final class LookaheadParser {

    private final Lexer lexer;
    private Token[] lookahead;
    private int k;
    private int p = 0;

    public LookaheadParser(Lexer lexer, int k) {
        this.lexer = lexer;
        this.k = k;
        this.lookahead = new Token[k];

        for (int i = 1; i <= k; i++) {
            consume();
        }
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

    private void consume() {
        lookahead[p] = lexer.nextToken();
        p = (p + 1) % k;
    }

    private Token lookahead(int i) {
        return lookahead[(p + i - 1) % k];
    }

    private void match(int x) {
        if (lookahead(1).getType() != x) {
            throw new Error("expecting " + lexer.getTokenName(x) + "; found " + lookahead(1));
        }

        consume();
    }
}
