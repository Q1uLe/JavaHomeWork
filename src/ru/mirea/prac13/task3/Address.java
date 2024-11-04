package ru.mirea.prac13.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flatNum;

    Address(String fullAddress){
        ArrayList<String> data = new ArrayList<>(List.of(fullAddress.split(",")));
        country = data.get(0).trim();
        region = data.get(1).trim();
        city = data.get(2).trim();
        street = data.get(3).trim();
        house = data.get(4).trim();
        corpus = data.get(5).trim();
        flatNum = data.get(6).trim();
    }

    Address(String fullAddress, String delimeter){
        StringTokenizer tokenizer = new StringTokenizer(fullAddress, delimeter);
        ArrayList<String> data = new ArrayList<>();
        while (tokenizer.hasMoreElements()){
            data.add(tokenizer.nextToken().trim());
        }
        country = data.get(0).trim();
        region = data.get(1).trim();
        city = data.get(2).trim();
        street = data.get(3).trim();
        house = data.get(4).trim();
        corpus = data.get(5).trim();
        flatNum = data.get(6).trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flatNum='" + flatNum + '\'' +
                '}';
    }
}
