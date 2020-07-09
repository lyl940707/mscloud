package com.observ;

public class SubjectInstance extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for(Observer observer:observerList){
            observer.response();
        }
    }
}
