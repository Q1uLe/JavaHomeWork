package ru.mirea.prac8.task3;

import java.util.Scanner;

public class FromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a < b){
            for (int i = a; i <= b; i++){
                System.out.print(i + " ");
            }
        }
        else if (a > b){
            for (int i = a; i >= b; i--){
                System.out.print(i + " ");
            }
        }
        else {
            System.out.println(a);
        }
    }
}
