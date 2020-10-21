package com.thread;
// 守护线程：当程序中不存在其他非守护线程时，守护线程停止，将线程设置为守护线程setDaemon(true)
public class ThreadTest11 {
    public static void main(String[] args) throws Exception{
        Thread10 thread10=new Thread10();
        thread10.setDaemon(true);
        thread10.start();
        Thread.sleep(4000);
        System.out.println("停止");
    }
}

class Thread10 extends Thread  {
    private int i=0;
    @Override
    public void run(){
        while (true){
            i++;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
