public class Guess {
  public static void main(String[] args)
    throws java.io.IOException {
      char ch, answer = 'Q';
      System.out.println("Зaдyмaнa буква из диапазона A-Z.");
      System.out.print("Пoпытaйтecь ее угадать: ");
      ch = (char) System.in.read();// чтение символа с клавиатуры
      if (ch == answer) System.out.println(" **SUCCESS!**");
      else {
        System.out.println("Мимо");
      }
    }
  }
