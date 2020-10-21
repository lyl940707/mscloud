package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest12 {
    public static void main(String[] args) throws Exception{
//        MyThread12 b=new MyThread12();
//        b.setName("b");
//        b.start();
//        Thread.sleep(1000);
//        MyThread12 a=new MyThread12();
//        a.setName("a");
//        a.start();
        List m=new ArrayList();
        m.add(1);
        m.add(2);
        System.out.println(m.size());
    }
}

class ServiveA{
    synchronized public void service1() throws Exception{
        System.out.println("1");
        service2();
    }

    synchronized public void service2() throws Exception{
        while (true){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"2");
        }
    }

    synchronized public void service3(){
        System.out.println("3");
    }
}

class MyThread12 extends Thread{
    @Override
    public void run(){
        ServiveA serviveA=new ServiveA();
        try {
            if(Thread.currentThread().getName().equals("a")){
                serviveA.service1();
            }else{
                serviveA.service2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
