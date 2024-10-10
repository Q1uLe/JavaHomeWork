package ru.mirea.prac4_1.task1_8;

public class Rectangle extends Shape{
    private double lenght;
    private double width;
    private Point topLeft = new Point();

    public Rectangle() {
        super();
        lenght = 2;
        width = 1;
    }

    public Rectangle(double width, double lenght) {
        super();
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.lenght = lenght;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public String toString() {
        return getType() +
                "\n\tTop left: " + topLeft +
                "\n\tColor: " + getColor() +
                "\n\tIs filled: " + isFilled() +
                "\n\tWidth: " + width +
                "\n\tLenght: " + lenght +
                "\n\tPerimeter: " + getPerimeter() +
                "\n\tArea: " + getArea();
    }

    @Override
    public double getPerimeter() {
        return (lenght + width) * 2;
    }
}
