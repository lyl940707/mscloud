package com.abstractFactory;

public class AbstractFactoryImpl2 implements AbstractFactory {
    @Override
    public Cat getCatInstance() {
        return new BlackCat();
    }

    @Override
    public Dog getDogInstance() {
        return new RedDog();
    }
}
