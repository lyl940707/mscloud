package com.observ;

public class ObserverInstance2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体实现2");
    }
}
