package ru.mirea.prac4.task2;

import ru.mirea.prac4.task2.clothes.Clothes;
import ru.mirea.prac4.task2.interfaces.ManClothing;
import ru.mirea.prac4.task2.interfaces.WomanClothing;

import java.util.ArrayList;

public class Atelier implements WomanClothing, ManClothing {
    public void dressWoman(ArrayList<Clothes> clothes){
        for(Clothes clothe: clothes){
            if (WomanClothing.class.isAssignableFrom(clothe.getClass())){
                ((WomanClothing) clothe).dressWoman();
            }
        }
    }

    public void dressMan(ArrayList<Clothes> clothes){
        for(Clothes clothe: clothes){
            if (ManClothing.class.isAssignableFrom(clothe.getClass())){
                ((ManClothing) clothe).dressMan();
            }
        }
    }
}
