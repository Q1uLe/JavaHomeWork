package ru.mirea.prac3.Task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] ints = {
                rand.nextInt(90) + 10,
                rand.nextInt(90) + 10,
                rand.nextInt(90) + 10,
                rand.nextInt(90) + 10,
        };
        System.out.println(Arrays.toString(ints));
        boolean flag = Boolean.TRUE;
        for(int i = 0; i < 3; i++) {
            flag = flag && (ints[i] < ints[i + 1]);
        }
        if (flag){
            System.out.println("Последовательность строго возрастает");
        }
        else {
            System.out.println("Последовательность не является строго возрастающей");
        }
    }
}
