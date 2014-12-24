package com.github.droxer.symtab;


import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Scope {
    private Map<String, Symbol> symbols = new HashMap<>();

    public SymbolTable() {
        initTypeSystem();
    }

    protected void initTypeSystem() {
        define(new BuildInTypeSymbol("int"));
        define(new BuildInTypeSymbol("float"));
    }

    @Override
    public String getScopeName() {
        return "global";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol sym) {
        symbols.put(sym.getName(), sym);
    }

    @Override
    public Symbol resolve(String name) {
        return symbols.get(name);
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        return getScopeName() + ":" + symbols;
    }
}
