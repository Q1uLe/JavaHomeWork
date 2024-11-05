package ru.mirea.prac14.task2;

import java.util.Scanner;

public class PatternChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.println("Введите строку для проверки:");
        String input = scanner.nextLine();

        if (input.matches(regex)) {
            System.out.println("Строка соответствует заданному шаблону.");
        } else {
            System.out.println("Строка не соответствует заданному шаблону.");
        }

        scanner.close();
    }
}

