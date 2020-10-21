package com.thread;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
//setPriority 设置线程优先级 1-10 1为最大优先级
public class ThreadTest9 {
    public static void main(String[] args) {
        AAA a=new AAA(3);
        BBB b=new BBB(4);
        CCC C=new CCC(8);
        FutureTask<Integer> futureTask = new FutureTask<>(a);
        FutureTask<Integer> futureTask2 = new FutureTask<>(b);
        FutureTask<Integer> futureTask3 = new FutureTask<>(C);
        Thread m=new Thread(futureTask);
        Thread n=new Thread(futureTask2);
        Thread x=new Thread(futureTask2);
        n.setPriority(2);
        System.out.println(x.getPriority());
        m.start();
        n.start();

    }
}

class AAA implements Callable<Integer>{
    int a=0;
    public AAA(int param){
        a=param;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(a);
        return null;
    }
}

class BBB implements Callable<Integer>{
    int a=0;
    public BBB(int param){
        a=param;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(a);
        return null;
    }
}

class CCC extends BBB{
    public CCC(int i){
        super(i);
    }

}
