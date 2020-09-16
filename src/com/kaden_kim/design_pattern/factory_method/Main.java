package com.kaden_kim.design_pattern.factory_method;

import com.kaden_kim.design_pattern.factory_method.impl.framework.Factory;
import com.kaden_kim.design_pattern.factory_method.impl.framework.Product;
import com.kaden_kim.design_pattern.factory_method.impl.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Fritz Smith");
        Product card2 = factory.create("Barry Hamill");
        Product card3 = factory.create("Amaya Bayer");
        card1.use();
        card2.use();
        card3.use();
    }

}
