package com.staticInnerClass;
public class Client {
    public static void main(String[] args) {
        PublicClass publicClass=new PublicClass();
        publicClass.setName("aaa");
        publicClass.setPassword("bbb");
        //必须这样初始化
        PublicClass.PrivateClass privateClass=new PublicClass.PrivateClass();
        privateClass.setAddress("ccc");
        privateClass.setAge("ddd");
        System.out.println(publicClass.getName());
        System.out.println(publicClass.getPassword());
        System.out.println(privateClass.getAddress());
        System.out.println(privateClass.getAge());
    }
}
