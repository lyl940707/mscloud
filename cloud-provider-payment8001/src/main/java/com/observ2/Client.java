package com.observ2;
//观察者模式实现2
public class Client {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.addObserver(new PersonA());
        dog.addObserver(new PersonB());
        dog.dogChange(5);
        dog.dogChange(6);
    }
}
