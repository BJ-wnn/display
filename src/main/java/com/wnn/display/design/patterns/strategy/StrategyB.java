package com.wnn.display.design.patterns.strategy;

import org.springframework.stereotype.Component;

/**
 * @author NanNan Wang
 **/
@Component
public class StrategyB implements Strategy {
    @Override
    public void doStuff() {
        System.out.println("StrategyB");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyB;
    }
}
