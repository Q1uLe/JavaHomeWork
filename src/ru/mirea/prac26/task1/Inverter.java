package ru.mirea.prac26.task1;

import java.util.Stack;

public class Inverter {
    public static <T> T[] invertArray(T[] array){
        Stack<T> stack = new Stack<>();
        for (T element: array){
            stack.push(element);
        }
        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }
        return array;
    }
}
