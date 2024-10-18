package ru.mirea.prac7.task4;

public class Complex {
    private double realPart, imPart;

    public Complex(double realPart, double imPart) {
        this.realPart = realPart;
        this.imPart = imPart;
    }

    public double[] getParts(){
        return new double[]{realPart, imPart};
    }

    @Override
    public String toString() {
        return "Complex{" +
                "realPart=" + realPart +
                ", imPart=" + imPart +
                '}';
    }
}
