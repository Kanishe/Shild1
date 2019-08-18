package abstractclass;

public class Test {
  public static void main(String[] args) {
    Cat cat=new Cat();
    Dog dog=new Dog();
    dog.makeSound();
    cat.makeSound();
    cat.eat();
    cat.eat();
  }
}
