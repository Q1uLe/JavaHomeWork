package ru.mirea.prac4_1.task1_8;

public class Circle extends Shape{
    protected Point center;
    protected double radius;


    public Circle() {
        super();
        center = new Point();
        this.radius = 1;
    }

    public Circle(double radius) {
        super();
        center = new Point();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        center = new Point();
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return getType() +
                "\n\tCenter: " + center.toString() +
                "\n\tColor: " + this.getColor() +
                "\n\tIs filled: " + this.isFilled() +
                "\n\tRadius: " + this.radius +
                "\n\tPerimeter: " + getPerimeter() +
                "\n\tArea: " + getArea();
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }
}
