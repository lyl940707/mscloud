package com.testProxy;

public class Client {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        Proxy proxy=new Proxy(subject);
        proxy.request();
    }
}
