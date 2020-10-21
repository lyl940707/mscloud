package com.thread;

//CTRL+ALT+T 快速try catch
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
// ReentrantLock 来替代sychonized
// 使用多个condion来控制线程 await相当于sychonized的wait signal(all)相当于sychonized的notify(all)
public class ThreadTest15 {
    public static void main(String[] args) {
        MyService service=new MyService();
        Thread threadA1=new ThreadA(service);
        Thread threadA2=new ThreadA(service);
        Thread threadB1=new ThreadB(service);
        Thread threadB2=new ThreadB(service);
        threadA1.start();
        threadA2.start();
        threadB1.start();
        threadB2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.signalAll_A();
        service.signalAll_B();
    }
}

class MyService{
    private Lock lock=new ReentrantLock();
    public Condition conditionA=lock.newCondition();
    public Condition conditionB=lock.newCondition();

    public void awaitA(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis()+"Aawaitstart");
        try {
            conditionA.await();
            System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis()+"Aawaitend");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void awaitB(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis()+"Bawaitstart");
        try {
            conditionB.await();
            System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis()+"Bawaitend");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis());
        conditionA.signalAll();
        lock.unlock();
    }

    public void signalAll_B(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"-----"+System.currentTimeMillis());
        conditionB.signalAll();
        lock.unlock();
    }
}

class  ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService=myService;
    }
    public void run(){
        myService.awaitA();
    }
}


class  ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService=myService;
    }
    public void run(){
        myService.awaitB();
    }
}