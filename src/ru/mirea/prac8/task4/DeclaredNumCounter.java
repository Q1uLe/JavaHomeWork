package ru.mirea.prac8.task4;


import java.util.Scanner;

public class DeclaredNumCounter {
    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(recursion(0, 0, 2, 4));
    }
}
