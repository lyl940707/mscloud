package com.single;

public class LazyEnumClient {
    public static void main(String[] args) {
        LazyEnum instance=LazyEnum.getInstance();
        LazyEnum instance1=LazyEnum.getInstance();
        System.out.println(instance==instance1);
    }
}
