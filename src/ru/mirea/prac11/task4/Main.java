package ru.mirea.prac11.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, date, hour, minute;
        System.out.println("Введите дату в формате: ГГГГ:ММ:ДД");
        year = sc.nextInt();
        month = sc.nextInt();
        date = sc.nextInt();
        System.out.println("Введите время в формате: ЧЧ:ММ");
        hour = sc.nextInt();
        minute = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);

        System.out.println(cal.getTime());
        Date date1 = cal.getTime();
        System.out.println(date1);
    }
}
