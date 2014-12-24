package com.github.droxer.symtab;

import java.lang.reflect.Type;

public class VariableSymbol extends Symbol {

    public VariableSymbol(String name, Type type) {
        super(name, type);
    }
}
