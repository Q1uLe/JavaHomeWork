package ru.mirea.prac1;

public class Prac3 {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Нечего выводить");
        }
        else{
            for(int i = 0; i < args.length; i++){
                System.out.println("Аргумент " + i + " - " + args[i]);
            }
        }
    }
}
