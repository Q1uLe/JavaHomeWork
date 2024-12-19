package ru.mirea.prac28.task1;

import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(8);
        hash.add(4);
        hash.add(1);
        hash.add(9);
        hash.add(2);
        System.out.println(hash);
        TreeSet<Integer> tree = new TreeSet<>(hash);
        System.out.println(tree);
    }
}
