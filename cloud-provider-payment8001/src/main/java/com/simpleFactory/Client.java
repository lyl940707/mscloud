package com.simpleFactory;

//简单工厂模式
//1.简单工厂和工厂方法的区别：简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
//2.工厂模式方法（factory method），定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类。
//3.工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。你想要加功能，本来是要改工厂类的，而现在是修改客户端。
//4.工厂方法克服了简单工厂违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点。这两者都是集中封装了对象的创建，使得要更换对象时，不需要做大的改动就可实现，降低了客户程序与产品对象的耦合。工厂方法模式是简单工厂模式的进一步抽象和推广。由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。但缺点是由于每加一个产品，就需要加一个产品工厂的类，增加了额外的开发量。

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Product product;
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a==1){
            product=new ProductImpl();
        }else if(a==2){
            product=new ProductImpl2();
        }else if(a==3){
            product=new ProductImpl3();
        }else {
            throw new Exception("123");
        }
        product.show();
        scanner.close();
    }
}
