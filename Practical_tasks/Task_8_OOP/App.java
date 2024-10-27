package io.hexlet;

public class App {
    public static String getFigureSquare(Geometric figure) {
        return "Square of " + figure.getName() + " is " + figure.getSquare(); // Форматируем строку для вывода
    }
}
