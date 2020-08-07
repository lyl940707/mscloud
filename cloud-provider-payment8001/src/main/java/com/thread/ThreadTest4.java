package com.thread;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

//ABA问题的演示与解决,这里演示AtomicStampedReference
//1：AtomicMarkableReference 利用一个boolean类型的标记来记录，只能记录它改变过，不能记录改变的次数
//2：AtomicStampedReference 利用一个int类型的标记来记录，它能够记录改变的次数。
public class ThreadTest4 {
    //存在aba问题
    static AtomicReference<Integer> atomicReference=new AtomicReference<>(100);
    //不存在aba问题:初始值和初始版本号
    static AtomicStampedReference<Integer> atomicStampedReference=new AtomicStampedReference<>(100,1);
    public static void main(String[] args){
        //aba问题展示
        new Thread(()->{
            atomicReference.compareAndSet(100,101);
            atomicReference.compareAndSet(101,100);
        },"t1").start();

        new Thread(()->{
            //保证t1线程进行过一次aba操作
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean b =atomicReference.compareAndSet(100,101);
            System.out.println(b+"线程"+Thread.currentThread().getName()+":"+atomicReference.get());
        },"t2").start();

        //aba问题解决
        new Thread(()->{
            atomicStampedReference.compareAndSet(100,101,1,2);
            atomicStampedReference.compareAndSet(101,100,2,3);
        },"t3").start();

        new Thread(()->{
            //保证t3线程进行过一次aba操作
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean b = atomicStampedReference.compareAndSet(100, 101, 1, 2);
            System.out.println(b+"线程"+Thread.currentThread().getName()+":"+atomicStampedReference.getReference());
        },"t4").start();
    }
}
