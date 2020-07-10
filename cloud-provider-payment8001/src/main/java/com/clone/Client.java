package com.clone;

//实现拷贝，必须实现cloneable接口，并且重写object的clone方法,Object的clone方法是native的，不能直接调用
//这里对于properties对象来说是浅拷贝，将引用拷贝了一份
//int之类的是值传递 String
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Subject subject=new Subject();
        Subject subject2=(Subject)subject.clone();
//        subject2.b=12;
//        System.out.println(subject.b);
//        System.out.println(subject2.b);
        subject2.c="m";
        subject2.properties.age=999;
        subject2.properties.name="lyl";
        System.out.println(subject.c);
        System.out.println(subject2.c);
        System.out.println(subject.properties.age);
        System.out.println(subject2.properties.age);
        System.out.println(subject.properties.name);
        System.out.println(subject2.properties.name);
        //String能实现深拷贝的原因不是final
        subject2.properties2.age=99;
        subject2.properties2.name="liyulong";
        System.out.println(subject.properties2.age);
        System.out.println(subject2.properties2.age);
        System.out.println(subject.properties2.name);
        System.out.println(subject2.properties2.name);
        System.out.println(subject.properties2==subject2.properties2);
    }
}
