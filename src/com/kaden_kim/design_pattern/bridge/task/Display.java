package com.kaden_kim.design_pattern.bridge.task;

import com.kaden_kim.design_pattern.bridge.impl.DisplayImpl;

public class Display {

    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }

}
