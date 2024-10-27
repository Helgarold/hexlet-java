package io.hexlet;

import java.util.HashSet;  // Импортируем HashSet

public class App {
    public static boolean hasDuplicates(String[] items) {
        HashSet<String> seen = new HashSet<>(); // Создаем новое множество (HashSet)

        for (String item : items) {
            if (!seen.add(item)) { // Пытаемся добавить элемент в множество
                return true; // Если элемент уже есть (add вернет false), значит, есть дубликат
            }
        }
        return false; // Если дубликатов не нашлось, возвращаем false
    }
}
