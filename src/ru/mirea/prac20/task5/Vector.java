package ru.mirea.prac20.task5;

public class Vector {
    public static int mulVAsIntArr(int[] v1, int[] v2){
        int res = 0;
        if(!(v1.length == v2.length)){
            throw new IllegalArgumentException("Different vector's lenght to multiply");
        }
        for(int i=0; i < v1.length; i++){
            res += v1[i] * v2[i];
        }
        return res;
    }
}
