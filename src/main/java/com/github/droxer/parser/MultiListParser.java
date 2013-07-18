package com.github.droxer.parser;

public class MultiListParser {

    private LookadeadListLexer input;
    private Token[] lookahead;
    private int k;
    private int p = 0;

    public MultiListParser(LookadeadListLexer input, int k) {
        this.input = input;
        this.k = k;

        lookahead = new Token[k];
        for(int i = 1; i <= k; i++){
            consume();
        }
    }

    public void list(){
        match(LookadeadListLexer.LBRACK);
        elements();
        match(LookadeadListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead[p].getIndex() == LookadeadListLexer.COMMA){
            match(LookadeadListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(la(1) == LookadeadListLexer.NAME && la(2) == LookadeadListLexer.EQUALS){
            match(LookadeadListLexer.NAME);
            match(LookadeadListLexer.EQUALS);
            match(LookadeadListLexer.NAME);
        }else if(la(1) == LookadeadListLexer.NAME){
            match(LookadeadListLexer.NAME);
        }else if(la(1) == LookadeadListLexer.LBRACK){
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

    public static void main(String[] args){
        LookadeadListLexer lookadeadListLexer = new LookadeadListLexer("[a, b=c, [d, e]]");
        MultiListParser multiListParser = new MultiListParser(lookadeadListLexer, 2);
        multiListParser.list();
    }
}
