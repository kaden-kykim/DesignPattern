package com.kaden_kim.design_pattern.composite.impl.framework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private final String name;
    private final List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) size += entry.getSize();
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + File.separatorChar + this);
        for (Entry entry : directory) entry.printList(prefix + File.separatorChar + name);
    }

}
