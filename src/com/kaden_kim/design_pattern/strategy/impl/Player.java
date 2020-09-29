package com.kaden_kim.design_pattern.strategy.impl;

import com.kaden_kim.design_pattern.strategy.impl.framework.Strategy;

public class Player {

    private final Strategy strategy;
    private final String name;

    private int winCount, loseCount, gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() { return strategy.nextHand(); }

    public void win() {
        strategy.study(true);
        ++winCount; ++gameCount;
    }

    public void lose() {
        strategy.study(false);
        ++loseCount; ++gameCount;
    }

    public void even() {
        ++gameCount;
    }

    @Override
    public String toString() {
        return "[" + name + ": " + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]";
    }
}
