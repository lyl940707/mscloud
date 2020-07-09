package com.decorator;

public abstract class  Drink {
    public String description="Your Drink:";

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();
}
