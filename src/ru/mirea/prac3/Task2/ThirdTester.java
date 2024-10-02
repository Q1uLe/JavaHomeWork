package ru.mirea.prac3.Task2;
import java.util.ArrayList;

public class ThirdTester {
    ArrayList<ThirdCircle> circles = new ArrayList<>();
    int circleCount = 0;

    public void addNewCircle(ThirdPoint center, double radius, String color){
        circles.add(new ThirdCircle(center, radius, color));
        circleCount++;
    }

    public ThirdCircle findSmallest(){
        ThirdCircle smallest = circles.getFirst();
        for(int i = 1; i < circleCount; i++){
            ThirdCircle tmp = circles.get(i);
            if (tmp.radius < smallest.radius) {
                smallest = tmp;
            }
        }
        return smallest;
    }

    public ThirdCircle findBiggest(){
        ThirdCircle biggest = circles.getFirst();
        for(int i = 1; i < circleCount; i++){
            ThirdCircle tmp = circles.get(i);
            if (tmp.radius > biggest.radius) {
                biggest = tmp;
            }
        }
        return biggest;
    }
}
