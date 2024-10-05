package ru.mirea.prac4.task2.clothes;

import ru.mirea.prac4.task2.interfaces.ManClothing;
import ru.mirea.prac4.task2.Sizes;
import ru.mirea.prac4.task2.interfaces.WomanClothing;

public class Pants extends Clothes implements ManClothing, WomanClothing {
    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Штаны");
        System.out.println("Размер: " + size.getDescription() + " Цена: " + price + " Цвет: " + color);
    }

    @Override
    public void dressWoman(){
        System.out.println("Штаны");
        System.out.println("Размер: " + size.getDescription() + " Цена: " + price + " Цвет: " + color);
    }
}
