package ru.mirea.prac29.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[][] mtx = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                mtx[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                if(mtx[i][j] == 1){
                    count++;
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
}
