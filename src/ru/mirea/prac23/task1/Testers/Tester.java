package ru.mirea.prac23.task1.Testers;

import ru.mirea.prac23.task1.ArrayQueue;
import ru.mirea.prac23.task1.ArrayQueueADT;
import ru.mirea.prac23.task1.ArrayQueueModule;

public class Tester {
    public static void main(String[] args) {
//        ArrayQueueModule test
        ArrayQueueModule.enqueue(0);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.display();
        ArrayQueueModule.dequeue();
        ArrayQueueModule.dequeue();
        ArrayQueueModule.display();
        ArrayQueueModule.dequeue();
        ArrayQueueModule.display();
        for (int i = 0; i < 11; i++){
            ArrayQueueModule.enqueue(i);
        }
        ArrayQueueModule.display();
        for (int i = 0; i < 5; i++){
            ArrayQueueModule.dequeue();
        }
        ArrayQueueModule.display();

        //    ArrayQueueADT test
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 0);
        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 2);
        ArrayQueueADT.display(queueADT);
        ArrayQueueADT.dequeue(queueADT);
        ArrayQueueADT.dequeue(queueADT);
        ArrayQueueADT.display(queueADT);
        ArrayQueueADT.dequeue(queueADT);
        ArrayQueueADT.display(queueADT);
        for (int i = 0; i < 11; i++){
            ArrayQueueADT.enqueue(queueADT, i);
        }
        ArrayQueueADT.display(queueADT);
        for (int i = 0; i < 5; i++){
            ArrayQueueADT.dequeue(queueADT);
        }
        ArrayQueueADT.display(queueADT);

        // ArrayQueue test
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        for (int i = 0; i < 11; i++){
            queue.enqueue(i);
        }
        queue.display();
        for (int i = 0; i < 5; i++){
            queue.dequeue();
        }
        queue.display();

    }
}
