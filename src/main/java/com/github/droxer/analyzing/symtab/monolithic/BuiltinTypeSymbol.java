package com.github.droxer.analyzing.symtab.monolithic;

import java.lang.reflect.Type;

public class BuiltinTypeSymbol extends Symbol implements Type {

    public BuiltinTypeSymbol(String name) {
        super(name);
    }
}
