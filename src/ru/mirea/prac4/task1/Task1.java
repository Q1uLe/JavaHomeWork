package ru.mirea.prac4.task1;

import javax.lang.model.type.NullType;
import java.util.Objects;

public class Task1 {
    public enum Seasons {
        SUMMER("Summer", 30){
            public String getDescription(){
                return "Hot season";
            }
        },
        AUTUMN("Autumn", 10){
            public String getDescription(){
                return "Colder season";
            }
        },
        WINTER("Winter", -10){
            public String getDescription(){
                return "Coldest season";
            }
        },
        SPRING("Spring", 7){
            public String getDescription(){
                return "Hotter season";
            }
        };
        private final String name;
        private final String period;
        private final int avgTemp;

        Seasons(String name, int avg) {
            this.name = name;
            this.avgTemp = avg;
            switch (this.name){
                case "Summer":
                    this.period = "1 JUN - 31 AUG";
                    break;
                case "Autumn":
                    this.period = "1 SEP - 30 NOV";
                    break;
                case "Winter":
                    this.period = "1 DEC - 28(29) FEB";
                    break;
                case "Spring":
                    this.period = "1 MAR - 31 MAY";
                    break;
                default:
                    this.period = "NONE";
                    break;
            }
        }
        public abstract String getDescription();

        @Override
        public String toString() {
            return this.name + ' ' + this.period + '\n' + "Avg temp is: " + this.avgTemp;
        }
    }

    public static void seasonGreeting(Seasons season){
        switch (season){
            case Seasons.SPRING:
                System.out.println("I LOVE SPRING");
                break;
            case Seasons.SUMMER:
                System.out.println("I LOVE SUMMER");
                break;
            case Seasons.AUTUMN:
                System.out.println("I HATE AUTUMN");
                break;
            case Seasons.WINTER:
                System.out.println("I LOVE WINTER");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;
//        System.out.println(summer);
        seasonGreeting(Seasons.SUMMER);
        for (Seasons season: Seasons.values()){
            System.out.println(season);
            System.out.println(season.getDescription());

        }
    }
}
