package ru.mirea.prac6.task1_2;

public class Tester {
    public static void testElement(Movable el){
        System.out.println("BEFORE MOVE\n" + el);

        el.moveDown();
        System.out.println("AFTER DOWN\n" + el);

        el.moveLeft();
        System.out.println("AFTER LEFT\n" + el);

        el.moveUp();
        System.out.println("AFTER UP\n" + el);

        el.moveRight();
        System.out.println("AFTER RIGHT\n" + el);
    }
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 100, 200, 100, 200);
        MovablePoint point = new MovablePoint(0, 0, 10, 10);
        MovableCircle circle = new MovableCircle(0, 0, 30, 30, 15);
        testElement(rectangle);
        testElement(point);
        testElement(circle);
    }
}
