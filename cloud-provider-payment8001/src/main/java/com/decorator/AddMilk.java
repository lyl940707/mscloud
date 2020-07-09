package com.decorator;

public class AddMilk extends DecoratorDrink {
    public AddMilk(Drink drink) {
        super(drink);
    }
    @Override
    public String getDescription() {
        return super.getDescription()+"加牛奶";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
