package com.testJdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private Subject subject;
    public MyProxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前处理");
        Object o = method.invoke(subject, args);
        System.out.println("后处理");
        return o;
    }
}
