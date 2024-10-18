package ru.mirea.prac6.task11;

public class ToFahr implements Convertable{
    public double convert(double temp){
        return 32 + (((double) 9 /5) * temp);
    }
}
