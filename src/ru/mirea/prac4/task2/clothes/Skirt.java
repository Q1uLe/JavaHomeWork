package ru.mirea.prac4.task2.clothes;

import ru.mirea.prac4.task2.Sizes;
import ru.mirea.prac4.task2.interfaces.WomanClothing;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman(){
        System.out.println("Юбка");
        System.out.println("Размер: " + size.getDescription() + " Цена: " + price + " Цвет: " + color);
    }
}
