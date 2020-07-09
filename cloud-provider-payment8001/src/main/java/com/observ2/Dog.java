package com.observ2;

import java.util.Observable;

public class Dog extends Observable {
    public void dogChange(int age){
        super.setChanged();
        super.notifyObservers(age);
    }
}
