package com.thread;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest3 implements Callable<Integer> {
    public static void main(String[] args) throws  Exception{
        ThreadTest3 a=new ThreadTest3();
        ThreadTest3 b=new ThreadTest3();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(a);
        new Thread(futureTask).start();
        // get方法会阻塞调用的线程
        Integer sum = futureTask.get();
        System.out.println(Thread.currentThread().getName() + Thread.currentThread().getId() + "=" + sum);
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t" + new Date() + " \tstarting...");

        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        Thread.sleep(5000);

        System.out.println(Thread.currentThread().getName() + "\t" + Thread.currentThread().getId() + "\t" + new Date() + " \tover...");
        return sum;
    }
}
