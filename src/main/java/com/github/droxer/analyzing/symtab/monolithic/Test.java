package com.github.droxer.analyzing.symtab.monolithic;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

public class Test {

    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if (args.length > 0) {
            input = new ANTLRFileStream(args[0]);
        } else {
            input = new ANTLRInputStream(System.in);
        }

        CymbolLexer lex = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        CymbolParser p = new CymbolParser(tokens);

        SymbolTable symtab = new SymbolTable();
        p.compilationUnit(symtab);
        System.out.println("globals: " + symtab.getSymbols());
    }
}
