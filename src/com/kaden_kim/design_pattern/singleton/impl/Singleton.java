package com.kaden_kim.design_pattern.singleton.impl;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {
        System.out.println("Create an instance");
    }
    public static Singleton getInstance() {
        return instance;
    }
}
