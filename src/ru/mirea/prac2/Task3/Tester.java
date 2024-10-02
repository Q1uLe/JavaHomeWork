package ru.mirea.prac2.Task3;


import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int circleCount = 0;
//        Circle[] circles = new Circle[10];
        ArrayList<Circle> circles1 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
//            circles[i] = new Circle(new Point(i, -i), Math.pow((i + 1), 2), "Red");
            circles1.add(i, new Circle(new ThirdPoint(i, -i), Math.pow((i + 1), 2), "Red"));
            circleCount++;
        }
//        System.out.println(circles[0]);
//        System.out.println(circles[1]);
        System.out.println(circles1.getFirst());
        System.out.println(circles1.get(1));
//        System.out.println(circles.length);
        System.out.println(circles1.size());
    }
}
