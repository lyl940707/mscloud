package com.proxy;

import java.lang.reflect.Constructor;
//代理模式
public class Client {
    public static void main(String[] args) throws Exception{
        Class subjectClass=Class.forName("com.proxy.SubjectImpl");
        Constructor constructor=subjectClass.getConstructor();
        Subject subject=(Subject) constructor.newInstance();
//        Subject subject=(SubjectImpl)subjectClass.newInstance();
//        Subject subject=new SubjectImpl();
//        Subject subject=SubjectImpl.class.newInstance();
//        System.out.println(SubjectImpl.class.getClassLoader().getParent());
        ProxyTest proxyTest=new ProxyTest(subject);
        proxyTest.request();
    }
}
