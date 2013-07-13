package com.github.droxer.parser;

public final class Token {
    private int type;
    private String text;

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}
