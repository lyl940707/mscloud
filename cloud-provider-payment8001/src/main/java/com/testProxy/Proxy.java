package com.testProxy;

public class Proxy {
    private Subject subject;
    public Proxy(Subject subject){
        this.subject=subject;
    }

    public void request(){
        System.out.println("前处理");
        subject.request();
        System.out.println("后处理");
    }
}
