package ru.mirea.prac4_1.task1;

public abstract class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this.color = "Black";
        this.filled = false;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public String getType();
    abstract public double getArea();
    @Override
    abstract public String toString();
    abstract public double getPerimeter();
}
