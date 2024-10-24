package ru.mirea.prac11.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy год dd MMMM EEEE HH:mm");
        String developerName = "Шарипов";
        Calendar taskDate = Calendar.getInstance();
        taskDate.set(Calendar.DAY_OF_MONTH, 18);
        taskDate.set(Calendar.HOUR_OF_DAY, 9);
        taskDate.set(Calendar.MINUTE, 30);
        taskDate.set(Calendar.SECOND, 0);
        Date curDate = new Date();
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + sdf.format(taskDate.getTime()));
        System.out.println("Дата и время сдачи задания: " + sdf.format(curDate.getTime()));
    }
}

