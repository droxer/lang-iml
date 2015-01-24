package com.github.droxer.analyzing.visiting.embedded;

import com.github.droxer.Token;

public abstract class ExprNode {
    protected Token token;
    public abstract void walk();
}
