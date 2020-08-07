package com.iterator;

import java.util.ArrayList;
import java.util.List;
//迭代器模式，自定义迭代器
public class Client extends  ArrayList{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        MyIterator iterator=new MyIteratorImpl(list);
        System.out.println(iterator.getFirst());
        while (iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
