package com;

public class Test {
    public static void main(String[] args) {
        String a="a";
        String b=new String("a");
        System.out.println(a==b);
        b=b.intern();
        System.out.println(a==b);
    }
}
