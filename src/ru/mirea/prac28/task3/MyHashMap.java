package ru.mirea.prac28.task3;

import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyHashMap<V> {
    private LinkedList<Entry<V>>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(double key) {
        return (int) (0.616161 * key) % table.length;
    }

    public void put(double key, V value) {
        int index = hash(key);
        LinkedList<Entry<V>> bucket = table[index];

        for (Entry<V> entry : bucket) {
            if (entry.k == key) {
                entry.v = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        size++;
    }

    @Nullable
    public V get(double key) {
        for (Entry<V> entry : table[hash(key)]) {
            if (entry.k == key) {
                return entry.v;
            }
        }
        return null;
    }

    public void remove(double key){
        LinkedList<Entry<V>> bucket = table[hash(key)];
        for (Entry<V> entry: bucket){
            if (entry.k == key){
                bucket.remove(entry);
                size--;
                return;
            }
        }
        throw new NoSuchElementException("Cannot delete non-existent element");
    }

    public boolean contains(double key){
        return get(key) != null;
    }

    public int getSize(){
        return size;
    }



    private static class Entry<V> {
        double k;
        V v;

        Entry(double k, V v) {
            this.k = k;
            this.v = v;
        }
    }
}
