package com.github.droxer.analyzing.visiting.embedded;

public class AddNode extends ExprNode {
    private ExprNode left;
    private ExprNode right;

    @Override
    public void walk() {
        left.walk();
        right.walk();
    }
}
