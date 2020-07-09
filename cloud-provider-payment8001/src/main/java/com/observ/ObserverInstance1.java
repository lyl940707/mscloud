package com.observ;

public class ObserverInstance1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体响应1");
    }
}
