package ru.mirea.prac26.task2;

public class MyIterListTester {
    public static void main(String[] args) {
        MyIterList<Integer> list = new MyIterList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Итерация по списку:");
        for (Integer element : list) {
            System.out.println(element);

        }
    }
}