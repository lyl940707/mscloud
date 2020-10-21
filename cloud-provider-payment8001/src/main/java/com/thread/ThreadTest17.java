package com.thread;

// ReentrantReadWriteLock 读写锁，读取操作可以同步进行
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest17 {
    public static void main(String[] args) throws Exception{
        Service17 service17=new Service17();
        new Thread(()->{
            service17.read();
        },"a").start();
        Thread.sleep(1000);
        new Thread(()->{
            service17.read2();
        },"b").start();
    }
}

class Service17{
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void read(){
        try {
            lock.readLock().lock();
            System.out.println(System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void read2(){
        try {
            lock.readLock().lock();
            System.out.println(System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void write2(){
        try {
            lock.writeLock().lock();
            System.out.println(System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}