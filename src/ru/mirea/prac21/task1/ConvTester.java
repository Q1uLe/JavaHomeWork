package ru.mirea.prac21.task1;

public class ConvTester {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        String[] words = {"Apple", "Banana", "Pineapple", "Teapot"};
        System.out.println(Converter.toList(nums));
        System.out.println(Converter.toList(words));
    }
}
