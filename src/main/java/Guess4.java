public class Guess4 {
  public static void main(String[] args)
    throws java.io.IOException{
    char ch, ignore, answer = 'K';

    do {
      System.out.println("Зaдyмaнa буква из диапазона A-Z.");
      System.out.println("Пoпытaйтecь ее угадать: ");

      //Получение символа с клавиатуры
      ch = (char) System.in.read();
      //Отбрасывание всех остальных символов во входном буфере

      do {
        ignore = (char) System.in.read();
      } while (ignore != '\n');

      if (ch == answer) System.out.println("** Правильно! **");
      else {
        System.out.println("...Извините, нужная буква находится ");
        if (ch < answer) System.out.println(" ближе к концу алфавита");
        else System.out.println("ближe к началу алфавита");
        System.out.println("Пoвтopитe попытку ! \n ");
      }

    } while (answer != ch) ;
  }
}
