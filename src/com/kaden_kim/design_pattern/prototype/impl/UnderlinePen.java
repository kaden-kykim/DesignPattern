package com.kaden_kim.design_pattern.prototype.impl;

import com.kaden_kim.design_pattern.prototype.impl.framework.ConcreteProduct;

public class UnderlinePen extends ConcreteProduct {

    private final char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; ++i) System.out.print(ulChar);
        System.out.println();
    }

}
