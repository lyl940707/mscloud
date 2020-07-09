package com.observ;
//观察者模式
public class Client {
    public static void main(String[] args) {
        Subject subject=new SubjectInstance();
        Observer obs1=new ObserverInstance1();
        Observer obs2=new ObserverInstance2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
