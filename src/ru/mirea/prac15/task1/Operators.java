package ru.mirea.prac15.task1;

public enum Operators {
    PLUS("+"),
    MINUS("-"),
    DIVIDE("/"),
    MULTIPLY("*");

    private String s;
    Operators(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return this.s;
    }
}
