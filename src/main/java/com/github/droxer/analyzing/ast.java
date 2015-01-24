package com.github.droxer.analyzing;

import com.github.droxer.Token;

import java.util.ArrayList;
import java.util.List;

public class AST {
    private Token token;
    private List<AST> children;

    public AST(Token token) {
        this.token = token;
        this.children = new ArrayList<>();
    }

    public void addChild(AST ast) {
        ast.children.add(ast);
    }
}
