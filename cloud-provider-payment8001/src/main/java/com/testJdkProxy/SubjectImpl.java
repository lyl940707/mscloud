package com.testJdkProxy;

public class SubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("do request");
    }
}
