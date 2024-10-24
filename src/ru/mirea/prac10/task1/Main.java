package ru.mirea.prac10.task1;

import java.util.ArrayList;
import java.util.Comparator;

public class Main implements Comparator<Student> {
    public static void setArray(ArrayList<Student> array){
        array.add(new Student("Sofya", "Afonina", "IVT", 2, "07", 1.3f));
        array.add(new Student("Arseniy", "Nikolin", "IVT", 2, "08", 1.2f));
        array.add(new Student("Samwel", "Pogosyan", "KIB", 3, "10", 1.4f));
        array.add(new Student("Pavel", "Savenko", "IVT", 2, "07", 1.6f));
        array.add(new Student("Egor", "Mel'nikov", "IVT", 2, "07", 2.f));
        array.add(new Student("Renat", "Sharipov", "KIB", 3, "12", 3.3f));
    }


    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        setArray(iDNumber);
        ArrayList<Student> revSorted = new ArrayList<>(revQuicksort(iDNumber));
        outArray(revSorted);
        ArrayList<Student> students1 = new ArrayList<>();
        setArray(students1);
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("John", "Doe", "Mechanic", 6, "2", 2.5f));
        students2.add(new Student("Jane", "Doe", "Painter", 5, "1", 2.9f));
        students2.add(new Student("Ivan", "Doe", "Waiter", 1, "1", 3.5f));
        ArrayList<Student> unified = Unifier.unifyAndSort(students1, students2);
        System.out.println("UNIFED");
        outArray(unified);
    }

    public static void outArray(ArrayList<Student> students){
        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        else {
            System.out.println("Array is empty");
        }
    }

    public static ArrayList<Student> quicksort(ArrayList<Student> students){
        ArrayList<Student> pivotArr = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        ArrayList<Student> left = new ArrayList<>();
        if (!students.isEmpty()){
            Student pivot = students.getFirst();
            for(Student student: students){
                if(pivot.compareTo(student) > 0){
                    left.add(student);
                } else if (pivot.compareTo(student) == 0){
                    pivotArr.add(student);
                } else {
                    right.add(student);
                }
            }
            ArrayList<Student> ans = new ArrayList<>();
            left = quicksort(left);
            right = quicksort(right);
            ans.addAll(left);
            ans.addAll(pivotArr);
            ans.addAll(right);
            return ans;
        }
        return new  ArrayList<Student>();
    }

    public static ArrayList<Student> revQuicksort(ArrayList<Student> students){
        ArrayList<Student> pivotArr = new ArrayList<>();
        ArrayList<Student> more = new ArrayList<>();
        ArrayList<Student> less = new ArrayList<>();
        if (!students.isEmpty()){
            Student pivot = students.getFirst();
            for(Student student: students){
                if(pivot.compareTo(student) < 0){
                    more.add(student);
                } else if (pivot.compareTo(student) == 0){
                    pivotArr.add(student);
                } else {
                    less.add(student);
                }
            }
            ArrayList<Student> ans = new ArrayList<>();
            more = quicksort(more);
            less = quicksort(less);
            ans.addAll(more);
            ans.addAll(pivotArr);
            ans.addAll(less);
            return ans;
        }
        return new  ArrayList<Student>();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }
}
