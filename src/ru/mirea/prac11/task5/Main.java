package ru.mirea.prac11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        int opCount;
        opCount = (int) Math.pow(10, 6); // Количество элементов для тестирования
        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();



        startTime = System.nanoTime();
        for(int i=0;i<opCount;i++){
            arrayList.add(random.nextInt());
        }
        endTime = System.nanoTime();
        System.out.printf("Время выполнения добавления ArrayList: %.0f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));

        startTime = System.nanoTime();
        for(int i=0;i<opCount;i++){
            linkedList.add(random.nextInt());
        }
        endTime = System.nanoTime();
        System.out.printf("Время выполнения добавления LinkedList: %.0f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));



        startTime = System.nanoTime();
        arrayList.add(opCount/2, random.nextInt());
        endTime =  System.nanoTime();
        System.out.printf("Время выполнения операции вставки в середину ArrayList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));

        startTime = System.nanoTime();
        linkedList.add(opCount/2, random.nextInt());
        endTime =  System.nanoTime();
        System.out.printf("Время выполнения операции вставки в середину LinkedList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));



        startTime = System.nanoTime();
        arrayList.remove(opCount/2);
        endTime = System.nanoTime();
        System.out.printf("Время выполнения удаления операции из середины ArrayList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));

        startTime = System.nanoTime();
        linkedList.remove(opCount/2);
        endTime = System.nanoTime();
        System.out.printf("Время выполнения удаления операции из середины LinkedList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));



        int numRequest = random.nextInt();

        startTime = System.nanoTime();
        arrayList.contains(numRequest);
        endTime = System.nanoTime();
        System.out.printf("Время выполнения операции поиска ArrayList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));

        startTime = System.nanoTime();
        linkedList.contains(numRequest);
        endTime = System.nanoTime();
        System.out.printf("Время выполнения операции поиска LinkedList: %.3f мс\n",
                (double)((endTime - startTime) / Math.pow(10, 6)));
    }
}
