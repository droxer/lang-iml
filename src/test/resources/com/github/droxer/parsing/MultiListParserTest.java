package com.github.droxer.parsing;

import org.junit.Test;

public class MultiListParserTest {

    @Test
    public void testListWithEmbeddedEquals(){
        LookadeadListLexer lookadeadListLexer = new LookadeadListLexer("[a, b = c, [d, e]]");
        MultiListParser multiListParser = new MultiListParser(lookadeadListLexer, 2);
        multiListParser.list();
    }

    @Test
    public void testNormalList() throws Exception {
        LookadeadListLexer lookadeadListLexer = new LookadeadListLexer("[a, c, [d, e]]");
        MultiListParser multiListParser = new MultiListParser(lookadeadListLexer, 2);
        multiListParser.list();
    }
}
