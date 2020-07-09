package com.proxyJdk;

import java.lang.reflect.Proxy;
//jdk动态代理模式
public class Client {
    public static void main(String[] args){
        Subject subject=new SubjectImpl();
        SubjectProxy proxyTest=new SubjectProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), proxyTest);
        proxyInstance.Request();
    }
}
