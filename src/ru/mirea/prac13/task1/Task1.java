package ru.mirea.prac13.task1;

public class Task1 {
    //Напишите метод, который принимает в качестве параметра любую
    //строку, например “I like Java!!!”.
    public static void getString(String arg){
        System.out.println(arg);
    }

    //2. Распечатать последний символ строки. Используем метод
    //String.charAt().
    public static void printLastChar(String arg){
        System.out.println("Last char is: " + arg.charAt(arg.length() - 1));
    }

    //3. Проверить, заканчивается ли ваша строка подстрокой “!!!”.
    //Используем метод String.endsWith().
    public static void endWithExclamations(String arg){
        if (arg.endsWith("!!!")) System.out.println("String ends with exclamations");
        else System.out.println("String doesn't end with exclamations");
    }

    //4. Проверить, начинается ли ваша строка подстрокой “I like”.
    //Используем метод String.startsWith().
    public static void startWithExclamations(String arg){
        if (arg.startsWith("I like")) System.out.println("String starts with \"I like\"");
        else System.out.println("String doesn't start with \"I like\"");
    }

    //5Проверить, содержит ли ваша строка подстроку “Java”. Используем
    //метод String.contains().
    public static void containJavaSubstring(String arg){
        if (arg.contains("Java")) System.out.println("Argument contains \"Java\"");
        else System.out.println("Argument doesn't contain \"Java\"");
    }

    //6. Найти позицию подстроки “Java” в строке “I like Java!!!”
    public static void findSubStrPos(String arg){
        System.out.println("Java's substring index is: " + arg.indexOf("Java"));
    }

    //7. Заменить все символы “а” на “о”.
    public static void repaceAWithO(String arg){
        System.out.println(arg.replace('a', 'o'));
    }

    //8. Преобразуйте строку к верхнему регистру.
    public static void up(String arg){
        System.out.println(arg.toUpperCase());
    }

    //9. Преобразуйте строку к нижнему регистру.
    public static void down(String arg){
        System.out.println(arg.toLowerCase());
    }

    //10. Вырезать строку Java c помощью метода String.substring().
    public static void withoutJ(String arg){
        System.out.println(arg.substring(arg.indexOf("Java"), arg.indexOf("Java") + 4));
    }

    public static void main(String[] args) {
        printLastChar("I like Java!!!");
        endWithExclamations("I like Java!!!");
        startWithExclamations("I like Java!!!");
        containJavaSubstring("I like Java!!!");
        findSubStrPos("I like Java!!!");
        repaceAWithO("I like Java!!!");
        up("I like Java!!!");
        down("I like Java!!!");
        withoutJ("I like Java!!!");
    }
}

