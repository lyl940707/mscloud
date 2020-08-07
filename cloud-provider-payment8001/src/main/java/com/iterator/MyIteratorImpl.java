package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl<E> implements MyIterator {
    private int i=0;
    private List<E> list=new ArrayList<E>();
    public MyIteratorImpl(List<E> list){
        this.list=list;
    }
    @Override
    public E getFirst() {
        return list.get(0);
    }

    @Override
    public E getNext() {
        return list.get(i++);
    }

    @Override
    public boolean hasNext() {
        return i>=list.size()?false:true;
    }
}
