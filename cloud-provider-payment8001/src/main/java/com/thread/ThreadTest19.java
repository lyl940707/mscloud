package com.thread;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadTest19 {
    static int j=0;
    public static void main(String[] args) throws Exception{
        System.out.println(1>>1);
        System.out.println(4>>1);
        ThreadTest19 threadTest19=new ThreadTest19();
        String a="a";
        System.out.println("++++"+a.hashCode());
        threadTest19.m(a);
        System.out.println(a);
        Class myService = Class.forName("com.thread.Service19");
        Service19 o = (Service19)myService.newInstance();
        getValue(myService,o);
        System.out.println(myService);
        List<String> list=new ArrayList();
        list.add("a");
//        Collection<String> clist= Collections.unmodifiableCollection(list);
//        clist.add("c");
        System.out.println(list);
    }

    public void m(String a){
        System.out.println("----"+a.hashCode());
        a="bb";
        System.out.println("-----"+a.hashCode());
        System.out.println(a);
//        Hashtable
//        CopyOnWriteArrayList
    }

    /**
     * 访问私有变量值
     */
    private static void getValue(Class clazz, Object obj)
            throws IllegalAccessException
    {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields)
        {
            field.setAccessible(true);
            System.out.println("******"+field.get(obj));
        }
    }
}

class Service19{
    private int i=1;
    private int j=3;
}
