package com.decorator;


public class Coffee extends Drink {

    public Coffee() {
        description = "咖啡";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
