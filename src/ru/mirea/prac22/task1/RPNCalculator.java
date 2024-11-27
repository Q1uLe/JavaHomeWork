package ru.mirea.prac22.task1;

import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    static  Stack<Double> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static String next;
    static Double firstOp, secondOp;

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static void main(String[] args) {
        System.out.println("Введите строку операций в обратной польской нотации\n" +
                "А затем нажмите Ctrl+D для завершения ввода");
        while (sc.hasNext()){
            next = sc.next();
            if(isNumeric(next)){
                stack.add(Double.parseDouble(next));
            } else {
                secondOp = stack.pop();
                firstOp = stack.pop();
                switch (next){
                    case "+" -> stack.add(firstOp + secondOp);
                    case "-" -> stack.add(firstOp - secondOp);
                    case "*" -> stack.add(firstOp * secondOp);
                    case "/" -> {
                        if (secondOp != 0) {
                            stack.add(firstOp / secondOp);
                        } else {throw new IllegalArgumentException("DIVISION BY ZERO");}
                    }
                }
            }
        }
        System.out.println(stack.pop());
    }
}
