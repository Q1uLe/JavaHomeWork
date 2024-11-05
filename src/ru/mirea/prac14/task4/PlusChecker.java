package ru.mirea.prac14.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlusChecker {
    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4"; // Правильный пример
        String text2 = "6 / 5 – 2 * 9";   // Неправильный пример

        System.out.println("Текст 1: " + checkForInvalidNumbers(text1));
        System.out.println("Текст 2: " + checkForInvalidNumbers(text2));
    }

    public static boolean checkForInvalidNumbers(String text) {
        if (!text.contains("+")){
            return false;
        }
        String regex = "\\d(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
