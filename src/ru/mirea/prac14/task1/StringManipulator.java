package ru.mirea.prac14.task1;

import java.util.Scanner;

public class StringManipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для разбивки:");
        String inputString = scanner.nextLine();

        System.out.println("Введите регулярное выражение для разбивки (например, \\s+ для пробелов):");
        String regex = scanner.nextLine();

        try {
            // Разбиваем строку по регулярному выражению
            String[] elements = inputString.split(regex);

            System.out.println("Результат разбивки:");
            for (String element : elements) {
                // Удаляем пустые строки
                if (!element.isEmpty()) {
                    System.out.println(element);
                }
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка при разбиении строки: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
