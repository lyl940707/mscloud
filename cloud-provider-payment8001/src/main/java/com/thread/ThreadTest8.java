package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadTest8 {

    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();
        FutureTask<Integer> futureTask=new FutureTask<>(myThread);
        FutureTask<Integer> futureTask2=new FutureTask<>(myThread);
        new  Thread(futureTask,"线程").start();
        new Thread(futureTask,"线程1").start();
        new Thread(futureTask,"线程2").start();
//        for (int i = 0; i <10 ; i++) {
//            new Thread(futureTask,"线程"+i).start();
//            System.out.println(futureTask.get());
//        }

    }
}

class  MyThread implements Callable<Integer> {
    public static int j=0;
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"---"+j++);
        return 1;
    }
}
