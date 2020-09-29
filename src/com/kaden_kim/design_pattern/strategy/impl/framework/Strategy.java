package com.kaden_kim.design_pattern.strategy.impl.framework;

import com.kaden_kim.design_pattern.strategy.impl.Hand;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
