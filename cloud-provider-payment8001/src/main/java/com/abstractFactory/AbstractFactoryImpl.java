package com.abstractFactory;

public class AbstractFactoryImpl implements AbstractFactory {
    @Override
    public Cat getCatInstance() {
        return new BlueCat();
    }

    @Override
    public Dog getDogInstance() {
        return new WhiteDog();
    }
}
