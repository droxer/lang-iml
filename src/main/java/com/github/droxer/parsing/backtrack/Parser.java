package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.MismatchedTokenException;
import com.github.droxer.parsing.Token;

import java.util.List;
import java.util.ArrayList;

public abstract class Parser {

    protected Lexer input;
    protected List<Integer> markers;
    protected List<Token> lookahead;
    protected int p = 0;

    public Parser(Lexer input) {
        this.input = input;
        markers = new ArrayList<>();
        lookahead = new ArrayList<>();
        sync(1);
    }

    private void consume() {
        p++;

        if (p == lookahead.size() && !isSpeculating()) {
            p = 0;
            lookahead.clear();
        }
        sync(1);
    }


    private void sync(int i) {
        if (p + i - 1 > (lookahead.size() - 1)) {
            int n = (p + i - 1) - (lookahead.size() - 1);
            fill(n);
        }
    }

    private void fill(int n) {
        for (int i = 1; i <= n; i++) {
            lookahead.add(input.nextToken());
        }
    }

    public Token LT(int i) {
        sync(i);
        return lookahead.get(p + i - 1);
    }

    public int LA(int i) {
        return LT(i).getType();
    }

    public void match(int x) throws MismatchedTokenException {
        if (LA(1) == x) {
            consume();
        } else {
            throw new MismatchedTokenException("expecting " +
                    input.getTokenName(x) + " found " + LT(1));
        }
    }

    public int mark() {
        markers.add(p);
        return p;
    }

    public void release() {
        int marker = markers.get(markers.size() - 1);
        markers.remove(markers.size() - 1);
        seek(marker);
    }

    private void seek(int index) {
        p = index;
    }

    private boolean isSpeculating() {
        return markers.size() > 0;
    }
}