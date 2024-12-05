package ru.mirea.prac11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        int date, month, year;
        System.out.println("Введите дату в формате: ДД ММ ГГГГ");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        while (!checkDate(date, month, year)) {
            System.out.println("Несуществующая дата");
            System.out.println("Введите дату в формате: ДД ММ ГГГГ");
            date = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();
        }
        Calendar userCal = Calendar.getInstance();
        userCal.set(year, month-1, date);
        Date userDate = new Date();
        userDate.setTime(userCal.getTimeInMillis());
        System.out.println("Дата введенная пользователем: " + sdf.format(userDate.getTime()));
        Date curDate = new Date();
        System.out.println("Нынешняя дата: " + sdf.format(curDate.getTime()));

        if (userDate.before(curDate)) {
            System.out.println("Введенная дата раньше текущей.");
        } else if (userDate.after(curDate)) {
            System.out.println("Введенная дата позже текущей.");
        } else {
            System.out.println("Введенная дата совпадает с текущей.");
        }
    }

    private static boolean checkDate(int d, int m, int y) {
        if (d <= 0 || m <= 0 || y <= 0) {
            return false;
        }
        if (m == 1) {
            if (d > 31) return false;
        }
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                if (d > 29) return false;
            } else {
                if ((d > 28)) return false;
            }
        }
        if (m == 3) {
            if (d > 31) return false;
        }
        if (m == 4) {
            if (d > 30) return false;
        }
        if (m == 5) {
            if (d > 31) return false;
        }
        if (m == 6) {
            if (d > 30) return false;
        }
        if (m == 7) {
            if (d > 31) return false;
        }
        if (m == 8) {
            if (d > 31) return false;
        }
        if (m == 9) {
            if (d > 30) return false;
        }
        if (m == 10) {
            if (d > 31) return false;
        }
        if (m == 11) {
            if (d > 30) return false;
        }
        if (m == 12) {
            if (d > 31) return false;
        }
        return true;
    }
}
