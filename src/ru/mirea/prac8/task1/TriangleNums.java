package ru.mirea.prac8.task1;

import java.util.Scanner;

public class TriangleNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int curN = 1;
        for(int i=0; i<n;i++){
            System.out.print(curN + " ");
            count++;
            if(count == curN){
                count = 0;
                curN++;
            }
        }
    }
}
