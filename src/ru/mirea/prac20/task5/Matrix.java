package ru.mirea.prac20.task5;

import ru.mirea.prac20.task5.Exceptions.DifferentMatrixSizes;
import ru.mirea.prac20.task5.Exceptions.NonRectangleMatrix;

import java.util.Arrays;

public class Matrix<T extends Number> {
    private int height, width;
    private int[][] nums;

    public Matrix(int[][] nums){
        if (!isRectM(nums)){
            throw new NonRectangleMatrix("Was given a non-rectable matrix");
        }
        this.nums = nums;
        this.height = nums.length;
        this.width = nums[0].length;
    }

    public Matrix<T> add(Matrix<T> arg) throws DifferentMatrixSizes {
        if(!(this.height == arg.height || this.width == arg.width)){
            throw new DifferentMatrixSizes("The matrices have different sizes to add them");
        }
        int[][] nums = new int[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                nums[i][j] = this.nums[i][j];
                nums[i][j] += arg.nums[i][j];
            }
        }
        return new Matrix<T>(nums);
    }

    public Matrix<T> mul(Matrix<T> arg){
        int[][] nums = new int[this.height][arg.width];
        for (int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++){
                nums[i][j] = Vector.mulVAsIntArr(this.getRow(i), arg.getCol(j));
            }
        }

        return new Matrix<>(nums);
    }

    private static boolean isRectM(int[][] arr){
        int firstLenght = arr[0].length;
        for(int i = 1; i < arr.length; i++){
            if(arr[i].length != firstLenght){
                return false;
            }
        }
        return true;
    }

    public int[] getRow(int rowNum){
        int[] res = new int[this.width];
        for(int i = 0; i < this.width; i++){
            res[i] = this.nums[rowNum][i];
        }
        return res;
    }

    public int[] getCol(int colNum){
        int[] res = new int[this.height];
        for(int i = 0; i < this.height; i++){
            res[i] = this.nums[i][colNum];
        }
        return res;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "nums=" + Arrays.deepToString(nums) +
                '}';
    }
}
