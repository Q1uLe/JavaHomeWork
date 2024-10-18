package ru.mirea.prac7.task4;

public class MathFunc implements MathCalculable{

    @Override
    public Complex pow(Complex num, double power) {
        double[] parts = num.getParts();
        double r_2 = Math.pow(Math.sqrt(Math.pow(parts[0], 2) + Math.pow(parts[1], 2)), power);
        double phi_2 = Math.atan(parts[1]/parts[0]) * power;
        return new Complex(r_2 * Math.cos(phi_2), r_2 * Math.sin(phi_2));
    }

    @Override
    public double abs(Complex num) {
        double[] parts = num.getParts();
        return Math.sqrt(Math.pow(parts[0], 2) + Math.pow(parts[1], 2));
    }

    public double findCircleArea(double r){
        return MathCalculable.PI * r * r;
    }

    @Override
    public String toString() {
        return "MathFunc{}";
    }
}
