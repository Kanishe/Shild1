package interfase;

public class Duck implements Swimmable {

  public void swim(){
    System.out.println("Животное плыви!");
  }

  public static void main(String[] args) {
    Duck duck=new Duck();
    duck.swim();

  }


}
