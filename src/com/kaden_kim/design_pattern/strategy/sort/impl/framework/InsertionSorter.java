package com.kaden_kim.design_pattern.strategy.sort.impl.framework;

public class InsertionSorter<T extends Comparable<T>> extends Sorter<T> {

    public InsertionSorter() {
        this.sorterName = "Insertion Sort";
    }

    @Override
    public void sort(T[] data) {
        for (int i = 1; i < data.length; ++i) {
            for (int j = i; j > 0; --j) {
                if (data[j].compareTo(data[j - 1]) < 0) swap(data, j, j - 1);
                else break;
            }
        }
    }

}
