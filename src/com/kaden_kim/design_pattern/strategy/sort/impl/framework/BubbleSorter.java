package com.kaden_kim.design_pattern.strategy.sort.impl.framework;

public class BubbleSorter<T extends Comparable<T>> extends Sorter<T> {

    public BubbleSorter() {
        this.sorterName = "Bubble Sort";
    }

    @Override
    public void sort(T[] data) {
        boolean sorted;
        for (int i = data.length - 1; i > 0; --i) {
            sorted = true;
            for (int j = 0; j < i; ++j) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    sorted = false;
                    swap(data, j, j + 1);
                }
            }
            if (sorted) break;
        }
    }

}
