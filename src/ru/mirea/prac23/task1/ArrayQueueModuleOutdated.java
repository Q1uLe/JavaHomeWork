package ru.mirea.prac23.task1;

public class ArrayQueueModuleOutdated {
    private static int size = 5;
    private static int[] items = new int[size];
    private static int front = -1;
    private static int rear = -1;

    private static boolean isFull(){ return front == 0 && rear == size - 1; }

    private static boolean isEmpty(){ return front == -1; }

    private static void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    static int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        element = items[front];
        if(front >= rear){
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        System.out.println(element + " deleted");
        return element;
    }

    static void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front index -> " + front);
            System.out.print("Items -> ");
            for(int i = front; i <= rear; i++){
                System.out.print(items[i] + " ");
            }
            System.out.println();
            System.out.println("Rear index -> " + rear);
        }
    }


    public static void main(String[] args) {
        display();
        enQueue(3);
        enQueue(4);
        enQueue(5);
        display();
        System.out.println(isEmpty());
        System.out.println(isFull());
        deQueue();
        deQueue();
        display();
        deQueue();
        display();
        System.out.println(isEmpty());
        System.out.println(front);
        System.out.println(rear);
        enQueue(1);
        enQueue(1);
        enQueue(1);
        enQueue(1);
        enQueue(1);
        System.out.println(front);
        System.out.println(rear);
        enQueue(1);
        System.out.println(isFull());
    }
}
