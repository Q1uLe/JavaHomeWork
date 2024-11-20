package ru.mirea.prac20.task4;

public class CalculatorTester {
    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(3, 2.5));
        System.out.println("Multiply: " + Calculator.mul(45, 0.5f));
        System.out.println("Divide: " + Calculator.div(1.2, 33L));
        System.out.println("Subtraction: " + Calculator.sub(1.2, 2.3));
    }
}
