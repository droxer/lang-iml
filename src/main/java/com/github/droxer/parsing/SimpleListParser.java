package com.github.droxer.parsing;

public class SimpleListParser {

    private LookaheadListLexer input;
    private Token lookahead;
    private int p = 0;


    public SimpleListParser(LookaheadListLexer lexerLookadead) {
        this.input = lexerLookadead;
        lookahead = input.nextToken();
    }

    public void list(){
        match(LookaheadListLexer.LBRACK);
        elements();
        match(LookaheadListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead.getIndex() == LookaheadListLexer.COMMA){
            match(LookaheadListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(lookahead.getIndex() == LookaheadListLexer.NAME) {
            match(LookaheadListLexer.NAME);
        }else if( lookahead.getIndex() == LookaheadListLexer.LBRACK){
            list();
        }else{
            throw new Error("expecting name or list;\n found " + lookahead);
        }
    }

    private void match(int x) {
        if(lookahead.getIndex() == x){
            consume();
        }else{
            throw new Error("expecting " + input.getTokenName(x) + ";\n found " + lookahead);
        }
    }

    private void consume(){
        lookahead = input.nextToken();
    }
}
