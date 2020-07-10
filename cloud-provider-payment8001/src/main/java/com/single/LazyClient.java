package com.single;

public class LazyClient {
    public static void main(String[] args) {
        Lazy lazy=Lazy.getInstance();
        Lazy lazy1=Lazy.getInstance();
        System.out.println(lazy==lazy1);
    }
}
