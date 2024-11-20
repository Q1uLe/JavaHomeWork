package ru.mirea.prac20.task4;


import java.util.List;

public class MinMax<T extends Comparable<T>> {
    private T[] list;
    public MinMax(T[] array){
        list = array;
    }

    public T getMin(){
        T min = list[0];
        for(int i=1; i<list.length;i++){
            if(min.compareTo(list[i]) > 0){
                min = list[i];
            }
        }
        return min;
    }

    public T getMax(){
        T max = list[0];
        for(int i=1; i<list.length;i++){
            if(max.compareTo(list[i]) < 0){
                max = list[i];
            }
        }
        return max;
    }
}
