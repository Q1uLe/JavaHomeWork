package ru.mirea.prac28.task3;

public class MyHashMapTester {
    public static void main(String[] args) {
        MyHashMap<String> hashTable = new MyHashMap<>(10);

        hashTable.put(1.5F, "Value1");
        hashTable.put(2.7F, "Value2");
        hashTable.put(3.14F, "Value3");

        System.out.println("Value for key 1.5: " + hashTable.get(1.5F));
        System.out.println("Value for key 2.7: " + hashTable.get(2.7F));
        System.out.println("Value for key 3.14: " + hashTable.get(3.14F));

        System.out.println("Contains key 2.7: " + hashTable.contains(2.7F));
        System.out.println("Contains key 4.0: " + hashTable.contains(4.0F));

        hashTable.remove(2.7F);
        System.out.println("Contains key 2.7 after removal: " + hashTable.contains(2.7F));

        System.out.println("Size of the table: " + hashTable.getSize());
    }
}
