package gym;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TODO ввод элементов с использованием System.in

public class Gym {
  public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    String nadss = scanner.nextLine();
    System.out.println("Введите имя очередного кOчки:");

    Set<String> visitor = new HashSet<>();


    //цыклы условыне операторы
    //обработка ошибки
    //не прерываемы цыклы
    visitor.add(nadss);
    visitor.add("Petro");
    visitor.add("Stepan");
    visitor.add("Stepman");

    for (String name : visitor){
      System.out.println(name);
    }


  }
}
