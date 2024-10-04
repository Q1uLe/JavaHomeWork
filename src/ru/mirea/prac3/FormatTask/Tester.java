package ru.mirea.prac3.FormatTask;

public class Tester {
    public static void main(String[] args) {
        Convertor conv = new Convertor(1000, "USD");
        conv.convertTo("EUR");
        conv.convertTo("RUB");
        System.out.println(conv);
    }
}
