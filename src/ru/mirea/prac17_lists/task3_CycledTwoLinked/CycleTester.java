package ru.mirea.prac17_lists.task3_CycledTwoLinked;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class CycleTester {
    static DoubleLinkedCycleList<Integer> list = new DoubleLinkedCycleList<>();
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
//        for (int i = 0; i<10; i++){
//            list.add(random.nextInt(100));
//            arrayList.add(list.head.getPrev().getData());
//        }
//        System.out.println(list);
//        System.out.println(arrayList);
//        list.bubbleSort();
//        Collections.sort(arrayList);
//        System.out.println(list);
//        System.out.println(arrayList);
//    }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                list.add(random.nextInt(100));
                arrayList.add(list.head.getPrev().getData());
            }
            assert Objects.equals(list.toString(), list.toString());
            list = new DoubleLinkedCycleList<>();
            arrayList = new ArrayList<>();
        }
    }
}
