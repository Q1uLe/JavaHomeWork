package ru.mirea.prac23.task2;

import org.jetbrains.annotations.Nullable;

public interface Queue<E> {
    void enqueue(E item);
    @Nullable E dequeue();
    @Nullable E element();
    int size();
    boolean isEmpty();
    void clear();
    void display();
}
