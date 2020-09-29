package com.kaden_kim.design_pattern.strategy.sort.impl.framework;

public class SelectionSorter<T extends Comparable<T>> extends Sorter<T> {

    public SelectionSorter() {
        this.sorterName = "Selection Sort";
    }

    @Override
    public void sort(T[] data) {
        for (int i = 0; i < data.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < data.length; ++j) {
                if (data[min].compareTo(data[j]) > 0) min = j;
            }
            swap(data, min, i);
        }
    }

}
