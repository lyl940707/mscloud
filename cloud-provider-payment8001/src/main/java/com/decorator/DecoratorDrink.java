package com.decorator;

public class DecoratorDrink extends Drink {
    private Drink drink;
    public DecoratorDrink(Drink drink){
        this.drink=drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }
    @Override
    public double getPrice() {
        return drink.getPrice();
    }
}
