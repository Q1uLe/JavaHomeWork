package ru.mirea.prac7.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        MathFunc mc = new MathFunc();
        Scanner sc = new Scanner(System.in);
        float a = 0, b = 0;
        System.out.println("Введите комлексное число z: вида a+bi, поочередно введите a и b");
        int flag = 0;
        while (flag!=2) {
            if(sc.hasNextFloat() && flag==0){
                a = sc.nextFloat();
                flag++;
            } else if (sc.hasNextFloat() && flag==1) {
                b = sc.nextFloat();
                flag++;
            } else {
                System.out.println("Вы ввели неверное число");
                System.out.println(flag);
                sc.next();
            }
        }
        Complex z = new Complex(a, b);
        System.out.println(z);

        z = mc.pow(z, 2);
        System.out.println(z);

        z = mc.pow(new Complex(0, 1), 2);
        System.out.println(z);

        System.out.println(mc.pow(new Complex(0, 1), 3));

        System.out.println("Z abs: " +mc.abs(new Complex(3, 4)));

        System.out.println(mc.findCircleArea(10));
    }

}
