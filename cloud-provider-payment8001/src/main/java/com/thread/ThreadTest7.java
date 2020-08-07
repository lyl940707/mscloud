package com.thread;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest7 {
    public static void main(String[] args) {
        Thread a=new Thread(new TestThread());
        a.start();
        a.interrupt();
        Thread.currentThread().interrupt();
        System.out.println(Thread.interrupted());
        System.out.println(a.isInterrupted());
    }
}

class TestThread implements Runnable {

    @Override
    public void run(){
        System.out.println("begin--");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("end");
    }
}
