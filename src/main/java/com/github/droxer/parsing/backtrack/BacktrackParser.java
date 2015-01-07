package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.*;

public class BacktrackParser extends Parser {
    public BacktrackParser(Lexer input) {
        super(input);
    }

    /**
     * stat : list EOF | assign EOF ;
     */
    public void stat() throws RecognitionException {
        if (speculate_stat_alt1()) {
            list();
            match(Lexer.EOF_TYPE);
        } else if (speculate_stat_alt2()) {
            assign();
            match(Lexer.EOF_TYPE);
        } else {
            throw new NoViableAltException("expecting stat found " + LT(1));
        }
    }

    public boolean speculate_stat_alt1() {
        boolean success = true;
        mark();
        try {
            list();
            match(Lexer.EOF_TYPE);
        } catch (RecognitionException e) {
            success = false;
        }

        release();
        return success;
    }

    public boolean speculate_stat_alt2() {
        boolean success = true;
        mark();
        try {
            assign();
            match(Lexer.EOF_TYPE);
        } catch (RecognitionException e) {
            success = false;
        }
        release();
        return success;
    }

    /**
     * assign : list '=' list ; // parallel assignment
     */
    public void assign() throws RecognitionException {
        list();
        match(ListLexer.EQUALS);
        list();
    }

    /**
     * list : '[' elements ']' ; // match bracketed list
     */
    public void list() throws RecognitionException {
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    /**
     * elements : element (',' element)* ; // match comma-separated list
     */
    void elements() throws RecognitionException {
        element();
        while (LA(1) == ListLexer.COMMA) {
            match(ListLexer.COMMA);
            element();
        }
    }

    /**
     * element : name '=' NAME | NAME | list ; // assignment, name or list
     */
    void element() throws RecognitionException {
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