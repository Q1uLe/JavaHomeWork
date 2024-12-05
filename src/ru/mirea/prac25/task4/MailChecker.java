package ru.mirea.prac25.task4;

import java.util.regex.Matcher;

public class MailChecker {
    public static void main(String[] args) {
        String regex = "^\\w+@\\w+(.\\w+)?$";
        String[] mails = {"user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"};
        for (String mail: mails){
            System.out.println(mail + " : " + (mail.matches(regex)?"mail is valid":"mail is invalid"));
        }
    }
}
