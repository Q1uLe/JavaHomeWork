package ru.mirea.prac24.task2.Interfaces;

import ru.mirea.prac24.task2.FunctionalChair;
import ru.mirea.prac24.task2.MagicChair;
import ru.mirea.prac24.task2.VictorianChair;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagiChair();
    FunctionalChair createFunctionalChair();
}
