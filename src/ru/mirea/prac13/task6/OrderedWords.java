package ru.mirea.prac13.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class OrderedWords {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Пожалуйста, укажите имя файла.");
            return;
        }

        String filename = args[0];
        List<String> words = readWordsFromFile(filename);
        if (words.isEmpty()) {
            System.out.println("Файл пуст или не содержит слов.");
            return;
        }

        String result = getLine(words);
        System.out.println("Результат: " + result);
    }

    private static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitWords = line.split(" +");
                for (String word : splitWords) {
                    words.add(word.trim());
                }
            }
            Collections.shuffle(words);
            System.out.println(words);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return words;
    }

    private static String getLine(List<String> words) {
        Set<String> usedWords = new HashSet<>();
        StringBuilder result = new StringBuilder();

        if (!words.isEmpty()) {
            String currentLastWord = words.getFirst();
            String currentFirstWord = currentLastWord;
            usedWords.add(currentLastWord);
            result.append(currentLastWord);

            while (true) {
                boolean foundNextWord = false;

                for (String word : words) {
                    if (!usedWords.contains(word) &&
                            currentLastWord.toLowerCase().charAt(currentLastWord.length() - 1) == word.toLowerCase().charAt(0)) {
                        result.append(" ").append(word);
                        usedWords.add(word);
                        currentLastWord = word;
                        foundNextWord = true;
                        break;
                    } else if (!usedWords.contains(word) &&
                            currentFirstWord.toLowerCase().charAt(0) == word.toLowerCase().charAt(word.length() - 1)) {
                        result.insert(0, word).insert(word.length(), " ");
                        usedWords.add(word);
                        currentFirstWord = word;
                        foundNextWord = true;
                        break;
                    }
                }

                if (!foundNextWord) {
                    break;
                }
            }
        }

        return result.toString();
    }
}
