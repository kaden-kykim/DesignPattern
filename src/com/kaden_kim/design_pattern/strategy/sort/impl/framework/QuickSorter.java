package com.kaden_kim.design_pattern.strategy.sort.impl.framework;

public class QuickSorter<T extends Comparable<T>> extends Sorter<T> {

    public QuickSorter() {
        this.sorterName = "Quick Sort";
    }

    @Override
    public void sort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private void quickSort(T[] data, int pre, int post) {
        int savedPre = pre;
        int savedPost = post;
        T mid = data[(pre + post) / 2];
        do {
            while (data[pre].compareTo(mid) < 0) ++pre;
            while (mid.compareTo(data[post]) < 0) --post;
            if (pre <= post) {
                swap(data, pre, post);
                ++pre; --post;
            }
        } while (pre <= post);
        if (savedPre < post) quickSort(data, savedPre, post);
        if (pre < savedPost) quickSort(data, pre, savedPost);
    }

}
