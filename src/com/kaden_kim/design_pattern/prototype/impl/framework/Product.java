package com.kaden_kim.design_pattern.prototype.impl.framework;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
