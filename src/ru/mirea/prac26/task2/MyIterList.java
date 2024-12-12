package ru.mirea.prac26.task2;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterList<E> implements Iterable<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    public MyIterList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(E el) {
        ensureCapacity();
        elements[size++] = el;
    }

    public E get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + size);
        }
        return (E) elements[id];
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public int size() {
        return size;
    }


    @Override
    public @NotNull Iterator<E> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<E>{
        private int curId = 0;
        @Override
        public boolean hasNext() {
            return curId < size;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return (E) elements[curId++];
        }
    }
}
