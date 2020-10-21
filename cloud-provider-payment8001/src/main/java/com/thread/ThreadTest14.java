package com.thread;

// ThreadLocal 每个线程都可以设置自己的值
public class ThreadTest14 {
    public static void main(String[] args) {
        System.out.println(ThreadLocalTools.tool.get());
        LocalTest1 localTest1=new LocalTest1();
        localTest1.start();

    }
}

class ThreadLocalTools extends ThreadLocal{
    public static ThreadLocal tool=new ThreadLocalTools();
    // 继承ThreadLocal 并重写initialValue() 可以设置默认值
    @Override
    protected Object initialValue() {
        return "默认值";
    }
}

class LocalTest1 extends Thread{
    @Override
    public void run(){
        ThreadLocalTools.tool.set("my value");
        System.out.println(ThreadLocalTools.tool.get());
    }
}
