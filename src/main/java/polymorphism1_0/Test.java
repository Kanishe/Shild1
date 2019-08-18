package polymorphism1_0;

public class Test {
  public static void main(String[] args) {
    Animal animal=new Animal();
    Dog dog=new Dog();
    Cat cat=new Cat();
    test(animal);
    test(dog);
    test(cat);
    dog.bark();




  }

  public static void test(Animal animal){
    animal.eat();
  }
}
