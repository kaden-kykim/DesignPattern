package com.kaden_kim.design_pattern.factory_method.impl.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
