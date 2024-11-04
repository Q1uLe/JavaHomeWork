package ru.mirea.prac13.task5;

public class Tester {
    public static void main(String[] args) {
        PhoneParser phoneNumber1 = new PhoneParser("89177148466");
        PhoneParser phoneNumber2 = new PhoneParser("+7139177568833");
        System.out.println(phoneNumber1);
        System.out.println(phoneNumber2);
    }
}
