package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.ListLexer;
import org.junit.Test;

public class MemoizedParserTest {


    @Test
    public void testParse() throws Exception {
        ListLexer lexer = new ListLexer("[a,b]=[c,d]");
        MemoizedParser parser = new MemoizedParser(lexer);
        parser.stat();
    }
}