package ru.mirea.prac9.task1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Vasya"),
                new Student(1337, "Grisha"),
                new Student(0, "Zhenya"),
                new Student(35, "Lena")
        };

        System.out.println("Before sort");
        for (Student student: students){
            System.out.println(student);
        }

        QSorter.sort(students);

        System.out.println("After sort");
        for (Student student: students){
            System.out.println(student);
        }
    }
}
