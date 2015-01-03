package com.github.droxer.parsing;

public class ListParser {

    private ListLexer input;
    private Token lookahead;

    public ListParser(ListLexer lexerLookadead) {
        this.input = lexerLookadead;
        lookahead = input.nextToken();
    }

    public void list(){
        match(ListLexer.LBRACK);
        elements();
        match(ListLexer.RBRACK);
    }

    private void elements() {
        element();
        while (lookahead.getIndex() == ListLexer.COMMA){
            match(ListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(lookahead.getIndex() == ListLexer.NAME) {
            match(ListLexer.NAME);
        }else if( lookahead.getIndex() == ListLexer.LBRACK){
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
