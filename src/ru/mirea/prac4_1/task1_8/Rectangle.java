package ru.mirea.prac4_1.task1;

public class Rectangle extends Shape{
    private double height;
    private double width;


    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }
}
