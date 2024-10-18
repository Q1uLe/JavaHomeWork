package ru.mirea.prac7.task4;

public class Tester {
    public static void main(String[] args) {
        MathFunc mc = new MathFunc();
        Complex z = new Complex(1, 0);
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
