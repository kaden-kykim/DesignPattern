package com.kaden_kim.design_pattern.prototype.impl.framework;

public abstract class ConcreteProduct implements Product {

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
