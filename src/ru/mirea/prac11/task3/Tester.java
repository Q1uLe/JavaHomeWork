package ru.mirea.prac11.task3;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Vasya", "Pupkin", "Technique", 3,
                "KVBO-07", 4.7f, new Date(105, Calendar.APRIL, 14));
        System.out.println(student.toString("dd MMM yyyy"));
    }
}
