package ru.mirea.prac3.ShellTask1;

public class Task1 {
    public static void main(String[] args) {
        //1
        Double obj1 = Double.valueOf(1.3);
        Double obj2 = Double.valueOf(3.14);

        //2
        String str = "2.7";
        double obj3 = Double.parseDouble(str);

        //3
        byte byte1 = obj1.byteValue();
        short short1 = obj1.shortValue();
        int int1 = obj1.intValue();
        long long1 = obj1.longValue();
        float float1 = obj1.floatValue();
        double double1 = obj1;
        boolean boolean1 = obj1 != 0;
//    char char1 = (char) obj1;

        //4
        System.out.println(obj1);
        //5
        String str1 = obj1.toString();
        
    }
}
