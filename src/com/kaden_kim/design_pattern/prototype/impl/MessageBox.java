package com.kaden_kim.design_pattern.prototype.impl;

import com.kaden_kim.design_pattern.prototype.impl.framework.ConcreteProduct;

public class MessageBox extends ConcreteProduct {

    private final char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; ++i) System.out.print(decoChar);
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; ++i) System.out.print(decoChar);
        System.out.println();
    }

}
