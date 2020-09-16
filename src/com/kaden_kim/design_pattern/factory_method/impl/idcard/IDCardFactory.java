package com.kaden_kim.design_pattern.factory_method.impl.idcard;

import com.kaden_kim.design_pattern.factory_method.impl.framework.Factory;
import com.kaden_kim.design_pattern.factory_method.impl.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {

    private final Map<Integer, String> database = new HashMap<>();

    private int serial = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }

}
