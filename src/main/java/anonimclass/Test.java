package anonimclass;


public class Test {
  public static void main(String[] args) {
    AnimalHunter animalHunter=new AnimalHunter() {
      @Override
      public void eat() {
        System.out.println("some eating");

      }
    };
    animalHunter.eat();
  }
}