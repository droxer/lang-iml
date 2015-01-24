package com.github.droxer.parsing;

import com.github.droxer.Token;

public abstract class Lexer {
    public static final char EOF = (char) -1;
    public static final int EOF_TYPE = 1;
    
    protected String input;
    protected int p;
    protected char c;

    public Lexer(String input) {
        this.input = input;
        c = input.charAt(p);
    }

    public void consume() {
        p++;
        if (p >= input.length()) {
            c = EOF;
        } else {
            c = input.charAt(p);
        }
    }

    public void match(char x) {
        if ( c == x) {
            consume();
        } else {
            throw new Error("expecting "+x+"; found "+c);
        }
    }

    public abstract Token nextToken();

    public abstract String getTokenName(int x);
}
