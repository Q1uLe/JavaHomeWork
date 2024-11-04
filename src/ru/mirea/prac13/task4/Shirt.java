package ru.mirea.prac13.task4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    Shirt(String data){
        String[] datas = data.split(",");
        id = datas[0];
        name = datas[1];
        color = datas[2];
        size = datas[3];
    }

    public static Shirt[] getShirts(String[] strings){
        Shirt[] shirts = new Shirt[strings.length];
        for (int i = 0; i < strings.length; i++){
            shirts[i] = new Shirt(strings[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
//        return "Shirt{" + '\n' +
//                "id='" + id + '\'' + '\n' +
//                ", name='" + name + '\'' + '\n' +
//                ", color='" + color + '\'' + '\n' +
//                ", size='" + size + '\'' + '\n' +
//                '}';
        return "Shirt{" + '\n' +
                "id='" + id + "',\n" +
                "name='" + name + "',\n" +
                "color='" + color + "',\n" +
                "size='" + size + "',\n" + "}";
    }
}
