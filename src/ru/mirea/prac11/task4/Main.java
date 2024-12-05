package ru.mirea.prac11.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, date, hour, minute;
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
        System.out.println("Введите время в формате: ЧЧ ММ");
        hour = sc.nextInt();
        minute = sc.nextInt();
        while (0 > hour || hour > 23 ||
                0 > minute || minute > 59) {
            System.out.println("Несуществующее время");
            System.out.println("Введите время в формате: ЧЧ ММ");
            hour = sc.nextInt();
            minute = sc.nextInt();
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);

        System.out.println(cal.getTime());
        Date date1 = cal.getTime();
        System.out.println(date1);

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
