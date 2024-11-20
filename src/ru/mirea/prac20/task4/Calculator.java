package ru.mirea.prac20.task4;

public class Calculator {
    public static <T extends Number, S extends Number> double sum(T a, S b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, S extends Number> double mul(T a, S b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, S extends Number> double div(T a, S b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, S extends Number> double sub(T a, S b) {
        return a.doubleValue() - b.doubleValue();
    }
}
