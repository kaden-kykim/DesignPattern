package com.kaden_kim.design_pattern.strategy.impl;

public class Hand {

    public static final int HAND_VALUE_ROCK = 0, HAND_VALUE_SCISSORS = 1, HAND_VALUE_PAPER = 2;
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_ROCK),
            new Hand(HAND_VALUE_SCISSORS),
            new Hand(HAND_VALUE_PAPER)
    };
    private static final String[] name = { "Rock", "Scissors", "Paper" };

    private final int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) return 0;
        if ((this.handValue + 1) % 3 == h.handValue) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return name[handValue];
    }

}
