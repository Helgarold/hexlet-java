public class App {  
  public static void main(String[] args)
 throws IOException {
        char ch;
        char answer = 'K';
        System.out.println("Задумана буква между A и Z.");
        // Начинаем цикл, который будет повторяться, пока не будет угадана буква      
  do {
            System.out.print("Попробуйте ее угадать: ");  
          ch = (char) System.in.read(); // чтение символа с клавиатуры
            System.in.read(); // Считывается символ для перехода на следующую строку
            if (ch == answer) {    
            System.out.println("Правильно!");
            } else {
                System.out.println("...Увы, не угадали.");
                // Подсказка             
   if (ch < answer) {
                    System.out.println("Загаданная буква идет дальше по алфавиту.");                } else {
                    System.out.println("Загаданная буква идет ближе по алфавиту.");               }
            }        } while (ch != answer); // Цикл продолжается, пока буква не угадана
    }}
