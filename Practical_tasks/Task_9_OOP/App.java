package io.hexlet;

public class App {
    public static void printSquare(Rectangle rectangle) {
        try {
            int square = rectangle.getSquare(); // Получаем площадь
            System.out.println(square);
        } catch (Exception e) {
            System.out.println("Не удалось посчитать площадь"); // Обработка исключения
        }
    }
}
