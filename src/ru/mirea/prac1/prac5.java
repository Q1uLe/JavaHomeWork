package ru.mirea.prac1;

public class prac5 {
    public static int factorial(int x){
        if (x < 0){
            System.out.println("Факториал для отрицательных чисел не определён");
            return -1;
        }
        if (x == 0 || x == 1){
            return 1;
        }
        int i = 1, result = 1;
        for(;i <= x; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        for (String arg : args) {
            System.out.println(factorial(Integer.decode(arg)));
        }
    }
}
