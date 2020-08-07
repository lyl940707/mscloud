package com.thread;


import jdk.internal.dynalink.support.TypeConverterFactory;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//第四种获得java多线程的方式，线程池
public class ThreadTest6 {
    public static void main(String[] args) {
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool = Executors.newCachedThreadPool();
//        Lock lock=new ReentrantLock();
//        lock.lock();
//        try {
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }

        try {
            for (int i = 0; i < 10; i++) {
                final int j=i;
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"完成服务"+j+"号员工");
                });
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
}
