package com.github.droxer.parsing.llk;

import com.github.droxer.parsing.ListLexer;
import org.junit.Test;

public class LookaheadParserTest {

    @Test
    public void testParse() throws Exception {
        ListLexer lexer = new ListLexer("[a,b=c,[d,e]]"); // parse arg
        LookaheadParser parser = new LookaheadParser(lexer, 2);
        parser.list();
    }
}