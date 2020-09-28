package com.kaden_kim.design_pattern.bridge;

import com.kaden_kim.design_pattern.bridge.impl.CharDisplayImpl;
import com.kaden_kim.design_pattern.bridge.impl.DecoTextDisplayImpl;
import com.kaden_kim.design_pattern.bridge.impl.FileDisplayImpl;
import com.kaden_kim.design_pattern.bridge.impl.StringDisplayImpl;
import com.kaden_kim.design_pattern.bridge.task.CountDisplay;
import com.kaden_kim.design_pattern.bridge.task.Display;
import com.kaden_kim.design_pattern.bridge.task.IncreaseDisplay;
import com.kaden_kim.design_pattern.bridge.task.RandomCountDisplay;

public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Java"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Pattern"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Bridge"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        RandomCountDisplay randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello, Random"));
        randomCountDisplay.randomDisplay(10);

        CountDisplay fileCountDisplay = new CountDisplay(new FileDisplayImpl("res/bridge/star.txt"));
        fileCountDisplay.multiDisplay(3);

        IncreaseDisplay increaseDisplay1
                = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay increaseDisplay2
                = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        IncreaseDisplay increaseDisplay3 = new IncreaseDisplay(new StringDisplayImpl("Hello, Increase 2"), 2);
        IncreaseDisplay increaseDisplay4 = new IncreaseDisplay(new StringDisplayImpl("Hello, Increase 1"), 1);
        increaseDisplay1.increaseDisplay(4);
        increaseDisplay2.increaseDisplay(6);
        increaseDisplay3.increaseDisplay(3);
        increaseDisplay4.increaseDisplay(5);

        CountDisplay decoTextDisplay1
                = new CountDisplay(new DecoTextDisplayImpl('<', '*', '>', 1));
        CountDisplay decoTextDisplay2
                = new CountDisplay(new DecoTextDisplayImpl('|', '#', '-', 2));
        decoTextDisplay1.multiDisplay(4);
        decoTextDisplay2.multiDisplay(6);
    }

}
