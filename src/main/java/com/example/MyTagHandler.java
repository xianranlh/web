package com.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MyTagHandler extends BodyTagSupport {
    @Override
    public int doEndTag() throws JspException {
        System.out.println("123");
        return super.doEndTag();
    }
}
