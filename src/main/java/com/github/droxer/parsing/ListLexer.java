package com.github.droxer.parsing;

import com.github.droxer.Token;

public class ListLexer extends Lexer {

    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBRACK = 5;
    public static int EQUALS = 6;
    public static String[] tokenNames = {"n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK", "EQUALS"};

    public ListLexer(String input) {
        super(input);
    }

    @Override
    public String getTokenName(int x) {
        return tokenNames[x];
    }

    @Override
    public Token nextToken() {
        while (c != EOF) {
            switch (c) {
                case ' ':
                case '\t':
                case '\r':
                    ws();
                    continue;
                case ',':
                    consume();
                    return new Token(COMMA, ",");
                case '[':
                    consume();
                    return new Token(LBRACK, "[");
                case ']':
                    consume();
                    return new Token(RBRACK, "]");
                case '=':
                    consume();
                    return new Token(EQUALS, "=");
                default:
                    if (isLetter()) {
                        return name();
                    }
                    throw new Error("invalid character: " + c);
            }

        }
        return new Token(EOF_TYPE, "<EOF>");
    }

    private Token name() {
        StringBuilder builder = new StringBuilder();
        do {
            builder.append(c);
            consume();
        } while (isLetter());

        return new Token(NAME, builder.toString());
    }

    private void ws() {
        while (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
            consume();
        }
    }

    private boolean isLetter() {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}
