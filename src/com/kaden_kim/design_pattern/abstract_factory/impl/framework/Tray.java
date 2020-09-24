package com.kaden_kim.design_pattern.abstract_factory.impl.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {

    private final List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }

    public List<Item> getTray() {
        return tray;
    }

}
