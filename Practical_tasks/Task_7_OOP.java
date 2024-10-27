package io.hexlet;

public class App {
    public static Double calculateAverage(Integer[] numbers) {
        // Проверка на пустой массив или массив с null значениями
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        
        double sum = 0;
        int count = 0;
        
        for (Integer number : numbers) {
            if (number == null) {
                return null; // Если найдено значение null, возвращаем null
            }
            sum += number; // Суммируем числа
            count++; // Увеличиваем счетчик
        }
        
        // Вычисляем среднее арифметическое
        return sum / count;
    }
}
