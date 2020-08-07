package com.iterator;

public interface MyIterator<E> {
    E getFirst();
    E getNext();
    boolean hasNext();
}
