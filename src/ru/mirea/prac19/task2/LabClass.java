package ru.mirea.prac19.task2;

import java.util.ArrayList;
import java.util.List;

public class LabClass {
    private ArrayList<Student> students;

    public LabClass(ArrayList<Student> students) {
        this.students = students;
    }

    public Student findByName(String name) throws EmptyStringException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyStringException("name cannot be empty");
        }

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент по имени " + name + " не найден");
    }

    public void sortStudentsByGPA(){
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        this.students = sorter.qSort(getStudents());
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
