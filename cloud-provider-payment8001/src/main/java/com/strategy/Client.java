package com.strategy;

import java.util.List;
import java.util.Map;
import java.util.Set;
//策略模式
public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new StrategyInstance1());
        context.useStrategy();
        context.setStrategy(new StrategyInstance2());
        context.useStrategy();
    }
}
