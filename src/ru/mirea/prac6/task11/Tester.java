package ru.mirea.prac6.task11;

public class Tester {
    public static void main(String[] args) {
        ToFahr toFahr = new ToFahr();
        ToKelvin toKelvin = new ToKelvin();

        double celsiusTemp = 16.;

        double fahrs = toFahr.convert(celsiusTemp);
        double kelvins = toKelvin.convert(celsiusTemp);

        System.out.println("Температура по цельсию: " + celsiusTemp + " °C");
        System.out.println("В кельвинах будет: " + kelvins + " K");
        System.out.println("В фаренгейтах будет: " + fahrs + " °F");

    }
}
