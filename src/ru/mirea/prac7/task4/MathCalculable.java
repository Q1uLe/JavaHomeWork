package ru.mirea.prac7.task4;

public interface MathCalculable {
    public static float PI = 3.14f;

    public abstract Complex pow(Complex num, double power);

    public abstract double abs(Complex num);
}
