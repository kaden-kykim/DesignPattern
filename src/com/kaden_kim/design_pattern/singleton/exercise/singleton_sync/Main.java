package com.kaden_kim.design_pattern.singleton.exercise.singleton_sync;

public class Main extends Thread {

    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        System.out.println("End.");
    }

    public Main(String name) {
        super(name);
    }

    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

}
