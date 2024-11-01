package ru.mirea.prac13.task2;

import java.util.Objects;

public class Person {
    private String name = "";
    private String surname = "";
    private String patronymic = "";


    Person(String surname){
        this.surname = surname;
    }

    Person(String surname, String name){
        this.surname = surname;
        this.name = name;
    }

    Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNameInitials(){
        return surname + " " +
                ((!Objects.equals(name, "")) ? name.charAt(0) + ". " : "") +
                ((!Objects.equals(patronymic, "")) ? patronymic.charAt(0) + ".": "");
    }
}

