package com.observ2;

import java.util.Observable;
import java.util.Observer;

public class PersonB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int age=(Integer) arg;
        System.out.println("2狗长大了"+age+"岁");
    }
}
