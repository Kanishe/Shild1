package object.ex2;

public class Animal {
  public static void main(String[] args) {
    Dog a =new Dog();
    a.name = "Max";
    Dog b =new Dog();
    b.name="Bella";
    Dog c =new Dog();
    c.name="Jack";
    System.out.println(a.name);
    System.out.println(b.name);
    System.out.println(c.name);
  }
}
