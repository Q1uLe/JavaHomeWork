package ru.mirea.prac4.task2;

import ru.mirea.prac4.task2.clothes.*;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<Clothes>();
        clothes.add(new Pants(Sizes.M, 1300, "Black"));
        clothes.add(new Skirt(Sizes.XS, 2500, "Green"));
        clothes.add(new Tie(Sizes.L, 500, "Red"));
        clothes.add(new TShirt(Sizes.XXS, 4900, "White"));
        Atelier atelier = new Atelier();
        System.out.println("-------");
        System.out.println("Atelier dresses man");
        atelier.dressMan(clothes);
        System.out.println("-------");
        System.out.println("Atelier dresses woman");
        atelier.dressWoman(clothes);
        System.out.println("-------");
    }

}
