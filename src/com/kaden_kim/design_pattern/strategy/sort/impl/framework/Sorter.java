package com.kaden_kim.design_pattern.strategy.sort.impl.framework;

public abstract class Sorter<T extends Comparable<T>> {

    public abstract void sort(T[] data);

    protected String sorterName;

    public String getSorterName() {
        return sorterName;
    }

    public void swap(T[] data, int i, int j) {
        T passingPlace = data[j];
        data[j] = data[i];
        data[i] = passingPlace;
    }

}
