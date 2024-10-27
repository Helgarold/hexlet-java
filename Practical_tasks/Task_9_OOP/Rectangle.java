package io.hexlet;

public class Rectangle {
    private final int length; // Длина прямоугольника
    private final int width;   // Ширина прямоугольника

    // Конструктор
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Метод для получения площади
    public int getSquare() throws Exception {
        if (length < 0 || width < 0) {
            throw new Exception("Длина или ширина не может быть отрицательной"); // Исключение если одна из сторон отрицательная
        }
        return length * width; // Площадь
    }

    // Геттеры можно добавить, если требуется доступ к длине и ширине
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
