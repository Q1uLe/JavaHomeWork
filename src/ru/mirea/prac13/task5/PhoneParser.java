package ru.mirea.prac13.task5;

public class PhoneParser {
    String countryCode;
    String number;
    PhoneParser(String numStr){
        if(numStr.startsWith("+")){
            countryCode = numStr.substring(0, numStr.length()-10);
        } else if(numStr.startsWith("8")){
            countryCode = "+7";
        }
        number = numStr.substring(numStr.length()-10);
    }

    @Override
    public String toString() {
        return countryCode + '(' + number.substring(0, 3) + ')' + '-'
                + number.substring(3, 6) + '-'
                + number.substring(6);
    }
}
