package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.*;

import java.util.HashMap;
import java.util.Map;

public class MemoizedParser extends BacktrackParser {

    private static final int FAILED = -1;
    private Map<Integer, Integer> memo = new HashMap<>();

    public MemoizedParser(Lexer lexer) {
        super(lexer);
    }

    @Override
    public void stat() throws RecognitionException {
        if (speculateStatAlt1()) {
            list();
            match(Lexer.EOF_TYPE);
        } else if (speculateAtatAlt2()) {
            System.out.println("predict alternative 2");
            assign();
            match(Lexer.EOF_TYPE);
        } else {
            throw new NoViableAltException("expecting stat found " + LT(1));
        }
    }

    @Override
    protected void list() throws RecognitionException {
        boolean failed = false;
        int startTokenIndex = p;
        if (isSpeculating() && alreadyParsedRule(memo)) {
            return;
        }
        try {
            _list();
        } catch (RecognitionException re) {
            failed = true;
            throw re;
        } finally {
            if (isSpeculating()) {
                memoize(memo, startTokenIndex, failed);
            }
        }
    }

    @Override
    protected void consume() {
        p++;
        if (p == lookahead.size() && !isSpeculating()) {
            p = 0;
            lookahead.clear();
            clearMemo();
        }
        sync(1);
    }

    private void _list() throws RecognitionException {
        System.out.println("parse list rule at token index: " + p);
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    private void clearMemo() {
        memo.clear();
    }

    public boolean alreadyParsedRule(Map<Integer, Integer> memoization) throws PreviousParseFailedException {
        if (memoization.get(index()) == null) {
            return false;
        }

        int memo = memoization.get(index()).intValue();
        System.out.println("parsed list before at index " + index() +
                "; skip ahead to token index " + memo + ": " +
                lookahead.get(memo).getText());
        if (memo == FAILED) {
            throw new PreviousParseFailedException();
        }
        seek(memo);
        return true;
    }

    public void memoize(Map<Integer, Integer> memoization, int startTokenIndex, boolean failed) {
        int stopTokenIndex = failed ? FAILED : index();
        memoization.put(startTokenIndex, stopTokenIndex);
    }

    public int index() {
        return p;
    }
}
