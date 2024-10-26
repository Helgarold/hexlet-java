class App {   
 public static void main(String[] args) {
        int beerNum = 99;       
 String word; // Объявляем переменную, в которую будем записывать значение "бутылка" или "бутылок"
        while (beerNum > 0) {
            if (beerNum == 1) {               
 word = "бутылка"; // Если осталась 1 бутылка
            } else {               
 word = "бутылок (бутылки)"; // Для всех остальных случаев
          }
            System.out.println(beerNum + " " + word + " пива на стене");           
 System.out.println("Возьми одну. " + "\nпусти по кругу");
            beerNum = beerNum - 1;
            // Проверка на остаток бутылок           
 if (beerNum > 0) {
                if (beerNum == 1) {                   
 System.out.println("Осталась " + beerNum + " бутылка пива на стене");
                } else {                   
 System.out.println("Осталось " + beerNum + " " + word + " пива на стене");
                }           
 } else {
 System.out.println("Нет бутылок пива на стене");          }
  } 
 }
}
