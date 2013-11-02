package com.github.droxer.parsing;

public final class Token {
    private int index;
    private String text;

    public Token(int index, String text) {
        this.index = index;
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "<" + text + ":" + index + ">";
    }
}
