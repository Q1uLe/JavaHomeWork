package ru.mirea.prac3.Task1;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/*
Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два подхода
к генерации случайных чисел – метод random() класса Math и класс Random)
 */

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numCount1 = rand.nextInt(10) + 1;
        int numCount2 = (int) Math.floor((Math.random() * 10)) + 1;
//        System.out.printf("%d %d\n", numCount1, numCount2);
        ArrayList<Integer> firstList = new ArrayList<Integer>(numCount1);
        ArrayList<Integer> secondList = new ArrayList<Integer>(numCount2);
        for(int i = 0; i < numCount1; i++){
            firstList.add(rand.nextInt(1000));
        }
        for(int i = 0; i < numCount2; i++){
            secondList.add((int)(Math.random() * 1000) + 1);
        }
        System.out.println("Unsorted 'Random' list: " + firstList);
        System.out.println("Unsorted 'Math.random()' list: " + secondList);
        Collections.sort(firstList);
        Collections.sort(secondList);
        System.out.println("Sorted 'Random' list: " + firstList);
        System.out.println("Sorted 'Math.random()' list: " + secondList);
    }
}
