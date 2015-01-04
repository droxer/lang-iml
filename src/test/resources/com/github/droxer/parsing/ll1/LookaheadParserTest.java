package com.github.droxer.parsing.ll1;

import com.github.droxer.parsing.Lexer;
import com.github.droxer.parsing.ListLexer;
import org.junit.Test;

public class LookaheadParserTest {

    @Test
    public void testParse() throws Exception {
        Lexer listLexer = new ListLexer("[a, [m, c], b]");
        LookaheadParser lookaheadParser = new LookaheadParser(listLexer);
        lookaheadParser.list();
    }
}
