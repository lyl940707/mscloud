package com.single;

public class LazyDubboCheckClient {
    public static void main(String[] args) {
        LazyDubboCheck instance=LazyDubboCheck.getInstance();
        LazyDubboCheck instance2=LazyDubboCheck.getInstance();
        System.out.println(instance==instance2);
    }
}
