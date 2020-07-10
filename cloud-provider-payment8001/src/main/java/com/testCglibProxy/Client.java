package com.testCglibProxy;

import org.springframework.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        Proxy proxy=new Proxy();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback(proxy);
        Subject subject2 = (Subject) enhancer.create();
        subject2.request();
    }
}
