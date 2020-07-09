package com.adapater;
//适配器模式
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new ClassAdapter();
        adapter.provide();
    }
}
