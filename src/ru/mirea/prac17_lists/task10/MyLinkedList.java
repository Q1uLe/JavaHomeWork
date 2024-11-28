package ru.mirea.prac17_lists.task10;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private int listCount;

    public MyLinkedList(){
        this.head = null;
        listCount = 0;
    }

    public void add(T data){
        if(listCount == 0){
            this.head = new Node<>(data);
        }
        else
        {
            Node<T> tmp = new Node<>(data);
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(tmp);
        }
        listCount++;
    }

    public void add(T data, int index){
        if(listCount > 1 && index != listCount && index != 0) {
            Node<T> tmp = new Node<>(data);
            Node<T> prev = head;
            Node<T> current = prev.getNext();
            for (int i = 0; i < index && current.getNext() != null; i++) {
                prev = prev.getNext();
                current = prev.getNext();
            }
            prev.setNext(tmp);
            tmp.setNext(current);
        } else if (index == 0) {
            Node<T> tmp = new Node<>(data);
            tmp.setNext(head);
            head = tmp;
        } else add(data);
        listCount++;
    }

    public T get(int index){
        if (index < 0) { return null; }
        Node<T> current = head;
        for(int i = 0; i < index && current.getNext() != null; i++){
            current = current.getNext();
        }
        return current.getData();
    }

    public Node<T> getNode(int index){
        if (index < 0) { return null; }
        Node<T> current = head;
        for(int i = 0; i < index && current.getNext() != null; i++){
            current = current.getNext();
        }
        return current;
    }

    public boolean remove(int index){
        if (index < 0 || index >= size()){
            return false;
        }
        if (index == 0){
            head = head.getNext();
            listCount--;
            return true;
        }
        Node<T> current = head;
        for(int i = 0; i < index - 1; i++){
            if(current.getNext() == null) { return false; }
            current = current.getNext();
        }
        if (current.getNext() != null){
            current.setNext(current.getNext().getNext());
        } else current.setNext(null);
        listCount--;
        return true;
    }

    public int size(){
        return listCount;
    }

    public T returnMax(){
        if (head == null){return null;}
        int maxId = 0;
        int iterId;
        for(iterId=0; iterId < listCount; iterId++){
            if (getNode(maxId).compareTo(getNode(iterId)) > 0){
                maxId = iterId;
            }
        }
        T ans = get(maxId);
        remove(maxId);
        return ans;
    }

    public void sort(){
        MyLinkedList<T> sorted = new MyLinkedList<>();
        while (head != null){
            T maxVal = returnMax();
            sorted.add(maxVal);
        }
        head = sorted.head;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder out = new StringBuilder("[");
        while (current != null){
            out.append(current.getData() != null ? current.getData().toString() : "null");
            current = current.getNext();
            if(current != null){ out.append(", ");}
        }
        out.append("]");
        return "MyLinkedList{%s}".formatted(out.toString());
    }
}
