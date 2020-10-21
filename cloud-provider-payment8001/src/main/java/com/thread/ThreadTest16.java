package com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 使用condition实现交替打印
public class ThreadTest16 {
    public static void main(String[] args) {
        MyService2 service2=new MyService2();
        Thread c=new ThreadC(service2);
        Thread d=new ThreadD(service2);
        c.start();
        d.start();
    }
}

class MyService2{
    private boolean flag=false;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void printA(){
        lock.lock();
        while(flag){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("**");
        flag=true;
        condition.signal();
        lock.unlock();
    }
    public void printB(){
        lock.lock();
        while(!flag){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("@@");
        flag=false;
        condition.signal();
        lock.unlock();
    }
}
class  ThreadC extends Thread{
    private MyService2 myService;
    public ThreadC(MyService2 myService){
        this.myService=myService;
    }
    public void run(){
        for (int i=0;i<Integer.MAX_VALUE;i++) {
            myService.printA();
        }
    }
}


class  ThreadD extends Thread{
    private MyService2 myService;
    public ThreadD(MyService2 myService){
        this.myService=myService;
    }
    public void run(){
        for (int i=0;i<Integer.MAX_VALUE;i++) {
            myService.printB();
        }
    }
}

