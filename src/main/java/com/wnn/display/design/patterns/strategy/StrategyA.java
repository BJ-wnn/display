package com.wnn.display.design.patterns.strategy;

import org.springframework.stereotype.Component;

/**
 * @author NanNan Wang
 **/
@Component
public class StrategyA implements Strategy{
    @Override
    public void doStuff() {
        System.out.println("StrategyA");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyA;
    }
}
