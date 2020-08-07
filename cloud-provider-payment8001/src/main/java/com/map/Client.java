package com.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
//HashTable是直接在操作方法上加synchronized关键字，锁住整个数组，粒度比较大，
//Collections.synchronizedMap是使用Collections集合工具的内部类，通过传入Map封装出一个SynchronizedMap对象，内部定义了一个对象锁，方法内通过对象锁实现；
//ConcurrentHashMap使用分段锁，降低了锁粒度，让并发度大大提高。
// ConcurrentHashMap成员变量使用volatile 修饰，免除了指令重排序，同时保证内存可见性，
// 另外使用CAS操作和synchronized结合实现赋值操作，多线程操作只会锁住当前操作索引的节点。

public class Client {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        //三种方式实现线程安全的map
       // Map<String, String> map1 = Collections.synchronizedMap(map);
        //Map<String,String> map2=new ConcurrentHashMap<>();
       // Map<String,String> map2=new Hashtable<>();
        map.put("a","b");
        System.out.println("1");
//        map.put("a","b");
//        map.put("c","d");
//        System.out.println(map.hashCode());

    }
}
