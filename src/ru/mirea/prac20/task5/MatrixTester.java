package ru.mirea.prac20.task5;

public class MatrixTester {
    public static void main(String[] args) {
        try {
            Matrix<Integer> mtx1 = new Matrix<>(new int[][]{{0, 2}, {3, 4}});
            Matrix<Integer> mtx2 = new Matrix<>(new int[][]{{1, 0}, {0, 1}});
            System.out.println(mtx1);
            System.out.println(mtx2);
            System.out.println(mtx1.add(mtx2));
            System.out.println(mtx1.mul(mtx2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
