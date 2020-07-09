package com.observ;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observerList=new ArrayList<>();

    public void  add(Observer observer){
        observerList.add(observer);
    }

    public  void remove(Observer observer){
        observerList.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}
