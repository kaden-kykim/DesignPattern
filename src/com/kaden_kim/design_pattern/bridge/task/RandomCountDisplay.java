package com.kaden_kim.design_pattern.bridge.task;

import com.kaden_kim.design_pattern.bridge.impl.DisplayImpl;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(new Random().nextInt(times));
    }

}
