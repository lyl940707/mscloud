package com.decorator;
//装饰者模式
public class Client {
    public static void main(String[] args) {
        Drink coffee=new Coffee();
        coffee=new AddSuger(coffee);
        coffee=new AddMilk(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());

    }
}
