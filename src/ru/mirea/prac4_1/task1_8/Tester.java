package ru.mirea.prac4_1.task1_8;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Rectangle rect = new Rectangle(3, 4);
        System.out.println(rect);
        Square square = new Square(4, "Red", true);
        square.setTopLeft(new Point(3, 16));
        System.out.println(square);
    }
}
