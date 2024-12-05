package ru.mirea.prac19.task2;

import java.util.ArrayList;
import java.util.List;

public class LabClassDriver {
    public static void main(String[] args) {
        Student student1 = new Student(0, "Vasya", 2);
        Student student2 = new Student(1, "Renat", 1337);
        Student student3 = new Student(2, "Lena", 23);
        Student student4 = new Student(3, "Artur", 2005);
        Student student5 = new Student(4, "Petya", 144);
        ArrayList<Student> students = new ArrayList<>(
                List.of(new Student[]{
                        student1,
                        student2,
                        student3,
                        student4,
                        student5}
                ));
        LabClass labClass = new LabClass(students);
        LabClassUI ui = new LabClassUI(labClass);
        ui.start();
    }
}
