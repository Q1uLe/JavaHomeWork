package ru.mirea.prac20.task5.Exceptions;

public class NonRectangleMatrix extends IllegalArgumentException {
    public NonRectangleMatrix(String message) {
        super(message);
    }
}
