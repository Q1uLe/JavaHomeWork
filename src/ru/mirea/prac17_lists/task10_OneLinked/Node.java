package ru.mirea.prac17_lists.task10_OneLinked;

//10.	Элемент односвязного списка содержит ссылку на строку.
//Отсортировать список путем исключения максимального элемента и включения его в начало списка

public class Node<T extends Comparable<T>> {
    private T data;
    private  Node<T> next;
    public Node(T dataValue){
        this.next = null;
        this.data = dataValue;
    }

    public Node(T dataValue, Node<T> next){
        this.next = next;
        this.data = dataValue;
    }

    public T getData(){
        return data;
    }

    public void setData(T dataValue){
        this.data = dataValue;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public int compareTo(Node<T> other){
        return data.compareTo(other.data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
