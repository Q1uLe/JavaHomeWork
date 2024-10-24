package ru.mirea.prac9.task2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(25, "Vasya", 12));
        students.add(new Student(1223, "Lena", 100));
        students.add(new Student(23, "Anna", 16));
        students.add(new Student(22, "Zhenya", 25));
        students.add(new Student(45, "Pavel", 57));

        System.out.println("Before sort");
        for(Student student: students){
            System.out.println(student);
        }

        ArrayList<Student> sorted = sorter.qSort(students);

        System.out.println("After sort");
        for(Student student: sorted){
            System.out.println(student);
        }

        ArrayList<Student> revSorted = sorter.reversedQSort(students);

        System.out.println("After reversed sort");
        for(Student student: revSorted){
            System.out.println(student);
        }

    }
}
