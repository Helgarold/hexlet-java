package io.hexlet;

class App {
  public static double getSquare(int a, int b, int angle) {
        // Конвертация угла из градусов в радианы
        double radians = Math.toRadians(angle);

        // Вычисление площади
        return 0.5 * a * b * Math.sin(radians);
    }

    public static void main(String[] args) {
        // Пример использования метода
        double area = App.getSquare(10, 10, 60);
        //System.out.println(area); // Приблизительно 43.30127018922193
        System.out.printf("%.1f%n", area);
    }
}
