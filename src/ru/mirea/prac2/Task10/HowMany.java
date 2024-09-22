package ru.mirea.prac2.Task10;

public class HowMany {
    public static void main(String[] args) {
        int counter = 0;
        for (String arg: args){
            counter++;
        }
        System.out.println(counter);
    }
}
