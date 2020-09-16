package com.kaden_kim.design_pattern.factory_method.impl.idcard;

import com.kaden_kim.design_pattern.factory_method.impl.framework.Product;

public class IDCard extends Product {

    private final String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println("Create " + owner + "(" + serial + ")'s card.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("Use " + owner + "(" + serial + ")'s card.");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }

}
