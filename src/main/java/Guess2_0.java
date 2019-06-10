public class Guess2_0 {
  public static void main(String[] args)
    throws java.io.IOException{
    char ch;
    char answer = 'K';
    System.out.println("Зaдyмaнa буква из диапазона A-Z.");
    System.out.print("Пoпытaйтecь ее угадать: ");
    ch = (char) System.in.read();
    if (ch == answer)System.out.println(" **SUCCESS!**");
    else System.out.println("...Sorry you chose wrong letter, try again  =(");
  }
}
