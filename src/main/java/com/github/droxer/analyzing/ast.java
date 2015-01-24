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

    public boolean isNil() {
        return token == null;
    }

    @Override
    public String toString() {
        return token == null ? token.toString() : "nil";
    }

    public String toStringTree(){
        if (children == null || children.size() == 0) {
            return toString();
        }

        StringBuilder sb = new StringBuilder();
        if (isNil()) {
            sb.append("(");
            sb.append(this.toString());
            sb.append(' ');
        }

        for ( int i = 0; i < children.size(); i++ ) {
            AST ast = children.get(i);
            if (i > 0 ) {
                sb.append(' ');
            }
        }

        if ( isNil()) {
            sb.append(")");
        }

        return sb.toString();
    }
}
