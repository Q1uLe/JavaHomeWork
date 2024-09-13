package ru.mirea.lab1;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0, num, flag=0;
        int[] nums = new int[10];
        while (i!=10){
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                nums[i] = num;
                i++;
            } else {
                System.out.println("Вы ввели не целое число");
                sc.next();
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
    }
}
