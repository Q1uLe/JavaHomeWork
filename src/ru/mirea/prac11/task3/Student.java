package ru.mirea.prac11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private float avg;
    private Date dateOfBirth;

    public Student(String name, String surname, String speciality, int course, String group, float avg, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.avg = avg;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", avg=" + avg +
                '}';
    }

    public String toString(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", avg=" + avg +
                ", dateOfBirth= " + sdf.format(this.dateOfBirth.getTime()) +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.avg, o.avg);
    }
}
