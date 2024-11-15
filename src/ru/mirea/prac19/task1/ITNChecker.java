package ru.mirea.prac19.task1;

import java.util.Collections;

public class ITNChecker {
    public static boolean checkNumber(String number) throws BadIndividualTaxNumber{
        char[] nums = number.toCharArray();
        if (number.length() == 10){
            int sum = 0;
            int[] coefs = {2, 4, 10, 3, 5, 9, 4, 6, 8};

            for (int i = 0; i < 9; i++){
                sum += (int)(nums[i] - '0') * coefs[i];
            }
            if (sum % 11 % 10 == (int) (nums[9] - '0')){
                return true;
            }
        } else if (number.length() == 12) {
            int sum1 = 0;
            int sum2 = 0;
            int[] coefs1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
            int[] coefs2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
            for (int i = 0; i < 10; i++) {
                sum1 += coefs1[i] * (int) (nums[i] - '0');
                sum2 += coefs2[i] * (int) (nums[i] - '0');
            }
            sum2 += coefs2[10] * (int) (nums[10] - '0');
            if ((sum1 % 11 % 10 == (int) (nums[10] - '0')) && (sum2 % 11 % 10 == (int) (nums[11] - '0'))) {
                return true;
            }
        }
        throw new BadIndividualTaxNumber(number + ": is invalid individual tax number");
    }
}
