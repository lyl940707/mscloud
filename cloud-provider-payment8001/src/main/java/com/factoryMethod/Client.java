package com.factoryMethod;

//工厂方法模式：一个具体工厂生产一个产品,每一个产品都要有一个具体工厂,但都是同一类产品，工厂方法模式只考虑生产同等级的产品
public class Client {
    public static void main(String[] args) {
        AbstractFactoryImpl a = new AbstractFactoryImpl();
        Product prodct = a.getProdct();
        AbstractFactoryImplB abstractFactoryImplB = new AbstractFactoryImplB();
        Product prodct1 = abstractFactoryImplB.getProdct();
        prodct.show();
        prodct1.show();
    }
}
