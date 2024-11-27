package ru.mirea.prac23.task1;

import org.jetbrains.annotations.Nullable;

public class ArrayQueue {
    static Object[] items = new Object[10];
    int front = 0;
    int rear = 0;
    int size = 0;

//    инвариант: size >= 0; 0 <= front <= rear < items.length


//    предусловие: el != null
//    постусловие size++;
    public void enqueue(Object el){
        if (rear + 1 > items.length){
            Object[] newArray = new Object[2 * size];
            System.arraycopy(items, front, newArray, 0, size);
            items = newArray;
            front = 0;
            rear = size;
        }
        items[rear] = el;
        rear++;
        size++;
    }

    //    предусловие: !isEmpty();
//    постусловие: front++; size--;
    public @Nullable Object dequeue(){
        if(isEmpty()){
            System.out.println("dequeue() -> Queue is empty");
            return null;
        }
        Object ans = items[front];
        front++;
        size--;
        return ans;
    }

    //    предусловие: !isEmpty();
//    постусловие: ...
    public @Nullable Object element(){
        if(isEmpty()){
            System.out.println("element() -> Queue is empty");
            return null;
        }
        return items[front];
    }

    public int size(){ return size; }

    //    предусловие: ...
    //    постусловие: front = rear = size = 0;
    public void clear(){
        items = new Object[10];
        front = 0;
        rear = 0;
        size = 0;
    }


    public void display(){
        System.out.println("Start of display()--------");
        if(isEmpty()){
            System.out.println("display() -> Queue is empty");
        } else {
            System.out.print("Items -> ");
            for(int i = front; i < rear; i++){
                System.out.print(items[i] + " ");
            }
            System.out.println();
            System.out.println("Front index -> " + front);
            System.out.println("Size -> " + size);
            System.out.println("Rear index -> " + rear);
        }
        System.out.println("End of display()----------");
    }

    public  boolean isEmpty() {
        return size == 0;
    }
}
