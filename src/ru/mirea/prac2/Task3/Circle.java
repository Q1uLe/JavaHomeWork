package ru.mirea.prac2.Task3;

public class Circle {
    ThirdPoint center;
    double radius;
    String color;

    public Circle(ThirdPoint center, double radius, String color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Circle(){
        this.center = new ThirdPoint();
        this.radius = 1.;
        this.color = "Black";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public ThirdPoint getCenter() {
        return center;
    }

    public void setCenter(ThirdPoint center) {
        this.center = center;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
