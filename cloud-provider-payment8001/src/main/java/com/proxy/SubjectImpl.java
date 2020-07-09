package com.proxy;

public class SubjectImpl implements Subject {
    @Override
    public void Request() {
        System.out.println("调用request");
    }
}
