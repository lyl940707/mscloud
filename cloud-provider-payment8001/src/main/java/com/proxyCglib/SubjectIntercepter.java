package com.proxyCglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SubjectIntercepter implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("--------------begin-------------");
        Object invoke = methodProxy.invokeSuper(o,objects);
        System.out.println("--------------end-------------");
        return invoke;
    }
}
