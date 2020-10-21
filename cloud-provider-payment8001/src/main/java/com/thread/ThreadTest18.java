package com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
// 需要继承timertask抽象类，在run方法中实现具体逻辑，通过timer来调用，但是该线程并不会销毁，将其设置为守护线程可以销毁
// 如果执行任务的时间早于当前时间，则立即执行task任务。
// schedule（TimerTask task，Date firstTime，long period）在firsttime时执行，并且每隔period执行一次，无限次执行
// （计划时间晚于当前时间：在未来执行，如果计划时间早于当前时间，则立即执行task任务）
// TimerTask类中的cancel（）方法的作用是将自身从任务队列中清除
// Timer类的cancel（）方法和TimerTask类中的cancel（）方法清除自身不同，Timer类中的cancel（）方法的作用是将任务队列中的全部任务清空。
// schedule（TimerTask task，long delay）方法当前的时间为参考时间，在此时间基础上延迟指定的毫秒数后执行一次TimerTask任务。
// schedule（TimerTask task，long delay，long period）方法当前的时间为参考时间，在此时间基础上延迟指定的毫秒数，再以某一间隔时间无限次数地执行某一任务。
// scheduleAtFixedRate方法具有追赶执行性，会把之前未执行的次数执行一次
public class ThreadTest18 {
    public static void main(String[] args) {
        try {
            Service18 service18=new Service18();
            Timer timer=new Timer(true);
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String runTime="2020-08-27 11:19:50";
            Date date = sdf.parse(runTime);
            timer.schedule(service18,date);
            System.out.println("当前时间"+new Date());
            Thread.sleep(20000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Service18 extends TimerTask {

    @Override
    public void run() {
        System.out.println("运行时间为"+new Date());
    }
}
