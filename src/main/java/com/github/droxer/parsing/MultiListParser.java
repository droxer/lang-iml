package com.github.droxer.parsing;

public class MultiListParser {

    private LookaheadListLexer input;
    private Token[] lookahead;
    private int k;
    private int p = 0;

    public MultiListParser(LookaheadListLexer input, int k) {
        this.input = input;
        this.k = k;

        lookahead = new Token[k];
        for(int i = 1; i <= k; i++){
            consume();
        }
    }

    public void list(){
        match(LookaheadListLexer.LBRACK);
        elements();
        match(LookaheadListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead[p].getIndex() == LookaheadListLexer.COMMA){
            match(LookaheadListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(la(1) == LookaheadListLexer.NAME && la(2) == LookaheadListLexer.EQUALS){
            match(LookaheadListLexer.NAME);
            match(LookaheadListLexer.EQUALS);
            match(LookaheadListLexer.NAME);
        }else if(la(1) == LookaheadListLexer.NAME){
            match(LookaheadListLexer.NAME);
        }else if(la(1) == LookaheadListLexer.LBRACK){
            list();
        }else{
            throw new Error("Expecting name or list;\n found " + lt(1));
        }
    }

    private Token lt(int i){
        return lookahead[ (p + i -1) % k];
    }

    private int la(int i){
        return lt(i).getIndex();
    }

    private void match(int x){
        if(la(1) == x){
            consume();
        }else{
            throw new Error("Expecting " + input.getTokenName(x) + "; found " + lt(1));
        }
    }

    private void consume() {
        lookahead[p] = input.nextToken();
        p = (p+1) % k;
    }
}
