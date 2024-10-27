package io.hexlet;

public class Quadrate implements Geometric {
    private final int side; // Сторона квадрата

    // Конструктор класса
    public Quadrate(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "quadrate"; // Название фигуры
    }

    @Override
    public double getSquare() {
        return side * side; // Площадь квадрата
    }
}
