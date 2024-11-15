package ru.mirea.prac11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        int d, m, y;
        System.out.println("Введите дату в формате: DD MM YYYY\n");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        Calendar userCal = Calendar.getInstance();
        userCal.set(d, m, y);
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
}
