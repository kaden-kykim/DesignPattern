package com.kaden_kim.design_pattern.adapter.delegate.impl;

import com.kaden_kim.design_pattern.adapter.delegate.impl.framework.Print;

public class PrintBanner extends Print {

    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
