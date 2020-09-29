package com.kaden_kim.design_pattern.strategy.impl.framework;

import com.kaden_kim.design_pattern.strategy.impl.Hand;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private final Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) { }
}
