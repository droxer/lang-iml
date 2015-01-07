package com.github.droxer.parsing;

public class MismatchedTokenException extends RecognitionException {
    public MismatchedTokenException(String msg) {
        super(msg);
    }
}
