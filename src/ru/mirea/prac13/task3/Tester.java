package ru.mirea.prac13.task3;

public class Tester {
    public static void main(String[] args) {
        String stringAddress1 = "Россия, Мос. Обл-ть, Чехов, Красная, 1, 13, 24";
        String stringAddress2 = "Таджикистан, Самаркандская обл-ть, Самарканд, Рудаки, 1, A, 13";
        String stringAddress3 = "Индия- Гоа- Калангут- Чогм- 2, B- 24";
        String stringAddress4 = "США;Нью-Йорк.Нью-Йорк;Восьмая Авеню;   253. B ;  12";
        Address address1 = new Address(stringAddress1);
        Address address2 = new Address(stringAddress2);
        Address address3 = new Address(stringAddress3, ",-");
        Address address4 = new Address(stringAddress4, ";.");
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}
