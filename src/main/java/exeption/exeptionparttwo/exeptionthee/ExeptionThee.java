package exeption.exeptionparttwo.exeptionthee;

import java.util.Scanner;

public class ExeptionThee {
  public static void main(String[] args) throws ScanerExeption{
    Scanner scanner=new Scanner(System.in);
    while (true){
      int x = Integer.parseInt(scanner.nextLine());
      if (x!=0){
        throw new ScanerExeption("Пользователь ввел что-то кроме нуля");
      }
    }

  }
}
