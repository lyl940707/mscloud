package com.proxyJdk;

import com.proxyJdk.Subject;

public class SubjectImpl implements Subject {
    @Override
    public void Request() {
        System.out.println("调用request");
    }
}
