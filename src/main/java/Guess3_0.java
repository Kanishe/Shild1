public class Guess3_0 {
  public static void main(String[] args)
    throws java.io.IOException{
    char ch, answer = 'K';
    System.out.println("Зaдyмaнa буква из диапазона A-Z . ");
    System.out.print("Пoпытaйтecь ее угадать: ");
    ch = (char) System.in.read();
    if (ch==answer)
      System.out.println("** Правильно! **");
    else {
      System.out.print(" Извинитe , нужная буква находится");
      if (ch<answer) System.out.print("ближe к концу алфавита");
      else System.out.print("ближe к началу алфавита");
    }
  }
}
