package generics.genericex4;

import equalsstringpool.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List animals =new ArrayList();
    Humanoid humanoid= new Humanoid();
    animals.add(2);
    animals.add("dog");
    animals.add("rate");




    System.out.println(animals.get(0));
    System.out.println(humanoid);

  }

  static class Humanoid{

  }
}
