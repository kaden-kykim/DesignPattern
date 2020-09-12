package com.kaden_kim.design_pattern.adapter.inherit.impl;

import com.kaden_kim.design_pattern.adapter.inherit.impl.framework.Print;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
