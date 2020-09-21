package com.kaden_kim.design_pattern.singleton.exercise.singleton_sync;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Created an instance");
        slowdown();
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    private void slowdown() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
