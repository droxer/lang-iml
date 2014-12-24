package com.github.droxer.symtab;

import java.lang.reflect.Type;

public class BuildInTypeSymbol extends Symbol implements Type {

    public BuildInTypeSymbol(String name) {
        super(name);
    }
}
