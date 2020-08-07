package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest2 implements Runnable {
    private static AtomicInteger count=new AtomicInteger(0);
    public static void main(String[] args) throws Exception{
        Thread a=new Thread(new ThreadTest2());
        a.setName("test1");
        Thread b=new Thread(new ThreadTest2());
        b.setName("test2");
        a.start();
        b.start();
        Thread.sleep(2000);
        System.out.println(count);
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            count.incrementAndGet();
        }
    }
}
