package com.kaden_kim.design_pattern.strategy.impl.framework;

import com.kaden_kim.design_pattern.strategy.impl.Hand;

import java.util.Random;

public class ProbStrategy implements Strategy {

    private final Random random;
    private final int[][] history = { {1, 1, 1}, {1, 1, 1}, {1, 1, 1} };

    private int prevHandValue = 0, curHandValue = 0;

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(curHandValue));
        int handValue = bet < history[curHandValue][0] ? 0
                : bet < history[curHandValue][0] + history[curHandValue][1] ? 1 : 2;
        prevHandValue = curHandValue;
        curHandValue = handValue;
        return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean win) {
        if (win) ++history[prevHandValue][curHandValue];
        else {
            ++history[prevHandValue][(curHandValue + 1) % 3];
            ++history[prevHandValue][(curHandValue + 2) % 3];
        }
    }

    private int getSum(int handValue) {
        int sum = 0;
        for (int i = 0; i < 3; ++i) sum += history[handValue][i];
        return sum;
    }

}
