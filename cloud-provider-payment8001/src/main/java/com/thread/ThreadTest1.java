package com.thread;

public class ThreadTest1 extends Thread {
    public static int n=0;
    public static void main(String[] args) throws Exception{
        Thread a=new ThreadTest1();
        Thread b=new ThreadTest1();
        a.start();
        b.start();
        Thread.sleep(2000);
        System.out.println(n);
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            n++;
        }

    }

}
