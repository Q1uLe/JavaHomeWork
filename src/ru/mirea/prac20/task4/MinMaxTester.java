package ru.mirea.prac20.task4;

import java.util.Random;
import java.util.Scanner;

public class MinMaxTester {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i<10; i++){
            arr[i] = rand.nextInt();
        }
        MinMax<Integer> minMax = new MinMax<>(arr);
        System.out.println(minMax.getMax());
        System.out.println(minMax.getMin());
    }
}
