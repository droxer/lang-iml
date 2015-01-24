package com.github.droxer.parsing.backtrack;

import com.github.droxer.Token;
import com.github.droxer.parsing.*;

import java.util.ArrayList;
import java.util.List;

public class BacktrackParser {

    protected final Lexer lexer;
    protected List<Integer> markers;
    protected List<Token> lookahead;
    protected int p = 0;

    public BacktrackParser(Lexer lexer) {
        this.lexer = lexer;
        markers = new ArrayList<>();
        lookahead = new ArrayList<>();
        sync(1);
    }

    /**
     * stat : list EOF | assign EOF ;
     */
    public void stat() throws RecognitionException {
        if (speculateStatAlt1()) {
            list();
            match(Lexer.EOF_TYPE);
        } else if (speculateAtatAlt2()) {
            assign();
            match(Lexer.EOF_TYPE);
        } else {
            throw new NoViableAltException("expecting stat found " + LT(1));
        }
    }

    public boolean speculateStatAlt1() {
        System.out.println("attempt alternative 1");
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

    public boolean speculateAtatAlt2() {
        System.out.println("attempt alternative 2");
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
    protected void list() throws RecognitionException {
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

    private void fill(int n) {
        for (int i = 1; i <= n; i++) {
            lookahead.add(lexer.nextToken());
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
                    lexer.getTokenName(x) + " found " + LT(1));
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

    protected void consume() {
        p++;

        if (p == lookahead.size() && !isSpeculating()) {
            p = 0;
            lookahead.clear();
        }
        sync(1);
    }


    protected void sync(int i) {
        if (p + i - 1 > (lookahead.size() - 1)) {
            int n = (p + i - 1) - (lookahead.size() - 1);
            fill(n);
        }
    }

    protected void seek(int index) {
        p = index;
    }

    protected boolean isSpeculating() {
        return markers.size() > 0;
    }
}