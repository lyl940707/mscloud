package com.factoryMethod;

public class AbstractFactoryImplB implements AbstractFactory {
    @Override
    public Product getProdct() {
        System.out.println("具体工厂B");
        return new TypeBProduct();
    }
}
