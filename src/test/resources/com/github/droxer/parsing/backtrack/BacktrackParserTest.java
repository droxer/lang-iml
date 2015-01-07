package com.github.droxer.parsing.backtrack;

import com.github.droxer.parsing.ListLexer;
import org.junit.Test;

public class BacktrackParserTest {

    @Test
    public void testElementAssignment() throws Exception {
        ListLexer lexer = new ListLexer("[a,b=c,[d,e]]");
        BacktrackParser parser = new BacktrackParser(lexer);
        parser.stat();
    }

    @Test
    public void testListAssignment() throws Exception {
        ListLexer lexer = new ListLexer("[a,b]=[A,B]");
        BacktrackParser parser = new BacktrackParser(lexer);
        parser.stat();
    }
}