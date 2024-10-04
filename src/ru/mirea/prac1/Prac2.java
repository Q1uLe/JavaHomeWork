package ru.mirea.prac1;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_count = 0;
        System.out.println("Введите целое число - количество элементов в массиве");
        while (num_count == 0){
            if (sc.hasNextInt()){
                num_count = sc.nextInt();
            }
            else{
                System.out.println("Вы ввели не целое число, попробуйте еще раз");
                sc.next();
            }
        }
        int[] nums = new int[num_count];
        int i = 0;
        int max= 0, min = 0;
        System.out.println("Последовательно введтие " + num_count + " чисел");
        while (i!=num_count){
            if (sc.hasNextInt()){
                nums[i] = sc.nextInt();
                if (i == 0){
                    max = min = nums[i];
                }
                if (nums[i] > max){
                    max = nums[i];
                }
                if (nums[i] < min){
                    min = nums[i];
                }
                i++;
            }
            else{
                System.out.println("Вы ввели не целое число, попробуйте еще раз");
                sc.next();
            }
        }
        sc.close();
        System.out.println("Max is: " + max + "\n" + "Min is:" + min);
    }
}
