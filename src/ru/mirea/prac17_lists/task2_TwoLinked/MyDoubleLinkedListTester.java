package ru.mirea.prac17_lists.task2_TwoLinked;

import java.util.Random;

public class MyDoubleLinkedListTester {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> linkedList = new MyDoubleLinkedList<>();
        Random random = new Random();
        for (int i = 0; i<15;i++){
            linkedList.addByData(random.nextInt(100));
        }
        System.out.println(linkedList);
        linkedList.sort();
        System.out.println(linkedList);
    }
}
