package ru.mirea.prac14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceGetter {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU\n, 100 RUB, 12.50 EUR.";

        String regex = "\\b\\d+(?:\\.\\d{1,2})?\\s*(USD|RUB|EUR)\\b\\n?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

