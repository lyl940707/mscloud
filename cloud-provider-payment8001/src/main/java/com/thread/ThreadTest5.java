package com.thread;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//Arraylist是线程不安全的

public class ThreadTest5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2=Collections.synchronizedList(new ArrayList<>());
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for(int i=0;i<30;i++){
                new Thread(() -> {
                        arrayList.add(UUID.randomUUID().toString().substring(0, 8));
                    System.out.println(arrayList);
                }, String.valueOf(i)).start();
            }

    }
    //1、故障现象: java.util.ConcurrentModificationException   JUC异常  java并发修改异常
    //2、导致原因：并发争抢修改
    //3、解决方案：
    // 1）new Vector<>();
    // 2)使用Collections.synchronizedList(arrayList)包装不安全的list
    // 3) new CopyOnWriteArrayList<>() 用它 写时复制（每次复制一份）
    //4、优化建议
}
