package com.decorator;

public class AddSuger extends DecoratorDrink {
    public AddSuger(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"加糖";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+4;
    }
}
