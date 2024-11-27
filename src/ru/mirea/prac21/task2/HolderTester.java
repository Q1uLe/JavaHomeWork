package ru.mirea.prac21.task2;

import java.util.Arrays;

public class HolderTester {
    public static void main(String[] args) {
        Object[] testArr = {1, 2, 3, 5L, "String", 2.5, 1.5f};
        ArrayHolder test = new ArrayHolder(testArr);
        System.out.println(Arrays.toString(test.getArray()));
    }
}
