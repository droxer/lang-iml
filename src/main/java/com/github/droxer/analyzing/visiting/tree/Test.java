//package com.github.droxer.analyzing.visiting.tree;
//
//import org.antlr.runtime.*;
//import org.antlr.runtime.tree.*;
//
//public class Test {
//    public static void main(String[] args) throws Exception {
//        // Create lexer/parser to build trees from stdin
//        VecMathLexer lex = new VecMathLexer(new ANTLRInputStream(System.in));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//        VecMathParser p = new VecMathParser(tokens);
//        RuleReturnScope r = p.prog(); // launch parser by calling start rule
//        // get tree result
//        CommonTree tree = (CommonTree)r.getTree();
//        System.out.println(tree.toStringTree()); // print out LISP style
//
//        // serialize tree into node stream
//        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
//        Printer tp = new Printer(nodes); // create tree walker
//        tp.prog();                       // launch by calling start rule
//    }
//}