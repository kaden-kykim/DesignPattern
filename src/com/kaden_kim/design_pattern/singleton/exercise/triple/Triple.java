package com.kaden_kim.design_pattern.singleton.exercise.triple;

public class Triple {

    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private final int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "[Triple id=" + id + "]";
    }

}
