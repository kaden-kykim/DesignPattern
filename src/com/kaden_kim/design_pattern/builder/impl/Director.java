package com.kaden_kim.design_pattern.builder.impl;

import com.kaden_kim.design_pattern.builder.impl.framework.Builder;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("In the morning");
        builder.makeItems(new String[]{"Good morning.", "Hello."});
        builder.makeString("At night");
        builder.makeItems(new String[]{"Good bye.", "Good night.", "See you tomorrow."});
        builder.close();
    }

}
