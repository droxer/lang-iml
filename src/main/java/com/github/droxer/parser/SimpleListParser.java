package com.github.droxer.parser;

public class SimpleListParser {

    private LookadeadListLexer input;
    private Token lookahead;
    private int p = 0;


    public SimpleListParser(LookadeadListLexer lexerLookadead) {
        this.input = lexerLookadead;
        lookahead = input.nextToken();
    }

    public void list(){
        match(LookadeadListLexer.LBRACK);
        elements();
        match(LookadeadListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead.getIndex() == LookadeadListLexer.COMMA){
            match(LookadeadListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(lookahead.getIndex() == LookadeadListLexer.NAME) {
            match(LookadeadListLexer.NAME);
        }else if( lookahead.getIndex() == LookadeadListLexer.LBRACK){
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

    public static void main(String [] args){
        LookadeadListLexer lookadeadListLexer = new LookadeadListLexer("[a, [m, c], b]");
        SimpleListParser simpleListParser = new SimpleListParser(lookadeadListLexer);
        simpleListParser.list();
    }
}
