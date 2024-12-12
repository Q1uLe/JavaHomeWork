package ru.mirea.prac17_lists.task3_CycledTwoLinked;

import org.jetbrains.annotations.NotNull;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    private Node<T> next = null;
    private Node<T> prev = null;

    Node(T data){
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }


    @Override
    public int compareTo(@NotNull Node<T> o) {
        return data.compareTo(o.getData());
    }
}
