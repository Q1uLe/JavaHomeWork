package ru.mirea.prac3.Task2;
import java.util.ArrayList;

public class Tester {
    ArrayList<Circle> circles = new ArrayList<>();
    int circleCount = 0;

    public void addNewCircle(Point center, double radius, String color){
        circles.add(new Circle(center, radius, color));
    }
}
