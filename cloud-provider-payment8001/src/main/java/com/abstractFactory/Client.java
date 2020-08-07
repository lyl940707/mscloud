package com.abstractFactory;

//抽象工厂模式:是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构
//抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new AbstractFactoryImpl();
        abstractFactory.getCatInstance().show();
        abstractFactory.getDogInstance().show();
        AbstractFactory abstractFactory1=new AbstractFactoryImpl2();
        abstractFactory1.getCatInstance().show();
        abstractFactory1.getDogInstance().show();
    }
}
