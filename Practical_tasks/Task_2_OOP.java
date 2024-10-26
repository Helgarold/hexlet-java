package io.hexlet;

class App {
    public static Point getNewPoint() {
        // Создаем новый объект Point с координатами X = 5 и Y = 10
        return new Point(5, 10);
    }

    public static void main(String[] args) {
        // Пример использования метода
        var point = App.getNewPoint(); // Переменная point содержит объект класса Point
        // Вы можете распечатать координаты точки, если у класса Point есть такие методы
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}
