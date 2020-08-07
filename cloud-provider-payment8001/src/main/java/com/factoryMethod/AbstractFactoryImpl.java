package com.factoryMethod;

public class AbstractFactoryImpl implements AbstractFactory {
    @Override
    public Product getProdct() {
        System.out.println("具体工厂A");
        return new TypeAProduct();
    }
}
