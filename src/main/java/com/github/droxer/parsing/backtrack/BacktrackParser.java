package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.*;

public class BacktrackParser extends Parser {
    public BacktrackParser(Lexer input) {
        super(input);
    }

    /**
     * stat : list EOF | assign EOF ;
     */
    public void stat() throws RecognitionException, MismatchedTokenException, NoViableAltException {
        // attempt alternative 1: list EOF
        if (speculate_stat_alt1()) {
            list();
            match(Lexer.EOF_TYPE);
        }
        // attempt alternative 2: assign EOF
        else if (speculate_stat_alt2()) {
            assign();
            match(Lexer.EOF_TYPE);
        }
        // must be an error; neither matched; LT(1) is lookahead token 1
        else throw new NoViableAltException("expecting stat found " + LT(1));
    }

    public boolean speculate_stat_alt1() throws MismatchedTokenException, NoViableAltException {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try {
            list();
            match(Lexer.EOF_TYPE);
        } catch (RecognitionException e) {
            success = false;
        }
        release(); // either way, rewind to where we were
        return success;
    }

    public boolean speculate_stat_alt2() throws MismatchedTokenException, NoViableAltException {
        boolean success = true;
        mark(); // mark this spot in input so we can rewind
        try {
            assign();
            match(Lexer.EOF_TYPE);
        } catch (RecognitionException e) {
            success = false;
        }
        release(); // either way, rewind to where we were
        return success;
    }

    /**
     * assign : list '=' list ; // parallel assignment
     */
    public void assign() throws RecognitionException, MismatchedTokenException, NoViableAltException {
        list();
        match(ListLexer.EQUALS);
        list();
    }

    /**
     * list : '[' elements ']' ; // match bracketed list
     */
    public void list() throws RecognitionException, MismatchedTokenException, NoViableAltException {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    /**
     * elements : element (',' element)* ; // match comma-separated list
     */
    void elements() throws RecognitionException, NoViableAltException, MismatchedTokenException {
        element();
        while (LA(1) == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    /**
     * element : name '=' NAME | NAME | list ; // assignment, name or list
     */
    void element() throws RecognitionException, MismatchedTokenException, NoViableAltException {
        if (LA(1) == ListLexer.NAME && LA(2) == ListLexer.EQUALS) {
            match(ListLexer.NAME);
            match(ListLexer.EQUALS);
            match(ListLexer.NAME);
        } else if (LA(1) == ListLexer.NAME) {
            match(ListLexer.NAME);
        } else if (LA(1) == ListLexer.LBRACK) {
            list();
        } else {
            throw new NoViableAltException("expecting element found " + LT(1));
        }
    }
}