package com.thread;

public class ThreadTest13 {
    public static void main(String[] args) {
        resource r=new resource();
        wait w=new wait(r);
        wait w1=new wait(r);
        wait w2=new wait(r);
        wait w3=new wait(r);
        wait w4=new wait(r);
        wait w5=new wait(r);
        wait w6=new wait(r);
        notify n=new notify(r);
        notify n1=new notify(r);
        notify n2=new notify(r);
        notify n3=new notify(r);
        notify n4=new notify(r);
        notify n5=new notify(r);
        notify n6=new notify(r);
        w.start();
        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
        n1.start();
        n.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
        n6.start();

    }
}

class wait extends Thread{
    private resource r;
    public wait(resource r){
        this.r=r;
    }
    @Override
    public void run() {
        super.run();
        try {
            r.sub();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class notify extends Thread{
    private resource r;
    public notify(resource r){
        this.r=r;
    }
    @Override
    public void run() {
        super.run();
        try {
            r.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class resource{
    Object o=new Object();
    volatile private int i=0;
    public void add() throws InterruptedException {
        synchronized (o) {
            while (i == 1) {
                o.wait();
            }
            i++;
            System.out.println(Thread.currentThread().getName() + "-------"+i);
            o.notifyAll();
        }
    }

    public void sub() throws InterruptedException {
        synchronized (o) {
            while (i < 1) {
                o.wait();
            }
            i--;
            System.out.println(Thread.currentThread().getName() + "-------"+i);
            o.notifyAll();
        }
    }
}
