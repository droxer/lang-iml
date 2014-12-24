package com.github.droxer.symtab;

import java.lang.reflect.Type;

public class Symbol {

    private String name;
    private Type type;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if( type != null ) {
            return '<' + getName() + ":" + type + ">";
        }

        return getName();
    }
}
