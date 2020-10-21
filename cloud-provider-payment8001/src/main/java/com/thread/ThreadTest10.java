package com.thread;

// suspend方法是被废弃的,可能出现独占锁的情况
public class ThreadTest10 {
    public static void main(String[] args) throws Exception{
        Test10 test10=new Test10();
        Thread a=new Thread(test10);
        a.start();
        Thread.sleep(1000);
        a.suspend();
        System.out.println("main end");
    }
}

class Test10 implements Runnable{
    private int i=0;
    @Override
    public void run() {
        while (true){
            i++;
            System.out.println(i);
        }

    }
}
