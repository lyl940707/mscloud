package com.proxyCglib;

import org.springframework.cglib.proxy.Enhancer;
//cglib动态代理模式
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback(new SubjectIntercepter());
        Subject cGsubject = (Subject) enhancer.create();
        cGsubject.request();

    }
}
