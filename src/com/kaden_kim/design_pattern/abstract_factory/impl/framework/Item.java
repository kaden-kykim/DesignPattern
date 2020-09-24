package com.kaden_kim.design_pattern.abstract_factory.impl.framework;

public abstract class Item implements HTMLabel {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

}
