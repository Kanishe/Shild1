package gym;

import java.util.HashSet;
import java.util.Set;

//TODO ввод элементов с использованием System.in 

public class Gym {
  public static void main(String[] args) {

    Set<String> visitor = new HashSet<>();

    visitor.add("Vovan");
    visitor.add("Petro");
    visitor.add("Stepan");
    visitor.add("Stepman");

    for (String name : visitor){
      System.out.println(name);
    }


  }
}
