package com.github.droxer.analyzing.visiting.embedded;

public class IntNode extends ExprNode {
    @Override
    public void walk() {
        System.out.println(token);
    }
}
