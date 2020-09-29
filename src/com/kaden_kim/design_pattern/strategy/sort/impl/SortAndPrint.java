package com.kaden_kim.design_pattern.strategy.sort.impl;

import com.kaden_kim.design_pattern.strategy.sort.impl.framework.Sorter;

import java.util.Arrays;

public class SortAndPrint<T extends Comparable<T>> {

    private final T[] data;
    private final Sorter<T> sorter;

    public SortAndPrint(T[] data, Sorter<T> sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        System.out.println(" === " + sorter.getSorterName() + " ===");
        print(); sorter.sort(data); print();
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

}
