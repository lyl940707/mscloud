package com.testJdkProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        MyProxy myProxy=new MyProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), myProxy);
        proxyInstance.request();
    }
}
