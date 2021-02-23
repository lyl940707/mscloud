package com;

import java.util.*;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        String str3="计算机软件";
//        System.out.println(str1==str3);
//        String str1=new String("计算机软件");
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
        Map<String, Object> map=new ConcurrentHashMap<>();
        Map<String, Object> map2=new HashMap<>();
        map.put("1","2");
        map2.put("1","2");
        map2.put(null,"123123");
        System.out.println(map2.get(null));
        //map.put(null,"1"); ConcurrentHashMap 的key和value都不允许为空
        //map.put("2",null);
        ExecutorService threadPool = Executors.newCachedThreadPool();
        threadPool.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
        Executors.newFixedThreadPool(10);
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(2);
        List<String> list=new ArrayList<>();
        list.add("1");
        List<String> list2=new LinkedList<>();
        list2.add("2");
        Set set =new HashSet();
        set.add("1");
        List<String> list3=new CopyOnWriteArrayList<>();
        list3.iterator();
        Set<String> set2 = new CopyOnWriteArraySet<>();
        set2.add("1");
        System.out.println(set2.add("1"));
        System.out.println(set2.add("2"));
        ListIterator<String> stringListIterator = list.listIterator();
        stringListIterator.hasPrevious();
        List<String> listString=new ArrayList<>();
        listString.add("1");
        listString.add("2");
        listString.add(0,"3");
        System.out.println(listString);
    }
}
