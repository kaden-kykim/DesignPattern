package com.kaden_kim.design_pattern.strategy;

import com.kaden_kim.design_pattern.strategy.impl.Hand;
import com.kaden_kim.design_pattern.strategy.impl.Player;
import com.kaden_kim.design_pattern.strategy.impl.framework.ProbStrategy;
import com.kaden_kim.design_pattern.strategy.impl.framework.RandomStrategy;
import com.kaden_kim.design_pattern.strategy.impl.framework.WinningStrategy;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomSeed1 randomSeed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        play(new Player("WS Player", new WinningStrategy(Integer.parseInt(args[0]))),
                new Player("PS Player", new ProbStrategy(Integer.parseInt(args[1]))));
        play(new Player("PS Player", new ProbStrategy(Integer.parseInt(args[1]))),
                new Player("RS Player", new RandomStrategy((int) System.currentTimeMillis())));
        play(new Player("WS Player", new WinningStrategy(Integer.parseInt(args[0]))),
                new Player("RS Player", new RandomStrategy((int) System.currentTimeMillis())));
    }

    private static void play(Player player1, Player player2) {
        for (int i = 0; i < 10000; ++i) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
//                System.out.println("Winner: " + player1);
                player1.win(); player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
//                System.out.println("Winner: " + player2);
                player1.lose(); player2.win();
            } else {
//                System.out.println("Even...");
                player1.even(); player2.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(player1);
        System.out.println(player2);
    }

}
