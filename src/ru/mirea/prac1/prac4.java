package ru.mirea.prac1;

public class prac4 {
    public static void main(String[] args){
        int i = 1;
        float out = 0;
        for (;i < 11;i++){
            out = out + (float)1 / i;
            System.out.printf("%.3f\n", out);

        }
    }
}
