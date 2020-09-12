package com.kaden_kim.design_pattern.adapter.delegate;

import com.kaden_kim.design_pattern.adapter.delegate.impl.PrintBanner;
import com.kaden_kim.design_pattern.adapter.delegate.impl.framework.Print;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}
