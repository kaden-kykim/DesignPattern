package com.kaden_kim.design_pattern.adapter.inherit;

import com.kaden_kim.design_pattern.adapter.inherit.impl.PrintBanner;
import com.kaden_kim.design_pattern.adapter.inherit.impl.framework.Print;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}
