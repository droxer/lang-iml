package com.github.droxer.st;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import static java.lang.System.*;

public class Test {

    public static void main(String[] args) {
        String assign = "<left> = <right>";
        StringTemplate st = new StringTemplate(assign, AngleBracketTemplateLexer.class);

        st.setAttribute("left", "x");
        st.setAttribute("right", 99);

        out.println(st.toString());
    }
}
