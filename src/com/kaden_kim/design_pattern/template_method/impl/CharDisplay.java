package com.kaden_kim.design_pattern.template_method.impl;

import com.kaden_kim.design_pattern.template_method.impl.framework.AbstractDisplay;

public class CharDisplay extends AbstractDisplay {

    private final char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(ch);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }

}
