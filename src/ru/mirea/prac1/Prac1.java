package ru.mirea.prac1;
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0, num, flag=0, sum=0;
        float mid;
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
        sc.close();
        for (i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
        for (i = 0; i < 10; i++) {
            sum += nums[i];
        }
        mid = (float)sum / 10;
        System.out.println("Sum is: " + sum);
        System.out.println("Mid is: " + mid);
    }
}
