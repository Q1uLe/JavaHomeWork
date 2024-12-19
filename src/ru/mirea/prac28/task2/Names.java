package ru.mirea.prac28.task2;

import java.util.HashMap;
import java.util.Map;

public class Names {
    public static HashMap<String, String> createMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Алексей");
        map.put("Смирнов", "Иван");
        map.put("Кузнецов", "Алексей");
        map.put("Попов", "Дмитрий");
        map.put("Васильев", "Николай");
        map.put("Соколов", "Иван");
        map.put("Михайлов", "Алексей");
        map.put("Федоров", "Сергей");
        return map;
    }

    public static int getSameFirstNameCount(Map<String, String> map){
        Map<String, Integer> firstNameCounts = new HashMap<>();
        for (String name : map.values()){
            firstNameCounts.put(name, firstNameCounts.getOrDefault(name, 0) + 1);
        }

        int count = 0;
        for (int val: firstNameCounts.values()){
            count += (val > 1?val:0);
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map){
        Map<String, Integer> lastNameCounts = new HashMap<>();
        for (String name : map.keySet()){
            lastNameCounts.put(name, lastNameCounts.getOrDefault(name, 0) + 1);
        }

        int count = 0;
        for (int val: lastNameCounts.values()){
            count += (val > 1?1:0);
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("Количество людей с одинаковыми именами: " + getSameFirstNameCount(map));
        System.out.println("Количество людей с одинаковыми фамилиями: " + getSameLastNameCount(map));
    }
}
