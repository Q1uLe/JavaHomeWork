package ru.mirea.prac3.Task2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class ThirdTester {
    static ArrayList<ThirdCircle> circles = new ArrayList<ThirdCircle>();
    static int circleCount = 0;

    public static void addNewCircle(ThirdPoint center, double radius, String color){
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

    public static void sortCircles(){
        circles = qSort(circles);
    }

    private static ArrayList<ThirdCircle> qSort(ArrayList<ThirdCircle> arr){
        if (arr.isEmpty()){
            return arr;
        }
        ThirdCircle pivot = arr.getFirst();
        ArrayList<ThirdCircle> pivotArr = new ArrayList<ThirdCircle>();
        pivotArr.add(pivot);
        ArrayList<ThirdCircle> lessSized = new ArrayList<ThirdCircle>();
        ArrayList<ThirdCircle> moreSized = new ArrayList<ThirdCircle>();
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i).radius > pivot.radius){
                moreSized.add(arr.get(i));
            }
            else {
                lessSized.add(arr.get(i));
            }
        }
        ArrayList<ThirdCircle> returnArr = new ArrayList<ThirdCircle>();
        returnArr.addAll(qSort(lessSized));
        returnArr.addAll(pivotArr);
        returnArr.addAll(qSort(moreSized));
        return returnArr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int r, x, y, c;
        String colors = "yrgbcm";
        for(int i = 0; i < 5; i++){
            r = rand.nextInt(100);
            x = rand.nextInt(101) - 50;
            y = rand.nextInt(101) - 50;
            c = rand.nextInt(6);
            addNewCircle(new ThirdPoint(x, y), r, String.valueOf(colors.charAt(c)));
        }
        System.out.println("Unsorted:");
        System.out.println(circles);
        System.out.println("Sorted:");
        sortCircles();
        System.out.println(circles);
    }
}
