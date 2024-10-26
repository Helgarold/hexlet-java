 package hexlet_java.Practical_tasks.Task_3_OOP;

  public class App {
      public static double getCircumference(Circle circle) {
          // Вычисляем длину окружности
          return 2 * Math.PI * circle.radius;
      }

      public static void main(String[] args) {
          // Создаем окружность
          Circle circle = new Circle(1, 2, 5);
          // Получаем длину окружности
          double circumference = getCircumference(circle);
          System.out.println("Длина окружности: " + circumference); // Приблизительно 31.4
      }
 }
