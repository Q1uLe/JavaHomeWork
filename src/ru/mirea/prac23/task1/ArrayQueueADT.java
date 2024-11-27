package ru.mirea.prac23.task1;

import org.jetbrains.annotations.Nullable;

public class ArrayQueueADT {
    Object[] items = new Object[10];
    int front = 0;
    int rear = 0;
    int size = 0;

//    инвариант: size >= 0; 0 <= front <= rear < items.length


//    предусловие: el != null
//    постусловие size++;
    public static void enqueue(ArrayQueueADT queueADT, Object el){
        if (queueADT.rear + 1 > queueADT.items.length){
            Object[] newArray = new Object[2 * queueADT.size];
            System.arraycopy(queueADT.items, queueADT.front, newArray, 0, queueADT.size);
            queueADT.items = newArray;
            queueADT.front = 0;
            queueADT.rear = queueADT.size;
        }
        queueADT.items[queueADT.rear] = el;
        queueADT.rear++;
        queueADT.size++;
    }

//    предусловие: !isEmpty();
//    постусловие: front++; size--;
    public static @Nullable Object dequeue(ArrayQueueADT queueADT){
        if(isEmpty(queueADT)){
            System.out.println("dequeue() -> Queue is empty");
            return null;
        }
        Object ans = queueADT.items[queueADT.front];
        queueADT.front++;
        queueADT.size--;
        return ans;
    }

//    предусловие: !isEmpty();
//    постусловие: ...
    static @Nullable Object element(ArrayQueueADT queueADT){
        if(isEmpty(queueADT)){
            System.out.println("element() -> Queue is empty");
            return null;
        }
        return queueADT.items[queueADT.front];
    }

    static int size(ArrayQueueADT queueADT){ return queueADT.size; }

    //    предусловие: ...
    //    постусловие: front = rear = size = 0;
    static void clear(ArrayQueueADT queueADT){
        queueADT.items = new Object[10];
        queueADT.front = 0;
        queueADT.rear = 0;
        queueADT.size = 0;
    }


    public static void display(ArrayQueueADT queueADT){
        System.out.println("Start of display()--------");
        if(isEmpty(queueADT)){
            System.out.println("display() -> Queue is empty");
        } else {
            System.out.print("Items -> ");
            for(int i = queueADT.front; i < queueADT.rear; i++){
                System.out.print(queueADT.items[i] + " ");
            }
            System.out.println();
            System.out.println("Front index -> " + queueADT.front);
            System.out.println("Size -> " + queueADT.size);
            System.out.println("Rear index -> " + queueADT.rear);
        }
        System.out.println("End of display()----------");
    }

    private static boolean isEmpty(ArrayQueueADT queueADT) {
        return queueADT.size == 0;
    }
}
