package ru.mirea.Task10;

public class HowMany {
    public static void main(String[] args) {
        int counter = 0;
        for (String arg: args){
            counter++;
        }
        System.out.println(counter);
    }
}
