package com.proxy;

public class ProxyTest {
    private Subject subject;
    public ProxyTest(Subject subject){
        this.subject=subject;
    }

    public void request(){
        this.beforeRequest();
        subject.Request();
        this.afterRequest();
    }

    private void beforeRequest(){
        System.out.println("request前处理");
    }

    private void afterRequest(){
        System.out.println("request后处理");
    }
}
