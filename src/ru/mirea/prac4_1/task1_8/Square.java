package ru.mirea.prac4_1.task1_8;

public class Square extends Rectangle{
    protected double side;

    public Square() {
        super(1, 1);
        side = 1;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getType(){
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return getType() +
                "\n\tTop left: " + topLeft +
                "\n\tColor: " + getColor() +
                "\n\tIs filled: " + isFilled() +
                "\n\tSide: " + width +
                "\n\tPerimeter: " + getPerimeter() +
                "\n\tArea: " + getArea();
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
