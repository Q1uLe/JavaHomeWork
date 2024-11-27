package ru.mirea.prac22.task2;

public class ProtectedCalculatorTester {
    public static void main(String[] args) {
        String arg1 = "2 3 +";
        String arg2 = "2 3 * 4 5 * +";
        String arg3 = "2 3 4 5 6 * + - / ";
        System.out.println(ProtectedRPNCalculator.solveString(arg1));
        System.out.println(ProtectedRPNCalculator.solveString(arg2));
        System.out.println(ProtectedRPNCalculator.solveString(arg3));
        ProtectedRPNCalculator.solveString("2 3 + 5");
    }
}
