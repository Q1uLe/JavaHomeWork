package ru.mirea.prac17_lists.task10;

public class ListTester {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("1");
        myLinkedList.add("3");
        myLinkedList.add("2", 1);
        myLinkedList.add("4", 3);
        myLinkedList.add("0", 0);
        System.out.println(myLinkedList);
        if(myLinkedList.remove(0)){
            System.out.println("Element 0 deleted");
            System.out.println(myLinkedList);
        }
        if(myLinkedList.remove(2)){
            System.out.println("Element 2 deleted");
            System.out.println(myLinkedList);
        }
        if(myLinkedList.remove(2)){
            System.out.println("Element 2 deleted");
            System.out.println(myLinkedList);
        }

    }
}
