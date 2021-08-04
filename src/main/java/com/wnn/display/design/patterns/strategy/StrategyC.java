package com.wnn.display.design.patterns.strategy;

import org.springframework.stereotype.Component;

/**
 * @author NanNan Wang
 **/
@Component
public class StrategyC implements Strategy{

    @Override
    public void doStuff() {
        System.out.println("StrategyC");
    }

    @Override
    public StrategyName getStrategyName() {
        return StrategyName.StrategyC;
    }
}
