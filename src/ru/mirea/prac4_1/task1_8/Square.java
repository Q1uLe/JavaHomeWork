package ru.mirea.prac4_1.task1;

public class Square extends Rectangle{
    public Square(double height, double width) {
        super(height, width);
    }

    @Override
    public String getType(){
        return "Square";
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
