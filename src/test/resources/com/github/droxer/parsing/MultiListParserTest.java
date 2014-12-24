package com.github.droxer.parsing;

import org.junit.Test;

public class MultiListParserTest {

    @Test
    public void testListWithEmbeddedEquals(){
        LookaheadListLexer lookaheadListLexer = new LookaheadListLexer("[a, b = c, [d, e]]");
        MultiListParser multiListParser = new MultiListParser(lookaheadListLexer, 2);
        multiListParser.list();
    }

    @Test
    public void testNormalList() throws Exception {
        LookaheadListLexer lookaheadListLexer = new LookaheadListLexer("[a, c, [d, e]]");
        MultiListParser multiListParser = new MultiListParser(lookaheadListLexer, 2);
        multiListParser.list();
    }
}
