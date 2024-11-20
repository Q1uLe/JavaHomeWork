package ru.mirea.prac20.task1_2;

public class MyClass<T, V, K> {
    private T t;
    private V v;
    private K k;
    public MyClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class of t: " + t.getClass().getName());
        System.out.println("Class of v: " + v.getClass().getName());
        System.out.println("Class of k: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        MyClass<Integer, String, Double> myInstance = new MyClass<>(42, "Hello", 3.14);
        myInstance.printClassNames();

        // Вывод значений переменных
        System.out.println("Value of t: " + myInstance.getT());
        System.out.println("Value of v: " + myInstance.getV());
        System.out.println("Value of k: " + myInstance.getK());
    }
}
