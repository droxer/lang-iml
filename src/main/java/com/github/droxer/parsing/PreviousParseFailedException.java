package com.github.droxer.parsing;

public class PreviousParseFailedException extends RecognitionException {
    public PreviousParseFailedException(String msg) {
        super(msg);
    }

    public PreviousParseFailedException() {
    }
}
