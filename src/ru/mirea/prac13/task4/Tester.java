package ru.mirea.prac13.task4;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] strings = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T_Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon T-Shirt,Maroon,S",
        };

        Shirt[] shirts = Shirt.getShirts(strings);

        for (Shirt shirt: shirts){
            System.out.println(shirt);
        }
    }
}
