package ru.mirea.prac4.task2.clothes;

import ru.mirea.prac4.task2.Sizes;

abstract public class Clothes{
    Sizes size;
    int price;
    String color;

    public Clothes(Sizes size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
