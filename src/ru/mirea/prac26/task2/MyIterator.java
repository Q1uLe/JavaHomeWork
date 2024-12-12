package ru.mirea.prac26.task2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<E> implements Iterator<E> {
    private List<E> lst;
    private int length;
    private int curId = 0;
    public MyIterator(List<E> lst){
        this.lst = lst;
        this.length = lst.size();
    }

    @Override
    public boolean hasNext() {
        return curId + 1 < length;
    }

    @Override
    public E next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return lst.get(curId++);
    }
}
