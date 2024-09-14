package ru.mirea.prac2;

public class TestBall {
    public static void main(String[] args) {
        Ball testBall = new Ball(0, 0);
        System.out.println(testBall + "\n");

        System.out.println("Getted X is " + testBall.getX() + "\n");

        testBall.setXY(2, 13);
        System.out.println("New XY is: (" + testBall.getX() + ", " + testBall.getY() + ")");

        testBall.move(-1.5, -0.14);
        System.out.println("Ball moved to: (" + testBall.getX() + ", " + testBall.getY() + ")");

        System.out.println(testBall);
    }
}
