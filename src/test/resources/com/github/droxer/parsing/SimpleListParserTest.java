package com.github.droxer.parsing;

import org.junit.Test;

public class SimpleListParserTest {

    @Test
    public void testList() throws Exception {
        LookaheadListLexer lookaheadListLexer = new LookaheadListLexer("[a, [m, c], b]");
        SimpleListParser simpleListParser = new SimpleListParser(lookaheadListLexer);
        simpleListParser.list();
    }
}
