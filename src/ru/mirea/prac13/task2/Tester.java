package ru.mirea.prac13.task2;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Шарипов", "Ренат", "Венерович");
        System.out.println(person.getNameInitials());
        Person person1 = new Person("Шарипов");
        System.out.println(person1.getNameInitials());
        person1.setPatronymic("Рафитович");
        System.out.println(person1.getNameInitials());
        person1.setPatronymic("");
        person1.setName("Венер");
        System.out.println(person1.getNameInitials());
    }
}
