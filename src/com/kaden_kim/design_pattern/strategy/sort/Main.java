package com.kaden_kim.design_pattern.strategy.sort;

import com.kaden_kim.design_pattern.strategy.sort.impl.SortAndPrint;
import com.kaden_kim.design_pattern.strategy.sort.impl.framework.BubbleSorter;
import com.kaden_kim.design_pattern.strategy.sort.impl.framework.InsertionSorter;
import com.kaden_kim.design_pattern.strategy.sort.impl.framework.QuickSorter;
import com.kaden_kim.design_pattern.strategy.sort.impl.framework.SelectionSorter;

public class Main {

    public static void main(String[] args) {
        String[] data = { "Dumpty", "Bowman", "Carroll", "ElfLand", "Alice" };

        new SortAndPrint<>(data.clone(), new SelectionSorter<>()).execute();
        new SortAndPrint<>(data.clone(), new InsertionSorter<>()).execute();
        new SortAndPrint<>(data.clone(), new BubbleSorter<>()).execute();
        new SortAndPrint<>(data.clone(), new QuickSorter<>()).execute();
    }

}
