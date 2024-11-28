package ru.mirea.prac17_lists.task10;

public class ListSorter {
    static MyLinkedList<String> testList = new MyLinkedList<>();

    public static void main(String[] args) {
        testList.add("11");
        testList.add("153");
        testList.add("12");
        testList.add("Z");
        testList.add("a");
        testList.add("1024");
        System.out.println(testList);
        testList.sort();
        System.out.println("Sorted");
        System.out.println(testList);
    }
}
