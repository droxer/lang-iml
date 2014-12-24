package com.github.droxer.symtab;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

import java.io.IOException;

public class Test {

    public static void main(String args[]) throws IOException {
        CharStream input = null;

        if (args.length > 0){
            input = new ANTLRFileStream(args[0]);
        } else {
            input = new ANTLRInputStream(System.in);
        }

//        CymbolLexer lex = new CymbolLexer(input);
//        CymbolTokens tokens = new CymbolTokens(lex);
//        CymbolParser parser = new CymbolParser(tokens);
//
//        SymbolTable symtab = new SymbolTable();
//        parser.compilationUnit(symtab);
//        System.out.println("globals: " + symtab.getSymbols());
    }
}
