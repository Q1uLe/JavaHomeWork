package ru.mirea.prac19.task1;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(ITNChecker.checkNumber("7707083893"));
            System.out.println(ITNChecker.checkNumber("325507450247"));
            System.out.println(ITNChecker.checkNumber("325507450246"));
        } catch (BadIndividualTaxNumber e){
            System.out.println(e.getMessage());
        }
    }
}
