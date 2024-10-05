package ru.mirea.prac4.task2.clothes;

import ru.mirea.prac4.task2.Sizes;
import ru.mirea.prac4.task2.interfaces.ManClothing;

public class Tie extends Clothes implements ManClothing {
    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Галстук");
        System.out.println("Размер: " + size.getDescription() + " Цена: " + price + " Цвет: " + color);
    }
}
