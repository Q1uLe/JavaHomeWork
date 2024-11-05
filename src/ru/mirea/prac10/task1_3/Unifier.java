package ru.mirea.prac10.task1_3;

import java.util.ArrayList;

import static ru.mirea.prac10.task1_3.Main.gnomeSort;

public class Unifier {
    public static ArrayList<Student> unifyAndSort(ArrayList<Student> students1, ArrayList<Student> students2){
        ArrayList<Student> ans = new ArrayList<>();
        ans.addAll(students1);
        ans.addAll(students2);
//        ans = quicksort(ans);
        gnomeSort(ans);
        return ans;
    }
}
