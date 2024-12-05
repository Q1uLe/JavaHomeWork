package ru.mirea.prac19.task2;

public class Student implements Comparable<Student>{
    private int idNumber;
    private String name;
    private int GPA;

    public Student(int idNumber, String name, int GPA) {
        this.idNumber = idNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.idNumber, o.idNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
