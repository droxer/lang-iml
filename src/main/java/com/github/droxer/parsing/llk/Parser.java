package com.github.droxer.parsing.llk;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.Token;

public class Parser {
    protected Lexer lexer;
    protected Token[] lookahead;
    protected int k;
    protected int p = 0;

    public Parser(Lexer lexer, int k) {
        this.lexer = lexer;
        this.k = k;
        this.lookahead = new Token[k];

        for (int i = 1; i <= k; i++) {
            consume();
        }
    }

    public void consume() {
        lookahead[p] = lexer.nextToken();
        p = (p + 1) % k;
    }

    public Token lookahead(int i) {
        return lookahead[(p+i-1) % k];
    }

    public void match(int x) {
        if ( lookahead(1).getType() != x ) {
            throw new Error("expecting "+lexer.getTokenName(x)+ "; found "+ lookahead(1));
        }

        consume();
    }
}
