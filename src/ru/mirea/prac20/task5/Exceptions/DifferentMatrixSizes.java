package ru.mirea.prac20.task5.Exceptions;

public class DifferentMatrixSizes extends IllegalArgumentException {
    public DifferentMatrixSizes(String message) {
        super(message);
    }
}
