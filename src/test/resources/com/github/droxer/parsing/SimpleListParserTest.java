package com.github.droxer.parsing;

import org.junit.Test;

public class SimpleListParserTest {

    @Test
    public void testList() throws Exception {
        LookadeadListLexer lookadeadListLexer = new LookadeadListLexer("[a, [m, c], b]");
        SimpleListParser simpleListParser = new SimpleListParser(lookadeadListLexer);
        simpleListParser.list();
    }
}
