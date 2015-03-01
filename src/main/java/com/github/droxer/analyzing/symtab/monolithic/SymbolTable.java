package com.github.droxer.analyzing.symtab.monolithic;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

public class SymbolTable implements Scope {

    private Map<String, Symbol> symbols = newHashMap();

    public SymbolTable() {
        initTypeSystem();
    }

    protected void initTypeSystem() {
        define(new BuiltinTypeSymbol("int"));
        define(new BuiltinTypeSymbol("float"));
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

    @Override
    public String toString() {
        return getScopeName() + ":" + symbols;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
