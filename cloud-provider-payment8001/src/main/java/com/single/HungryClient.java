package com.single;

public class HungryClient {
    public static void main(String[] args) {
        Hungry hungry=Hungry.getInstance();
        Hungry hungry1=hungry.getInstance();
        System.out.println(hungry==hungry1);
    }
}
