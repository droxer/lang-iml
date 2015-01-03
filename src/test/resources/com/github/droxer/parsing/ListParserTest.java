package com.github.droxer.parsing;

import org.junit.Test;

public class ListParserTest {

    @Test
    public void testList() throws Exception {
        ListLexer listLexer = new ListLexer("[a, [m, c], b]");
        ListParser listParser = new ListParser(listLexer);
        listParser.list();
    }
}
